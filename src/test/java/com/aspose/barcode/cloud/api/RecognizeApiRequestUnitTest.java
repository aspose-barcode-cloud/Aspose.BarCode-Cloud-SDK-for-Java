package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
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

/**
 * Offline unit tests for {@link RecognizeApi} request building: paths, HTTP methods, query
 * parameters, content types and headers.
 */
public class RecognizeApiRequestUnitTest {

    private static RecognizeApi api;

    @BeforeClass
    public static void setUp() {
        api = RecognizeApiTestFixtures.newApi();
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
        assertEquals(
                "Bearer " + RecognizeApiTestFixtures.FAKE_TOKEN,
                httpRequest.header("Authorization"));
    }
}
