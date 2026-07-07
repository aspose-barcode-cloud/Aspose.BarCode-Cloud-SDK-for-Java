package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.ScanBase64Request;
import com.aspose.barcode.cloud.requests.ScanBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.ScanRequestWrapper;

import okhttp3.Request;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;

/**
 * Offline unit tests for {@link ScanApi} request building: paths, HTTP methods, query parameters and
 * headers.
 */
public class ScanApiRequestUnitTest {

    private static ScanApi api;

    @BeforeClass
    public static void setUp() {
        api = ScanApiTestFixtures.newApi();
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

    // --- Header tests ---

    @Test
    public void testScanCall_AuthorizationHeader() throws Exception {
        ScanRequestWrapper request = new ScanRequestWrapper(new URI("https://example.com/img.png"));
        Request httpRequest = api.scanCall(request, null, null).request();
        assertEquals(
                "Bearer " + ScanApiTestFixtures.FAKE_TOKEN, httpRequest.header("Authorization"));
    }
}
