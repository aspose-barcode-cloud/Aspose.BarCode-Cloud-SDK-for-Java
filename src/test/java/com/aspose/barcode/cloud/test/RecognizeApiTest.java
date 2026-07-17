package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.RecognizeApi;
import com.aspose.barcode.cloud.model.BarcodeResponse;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.RecognitionImageKind;
import com.aspose.barcode.cloud.model.RecognitionMode;
import com.aspose.barcode.cloud.model.RecognizeBase64Request;
import com.aspose.barcode.cloud.requests.RecognizeBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.RecognizeMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.RecognizeRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;

public class RecognizeApiTest extends TestBase {

    private static RecognizeApi api = null;
    private static String testDataFolderPath = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        api = new RecognizeApi(apiClient);
        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        testDataFolderPath = String.valueOf(Paths.get(currentPath, "test_data"));
    }

    @Test
    public void testBarcodeRecognizeGet() throws Exception {
        BarcodeResponseList response =
                api.recognize(
                        new RecognizeRequestWrapper(
                                DecodeBarcodeType.QR,
                                new URI(
                                        "https://raw.githubusercontent.com/aspose-barcode-cloud/Aspose.BarCode-Cloud-SDK-for-Java/main/test_data/QR_and_Code128.png")));

        assertNotNull(response);
        assertEquals(1, response.getBarcodes().size());
        BarcodeResponse barcode = response.getBarcodes().get(0);
        assertEquals(DecodeBarcodeType.QR.toString(), barcode.getType());
        assertEquals("Hello world!", barcode.getBarcodeValue());
    }

    @Test
    public void testBarcodeRecognizeBodyPost() throws Exception {
        File file = new File(String.valueOf(Paths.get(testDataFolderPath, "pdf417Sample.png")));
        byte[] fileContent = Files.readAllBytes(file.toPath());
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        RecognizeBase64Request request =
                new RecognizeBase64Request(Arrays.asList(DecodeBarcodeType.PDF417), encodedString);
        request.setRecognitionImageKind(RecognitionImageKind.CLEAR_IMAGE);
        request.setRecognitionMode(RecognitionMode.FAST);

        BarcodeResponseList response =
                api.recognizeBase64(new RecognizeBase64RequestWrapper(request));

        assertNotNull(response);
        assertEquals(1, response.getBarcodes().size());
        BarcodeResponse barcode = response.getBarcodes().get(0);
        assertEquals(DecodeBarcodeType.PDF417.toString(), barcode.getType());
        assertEquals("Aspose.BarCode for Cloud Sample", barcode.getBarcodeValue());
        assertNotNull(barcode.getRegion());
        assertEquals(true, barcode.getRegion().get(0).getX() > 0);
        assertEquals(true, barcode.getRegion().get(0).getY() > 0);
    }

    @Test
    public void testBarcodeRecognizeMultipartPost() throws Exception {
        File file = new File(String.valueOf(Paths.get(testDataFolderPath, "ManyTypes.png")));
        RecognizeMultipartRequestWrapper request =
                new RecognizeMultipartRequestWrapper(DecodeBarcodeType.MOST_COMMONLY_USED, file);
        request.recognitionImageKind = RecognitionImageKind.CLEAR_IMAGE;
        request.recognitionMode = RecognitionMode.FAST;

        BarcodeResponseList response;
        try {
            response = api.recognizeMultipart(request);
        } catch (ApiException e) {
            throw new AssertionError(
                    "recognizeMultipart failed: httpCode="
                            + e.getHttpCode()
                            + ", details="
                            + e.getDetails(),
                    e);
        }

        assertNotNull(response);
        assertEquals(3, response.getBarcodes().size());
    }
}
