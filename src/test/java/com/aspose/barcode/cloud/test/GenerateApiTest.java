package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.Code128EncodeMode;
import com.aspose.barcode.cloud.model.Code128Params;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeData;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.model.GenerateParams;
import com.aspose.barcode.cloud.model.Pdf417EncodeMode;
import com.aspose.barcode.cloud.model.Pdf417ErrorLevel;
import com.aspose.barcode.cloud.model.Pdf417Params;
import com.aspose.barcode.cloud.model.QREncodeMode;
import com.aspose.barcode.cloud.model.QRErrorLevel;
import com.aspose.barcode.cloud.model.QRVersion;
import com.aspose.barcode.cloud.model.QrParams;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

public class GenerateApiTest extends TestBase {

    private static GenerateApi api;

    @BeforeClass
    public static void setUpClass() {
        // Initialize
        api = new GenerateApi(apiClient);
    }

    @Test
    public void testBarcodeGenerateBarcodeTypeGet() throws Exception {
        // Test case for barcode_generate_barcode_type_get
        // Generate barcode

        File response =
                api.generate(new GenerateRequestWrapper(EncodeBarcodeType.CODE128, "Hello!"));

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
    }

    @Test
    public void testBarcodeGenerateGetWithQrParams() throws Exception {
        GenerateRequestWrapper request =
                new GenerateRequestWrapper(EncodeBarcodeType.QR, "Java SDK QR params");
        request.qrParams = new QrParams();
        request.qrParams.setQrEncodeMode(QREncodeMode.AUTO);
        request.qrParams.setQrErrorLevel(QRErrorLevel.LEVEL_M);
        request.qrParams.setQrVersion(QRVersion.AUTO);
        request.qrParams.setQrAspectRatio(1.0f);

        File response = api.generate(request);

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
    }

    @Test
    public void testBarcodeGenerateBodyPost() throws Exception {
        // Test case for barcode_generate_body_post
        // Generate barcode from params in body
        BarcodeImageParams imageParams = new BarcodeImageParams();
        imageParams.setImageFormat(BarcodeImageFormat.JPEG);

        EncodeData encodeData = new EncodeData("VGVzdA==");
        encodeData.setDataType(EncodeDataType.BASE64_BYTES);
        GenerateParams generatorParams = new GenerateParams(EncodeBarcodeType.QR, encodeData);

        generatorParams.setBarcodeImageParams(imageParams);

        File response = api.generateBody(new GenerateBodyRequestWrapper(generatorParams));

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
    }

    @Test
    public void testBarcodeGenerateBodyPostWithPdf417Params() throws Exception {
        EncodeData encodeData = new EncodeData("Java SDK PDF417 params");
        GenerateParams generatorParams = new GenerateParams(EncodeBarcodeType.PDF417, encodeData);

        Pdf417Params pdf417Params = new Pdf417Params();
        pdf417Params.setPdf417EncodeMode(Pdf417EncodeMode.AUTO);
        pdf417Params.setPdf417ErrorLevel(Pdf417ErrorLevel.LEVEL2);
        pdf417Params.setPdf417Columns(0);
        pdf417Params.setPdf417Rows(0);
        pdf417Params.setPdf417Truncate(false);
        generatorParams.setPdf417Params(pdf417Params);

        File response = api.generateBody(new GenerateBodyRequestWrapper(generatorParams));

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
    }

    @Test
    public void testBarcodeGenerateMultipartPost() throws Exception {
        // Test case for barcode_generate_form_post
        // Generate barcode from params in form

        GenerateMultipartRequestWrapper request =
                new GenerateMultipartRequestWrapper(EncodeBarcodeType.QR, "54657374");
        request.dataType = EncodeDataType.HEX_BYTES;
        File response = api.generateMultipart(request);

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
    }

    @Test
    public void testBarcodeGenerateMultipartPostWithCode128Params() throws Exception {
        GenerateMultipartRequestWrapper request =
                new GenerateMultipartRequestWrapper(EncodeBarcodeType.CODE128, "JavaCode128");
        request.code128Params = new Code128Params();
        request.code128Params.setCode128EncodeMode(Code128EncodeMode.CODE_B);

        File response = api.generateMultipart(request);

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
    }
}
