package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

/** Offline unit tests for {@link GenerateApi} required-parameter validation. */
public class GenerateApiValidationUnitTest {

    private static GenerateApi api;

    @BeforeClass
    public static void setUp() {
        api = GenerateApiTestFixtures.newApi();
    }

    @Test(expected = ApiException.class)
    public void testGenerate_NullBarcodeType_ThrowsApiException() throws ApiException {
        api.generate(new GenerateRequestWrapper(null, "data"));
    }

    @Test(expected = ApiException.class)
    public void testGenerate_NullData_ThrowsApiException() throws ApiException {
        api.generate(new GenerateRequestWrapper(EncodeBarcodeType.QR, null));
    }

    @Test
    public void testGenerate_NullBarcodeType_ErrorMessage() {
        try {
            api.generate(new GenerateRequestWrapper(null, "data"));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.barcodeType"));
        }
    }

    @Test
    public void testGenerate_NullData_ErrorMessage() {
        try {
            api.generate(new GenerateRequestWrapper(EncodeBarcodeType.QR, null));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.data"));
        }
    }

    @Test(expected = ApiException.class)
    public void testGenerateBody_NullParams_ThrowsApiException() throws ApiException {
        api.generateBody(new GenerateBodyRequestWrapper(null));
    }

    @Test(expected = ApiException.class)
    public void testGenerateMultipart_NullBarcodeType_ThrowsApiException() throws ApiException {
        api.generateMultipart(new GenerateMultipartRequestWrapper(null, "data"));
    }

    @Test(expected = ApiException.class)
    public void testGenerateMultipart_NullData_ThrowsApiException() throws ApiException {
        api.generateMultipart(new GenerateMultipartRequestWrapper(EncodeBarcodeType.QR, null));
    }
}
