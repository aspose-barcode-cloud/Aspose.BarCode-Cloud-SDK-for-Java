import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.*;
import com.aspose.barcode.cloud.requests.GenerateBatchRequestWrapper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collections;

public class GenerateBatch {
    public static void main(String[] args) throws Exception {
        ApiClient client = new ApiClient(System.getenv("TEST_CONFIGURATION_ACCESS_TOKEN"));
        BatchGenerateItem item =
                new BatchGenerateItem(
                        new GenerateParams(EncodeBarcodeType.QR, new EncodeData("Batch example")));
        item.setFileName("qr.png");
        BatchGenerateRequest batch = new BatchGenerateRequest(Collections.singletonList(item));
        batch.setArchiveFormat(BatchArchiveFormat.ZIP);
        File archive =
                new GenerateApi(client).generateBatch(new GenerateBatchRequestWrapper(batch));
        Files.move(
                archive.toPath(), Paths.get("barcodes.zip"), StandardCopyOption.REPLACE_EXISTING);
    }
}
