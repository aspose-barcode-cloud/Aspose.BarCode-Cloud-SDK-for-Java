package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.requests.RecognizeBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.RecognizeMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.RecognizeRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;

/** Offline unit tests for {@link RecognizeApi} required-parameter validation. */
public class RecognizeApiValidationUnitTest {

    private static RecognizeApi api;

    @BeforeClass
    public static void setUp() {
        api = RecognizeApiTestFixtures.newApi();
    }

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
}
