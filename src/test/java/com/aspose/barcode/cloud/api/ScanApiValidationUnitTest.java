package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.requests.ScanBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.ScanRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

/** Offline unit tests for {@link ScanApi} required-parameter validation. */
public class ScanApiValidationUnitTest {

    private static ScanApi api;

    @BeforeClass
    public static void setUp() {
        api = ScanApiTestFixtures.newApi();
    }

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
}
