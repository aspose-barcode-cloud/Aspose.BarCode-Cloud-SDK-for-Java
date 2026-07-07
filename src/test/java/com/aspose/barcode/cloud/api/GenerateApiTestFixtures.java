package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.model.*;

/** Shared fixtures for the offline {@link GenerateApi} unit tests. */
final class GenerateApiTestFixtures {

    static final String FAKE_TOKEN = "fake-test-token";

    private GenerateApiTestFixtures() {}

    static GenerateApi newApi() {
        return new GenerateApi(new ApiClient(FAKE_TOKEN));
    }

    static QrParams buildQrParams() {
        QrParams params = new QrParams();
        params.setQrEncodeMode(QREncodeMode.AUTO);
        params.setQrErrorLevel(QRErrorLevel.LEVEL_M);
        params.setQrVersion(QRVersion.VERSION01);
        params.setQrECIEncoding(ECIEncodings.UTF8);
        params.setQrAspectRatio(0.75f);
        params.setMicroQRVersion(MicroQRVersion.M2);
        params.setRectMicroQrVersion(RectMicroQRVersion.R7X43);
        return params;
    }

    static Code128Params buildCode128Params() {
        Code128Params params = new Code128Params();
        params.setCode128EncodeMode(Code128EncodeMode.CODE_B);
        return params;
    }

    static Pdf417Params buildPdf417Params() {
        Pdf417Params params = new Pdf417Params();
        params.setPdf417EncodeMode(Pdf417EncodeMode.AUTO);
        params.setPdf417ErrorLevel(Pdf417ErrorLevel.LEVEL2);
        params.setPdf417Truncate(true);
        params.setPdf417Columns(3);
        params.setPdf417Rows(9);
        params.setPdf417AspectRatio(3.0f);
        params.setPdf417ECIEncoding(ECIEncodings.UTF8);
        params.setPdf417IsReaderInitialization(false);
        params.setPdf417MacroCharacters(MacroCharacter.MACRO05);
        params.setPdf417IsLinked(false);
        params.setPdf417IsCode128Emulation(false);
        return params;
    }
}
