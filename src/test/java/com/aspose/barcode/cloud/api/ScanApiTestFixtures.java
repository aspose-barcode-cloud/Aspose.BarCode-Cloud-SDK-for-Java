package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiClient;

/** Shared fixtures for the offline {@link ScanApi} unit tests. */
final class ScanApiTestFixtures {

    static final String FAKE_TOKEN = "fake-test-token";

    private ScanApiTestFixtures() {}

    static ScanApi newApi() {
        return new ScanApi(new ApiClient(FAKE_TOKEN));
    }
}
