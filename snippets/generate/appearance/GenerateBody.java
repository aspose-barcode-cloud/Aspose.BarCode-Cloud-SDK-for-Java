import com.aspose.barcode.cloud.*;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeData;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.model.GenerateParams;
import com.aspose.barcode.cloud.model.QREncodeMode;
import com.aspose.barcode.cloud.model.QRErrorLevel;
import com.aspose.barcode.cloud.model.QRVersion;
import com.aspose.barcode.cloud.model.QrParams;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;

import java.io.File;

public class GenerateBody {
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
            EncodeData encodeData = new EncodeData("Aspose");
            encodeData.setDataType(EncodeDataType.STRING_DATA);

            BarcodeImageParams imageParams = new BarcodeImageParams();
            imageParams.setForegroundColor("#FF0000");
            imageParams.setBackgroundColor("#FFFF00");
            imageParams.setImageFormat(BarcodeImageFormat.JPEG);
            imageParams.setRotationAngle(90);

            QrParams qrParams = new QrParams();
            qrParams.setQrEncodeMode(QREncodeMode.AUTO);
            qrParams.setQrErrorLevel(QRErrorLevel.LEVEL_M);
            qrParams.setQrVersion(QRVersion.AUTO);
            qrParams.setQrAspectRatio(0.75f);

            GenerateParams generateParams = new GenerateParams(EncodeBarcodeType.QR, encodeData);
            generateParams.setBarcodeImageParams(imageParams);
            generateParams.setQrParams(qrParams);

            GenerateBodyRequestWrapper request = new GenerateBodyRequestWrapper(generateParams);
            File barcodeImage = generateApi.generateBody(request);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
