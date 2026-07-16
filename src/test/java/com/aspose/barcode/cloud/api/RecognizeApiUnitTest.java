package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.RecognitionImageKind;
import com.aspose.barcode.cloud.model.RecognitionMode;
import com.aspose.barcode.cloud.model.RecognizeBase64Request;
import com.aspose.barcode.cloud.requests.RecognizeBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.RecognizeMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.RecognizeRequestWrapper;

import okhttp3.Request;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RecognizeApiUnitTest {

    private static final String FAKE_TOKEN = "fake-test-token";
    private static RecognizeApi api;

    @BeforeClass
    public static void setUp() {
        ApiClient apiClient = new ApiClient(FAKE_TOKEN);
        api = new RecognizeApi(apiClient);
    }

    // --- Validation tests ---

    @Test(expected = ApiException.class)
    public void testRecognize_NullBarcodeType_ThrowsApiException() throws Exception {
        api.recognize(new RecognizeRequestWrapper(null, new URI("https://example.com/img.png")));
    }

    @Test(expected = ApiException.class)
    public void testRecognize_NullFileUrl_ThrowsApiException() throws Exception {
        api.recognize(new RecognizeRequestWrapper(DecodeBarcodeType.QR, null));
    }

    @Test
    public void testRecognize_NullBarcodeType_ErrorMessage() throws Exception {
        try {
            api.recognize(
                    new RecognizeRequestWrapper(null, new URI("https://example.com/img.png")));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.barcodeType"));
        }
    }

    @Test
    public void testRecognize_NullFileUrl_ErrorMessage() throws Exception {
        try {
            api.recognize(new RecognizeRequestWrapper(DecodeBarcodeType.QR, null));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.fileUrl"));
        }
    }

    @Test(expected = ApiException.class)
    public void testRecognizeBase64_NullRequest_ThrowsApiException() throws ApiException {
        api.recognizeBase64(new RecognizeBase64RequestWrapper(null));
    }

    @Test
    public void testRecognizeBase64_NullRequest_ErrorMessage() {
        try {
            api.recognizeBase64(new RecognizeBase64RequestWrapper(null));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.recognizeBase64Request"));
        }
    }

    @Test(expected = ApiException.class)
    public void testRecognizeMultipart_NullBarcodeType_ThrowsApiException() throws ApiException {
        api.recognizeMultipart(new RecognizeMultipartRequestWrapper(null, new File("dummy.png")));
    }

    @Test(expected = ApiException.class)
    public void testRecognizeMultipart_NullFile_ThrowsApiException() throws ApiException {
        api.recognizeMultipart(new RecognizeMultipartRequestWrapper(DecodeBarcodeType.QR, null));
    }

    @Test
    public void testRecognizeMultipart_NullBarcodeType_ErrorMessage() {
        try {
            api.recognizeMultipart(
                    new RecognizeMultipartRequestWrapper(null, new File("dummy.png")));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.barcodeType"));
        }
    }

    @Test
    public void testRecognizeMultipart_NullFile_ErrorMessage() {
        try {
            api.recognizeMultipart(
                    new RecognizeMultipartRequestWrapper(DecodeBarcodeType.QR, null));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.file"));
        }
    }

    // --- Path construction tests ---

    @Test
    public void testRecognizeCall_Path() throws Exception {
        RecognizeRequestWrapper request =
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png"));
        Request httpRequest = api.recognizeCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/recognize"));
    }

    @Test
    public void testRecognizeCall_HttpMethodIsGet() throws Exception {
        RecognizeRequestWrapper request =
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png"));
        Request httpRequest = api.recognizeCall(request, null, null).request();
        assertEquals("GET", httpRequest.method());
    }

    @Test
    public void testRecognizeBase64Call_PathAndMethod() throws ApiException {
        RecognizeBase64Request body =
                new RecognizeBase64Request(Arrays.asList(DecodeBarcodeType.QR), "dGVzdA==");
        RecognizeBase64RequestWrapper request = new RecognizeBase64RequestWrapper(body);
        Request httpRequest = api.recognizeBase64Call(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/recognize-body"));
        assertEquals("POST", httpRequest.method());
    }

    @Test
    public void testRecognizeMultipartCall_PathAndMethod() throws ApiException {
        RecognizeMultipartRequestWrapper request =
                new RecognizeMultipartRequestWrapper(DecodeBarcodeType.QR, new File("dummy.png"));
        Request httpRequest = api.recognizeMultipartCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/recognize-multipart"));
        assertEquals("POST", httpRequest.method());
    }

    // --- Query parameter tests ---

    @Test
    public void testRecognizeCall_QueryContainsBarcodeType() throws Exception {
        RecognizeRequestWrapper request =
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png"));
        String url = api.recognizeCall(request, null, null).request().url().toString();
        assertTrue(url.contains("barcodeType="));
    }

    @Test
    public void testRecognizeCall_QueryContainsFileUrl() throws Exception {
        RecognizeRequestWrapper request =
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png"));
        String url = api.recognizeCall(request, null, null).request().url().toString();
        assertTrue(url.contains("fileUrl="));
    }

    @Test
    public void testRecognizeCall_WithOptionalParams() throws Exception {
        RecognizeRequestWrapper request =
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png"));
        request.recognitionMode = RecognitionMode.FAST;
        request.recognitionImageKind = RecognitionImageKind.CLEAR_IMAGE;
        String url = api.recognizeCall(request, null, null).request().url().toString();
        assertTrue(url.contains("recognitionMode="));
        assertTrue(url.contains("recognitionImageKind="));
    }

    @Test
    public void testRecognizeCall_WithoutOptionalParams() throws Exception {
        RecognizeRequestWrapper request =
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png"));
        String url = api.recognizeCall(request, null, null).request().url().toString();
        assertFalse(url.contains("recognitionMode="));
        assertFalse(url.contains("recognitionImageKind="));
    }

    // --- Content-Type tests ---

    @Test
    public void testRecognizeBase64Call_ContentTypeJson() throws ApiException {
        RecognizeBase64Request body =
                new RecognizeBase64Request(Arrays.asList(DecodeBarcodeType.QR), "dGVzdA==");
        RecognizeBase64RequestWrapper request = new RecognizeBase64RequestWrapper(body);
        Request httpRequest = api.recognizeBase64Call(request, null, null).request();
        String contentType = httpRequest.header("Content-Type");
        assertTrue(contentType.contains("application/json"));
    }

    @Test
    public void testRecognizeBase64Call_HasBody() throws ApiException {
        RecognizeBase64Request body =
                new RecognizeBase64Request(Arrays.asList(DecodeBarcodeType.QR), "dGVzdA==");
        RecognizeBase64RequestWrapper request = new RecognizeBase64RequestWrapper(body);
        Request httpRequest = api.recognizeBase64Call(request, null, null).request();
        assertNotNull(httpRequest.body());
    }

    @Test
    public void testRecognizeMultipartCall_ContentTypeMultipart() throws ApiException {
        RecognizeMultipartRequestWrapper request =
                new RecognizeMultipartRequestWrapper(DecodeBarcodeType.QR, new File("dummy.png"));
        Request httpRequest = api.recognizeMultipartCall(request, null, null).request();
        String contentType = httpRequest.header("Content-Type");
        assertTrue(contentType.contains("multipart/form-data"));
    }

    @Test
    public void testRecognizeCall_AuthorizationHeader() throws Exception {
        RecognizeRequestWrapper request =
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png"));
        Request httpRequest = api.recognizeCall(request, null, null).request();
        assertEquals("Bearer " + FAKE_TOKEN, httpRequest.header("Authorization"));
    }

    // --- Public method coverage ---

    private static final ApiCallback<BarcodeResponseList> NO_OP_CALLBACK =
            new ApiCallback<BarcodeResponseList>() {
                @Override
                public void onFailure(
                        ApiException e, int statusCode, Map<String, List<String>> headers) {}

                @Override
                public void onSuccess(
                        BarcodeResponseList result,
                        int statusCode,
                        Map<String, List<String>> headers) {}

                @Override
                public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {}

                @Override
                public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {}
            };

    @Test(expected = ApiException.class)
    public void testRecognize_CallsExecute() throws Exception {
        api.recognize(
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png")));
    }

    @Test(expected = ApiException.class)
    public void testRecognizeWithHttpInfo_CallsExecute() throws Exception {
        api.recognizeWithHttpInfo(
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png")));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRecognizeAsync_CallsEnqueue() throws Exception {
        api.recognizeAsync(
                new RecognizeRequestWrapper(
                        DecodeBarcodeType.QR, new URI("https://example.com/img.png")),
                NO_OP_CALLBACK);
    }

    @Test(expected = ApiException.class)
    public void testRecognizeBase64_CallsExecute() throws ApiException {
        RecognizeBase64Request body =
                new RecognizeBase64Request(Arrays.asList(DecodeBarcodeType.QR), "dGVzdA==");
        api.recognizeBase64(new RecognizeBase64RequestWrapper(body));
    }

    @Test(expected = ApiException.class)
    public void testRecognizeBase64WithHttpInfo_CallsExecute() throws ApiException {
        RecognizeBase64Request body =
                new RecognizeBase64Request(Arrays.asList(DecodeBarcodeType.QR), "dGVzdA==");
        api.recognizeBase64WithHttpInfo(new RecognizeBase64RequestWrapper(body));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRecognizeBase64Async_CallsEnqueue() throws ApiException {
        RecognizeBase64Request body =
                new RecognizeBase64Request(Arrays.asList(DecodeBarcodeType.QR), "dGVzdA==");
        api.recognizeBase64Async(new RecognizeBase64RequestWrapper(body), NO_OP_CALLBACK);
    }

    @Test(expected = ApiException.class)
    public void testRecognizeMultipart_CallsExecute() throws ApiException {
        api.recognizeMultipart(
                new RecognizeMultipartRequestWrapper(DecodeBarcodeType.QR, new File("dummy.png")));
    }

    @Test(expected = ApiException.class)
    public void testRecognizeMultipartWithHttpInfo_CallsExecute() throws ApiException {
        api.recognizeMultipartWithHttpInfo(
                new RecognizeMultipartRequestWrapper(DecodeBarcodeType.QR, new File("dummy.png")));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRecognizeMultipartAsync_CallsEnqueue() throws ApiException {
        api.recognizeMultipartAsync(
                new RecognizeMultipartRequestWrapper(DecodeBarcodeType.QR, new File("dummy.png")),
                NO_OP_CALLBACK);
    }
}
