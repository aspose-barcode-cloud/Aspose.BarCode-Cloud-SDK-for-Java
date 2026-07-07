package com.aspose.barcode.cloud.api;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.*;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

import okhttp3.Request;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Offline unit tests for {@link GenerateApi} request building: paths, HTTP methods, query
 * parameters, headers and edge cases.
 */
public class GenerateApiRequestUnitTest {

    private static GenerateApi api;

    @BeforeClass
    public static void setUp() {
        api = GenerateApiTestFixtures.newApi();
    }

    // --- Path construction tests ---

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

    // --- Query parameter tests ---

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
        request.qrParams = GenerateApiTestFixtures.buildQrParams();
        request.code128Params = GenerateApiTestFixtures.buildCode128Params();
        request.pdf417Params = GenerateApiTestFixtures.buildPdf417Params();

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

    // --- Header tests ---

    @Test
    public void testGenerateCall_AuthorizationHeader() throws ApiException {
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "test");
        Request httpRequest = api.generateCall(request, null, null).request();
        assertEquals(
                "Bearer " + GenerateApiTestFixtures.FAKE_TOKEN,
                httpRequest.header("Authorization"));
    }

    // --- Edge cases ---

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
}
