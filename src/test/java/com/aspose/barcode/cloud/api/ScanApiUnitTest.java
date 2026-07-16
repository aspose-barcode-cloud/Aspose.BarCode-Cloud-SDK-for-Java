package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.ScanBase64Request;
import com.aspose.barcode.cloud.requests.ScanBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.ScanRequestWrapper;

import okhttp3.Request;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.Map;

public class ScanApiUnitTest {

    private static final String FAKE_TOKEN = "fake-test-token";
    private static ScanApi api;

    @BeforeClass
    public static void setUp() {
        ApiClient apiClient = new ApiClient(FAKE_TOKEN);
        api = new ScanApi(apiClient);
    }

    // --- Validation tests ---

    @Test(expected = ApiException.class)
    public void testScan_NullFileUrl_ThrowsApiException() throws Exception {
        api.scan(new ScanRequestWrapper(null));
    }

    @Test
    public void testScan_NullFileUrl_ErrorMessage() throws Exception {
        try {
            api.scan(new ScanRequestWrapper(null));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.fileUrl"));
        }
    }

    @Test(expected = ApiException.class)
    public void testScanBase64_NullRequest_ThrowsApiException() throws ApiException {
        api.scanBase64(new ScanBase64RequestWrapper(null));
    }

    @Test
    public void testScanBase64_NullRequest_ErrorMessage() {
        try {
            api.scanBase64(new ScanBase64RequestWrapper(null));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.scanBase64Request"));
        }
    }

    @Test(expected = ApiException.class)
    public void testScanMultipart_NullFile_ThrowsApiException() throws ApiException {
        api.scanMultipart(new ScanMultipartRequestWrapper(null));
    }

    @Test
    public void testScanMultipart_NullFile_ErrorMessage() {
        try {
            api.scanMultipart(new ScanMultipartRequestWrapper(null));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.file"));
        }
    }

    // --- Path construction tests ---

    @Test
    public void testScanCall_Path() throws Exception {
        ScanRequestWrapper request = new ScanRequestWrapper(new URI("https://example.com/img.png"));
        Request httpRequest = api.scanCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/scan"));
    }

    @Test
    public void testScanCall_HttpMethodIsGet() throws Exception {
        ScanRequestWrapper request = new ScanRequestWrapper(new URI("https://example.com/img.png"));
        Request httpRequest = api.scanCall(request, null, null).request();
        assertEquals("GET", httpRequest.method());
    }

    @Test
    public void testScanBase64Call_PathAndMethod() throws ApiException {
        ScanBase64Request body = new ScanBase64Request("dGVzdA==");
        ScanBase64RequestWrapper request = new ScanBase64RequestWrapper(body);
        Request httpRequest = api.scanBase64Call(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/scan-body"));
        assertEquals("POST", httpRequest.method());
    }

    @Test
    public void testScanMultipartCall_PathAndMethod() throws ApiException {
        ScanMultipartRequestWrapper request =
                new ScanMultipartRequestWrapper(new File("dummy.png"));
        Request httpRequest = api.scanMultipartCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/scan-multipart"));
        assertEquals("POST", httpRequest.method());
    }

    // --- Query parameter tests ---

    @Test
    public void testScanCall_QueryContainsFileUrl() throws Exception {
        ScanRequestWrapper request = new ScanRequestWrapper(new URI("https://example.com/img.png"));
        String url = api.scanCall(request, null, null).request().url().toString();
        assertTrue(url.contains("fileUrl="));
    }

    // --- Content-Type tests ---

    @Test
    public void testScanBase64Call_ContentTypeJson() throws ApiException {
        ScanBase64Request body = new ScanBase64Request("dGVzdA==");
        ScanBase64RequestWrapper request = new ScanBase64RequestWrapper(body);
        Request httpRequest = api.scanBase64Call(request, null, null).request();
        String contentType = httpRequest.header("Content-Type");
        assertTrue(contentType.contains("application/json"));
    }

    @Test
    public void testScanBase64Call_HasBody() throws ApiException {
        ScanBase64Request body = new ScanBase64Request("dGVzdA==");
        ScanBase64RequestWrapper request = new ScanBase64RequestWrapper(body);
        Request httpRequest = api.scanBase64Call(request, null, null).request();
        assertNotNull(httpRequest.body());
    }

    @Test
    public void testScanMultipartCall_ContentTypeMultipart() throws ApiException {
        ScanMultipartRequestWrapper request =
                new ScanMultipartRequestWrapper(new File("dummy.png"));
        Request httpRequest = api.scanMultipartCall(request, null, null).request();
        String contentType = httpRequest.header("Content-Type");
        assertTrue(contentType.contains("multipart/form-data"));
    }

    @Test
    public void testScanCall_AuthorizationHeader() throws Exception {
        ScanRequestWrapper request = new ScanRequestWrapper(new URI("https://example.com/img.png"));
        Request httpRequest = api.scanCall(request, null, null).request();
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
    public void testScan_CallsExecute() throws Exception {
        api.scan(new ScanRequestWrapper(new URI("https://example.com/img.png")));
    }

    @Test(expected = ApiException.class)
    public void testScanWithHttpInfo_CallsExecute() throws Exception {
        api.scanWithHttpInfo(new ScanRequestWrapper(new URI("https://example.com/img.png")));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testScanAsync_CallsEnqueue() throws Exception {
        api.scanAsync(
                new ScanRequestWrapper(new URI("https://example.com/img.png")), NO_OP_CALLBACK);
    }

    @Test(expected = ApiException.class)
    public void testScanBase64_CallsExecute() throws ApiException {
        api.scanBase64(new ScanBase64RequestWrapper(new ScanBase64Request("dGVzdA==")));
    }

    @Test(expected = ApiException.class)
    public void testScanBase64WithHttpInfo_CallsExecute() throws ApiException {
        api.scanBase64WithHttpInfo(new ScanBase64RequestWrapper(new ScanBase64Request("dGVzdA==")));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testScanBase64Async_CallsEnqueue() throws ApiException {
        api.scanBase64Async(
                new ScanBase64RequestWrapper(new ScanBase64Request("dGVzdA==")), NO_OP_CALLBACK);
    }

    @Test(expected = ApiException.class)
    public void testScanMultipart_CallsExecute() throws ApiException {
        api.scanMultipart(new ScanMultipartRequestWrapper(new File("dummy.png")));
    }

    @Test(expected = ApiException.class)
    public void testScanMultipartWithHttpInfo_CallsExecute() throws ApiException {
        api.scanMultipartWithHttpInfo(new ScanMultipartRequestWrapper(new File("dummy.png")));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testScanMultipartAsync_CallsEnqueue() throws ApiException {
        api.scanMultipartAsync(
                new ScanMultipartRequestWrapper(new File("dummy.png")), NO_OP_CALLBACK);
    }
}
