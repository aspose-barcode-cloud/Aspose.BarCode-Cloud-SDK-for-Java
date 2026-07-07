package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.ScanBase64Request;
import com.aspose.barcode.cloud.requests.ScanBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.ScanRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.Map;

/** Offline unit tests covering the public sync, http-info and async {@link ScanApi} methods. */
public class ScanApiMethodCoverageUnitTest {

    private static ScanApi api;

    @BeforeClass
    public static void setUp() {
        api = ScanApiTestFixtures.newApi();
    }

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
