package com.aspose.barcode.cloud;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.model.ApiError;
import com.aspose.barcode.cloud.model.ApiErrorResponse;

import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.junit.Test;

import java.io.File;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SdkCoreCoverageTest {

    @Test
    public void apiResponseExposesConstructorValues() {
        Map<String, List<String>> headers = Collections.singletonMap("X-Test", Arrays.asList("a"));
        ApiResponse<String> response = new ApiResponse<>(201, headers, "payload");

        assertEquals(201, response.getStatusCode());
        assertEquals(headers, response.getHeaders());
        assertEquals("payload", response.getData());
    }

    @Test
    public void apiExceptionBuildsDetailsFromErrorResponseBodyOrEmptyFallback() {
        ApiError error = new ApiError("BadRequest", "Invalid barcode");
        error.setDescription(" Missing data.");
        ApiErrorResponse response = new ApiErrorResponse("request-id", error);

        ApiException apiErrorException = new ApiException("failed", 400, response);
        assertEquals(400, apiErrorException.getHttpCode());
        assertEquals("BadRequest: Invalid barcode Missing data.", apiErrorException.getDetails());

        Map<String, List<String>> headers =
                Collections.singletonMap("X-Request", Arrays.asList("1"));
        ApiException bodyException = new ApiException("failed", 500, headers, "raw body");
        assertEquals(headers, bodyException.getResponseHeaders());
        assertEquals("raw body", bodyException.getDetails());

        assertEquals("", new ApiException("failed").getDetails());
        assertTrue(
                new ApiException(new IllegalStateException("boom")).getCause()
                        instanceof IllegalStateException);
    }

    @Test
    public void serverConfigurationExpandsDefaultsOverridesAndRejectsInvalidEnums() {
        HashSet<String> enumValues = new HashSet<>(Arrays.asList("v4.0", "v5.0"));
        ServerVariable version = new ServerVariable("version", "v4.0", enumValues);
        Map<String, ServerVariable> variables = Collections.singletonMap("version", version);
        ServerConfiguration server =
                new ServerConfiguration("https://api.aspose.cloud/{version}", "Aspose", variables);

        assertEquals("https://api.aspose.cloud/v4.0", server.url());
        assertEquals(
                "https://api.aspose.cloud/v5.0",
                server.url(Collections.singletonMap("version", "v5.0")));

        try {
            server.url(Collections.singletonMap("version", "v6.0"));
            fail("Expected invalid enum value to be rejected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("invalid value v6.0"));
        }
    }

    @Test
    public void apiClientFormatsHeadersParametersUrlsAndMultipartBodies() {
        ApiClient client = new ApiClient("fake-token");
        client.setUserAgent("unit-test");
        client.addDefaultHeader("X-Default", "default-value");
        client.setTempFolderPath("target");
        client.setReadTimeout(1234);

        assertEquals("https://api.aspose.cloud/v4.0", client.getBasePath());
        assertNotNull(client.getHttpClient());
        assertFalse(client.isDebugging());
        client.setDebugging(false);
        assertFalse(client.isDebugging());
        assertEquals("target", client.getTempFolderPath());
        assertTrue(client.getConnectTimeout() >= 0);
        assertEquals(1234, client.getReadTimeout());
        assertTrue(client.getWriteTimeout() >= 0);

        assertEquals("", client.parameterToString(null));
        assertEquals("a,b", client.parameterToString(Arrays.asList("a", "b")));
        assertEquals("2026-06-29", client.parameterToString(LocalDate.parse("2026-06-29")));
        assertTrue(
                client.parameterToString(OffsetDateTime.parse("2026-06-29T00:00:00Z"))
                        .startsWith("2026-06-29T00:00"));

        assertTrue(client.parameterToPair(null, "value").isEmpty());
        assertTrue(client.parameterToPair("empty", null).isEmpty());
        assertEquals("value", client.parameterToPair("name", "value").get(0).getValue());
        assertEquals(
                "a%20b",
                client.parameterToPairs("multi", "name", Arrays.asList("a b")).get(0).getValue());
        assertEquals(
                "a%20b,c",
                client.parameterToPairs("csv", "name", Arrays.asList("a b", "c"))
                        .get(0)
                        .getValue());
        assertEquals(
                "a%20b%09c",
                client.parameterToPairs("tsv", "name", Arrays.asList("a b", "c"))
                        .get(0)
                        .getValue());
        assertEquals(
                "a%20b%7Cc",
                client.parameterToPairs("pipes", "name", Arrays.asList("a b", "c"))
                        .get(0)
                        .getValue());
        assertTrue(client.parameterToPairs("csv", "", Arrays.asList("a")).isEmpty());

        assertEquals("file.png", client.sanitizeFilename("../path/file.png"));
        assertTrue(client.isJsonMime("application/vnd.test+json; charset=UTF-8"));
        assertFalse(client.isJsonMime("text/plain"));
        assertNull(client.selectHeaderAccept(new String[] {}));
        assertEquals(
                "application/json",
                client.selectHeaderAccept(new String[] {"text/plain", "application/json"}));
        assertEquals(
                "text/plain,image/png",
                client.selectHeaderAccept(new String[] {"text/plain", "image/png"}));
        assertEquals("application/json", client.selectHeaderContentType(new String[] {}));
        assertEquals("application/json", client.selectHeaderContentType(new String[] {"*/*"}));
        assertEquals(
                "application/json",
                client.selectHeaderContentType(new String[] {"text/plain", "application/json"}));
        assertEquals("text/plain", client.selectHeaderContentType(new String[] {"text/plain"}));
        assertEquals("a%20b", client.escapeString("a b"));

        Map<String, String> headers = new HashMap<>();
        Request.Builder requestBuilder = new Request.Builder().url("https://example.com");
        client.processHeaderParams(headers, requestBuilder);
        Request request = requestBuilder.get().build();
        assertEquals("default-value", request.header("X-Default"));
        assertEquals("unit-test", request.header("User-Agent"));

        String url =
                client.buildUrl(
                        "/resource?existing=1",
                        client.parameterToPair("q", "a b"),
                        client.parameterToPairs("multi", "kind", Arrays.asList("qr", "pdf")));
        assertTrue(url.contains("existing=1&q=a%20b"));
        assertTrue(url.contains("kind=qr"));
        assertTrue(url.contains("kind=pdf"));

        Map<String, Object> formParams = new HashMap<>();
        formParams.put("name", "value");
        formParams.put("many", Arrays.asList("one", "two"));
        formParams.put("file", new File("test_data/pdf417Sample.png"));
        RequestBody body = client.buildRequestBodyMultipart(formParams);
        assertTrue(body instanceof MultipartBody);
        MultipartBody multipartBody = (MultipartBody) body;
        assertTrue(multipartBody.parts().size() >= 4);
        assertEquals("image/png", client.guessContentTypeFromFile(new File("sample.png")));
        assertEquals(
                "application/octet-stream",
                client.guessContentTypeFromFile(new File("sample.unknownext")));
    }

    @Test
    public void apiClientDeserializesSimpleResponsesAndRejectsUnsupportedContent()
            throws Exception {
        ApiClient client = new ApiClient("fake-token");

        Response stringResponse = response("plain text", "text/plain", 200, "OK");
        assertEquals("plain text", client.deserialize(stringResponse, String.class));

        Response emptyResponse = response("", "application/json", 204, "No Content");
        assertNull(client.handleResponse(emptyResponse, null));

        Response unsupported = response("payload", "text/plain", 200, "OK");
        try {
            client.deserialize(unsupported, ApiErrorResponse.class);
            fail("Expected unsupported content type");
        } catch (ApiException e) {
            assertTrue(e.getDetails().contains("payload"));
        }
    }

    private static Response response(String body, String contentType, int code, String message) {
        return new Response.Builder()
                .request(new Request.Builder().url("https://example.com").build())
                .protocol(okhttp3.Protocol.HTTP_1_1)
                .code(code)
                .message(message)
                .headers(Headers.of("Content-Type", contentType))
                .body(okhttp3.ResponseBody.create(body, okhttp3.MediaType.parse(contentType)))
                .build();
    }
}
