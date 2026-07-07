package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.ScanBase64Request;
import com.aspose.barcode.cloud.requests.ScanBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;

import okhttp3.Request;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

/** Offline unit tests for {@link ScanApi} request content types and payload presence. */
public class ScanApiBodyUnitTest {

    private static ScanApi api;

    @BeforeClass
    public static void setUp() {
        api = ScanApiTestFixtures.newApi();
    }

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
}
