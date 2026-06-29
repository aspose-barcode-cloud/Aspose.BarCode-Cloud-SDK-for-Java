import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.Code128EncodeMode;
import com.aspose.barcode.cloud.model.Code128Params;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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
                    new GenerateRequestWrapper(EncodeBarcodeType.CODE128, "Aspose.BarCode.Cloud");

            BarcodeImageParams imageParams = new BarcodeImageParams();
            imageParams.setImageFormat(BarcodeImageFormat.PNG);
            request.barcodeImageParams = imageParams;

            Code128Params code128Params = new Code128Params();
            code128Params.setCode128EncodeMode(Code128EncodeMode.AUTO);
            request.code128Params = code128Params;

            File barcodeImage = generateApi.generate(request);

            File destination = Paths.get("test_data", "Code128.png").toFile();
            Files.move(
                    barcodeImage.toPath(),
                    destination.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Barcode image saved to file " + destination.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
