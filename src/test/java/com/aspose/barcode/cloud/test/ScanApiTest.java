package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.ScanBase64Request;
import com.aspose.barcode.cloud.requests.ScanBase64RequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;
import com.aspose.barcode.cloud.requests.ScanRequestWrapper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class ScanApiTest extends TestBase {
    private static ScanApi api = null;
    private static String testDataFolderPath = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        api = new ScanApi(apiClient);
        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        testDataFolderPath = String.valueOf(Paths.get(currentPath, "test_data"));
    }

    @Test
    public void testBarcodeScanMultipartPost() throws Exception {
        File file = new File(String.valueOf(Paths.get(testDataFolderPath, "pdf417Sample.png")));
        ScanMultipartRequestWrapper ScanRequestWrapper = new ScanMultipartRequestWrapper(file);

        BarcodeResponseList scanResponse = api.scanMultipart(ScanRequestWrapper);
        assertNotNull(scanResponse);

        assertEquals(1, scanResponse.getBarcodes().size());

        assertEquals(
                DecodeBarcodeType.PDF417.toString(), scanResponse.getBarcodes().get(0).getType());
        assertEquals(
                "Aspose.BarCode for Cloud Sample",
                scanResponse.getBarcodes().get(0).getBarcodeValue());
    }

    @Test
    public void testBarcodeScanBodyPost() throws Exception {
        File file = new File(String.valueOf(Paths.get(testDataFolderPath, "QR_and_Code128.png")));
        byte[] fileContent = Files.readAllBytes(file.toPath());
        String encodedFile = Base64.getEncoder().encodeToString(fileContent);

        ScanBase64Request scanBase64Request = new ScanBase64Request(encodedFile);

        ScanBase64RequestWrapper scanRequestWrapper =
                new ScanBase64RequestWrapper(scanBase64Request);
        BarcodeResponseList scanResponse = api.scanBase64(scanRequestWrapper);
        assertNotNull(scanResponse);

        assertEquals(2, scanResponse.getBarcodes().size());
        assertEquals(DecodeBarcodeType.QR.toString(), scanResponse.getBarcodes().get(0).getType());
        assertEquals("Hello world!", scanResponse.getBarcodes().get(0).getBarcodeValue());

        assertEquals(
                DecodeBarcodeType.CODE128.toString(), scanResponse.getBarcodes().get(1).getType());
        assertEquals("Hello world!", scanResponse.getBarcodes().get(1).getBarcodeValue());
    }

    @Test
    public void testBarcodeScanGet() throws Exception {
        ScanRequestWrapper ScanRequestWrapper =
                new ScanRequestWrapper(
                        new URI(
                                "https://raw.githubusercontent.com/aspose-barcode-cloud/Aspose.BarCode-Cloud-SDK-for-Java/main/test_data/QR_and_Code128.png"));

        BarcodeResponseList response = api.scan(ScanRequestWrapper);
        assertNotNull(response);

        assertEquals(2, response.getBarcodes().size());
        assertEquals(DecodeBarcodeType.QR.toString(), response.getBarcodes().get(0).getType());
        assertEquals("Hello world!", response.getBarcodes().get(0).getBarcodeValue());
        assertEquals(DecodeBarcodeType.CODE128.toString(), response.getBarcodes().get(1).getType());
        assertEquals("Hello world!", response.getBarcodes().get(1).getBarcodeValue());
    }
}
