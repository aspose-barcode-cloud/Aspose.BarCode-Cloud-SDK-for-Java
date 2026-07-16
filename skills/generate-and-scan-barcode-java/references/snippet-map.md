# Snippet and example map

Use this reference when you want the closest existing pattern before writing new Java SDK code or when updating docs, snippets, and examples.

## Small end-user examples

- `src/test/java/com/aspose/barcode/cloud/examples/Example.java`: minimal generate-then-scan flow using `GenerateApi` and `ScanApi`.
- `snippets/ManualFetchToken.java`: manual OAuth client-credentials token fetch without the SDK.

## Generate patterns

- `snippets/generate/save/GenerateGet.java`: simple `generate(...)` and save-to-file flow.
- `snippets/generate/save/GenerateBody.java`: `generateBody(...)` with `GenerateParams`.
- `snippets/generate/save/GenerateMultipart.java`: multipart generation flow.
- `snippets/generate/set-text/*`: `EncodeData` and `EncodeDataType` examples.
- `snippets/generate/set-size/*`: width, height, resolution, and units examples.
- `snippets/generate/set-colorscheme/*`: foreground and background color examples.
- `snippets/generate/appearance/*`: richer `BarcodeImageParams` examples.

## Recognize and scan patterns

- `snippets/read/set-source/RecognizeGet.java`: recognize from a public URL.
- `snippets/read/set-source/RecognizeMultipart.java`: recognize from a local file.
- `snippets/read/set-source/RecognizeBody.java`: recognize from base64 bytes.
- `snippets/read/set-source/ScanGet.java`: auto-scan from a public URL.
- `snippets/read/set-source/ScanMultipart.java`: auto-scan from a local file.
- `snippets/read/set-source/ScanBody.java`: auto-scan from base64 bytes.
- `snippets/read/set-target-types/*`: choosing `DecodeBarcodeType` or `List<DecodeBarcodeType>`.
- `snippets/read/set-quality/*`: `RecognitionMode` examples.
- `snippets/read/set-image-kind/*`: `RecognitionImageKind` examples.

## Tests worth copying

- `src/test/java/com/aspose/barcode/cloud/test/EndToEndTest.java`: generate a barcode `File`, then scan that same file end to end.
- `src/test/java/com/aspose/barcode/cloud/test/GenerateApiTest.java`: generate via GET, body, and multipart variants.
- `src/test/java/com/aspose/barcode/cloud/test/RecognizeApiTest.java`: recognize via base64 body, multipart, and URL.
- `src/test/java/com/aspose/barcode/cloud/test/ScanApiTest.java`: scan via base64 body, multipart, and URL.
- `src/test/java/com/aspose/barcode/cloud/test/ConfigurationTest.java`: configuration defaults and `buildApiClient()` behavior.
- `src/test/java/com/aspose/barcode/cloud/test/ExceptionTest.java`: expected failures and exception behavior.
- `src/test/java/com/aspose/barcode/cloud/api/GenerateApiUnitTest.java`: request validation and generated request-path behavior.
- `src/test/java/com/aspose/barcode/cloud/api/RecognizeApiUnitTest.java`: recognize request validation, request-path behavior, and async wiring.
- `src/test/java/com/aspose/barcode/cloud/api/ScanApiUnitTest.java`: scan request validation, request-path behavior, and async wiring.
