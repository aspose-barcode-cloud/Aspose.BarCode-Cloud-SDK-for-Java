package com.aspose.barcode.cloud.test;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.*;
import com.aspose.barcode.cloud.requests.GenerateBatchRequestWrapper;

import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.util.Collections;
import java.util.zip.ZipFile;

public class BatchGenerateTest extends TestBase {
    @Test
    public void generatesBinaryArchives() throws Exception {
        for (BatchArchiveFormat format : BatchArchiveFormat.values()) {
            BatchGenerateItem item =
                    new BatchGenerateItem(
                            new GenerateParams(
                                    EncodeBarcodeType.QR, new EncodeData("Batch example")));
            item.setFileName("qr.png");
            BatchGenerateRequest batch = new BatchGenerateRequest(Collections.singletonList(item));
            batch.setArchiveFormat(format);
            File result =
                    new GenerateApi(apiClient)
                            .generateBatch(new GenerateBatchRequestWrapper(batch));
            try {
                byte[] bytes = Files.readAllBytes(result.toPath());
                assertTrue(bytes.length > 0);
                if (format == BatchArchiveFormat.ZIP) {
                    try (ZipFile zip = new ZipFile(result)) {
                        assertEquals(1, zip.size());
                        assertNotNull(zip.getEntry("qr.png"));
                    }
                } else if (format == BatchArchiveFormat.TAR_GZIP) {
                    assertEquals(0x1f, bytes[0] & 0xff);
                    assertEquals(0x8b, bytes[1] & 0xff);
                } else {
                    assertEquals(
                            "ustar",
                            new String(bytes, 257, 5, java.nio.charset.StandardCharsets.US_ASCII));
                }
            } finally {
                Files.deleteIfExists(result.toPath());
            }
        }
    }
}
