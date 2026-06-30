import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
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
                    new GenerateMultipartRequestWrapper(EncodeBarcodeType.CODE39, "Aspose");
            BarcodeImageParams imageParams = new BarcodeImageParams();
            imageParams.setForegroundColor("Green");
            imageParams.setBackgroundColor("Yellow");
            imageParams.setImageFormat(BarcodeImageFormat.GIF);
            request.barcodeImageParams = imageParams;

            File barcodeFile = generateApi.generateMultipart(request);

            System.out.println("Barcode image saved to file " + barcodeFile.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
