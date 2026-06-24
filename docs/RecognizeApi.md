# RecognizeApi

All URIs are relative to *<https://api.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**recognize**](RecognizeApi.md#recognize) | **GET** /barcode/recognize | Recognize a barcode from a file on an Internet server using a GET request with a query string parameter. For recognizing files from your hard drive, use &#x60;recognize-body&#x60; or &#x60;recognize-multipart&#x60; endpoints instead.
[**recognizeBase64**](RecognizeApi.md#recognizeBase64) | **POST** /barcode/recognize-body | Recognize a barcode from a file in the request body using a POST request with JSON or XML body parameters.
[**recognizeMultipart**](RecognizeApi.md#recognizeMultipart) | **POST** /barcode/recognize-multipart | Recognize a barcode from a file in the request body using a POST request with multipart form parameters.

## recognize

> BarcodeResponseList recognize(barcodeType, fileUrl, recognitionMode, recognitionImageKind)

Recognize a barcode from a file on an Internet server using a GET request with a query string parameter. For recognizing files from your hard drive, use &#x60;recognize-body&#x60; or &#x60;recognize-multipart&#x60; endpoints instead.


### recognize parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**DecodeBarcodeType**](.md)| Type of barcode to recognize. | [enum: MostCommonlyUsed, QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, CompactPdf417, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1Code128, GS1CompositeBar, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, HIBCAztecLIC, HIBCAztecPAS, HIBCCode128LIC, HIBCCode128PAS, HIBCCode39LIC, HIBCCode39PAS, HIBCDataMatrixLIC, HIBCDataMatrixPAS, HIBCQRLIC, HIBCQRPAS, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicrE13B, MicroPdf417, MicroQR, MSI, OneCode, OPC, PatchCode, Pdf417, Pharmacode, Planet, Postnet, PZN, RectMicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, SwissPostParcel, UPCA, UPCE, VIN]
 **fileUrl** | **URI**| URL to the barcode image. |
 **recognitionMode** | [**RecognitionMode**](.md)| Recognition mode. | [optional] [enum: Fast, Normal, Excellent]
 **recognitionImageKind** | [**RecognitionImageKind**](.md)| Image kind for recognition. | [optional] [enum: Photo, ScannedDocument, ClearImage]

### recognize return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## recognizeBase64

> BarcodeResponseList recognizeBase64(recognizeBase64Request)

Recognize a barcode from a file in the request body using a POST request with JSON or XML body parameters.


### recognizeBase64 parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **recognizeBase64Request** | [**RecognizeBase64Request**](RecognizeBase64Request.md)| Barcode recognition request. |

### recognizeBase64 return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## recognizeMultipart

> BarcodeResponseList recognizeMultipart(barcodeType, _file, recognitionMode, recognitionImageKind)

Recognize a barcode from a file in the request body using a POST request with multipart form parameters.


### recognizeMultipart parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**DecodeBarcodeType**](DecodeBarcodeType.md)| See https://reference.aspose.com/barcode/net/aspose.barcode.barcoderecognition/decodetype/ | [enum: MostCommonlyUsed, QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, CompactPdf417, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1Code128, GS1CompositeBar, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, HIBCAztecLIC, HIBCAztecPAS, HIBCCode128LIC, HIBCCode128PAS, HIBCCode39LIC, HIBCCode39PAS, HIBCDataMatrixLIC, HIBCDataMatrixPAS, HIBCQRLIC, HIBCQRPAS, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicrE13B, MicroPdf417, MicroQR, MSI, OneCode, OPC, PatchCode, Pdf417, Pharmacode, Planet, Postnet, PZN, RectMicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, SwissPostParcel, UPCA, UPCE, VIN]
 **_file** | **File**| Barcode image file. |
 **recognitionMode** | [**RecognitionMode**](RecognitionMode.md)| Recognition mode. | [optional] [enum: Fast, Normal, Excellent]
 **recognitionImageKind** | [**RecognitionImageKind**](RecognitionImageKind.md)| Image kind for recognition. | [optional] [enum: Photo, ScannedDocument, ClearImage]

### recognizeMultipart return type

[**BarcodeResponseList**](BarcodeResponseList.md)

