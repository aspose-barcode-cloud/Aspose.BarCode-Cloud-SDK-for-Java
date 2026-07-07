package com.aspose.barcode.cloud.model;

import static org.junit.Assert.*;

import com.google.gson.Gson;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * Coverage for the generated enum types: every constant must round-trip through the generated
 * {@code getValue}/{@code fromValue} factories and through Gson serialization/deserialization.
 */
public class GeneratedEnumCoverageTest {
    private static final Gson GSON = new Gson();

    private static final List<Class<? extends Enum<?>>> ENUM_TYPES =
            Arrays.asList(
                    BarcodeImageFormat.class,
                    Code128EncodeMode.class,
                    CodeLocation.class,
                    DecodeBarcodeType.class,
                    ECIEncodings.class,
                    EncodeBarcodeType.class,
                    EncodeDataType.class,
                    GraphicsUnit.class,
                    MacroCharacter.class,
                    MicroQRVersion.class,
                    Pdf417EncodeMode.class,
                    Pdf417ErrorLevel.class,
                    QREncodeMode.class,
                    QRErrorLevel.class,
                    QRVersion.class,
                    RecognitionImageKind.class,
                    RecognitionMode.class,
                    RectMicroQRVersion.class);

    @Test
    public void enumValuesRoundTripThroughFactoriesAndJsonAdapters() throws Exception {
        for (Class<? extends Enum<?>> enumType : ENUM_TYPES) {
            Method getValue = enumType.getMethod("getValue");
            Method fromValue = enumType.getMethod("fromValue", String.class);

            for (Enum<?> enumValue : enumType.getEnumConstants()) {
                String wireValue = (String) getValue.invoke(enumValue);

                assertEquals(wireValue, enumValue.toString());
                assertSame(enumValue, fromValue.invoke(null, wireValue));
                assertEquals("\"" + wireValue + "\"", GSON.toJson(enumValue));
                assertSame(enumValue, GSON.fromJson("\"" + wireValue + "\"", enumType));
            }

            assertNull(fromValue.invoke(null, "__missing_value__"));
        }
    }
}
