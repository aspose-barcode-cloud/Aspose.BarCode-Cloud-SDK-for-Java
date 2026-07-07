package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiClient;

/** Shared fixtures for the offline {@link RecognizeApi} unit tests. */
final class RecognizeApiTestFixtures {

    static final String FAKE_TOKEN = "fake-test-token";

    private RecognizeApiTestFixtures() {}

    static RecognizeApi newApi() {
        return new RecognizeApi(new ApiClient(FAKE_TOKEN));
    }
}
