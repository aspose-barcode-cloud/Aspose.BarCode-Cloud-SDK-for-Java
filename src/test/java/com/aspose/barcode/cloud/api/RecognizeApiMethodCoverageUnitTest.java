package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.RecognizeBase64Request;
import com.aspose.barcode.cloud.requests.RecognizeBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.RecognizeMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.RecognizeRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Offline unit tests covering the public sync, http-info and async {@link RecognizeApi} methods.
 */
public class RecognizeApiMethodCoverageUnitTest {

    private static RecognizeApi api;

    @BeforeClass
    public static void setUp() {
        api = RecognizeApiTestFixtures.newApi();
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
