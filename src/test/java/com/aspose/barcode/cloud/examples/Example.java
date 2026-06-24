package com.aspose.barcode.cloud.examples;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.QREncodeMode;
import com.aspose.barcode.cloud.model.QRErrorLevel;
import com.aspose.barcode.cloud.model.QRVersion;
import com.aspose.barcode.cloud.model.QrParams;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;

import java.io.File;

public class Example {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");

        GenerateApi genApi = new GenerateApi(client);
        ScanApi scanApi = new ScanApi(client);

        try {
            System.out.println("Generating barcode...");
            File barcodeImage = generateBarcode(genApi);
            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

            System.out.println("Recognizing barcode on image...");
            BarcodeResponseList recognized = scanBarcode(scanApi, barcodeImage);
            System.out.print("Barcode on image:");
            System.out.println(recognized.toString());
        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

    private static File generateBarcode(GenerateApi api) throws ApiException {
        EncodeBarcodeType type = EncodeBarcodeType.QR;
        String text = "Aspose.BarCode for Cloud Sample";
        GenerateRequestWrapper request = new GenerateRequestWrapper(type, text);
        request.barcodeImageParams = new BarcodeImageParams();
        request.barcodeImageParams.setImageFormat(BarcodeImageFormat.JPEG);
        request.qrParams = new QrParams();
        request.qrParams.setQrEncodeMode(QREncodeMode.AUTO);
        request.qrParams.setQrErrorLevel(QRErrorLevel.LEVEL_M);
        request.qrParams.setQrVersion(QRVersion.AUTO);
        request.qrParams.setQrAspectRatio(0.75f);

        return api.generate(request);
    }

    private static BarcodeResponseList scanBarcode(ScanApi api, File barcodeImage)
            throws ApiException {
        ScanMultipartRequestWrapper request = new ScanMultipartRequestWrapper(barcodeImage);

        return api.scanMultipart(request);
    }
}
