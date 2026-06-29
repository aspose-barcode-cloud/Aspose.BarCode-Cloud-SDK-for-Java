# GenerateApi

All URIs are relative to *<https://api.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**generate**](GenerateApi.md#generate) | **GET** /barcode/generate/{barcodeType} | Generate a barcode using a GET request with parameters in the route and query string.
[**generateBody**](GenerateApi.md#generateBody) | **POST** /barcode/generate-body | Generate a barcode using a POST request with parameters in the request body in JSON or XML format.
[**generateMultipart**](GenerateApi.md#generateMultipart) | **POST** /barcode/generate-multipart | Generate a barcode using a POST request with parameters in a multipart form.

## generate

> File generate(barcodeType, data, dataType, imageFormat, textLocation, foregroundColor, backgroundColor, units, resolution, imageHeight, imageWidth, rotationAngle, qrEncodeMode, qrErrorLevel, qrVersion, qrECIEncoding, qrAspectRatio, microQRVersion, rectMicroQrVersion, code128EncodeMode, pdf417EncodeMode, pdf417ErrorLevel, pdf417Truncate, pdf417Columns, pdf417Rows, pdf417AspectRatio, pdf417ECIEncoding, pdf417IsReaderInitialization, pdf417MacroCharacters, pdf417IsLinked, pdf417IsCode128Emulation)

Generate a barcode using a GET request with parameters in the route and query string.


### generate parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**EncodeBarcodeType**](.md)| Type of barcode to generate. | [enum: QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1CodablockF, GS1Code128, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MSI, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicroPdf417, MicroQR, OPC, OneCode, PZN, PatchCode, Pdf417, Pharmacode, Planet, Postnet, RM4SCC, RectMicroQR, SCC14, SSCC18, SingaporePost, Standard2of5, SwissPostParcel, UPCA, UPCE, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, VIN]
 **data** | **String**| String that represents the data to encode. |
 **dataType** | [**EncodeDataType**](.md)| Type of data to encode. Default value: StringData. | [optional] [default to StringData] [enum: StringData, Base64Bytes, HexBytes]
 **imageFormat** | [**BarcodeImageFormat**](.md)| Barcode output image format. Default value: png. | [optional] [default to Png] [enum: Png, Jpeg, Svg, Tiff, Gif]
 **textLocation** | [**CodeLocation**](.md)| Specify the displayed text location. Set to CodeLocation.None to hide CodeText. Default value depends on BarcodeType: CodeLocation.Below for 1D barcodes and CodeLocation.None for 2D barcodes. | [optional] [enum: Below, Above, None]
 **foregroundColor** | **String**| Specify the display color for bars and content. Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value starting with #. For example: AliceBlue or #FF000000. Default value: Black. | [optional] [default to Black]
 **backgroundColor** | **String**| Background color of the barcode image. Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value starting with #. For example: AliceBlue or #FF000000. Default value: White. | [optional] [default to White]
 **units** | [**GraphicsUnit**](.md)| Common units for all measurements. Default units: pixels. | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **resolution** | **Float**| Resolution of the barcode image. One value for both dimensions. Default value: 96 dpi. Decimal separator is a dot. | [optional]
 **imageHeight** | **Float**| Height of the barcode image in the specified units. Default units: pixels. Decimal separator is a dot. | [optional]
 **imageWidth** | **Float**| Width of the barcode image in the specified units. Default units: pixels. Decimal separator is a dot. | [optional]
 **rotationAngle** | **Integer**| Barcode image rotation angle, measured in degrees. For example, RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle is not equal to 90, 180, 270, or 0, it may increase the difficulty for the scanner to read the image. Default value: 0. | [optional]
 **qrEncodeMode** | [**QREncodeMode**](.md)| QR barcode encode mode. | [optional] [enum: Auto, Extended, Binary, ECI]
 **qrErrorLevel** | [**QRErrorLevel**](.md)| QR barcode error correction level. | [optional] [enum: LevelL, LevelM, LevelQ, LevelH]
 **qrVersion** | [**QRVersion**](.md)| QR barcode version. Automatically selects the smallest version that fits the data. | [optional] [enum: Auto, Version01, Version02, Version03, Version04, Version05, Version06, Version07, Version08, Version09, Version10, Version11, Version12, Version13, Version14, Version15, Version16, Version17, Version18, Version19, Version20, Version21, Version22, Version23, Version24, Version25, Version26, Version27, Version28, Version29, Version30, Version31, Version32, Version33, Version34, Version35, Version36, Version37, Version38, Version39, Version40]
 **qrECIEncoding** | [**ECIEncodings**](.md)| ECI encoding for QR barcode data. | [optional] [enum: NONE, ISO_8859_1, ISO_8859_2, ISO_8859_3, ISO_8859_4, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, ISO_8859_9, ISO_8859_10, ISO_8859_11, ISO_8859_13, ISO_8859_14, ISO_8859_15, ISO_8859_16, Shift_JIS, Win1250, Win1251, Win1252, Win1256, UTF16BE, UTF8, US_ASCII, Big5, GB2312, EUC_KR, GBK, GB18030, UTF16LE, UTF32BE, UTF32LE, INVARIANT, BINARY]
 **qrAspectRatio** | **Float**| QR barcode aspect ratio. Values: 0 to 1. | [optional]
 **microQRVersion** | [**MicroQRVersion**](.md)| MicroQR barcode version. Used when BarcodeType is MicroQR. | [optional] [enum: Auto, M1, M2, M3, M4]
 **rectMicroQrVersion** | [**RectMicroQRVersion**](.md)| RectMicroQR barcode version. Used when BarcodeType is RectMicroQR. | [optional] [enum: Auto, R7x43, R7x59, R7x77, R7x99, R7x139, R9x43, R9x59, R9x77, R9x99, R9x139, R11x27, R11x43, R11x59, R11x77, R11x99, R11x139, R13x27, R13x43, R13x59, R13x77, R13x99, R13x139, R15x43, R15x59, R15x77, R15x99, R15x139, R17x43, R17x59, R17x77, R17x99, R17x139]
 **code128EncodeMode** | [**Code128EncodeMode**](.md)| Code128 barcode encode mode. Controls which Code 128 subset (A, B, C, or mix) is used. | [optional] [enum: Auto, CodeA, CodeB, CodeAB, CodeC, CodeAC, CodeBC]
 **pdf417EncodeMode** | [**Pdf417EncodeMode**](.md)| PDF417 barcode encode mode. | [optional] [enum: Auto, Binary, ECI, Extended]
 **pdf417ErrorLevel** | [**Pdf417ErrorLevel**](.md)| PDF417 barcode error correction level. | [optional] [enum: Level0, Level1, Level2, Level3, Level4, Level5, Level6, Level7, Level8]
 **pdf417Truncate** | **Boolean**| Whether to use truncated PDF417 format (removes right-side stop pattern). | [optional]
 **pdf417Columns** | **Integer**| Number of columns in the PDF417 barcode. Values between 1 and 30. 0 for auto. | [optional]
 **pdf417Rows** | **Integer**| Number of rows in the PDF417 barcode. Values between 3 and 90. 0 for automatic. | [optional]
 **pdf417AspectRatio** | **Float**| PDF417 barcode aspect ratio (height/width of the barcode module). Values are defined by the standard: 2 to 5 for MicroPdf417; 3 to 5 for Pdf417 and MacroPdf417. | [optional]
 **pdf417ECIEncoding** | [**ECIEncodings**](.md)| ECI encoding for PDF417 barcode data. | [optional] [enum: NONE, ISO_8859_1, ISO_8859_2, ISO_8859_3, ISO_8859_4, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, ISO_8859_9, ISO_8859_10, ISO_8859_11, ISO_8859_13, ISO_8859_14, ISO_8859_15, ISO_8859_16, Shift_JIS, Win1250, Win1251, Win1252, Win1256, UTF16BE, UTF8, US_ASCII, Big5, GB2312, EUC_KR, GBK, GB18030, UTF16LE, UTF32BE, UTF32LE, INVARIANT, BINARY]
 **pdf417IsReaderInitialization** | **Boolean**| Whether the barcode is used for reader initialization (programming). | [optional]
 **pdf417MacroCharacters** | [**MacroCharacter**](.md)| Macro character to prepend (structured append). | [optional] [enum: None, Macro05, Macro06]
 **pdf417IsLinked** | **Boolean**| Whether to use linked mode (for MicroPdf417). | [optional]
 **pdf417IsCode128Emulation** | **Boolean**| Whether to use Code128 emulation for MicroPdf417. | [optional]

### generate return type

**File**

## generateBody

> File generateBody(generateParams)

Generate a barcode using a POST request with parameters in the request body in JSON or XML format.


### generateBody parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **generateParams** | [**GenerateParams**](GenerateParams.md)| Generation parameters. |

### generateBody return type

**File**

## generateMultipart

> File generateMultipart(barcodeType, data, dataType, imageFormat, textLocation, foregroundColor, backgroundColor, units, resolution, imageHeight, imageWidth, rotationAngle, qrEncodeMode, qrErrorLevel, qrVersion, qrECIEncoding, qrAspectRatio, microQRVersion, rectMicroQrVersion, code128EncodeMode, pdf417EncodeMode, pdf417ErrorLevel, pdf417Truncate, pdf417Columns, pdf417Rows, pdf417AspectRatio, pdf417ECIEncoding, pdf417IsReaderInitialization, pdf417MacroCharacters, pdf417IsLinked, pdf417IsCode128Emulation)

Generate a barcode using a POST request with parameters in a multipart form.


### generateMultipart parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**EncodeBarcodeType**](EncodeBarcodeType.md)| See https://reference.aspose.com/barcode/net/aspose.barcode.generation/encodetypes/ | [enum: QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1CodablockF, GS1Code128, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MSI, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicroPdf417, MicroQR, OPC, OneCode, PZN, PatchCode, Pdf417, Pharmacode, Planet, Postnet, RM4SCC, RectMicroQR, SCC14, SSCC18, SingaporePost, Standard2of5, SwissPostParcel, UPCA, UPCE, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, VIN]
 **data** | **String**| String that represents the data to encode. |
 **dataType** | [**EncodeDataType**](EncodeDataType.md)| Type of data to encode. Default value: StringData. | [optional] [default to StringData] [enum: StringData, Base64Bytes, HexBytes]
 **imageFormat** | [**BarcodeImageFormat**](BarcodeImageFormat.md)| Barcode output image format. Default value: png. | [optional] [default to Png] [enum: Png, Jpeg, Svg, Tiff, Gif]
 **textLocation** | [**CodeLocation**](CodeLocation.md)| Specify the displayed text location. Set to CodeLocation.None to hide CodeText. Default value depends on BarcodeType: CodeLocation.Below for 1D barcodes and CodeLocation.None for 2D barcodes. | [optional] [enum: Below, Above, None]
 **foregroundColor** | **String**| Specify the display color for bars and content. Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value starting with #. For example: AliceBlue or #FF000000. Default value: Black. | [optional] [default to Black]
 **backgroundColor** | **String**| Background color of the barcode image. Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value starting with #. For example: AliceBlue or #FF000000. Default value: White. | [optional] [default to White]
 **units** | [**GraphicsUnit**](GraphicsUnit.md)| Common units for all measurements. Default units: pixels. | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **resolution** | **Float**| Resolution of the barcode image. One value for both dimensions. Default value: 96 dpi. Decimal separator is a dot. | [optional]
 **imageHeight** | **Float**| Height of the barcode image in the specified units. Default units: pixels. Decimal separator is a dot. | [optional]
 **imageWidth** | **Float**| Width of the barcode image in the specified units. Default units: pixels. Decimal separator is a dot. | [optional]
 **rotationAngle** | **Integer**| Barcode image rotation angle, measured in degrees. For example, RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle is not equal to 90, 180, 270, or 0, it may increase the difficulty for the scanner to read the image. Default value: 0. | [optional]
 **qrEncodeMode** | [**QREncodeMode**](QREncodeMode.md)| QR barcode encode mode. | [optional] [enum: Auto, Extended, Binary, ECI]
 **qrErrorLevel** | [**QRErrorLevel**](QRErrorLevel.md)| QR barcode error correction level. | [optional] [enum: LevelL, LevelM, LevelQ, LevelH]
 **qrVersion** | [**QRVersion**](QRVersion.md)| QR barcode version. Automatically selects the smallest version that fits the data. | [optional] [enum: Auto, Version01, Version02, Version03, Version04, Version05, Version06, Version07, Version08, Version09, Version10, Version11, Version12, Version13, Version14, Version15, Version16, Version17, Version18, Version19, Version20, Version21, Version22, Version23, Version24, Version25, Version26, Version27, Version28, Version29, Version30, Version31, Version32, Version33, Version34, Version35, Version36, Version37, Version38, Version39, Version40]
 **qrECIEncoding** | [**ECIEncodings**](ECIEncodings.md)| ECI encoding for QR barcode data. | [optional] [enum: NONE, ISO_8859_1, ISO_8859_2, ISO_8859_3, ISO_8859_4, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, ISO_8859_9, ISO_8859_10, ISO_8859_11, ISO_8859_13, ISO_8859_14, ISO_8859_15, ISO_8859_16, Shift_JIS, Win1250, Win1251, Win1252, Win1256, UTF16BE, UTF8, US_ASCII, Big5, GB2312, EUC_KR, GBK, GB18030, UTF16LE, UTF32BE, UTF32LE, INVARIANT, BINARY]
 **qrAspectRatio** | **Float**| QR barcode aspect ratio. Values: 0 to 1. | [optional]
 **microQRVersion** | [**MicroQRVersion**](MicroQRVersion.md)| MicroQR barcode version. Used when BarcodeType is MicroQR. | [optional] [enum: Auto, M1, M2, M3, M4]
 **rectMicroQrVersion** | [**RectMicroQRVersion**](RectMicroQRVersion.md)| RectMicroQR barcode version. Used when BarcodeType is RectMicroQR. | [optional] [enum: Auto, R7x43, R7x59, R7x77, R7x99, R7x139, R9x43, R9x59, R9x77, R9x99, R9x139, R11x27, R11x43, R11x59, R11x77, R11x99, R11x139, R13x27, R13x43, R13x59, R13x77, R13x99, R13x139, R15x43, R15x59, R15x77, R15x99, R15x139, R17x43, R17x59, R17x77, R17x99, R17x139]
 **code128EncodeMode** | [**Code128EncodeMode**](Code128EncodeMode.md)| Code128 barcode encode mode. Controls which Code 128 subset (A, B, C, or mix) is used. | [optional] [enum: Auto, CodeA, CodeB, CodeAB, CodeC, CodeAC, CodeBC]
 **pdf417EncodeMode** | [**Pdf417EncodeMode**](Pdf417EncodeMode.md)| PDF417 barcode encode mode. | [optional] [enum: Auto, Binary, ECI, Extended]
 **pdf417ErrorLevel** | [**Pdf417ErrorLevel**](Pdf417ErrorLevel.md)| PDF417 barcode error correction level. | [optional] [enum: Level0, Level1, Level2, Level3, Level4, Level5, Level6, Level7, Level8]
 **pdf417Truncate** | **Boolean**| Whether to use truncated PDF417 format (removes right-side stop pattern). | [optional]
 **pdf417Columns** | **Integer**| Number of columns in the PDF417 barcode. Values between 1 and 30. 0 for auto. | [optional]
 **pdf417Rows** | **Integer**| Number of rows in the PDF417 barcode. Values between 3 and 90. 0 for automatic. | [optional]
 **pdf417AspectRatio** | **Float**| PDF417 barcode aspect ratio (height/width of the barcode module). Values are defined by the standard: 2 to 5 for MicroPdf417; 3 to 5 for Pdf417 and MacroPdf417. | [optional]
 **pdf417ECIEncoding** | [**ECIEncodings**](ECIEncodings.md)| ECI encoding for PDF417 barcode data. | [optional] [enum: NONE, ISO_8859_1, ISO_8859_2, ISO_8859_3, ISO_8859_4, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, ISO_8859_9, ISO_8859_10, ISO_8859_11, ISO_8859_13, ISO_8859_14, ISO_8859_15, ISO_8859_16, Shift_JIS, Win1250, Win1251, Win1252, Win1256, UTF16BE, UTF8, US_ASCII, Big5, GB2312, EUC_KR, GBK, GB18030, UTF16LE, UTF32BE, UTF32LE, INVARIANT, BINARY]
 **pdf417IsReaderInitialization** | **Boolean**| Whether the barcode is used for reader initialization (programming). | [optional]
 **pdf417MacroCharacters** | [**MacroCharacter**](MacroCharacter.md)| Macro character to prepend (structured append). | [optional] [enum: None, Macro05, Macro06]
 **pdf417IsLinked** | **Boolean**| Whether to use linked mode (for MicroPdf417). | [optional]
 **pdf417IsCode128Emulation** | **Boolean**| Whether to use Code128 emulation for MicroPdf417. | [optional]

### generateMultipart return type

**File**

