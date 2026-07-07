package com.aspose.barcode.cloud;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.model.ApiError;
import com.aspose.barcode.cloud.model.ApiErrorResponse;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Coverage for the core SDK result and exception types: {@link ApiResponse} value exposure and
 * {@link ApiException} detail/cause construction.
 */
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
}
