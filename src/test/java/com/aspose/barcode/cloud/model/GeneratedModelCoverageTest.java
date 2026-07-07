package com.aspose.barcode.cloud.model;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Method;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Coverage for the generated model classes: every model must behave as a value object
 * (equals/hashCode/toString) and expose non-null accessors for populated fields.
 */
public class GeneratedModelCoverageTest {

    private static final List<Class<?>> MODEL_TYPES =
            Arrays.asList(
                    ApiError.class,
                    ApiErrorResponse.class,
                    BarcodeImageParams.class,
                    BarcodeResponse.class,
                    BarcodeResponseList.class,
                    Code128Params.class,
                    EncodeData.class,
                    GenerateParams.class,
                    Pdf417Params.class,
                    QrParams.class,
                    RecognizeBase64Request.class,
                    RegionPoint.class,
                    ScanBase64Request.class);

    @Test
    public void generatedModelsExposeValueObjectBehavior() throws Exception {
        for (Class<?> modelType : MODEL_TYPES) {
            Object first = newModel(modelType, 1);
            Object same = newModel(modelType, 1);
            Object different = newModel(modelType, 2);

            assertEquals(first, first);
            assertEquals(first, same);
            assertEquals(first.hashCode(), same.hashCode());
            assertNotEquals(first, different);
            assertNotEquals(first, null);
            assertNotEquals(first, "not a " + modelType.getSimpleName());
            assertTrue(first.toString().contains(modelType.getSimpleName()));

            for (Method accessor : modelType.getMethods()) {
                if (isValueAccessor(accessor)) {
                    assertNotNull(
                            modelType.getSimpleName() + "." + accessor.getName(),
                            accessor.invoke(first));
                }
            }
        }
    }

    private static boolean isValueAccessor(Method method) {
        if (method.getParameterCount() != 0 || method.getDeclaringClass().equals(Object.class)) {
            return false;
        }
        return method.getName().startsWith("get");
    }

    private static Object newModel(Class<?> type, int variant) {
        if (type.equals(ApiError.class)) {
            ApiError error = new ApiError("code-" + variant, "message-" + variant);
            error.setDescription("description-" + variant);
            error.setDateTime(OffsetDateTime.parse("2026-06-29T00:00:0" + variant + "Z"));
            error.setInnerError(new ApiError("inner-code-" + variant, "inner-message-" + variant));
            return error;
        }
        if (type.equals(ApiErrorResponse.class)) {
            return new ApiErrorResponse("request-" + variant, apiError(variant));
        }
        if (type.equals(BarcodeImageParams.class)) {
            return barcodeImageParams(variant);
        }
        if (type.equals(BarcodeResponse.class)) {
            BarcodeResponse response = new BarcodeResponse();
            response.setBarcodeValue("value-" + variant);
            response.setType("QR");
            response.setRegion(Collections.singletonList(regionPoint(variant)));
            response.setChecksum("checksum-" + variant);
            return response;
        }
        if (type.equals(BarcodeResponseList.class)) {
            BarcodeResponse response = new BarcodeResponse();
            response.setBarcodeValue("value-" + variant);
            response.setType("QR");
            return new BarcodeResponseList(Collections.singletonList(response));
        }
        if (type.equals(Code128Params.class)) {
            return code128Params(variant);
        }
        if (type.equals(EncodeData.class)) {
            EncodeData encodeData = new EncodeData("data-" + variant);
            encodeData.setDataType(
                    variant == 1 ? EncodeDataType.STRING_DATA : EncodeDataType.HEX_BYTES);
            return encodeData;
        }
        if (type.equals(GenerateParams.class)) {
            EncodeData encodeData = new EncodeData("data-" + variant);
            GenerateParams params =
                    new GenerateParams(
                            variant == 1 ? EncodeBarcodeType.QR : EncodeBarcodeType.PDF417,
                            encodeData);
            params.setBarcodeImageParams(barcodeImageParams(variant));
            params.setQrParams(qrParams(variant));
            params.setCode128Params(code128Params(variant));
            params.setPdf417Params(pdf417Params(variant));
            return params;
        }
        if (type.equals(Pdf417Params.class)) {
            return pdf417Params(variant);
        }
        if (type.equals(QrParams.class)) {
            return qrParams(variant);
        }
        if (type.equals(RecognizeBase64Request.class)) {
            RecognizeBase64Request request =
                    new RecognizeBase64Request(
                            Collections.singletonList(
                                    variant == 1
                                            ? DecodeBarcodeType.QR
                                            : DecodeBarcodeType.CODE128),
                            "file-" + variant);
            request.setRecognitionMode(
                    variant == 1 ? RecognitionMode.FAST : RecognitionMode.NORMAL);
            request.setRecognitionImageKind(
                    variant == 1 ? RecognitionImageKind.CLEAR_IMAGE : RecognitionImageKind.PHOTO);
            return request;
        }
        if (type.equals(RegionPoint.class)) {
            return regionPoint(variant);
        }
        if (type.equals(ScanBase64Request.class)) {
            return new ScanBase64Request("file-" + variant);
        }
        throw new IllegalArgumentException("No model fixture for " + type);
    }

