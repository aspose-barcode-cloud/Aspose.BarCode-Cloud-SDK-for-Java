package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeData;
import com.aspose.barcode.cloud.model.GenerateParams;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.Map;

/** Offline unit tests covering the public sync, http-info and async {@link GenerateApi} methods. */
public class GenerateApiMethodCoverageUnitTest {

    private static GenerateApi api;

    @BeforeClass
    public static void setUp() {
        api = GenerateApiTestFixtures.newApi();
    }

    private static final ApiCallback<File> NO_OP_CALLBACK =
            new ApiCallback<File>() {
                @Override
                public void onFailure(
                        ApiException e, int statusCode, Map<String, List<String>> headers) {}

                @Override
                public void onSuccess(
                        File result, int statusCode, Map<String, List<String>> headers) {}

                @Override
                public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {}

                @Override
                public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {}
            };

    @Test(expected = ApiException.class)
    public void testGenerate_CallsExecute() throws ApiException {
        api.generate(new GenerateRequestWrapper(EncodeBarcodeType.QR, "test"));
    }

    @Test(expected = ApiException.class)
    public void testGenerateWithHttpInfo_CallsExecute() throws ApiException {
        api.generateWithHttpInfo(new GenerateRequestWrapper(EncodeBarcodeType.QR, "test"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGenerateAsync_CallsEnqueue() throws ApiException {
        api.generateAsync(new GenerateRequestWrapper(EncodeBarcodeType.QR, "test"), NO_OP_CALLBACK);
    }

    @Test(expected = ApiException.class)
    public void testGenerateBody_CallsExecute() throws ApiException {
        EncodeData encodeData = new EncodeData("test");
        GenerateParams params = new GenerateParams(EncodeBarcodeType.QR, encodeData);
        api.generateBody(new GenerateBodyRequestWrapper(params));
    }

    @Test(expected = ApiException.class)
    public void testGenerateBodyWithHttpInfo_CallsExecute() throws ApiException {
        EncodeData encodeData = new EncodeData("test");
        GenerateParams params = new GenerateParams(EncodeBarcodeType.QR, encodeData);
        api.generateBodyWithHttpInfo(new GenerateBodyRequestWrapper(params));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGenerateBodyAsync_CallsEnqueue() throws ApiException {
        EncodeData encodeData = new EncodeData("test");
        GenerateParams params = new GenerateParams(EncodeBarcodeType.QR, encodeData);
        api.generateBodyAsync(new GenerateBodyRequestWrapper(params), NO_OP_CALLBACK);
    }

    @Test(expected = ApiException.class)
    public void testGenerateMultipart_CallsExecute() throws ApiException {
        api.generateMultipart(new GenerateMultipartRequestWrapper(EncodeBarcodeType.QR, "test"));
    }

    @Test(expected = ApiException.class)
    public void testGenerateMultipartWithHttpInfo_CallsExecute() throws ApiException {
        api.generateMultipartWithHttpInfo(
                new GenerateMultipartRequestWrapper(EncodeBarcodeType.QR, "test"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGenerateMultipartAsync_CallsEnqueue() throws ApiException {
        api.generateMultipartAsync(
                new GenerateMultipartRequestWrapper(EncodeBarcodeType.QR, "test"), NO_OP_CALLBACK);
    }
}
