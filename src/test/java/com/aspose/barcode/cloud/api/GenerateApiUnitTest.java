package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.*;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

import okhttp3.MultipartBody;
import okhttp3.Request;

import okio.Buffer;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenerateApiUnitTest {

    private static final String FAKE_TOKEN = "fake-test-token";
    private static GenerateApi api;

    @BeforeClass
    public static void setUp() {
        ApiClient apiClient = new ApiClient(FAKE_TOKEN);
        api = new GenerateApi(apiClient);
    }

    // --- Group A: Validation tests ---

    @Test(expected = ApiException.class)
    public void testGenerate_NullBarcodeType_ThrowsApiException() throws ApiException {
        api.generate(new GenerateRequestWrapper(null, "data"));
    }

    @Test(expected = ApiException.class)
    public void testGenerate_NullData_ThrowsApiException() throws ApiException {
        api.generate(new GenerateRequestWrapper(EncodeBarcodeType.QR, null));
    }

    @Test
    public void testGenerate_NullBarcodeType_ErrorMessage() {
        try {
            api.generate(new GenerateRequestWrapper(null, "data"));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.barcodeType"));
        }
    }

    @Test
    public void testGenerate_NullData_ErrorMessage() {
        try {
            api.generate(new GenerateRequestWrapper(EncodeBarcodeType.QR, null));
            fail("Expected ApiException");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("request.data"));
        }
    }

    @Test(expected = ApiException.class)
    public void testGenerateBody_NullParams_ThrowsApiException() throws ApiException {
        api.generateBody(new GenerateBodyRequestWrapper(null));
    }

    @Test(expected = ApiException.class)
    public void testGenerateMultipart_NullBarcodeType_ThrowsApiException() throws ApiException {
        api.generateMultipart(new GenerateMultipartRequestWrapper(null, "data"));
    }

    @Test(expected = ApiException.class)
    public void testGenerateMultipart_NullData_ThrowsApiException() throws ApiException {
        api.generateMultipart(new GenerateMultipartRequestWrapper(EncodeBarcodeType.QR, null));
    }

    // --- Group B: Path construction tests ---

    @Test
    public void testGenerateCall_QR_Path() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        Request httpRequest = api.generateCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/generate/QR"));
    }

    @Test
    public void testGenerateCall_Code128_Path() throws ApiException {
        GenerateRequestWrapper request =
                new GenerateRequestWrapper(EncodeBarcodeType.CODE128, "test");
        Request httpRequest = api.generateCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/generate/Code128"));
    }

    @Test
    public void testGenerateCall_GS1Code128_Path() throws ApiException {
        GenerateRequestWrapper request =
                new GenerateRequestWrapper(EncodeBarcodeType.GS1_CODE128, "test");
        Request httpRequest = api.generateCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/generate/GS1Code128"));
    }

    @Test
    public void testGenerateCall_AllEnumTypes_Path() throws ApiException {
        for (EncodeBarcodeType type : EncodeBarcodeType.values()) {
            GenerateRequestWrapper request = new GenerateRequestWrapper(type, "test");
            Request httpRequest = api.generateCall(request, null, null).request();
            String url = httpRequest.url().toString();
            assertTrue(
                    "URL should contain '" + type.toString() + "' for enum " + type.name(),
                    url.contains("/barcode/generate/" + type.toString()));
        }
    }

    @Test
    public void testGenerateCall_HttpMethodIsGet() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        Request httpRequest = api.generateCall(request, null, null).request();
        assertEquals("GET", httpRequest.method());
    }

    @Test
    public void testGenerateBodyCall_PathAndMethod() throws ApiException {
        EncodeData encodeData = new EncodeData("test");
        GenerateParams params = new GenerateParams(EncodeBarcodeType.QR, encodeData);
        GenerateBodyRequestWrapper request = new GenerateBodyRequestWrapper(params);
        Request httpRequest = api.generateBodyCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/generate-body"));
        assertEquals("POST", httpRequest.method());
    }

    @Test
    public void testGenerateMultipartCall_PathAndMethod() throws ApiException {
        GenerateMultipartRequestWrapper request =
                new GenerateMultipartRequestWrapper(EncodeBarcodeType.QR, "test");
        Request httpRequest = api.generateMultipartCall(request, null, null).request();
        assertTrue(httpRequest.url().toString().contains("/barcode/generate-multipart"));
        assertEquals("POST", httpRequest.method());
    }

    // --- Group C: Query parameter tests ---

    @Test
    public void testGenerateCall_RequiredParamsOnly_DefaultsPresent() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "hello");
        String url = api.generateCall(request, null, null).request().url().toString();

        assertTrue(url.contains("data="));
        assertFalse(url.contains("foregroundColor="));
        assertFalse(url.contains("backgroundColor="));
        assertFalse(url.contains("imageFormat="));
        assertFalse(url.contains("textLocation="));
        assertFalse(url.contains("units="));
        assertFalse(url.contains("resolution="));
        assertFalse(url.contains("imageHeight="));
        assertFalse(url.contains("imageWidth="));
        assertFalse(url.contains("rotationAngle="));
    }

    @Test
    public void testGenerateCall_WithImageFormat() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        request.barcodeImageParams = new BarcodeImageParams();
        request.barcodeImageParams.setImageFormat(BarcodeImageFormat.PNG);
        String url = api.generateCall(request, null, null).request().url().toString();
        assertTrue(url.contains("imageFormat=Png"));
    }

    @Test
    public void testGenerateCall_WithResolution() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        request.barcodeImageParams = new BarcodeImageParams();
        request.barcodeImageParams.setResolution(300.0f);
        String url = api.generateCall(request, null, null).request().url().toString();
        assertTrue(url.contains("resolution=300"));
    }

    @Test
    public void testGenerateCall_WithDataType() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        request.dataType = EncodeDataType.BASE64_BYTES;
        String url = api.generateCall(request, null, null).request().url().toString();
        assertTrue(url.contains("dataType=Base64Bytes"));
    }

    @Test
    public void testGenerateCall_WithAllOptionalParams() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        request.dataType = EncodeDataType.STRING_DATA;
        request.barcodeImageParams = new BarcodeImageParams();
        request.barcodeImageParams.setImageFormat(BarcodeImageFormat.JPEG);
        request.barcodeImageParams.setTextLocation(CodeLocation.BELOW);
        request.barcodeImageParams.setForegroundColor("Red");
        request.barcodeImageParams.setBackgroundColor("Blue");
        request.barcodeImageParams.setUnits(GraphicsUnit.PIXEL);
        request.barcodeImageParams.setResolution(150.0f);
        request.barcodeImageParams.setImageHeight(200.0f);
        request.barcodeImageParams.setImageWidth(400.0f);
        request.barcodeImageParams.setRotationAngle(90);

        String url = api.generateCall(request, null, null).request().url().toString();
        assertTrue(url.contains("dataType="));
        assertTrue(url.contains("imageFormat="));
        assertTrue(url.contains("textLocation="));
        assertTrue(url.contains("foregroundColor="));
        assertTrue(url.contains("backgroundColor="));
        assertTrue(url.contains("units="));
        assertTrue(url.contains("resolution="));
        assertTrue(url.contains("imageHeight="));
        assertTrue(url.contains("imageWidth="));
        assertTrue(url.contains("rotationAngle="));
    }

    @Test
    public void testGenerateCall_WithGroupedGenerationParams() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        request.qrParams = buildQrParams();
        request.code128Params = buildCode128Params();
        request.pdf417Params = buildPdf417Params();

        String url = api.generateCall(request, null, null).request().url().toString();
        assertTrue(url.contains("qrEncodeMode=Auto"));
        assertTrue(url.contains("qrErrorLevel=LevelM"));
        assertTrue(url.contains("qrVersion=Version01"));
        assertTrue(url.contains("qrECIEncoding=UTF8"));
        assertTrue(url.contains("qrAspectRatio=0.75"));
        assertTrue(url.contains("microQRVersion=M2"));
        assertTrue(url.contains("rectMicroQrVersion=R7x43"));
        assertTrue(url.contains("code128EncodeMode=CodeB"));
        assertTrue(url.contains("pdf417EncodeMode=Auto"));
        assertTrue(url.contains("pdf417ErrorLevel=Level2"));
        assertTrue(url.contains("pdf417Truncate=true"));
        assertTrue(url.contains("pdf417Columns=3"));
        assertTrue(url.contains("pdf417Rows=9"));
        assertTrue(url.contains("pdf417AspectRatio=3.0"));
        assertTrue(url.contains("pdf417ECIEncoding=UTF8"));
        assertTrue(url.contains("pdf417IsReaderInitialization=false"));
        assertTrue(url.contains("pdf417MacroCharacters=Macro05"));
        assertTrue(url.contains("pdf417IsLinked=false"));
        assertTrue(url.contains("pdf417IsCode128Emulation=false"));
    }

    // --- Group D: Content-Type and body tests ---

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
        params.setQrParams(buildQrParams());
        params.setCode128Params(buildCode128Params());
        params.setPdf417Params(buildPdf417Params());

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
        request.qrParams = buildQrParams();
        request.code128Params = buildCode128Params();
        request.pdf417Params = buildPdf417Params();

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

    @Test
    public void testGenerateCall_AuthorizationHeader() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        Request httpRequest = api.generateCall(request, null, null).request();
        assertEquals("Bearer " + FAKE_TOKEN, httpRequest.header("Authorization"));
    }

    // --- Group E: Edge cases ---

    @Test
    public void testGenerateCall_SpecialCharactersInData() throws ApiException {
        GenerateRequestWrapper request =
                new GenerateRequestWrapper(EncodeBarcodeType.QR, "Hello World!@#$%");
        Request httpRequest = api.generateCall(request, null, null).request();
        assertNotNull(httpRequest.url());
    }

    @Test
    public void testGenerateCall_EmptyStringData() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "");
        Request httpRequest = api.generateCall(request, null, null).request();
        assertNotNull(httpRequest.url());
    }

    // --- Group F: Public method coverage ---

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

    private static QrParams buildQrParams() {
        QrParams params = new QrParams();
        params.setQrEncodeMode(QREncodeMode.AUTO);
        params.setQrErrorLevel(QRErrorLevel.LEVEL_M);
        params.setQrVersion(QRVersion.VERSION01);
        params.setQrECIEncoding(ECIEncodings.UTF8);
        params.setQrAspectRatio(0.75f);
        params.setMicroQRVersion(MicroQRVersion.M2);
        params.setRectMicroQrVersion(RectMicroQRVersion.R7X43);
        return params;
    }

    private static Code128Params buildCode128Params() {
        Code128Params params = new Code128Params();
        params.setCode128EncodeMode(Code128EncodeMode.CODE_B);
        return params;
    }

    private static Pdf417Params buildPdf417Params() {
        Pdf417Params params = new Pdf417Params();
        params.setPdf417EncodeMode(Pdf417EncodeMode.AUTO);
        params.setPdf417ErrorLevel(Pdf417ErrorLevel.LEVEL2);
        params.setPdf417Truncate(true);
        params.setPdf417Columns(3);
        params.setPdf417Rows(9);
        params.setPdf417AspectRatio(3.0f);
        params.setPdf417ECIEncoding(ECIEncodings.UTF8);
        params.setPdf417IsReaderInitialization(false);
        params.setPdf417MacroCharacters(MacroCharacter.MACRO05);
        params.setPdf417IsLinked(false);
        params.setPdf417IsCode128Emulation(false);
        return params;
    }
}