    private static ApiError apiError(int variant) {
        ApiError error = new ApiError("code-" + variant, "message-" + variant);
        error.setDescription("description-" + variant);
        return error;
    }

    private static BarcodeImageParams barcodeImageParams(int variant) {
        BarcodeImageParams params = new BarcodeImageParams();
        params.setImageFormat(variant == 1 ? BarcodeImageFormat.PNG : BarcodeImageFormat.JPEG);
        params.setTextLocation(variant == 1 ? CodeLocation.BELOW : CodeLocation.NONE);
        params.setForegroundColor("Black-" + variant);
        params.setBackgroundColor("White-" + variant);
        params.setUnits(variant == 1 ? GraphicsUnit.PIXEL : GraphicsUnit.MILLIMETER);
        params.setResolution(100.0f + variant);
        params.setImageHeight(200.0f + variant);
        params.setImageWidth(300.0f + variant);
        params.setRotationAngle(90 + variant);
        return params;
    }

    private static Code128Params code128Params(int variant) {
        Code128Params params = new Code128Params();
        params.setCode128EncodeMode(
                variant == 1 ? Code128EncodeMode.CODE_B : Code128EncodeMode.CODE_C);
        return params;
    }

    private static Pdf417Params pdf417Params(int variant) {
        Pdf417Params params = new Pdf417Params();
        params.setPdf417EncodeMode(variant == 1 ? Pdf417EncodeMode.AUTO : Pdf417EncodeMode.BINARY);
        params.setPdf417ErrorLevel(
                variant == 1 ? Pdf417ErrorLevel.LEVEL2 : Pdf417ErrorLevel.LEVEL3);
        params.setPdf417Truncate(variant == 1);
        params.setPdf417Columns(variant + 2);
        params.setPdf417Rows(variant + 8);
        params.setPdf417AspectRatio(3.0f + variant);
        params.setPdf417ECIEncoding(variant == 1 ? ECIEncodings.UTF8 : ECIEncodings.ISO_8859_1);
        params.setPdf417IsReaderInitialization(false);
        params.setPdf417MacroCharacters(
                variant == 1 ? MacroCharacter.MACRO05 : MacroCharacter.MACRO06);
        params.setPdf417IsLinked(false);
        params.setPdf417IsCode128Emulation(false);
        return params;
    }

    private static QrParams qrParams(int variant) {
        QrParams params = new QrParams();
        params.setQrEncodeMode(variant == 1 ? QREncodeMode.AUTO : QREncodeMode.BINARY);
        params.setQrErrorLevel(variant == 1 ? QRErrorLevel.LEVEL_M : QRErrorLevel.LEVEL_Q);
        params.setQrVersion(variant == 1 ? QRVersion.VERSION01 : QRVersion.VERSION02);
        params.setQrECIEncoding(variant == 1 ? ECIEncodings.UTF8 : ECIEncodings.ISO_8859_1);
        params.setQrAspectRatio(variant == 1 ? 0.75f : 0.5f);
        params.setMicroQRVersion(variant == 1 ? MicroQRVersion.M2 : MicroQRVersion.M3);
        params.setRectMicroQrVersion(
                variant == 1 ? RectMicroQRVersion.R7X43 : RectMicroQRVersion.R9X43);
        return params;
    }

    private static RegionPoint regionPoint(int variant) {
        RegionPoint point = new RegionPoint();
        point.setX(10 + variant);
        point.setY(20 + variant);
        return point;
    }
}
