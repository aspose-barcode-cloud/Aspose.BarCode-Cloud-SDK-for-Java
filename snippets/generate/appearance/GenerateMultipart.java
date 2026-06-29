import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.CodeLocation;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.Pdf417EncodeMode;
import com.aspose.barcode.cloud.model.Pdf417ErrorLevel;
import com.aspose.barcode.cloud.model.Pdf417Params;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;

import java.io.File;

public class GenerateMultipart {
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
            GenerateMultipartRequestWrapper request =
                    new GenerateMultipartRequestWrapper(
                            EncodeBarcodeType.PDF417, "Aspose.BarCode.Cloud");
            BarcodeImageParams imageParams = new BarcodeImageParams();
            imageParams.setTextLocation(CodeLocation.ABOVE);
            imageParams.setImageFormat(BarcodeImageFormat.SVG);
            request.barcodeImageParams = imageParams;

            Pdf417Params pdf417Params = new Pdf417Params();
            pdf417Params.setPdf417EncodeMode(Pdf417EncodeMode.AUTO);
            pdf417Params.setPdf417ErrorLevel(Pdf417ErrorLevel.LEVEL2);
            pdf417Params.setPdf417AspectRatio(2.0f);
            request.pdf417Params = pdf417Params;

            File barcodeImage = generateApi.generateMultipart(request);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
