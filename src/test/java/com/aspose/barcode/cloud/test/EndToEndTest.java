package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;

import org.junit.Test;

import java.io.File;

public class EndToEndTest extends TestBase {

    @Test
    public void testGenerateAndRecognize() throws Exception {

        // Initialize GenerateApi and ScanApi
        GenerateApi genApi = new GenerateApi(apiClient);
        ScanApi scanApi = new ScanApi(apiClient);

        // Generate barcode request
        GenerateRequestWrapper genRequest =
                new GenerateRequestWrapper(EncodeBarcodeType.QR, "Java SDK Test");
        genRequest.dataType = EncodeDataType.STRING_DATA;
        genRequest.barcodeImageParams = new BarcodeImageParams();
        genRequest.barcodeImageParams.setImageFormat(BarcodeImageFormat.PNG);

        // Generate barcode
        File genResponse = genApi.generate(genRequest);

        // Scan barcode request
        ScanMultipartRequestWrapper ScanRequestWrapper =
                new ScanMultipartRequestWrapper(genResponse);

        // Scan barcode
        BarcodeResponseList scanResponse = scanApi.scanMultipart(ScanRequestWrapper);

        // Assertions
        assertNotNull(scanResponse);
        assertEquals("QR", scanResponse.getBarcodes().get(0).getType());
        assertEquals("Java SDK Test", scanResponse.getBarcodes().get(0).getBarcodeValue());
    }
}
