import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.CodeLocation;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.QREncodeMode;
import com.aspose.barcode.cloud.model.QRErrorLevel;
import com.aspose.barcode.cloud.model.QRVersion;
import com.aspose.barcode.cloud.model.QrParams;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

import java.io.File;

public class GenerateGet {
    public static void main(String[] args) {
        String accessToken = System.getenv("TEST_CONFIGURATION_ACCESS_TOKEN");
        ApiClient client;

        if (accessToken != null && !accessToken.isEmpty()) {
            client = new ApiClient(accessToken);
        } else {
            client =
                    new ApiClient(
                            "Client Id from https://dashboard.aspose.cloud/applications",
                            "Client Secret from https://dashboard.aspose.cloud/applications");
        }

        GenerateApi generateApi = new GenerateApi(client);

        try {
            GenerateRequestWrapper request =
                    new GenerateRequestWrapper(EncodeBarcodeType.QR, "Aspose.BarCode.Cloud");

            BarcodeImageParams imageParams = new BarcodeImageParams();
            imageParams.setImageFormat(BarcodeImageFormat.PNG);
            imageParams.setForegroundColor("Black");
            imageParams.setBackgroundColor("White");
            imageParams.setTextLocation(CodeLocation.BELOW);
            imageParams.setImageHeight(200f);
            imageParams.setImageWidth(200f);
            imageParams.setResolution(300f);
            request.barcodeImageParams = imageParams;

            QrParams qrParams = new QrParams();
            qrParams.setQrEncodeMode(QREncodeMode.AUTO);
            qrParams.setQrErrorLevel(QRErrorLevel.LEVEL_M);
            qrParams.setQrVersion(QRVersion.AUTO);
            qrParams.setQrAspectRatio(1.0f);
            request.qrParams = qrParams;

            File barcodeImage = generateApi.generate(request);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
