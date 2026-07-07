package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeData;
import com.aspose.barcode.cloud.model.GenerateParams;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;

import okhttp3.MultipartBody;
import okhttp3.Request;

import okio.Buffer;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.stream.Collectors;

/** Offline unit tests for {@link GenerateApi} request content types and payload serialization. */
public class GenerateApiBodyUnitTest {

    private static GenerateApi api;

    @BeforeClass
    public static void setUp() {
        api = GenerateApiTestFixtures.newApi();
    }

    @Test
    public void testGenerateBodyCall_ContentTypeJson() throws ApiException {
        EncodeData encodeData = new EncodeData("test");
        GenerateParams params = new GenerateParams(EncodeBarcodeType.QR, encodeData);
        GenerateBodyRequestWrapper request = new GenerateBodyRequestWrapper(params);
        Request httpRequest = api.generateBodyCall(request, null, null).request();
        String contentType = httpRequest.header("Content-Type");
        assertTrue(contentType.contains("application/json"));
    }

    @Test
    public void testGenerateBodyCall_HasBody() throws ApiException {
        EncodeData encodeData = new EncodeData("test");
        GenerateParams params = new GenerateParams(EncodeBarcodeType.QR, encodeData);
        GenerateBodyRequestWrapper request = new GenerateBodyRequestWrapper(params);
        Request httpRequest = api.generateBodyCall(request, null, null).request();
        assertNotNull(httpRequest.body());
    }

    @Test
    public void testGenerateBodyCall_WithGroupedGenerationParamsInJson() throws Exception {
        EncodeData encodeData = new EncodeData("test");
        GenerateParams params = new GenerateParams(EncodeBarcodeType.PDF417, encodeData);
        params.setQrParams(GenerateApiTestFixtures.buildQrParams());
        params.setCode128Params(GenerateApiTestFixtures.buildCode128Params());
        params.setPdf417Params(GenerateApiTestFixtures.buildPdf417Params());

        GenerateBodyRequestWrapper request = new GenerateBodyRequestWrapper(params);
        Request httpRequest = api.generateBodyCall(request, null, null).request();

        Buffer buffer = new Buffer();
        httpRequest.body().writeTo(buffer);
        String body = buffer.readUtf8();

        assertTrue(body.contains("\"qrParams\""));
        assertTrue(body.contains("\"qrEncodeMode\""));
        assertTrue(body.contains("\"Auto\""));
        assertTrue(body.contains("\"code128Params\""));
        assertTrue(body.contains("\"code128EncodeMode\""));
        assertTrue(body.contains("\"CodeB\""));
        assertTrue(body.contains("\"pdf417Params\""));
        assertTrue(body.contains("\"pdf417Columns\""));
        assertTrue(body.contains("\"pdf417Rows\""));
        assertTrue(body.contains("\"pdf417IsCode128Emulation\""));
    }

    @Test
    public void testGenerateMultipartCall_ContentTypeMultipart() throws ApiException {
        GenerateMultipartRequestWrapper request =
                new GenerateMultipartRequestWrapper(EncodeBarcodeType.QR, "test");
        Request httpRequest = api.generateMultipartCall(request, null, null).request();
        String contentType = httpRequest.header("Content-Type");
        assertTrue(contentType.contains("multipart/form-data"));
    }

    @Test
    public void testGenerateMultipartCall_WithGroupedGenerationParams() throws ApiException {
        GenerateMultipartRequestWrapper request =
                new GenerateMultipartRequestWrapper(EncodeBarcodeType.PDF417, "test");
        request.qrParams = GenerateApiTestFixtures.buildQrParams();
        request.code128Params = GenerateApiTestFixtures.buildCode128Params();
        request.pdf417Params = GenerateApiTestFixtures.buildPdf417Params();

        Request httpRequest = api.generateMultipartCall(request, null, null).request();
        assertTrue(httpRequest.body() instanceof MultipartBody);
        MultipartBody body = (MultipartBody) httpRequest.body();
        String partHeaders =
                body.parts().stream()
                        .map(part -> part.headers().toString())
                        .collect(Collectors.joining("\n"));

        assertTrue(partHeaders.contains("name=\"qrEncodeMode\""));
        assertTrue(partHeaders.contains("name=\"qrErrorLevel\""));
        assertTrue(partHeaders.contains("name=\"qrVersion\""));
        assertTrue(partHeaders.contains("name=\"qrECIEncoding\""));
        assertTrue(partHeaders.contains("name=\"qrAspectRatio\""));
        assertTrue(partHeaders.contains("name=\"microQRVersion\""));
        assertTrue(partHeaders.contains("name=\"rectMicroQrVersion\""));
        assertTrue(partHeaders.contains("name=\"code128EncodeMode\""));
        assertTrue(partHeaders.contains("name=\"pdf417EncodeMode\""));
        assertTrue(partHeaders.contains("name=\"pdf417ErrorLevel\""));
        assertTrue(partHeaders.contains("name=\"pdf417Truncate\""));
        assertTrue(partHeaders.contains("name=\"pdf417Columns\""));
        assertTrue(partHeaders.contains("name=\"pdf417Rows\""));
        assertTrue(partHeaders.contains("name=\"pdf417AspectRatio\""));
        assertTrue(partHeaders.contains("name=\"pdf417ECIEncoding\""));
        assertTrue(partHeaders.contains("name=\"pdf417IsReaderInitialization\""));
        assertTrue(partHeaders.contains("name=\"pdf417MacroCharacters\""));
        assertTrue(partHeaders.contains("name=\"pdf417IsLinked\""));
        assertTrue(partHeaders.contains("name=\"pdf417IsCode128Emulation\""));
    }
}
