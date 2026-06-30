package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * ECIEncodings. ECI encoding identifiers. Mirrors
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/eciencodings/
 */
@JsonAdapter(ECIEncodings.Adapter.class)
public enum ECIEncodings {
    NONE("NONE"),

    ISO_8859_1("ISO_8859_1"),

    ISO_8859_2("ISO_8859_2"),

    ISO_8859_3("ISO_8859_3"),

    ISO_8859_4("ISO_8859_4"),

    ISO_8859_5("ISO_8859_5"),

    ISO_8859_6("ISO_8859_6"),

    ISO_8859_7("ISO_8859_7"),

    ISO_8859_8("ISO_8859_8"),

    ISO_8859_9("ISO_8859_9"),

    ISO_8859_10("ISO_8859_10"),

    ISO_8859_11("ISO_8859_11"),

    ISO_8859_13("ISO_8859_13"),

    ISO_8859_14("ISO_8859_14"),

    ISO_8859_15("ISO_8859_15"),

    ISO_8859_16("ISO_8859_16"),

    SHIFT_JIS("Shift_JIS"),

    WIN1250("Win1250"),

    WIN1251("Win1251"),

    WIN1252("Win1252"),

    WIN1256("Win1256"),

    UTF16_BE("UTF16BE"),

    UTF8("UTF8"),

    US_ASCII("US_ASCII"),

    BIG5("Big5"),

    GB2312("GB2312"),

    EUC_KR("EUC_KR"),

    GBK("GBK"),

    GB18030("GB18030"),

    UTF16_LE("UTF16LE"),

    UTF32_BE("UTF32BE"),

    UTF32_LE("UTF32LE"),

    INVARIANT("INVARIANT"),

    BINARY("BINARY");

    private final String value;

    ECIEncodings(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create ECIEncodings from String. */
    public static ECIEncodings fromValue(String text) {
        for (ECIEncodings b : ECIEncodings.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<ECIEncodings> {
        @Override
        public void write(final JsonWriter jsonWriter, final ECIEncodings enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ECIEncodings read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ECIEncodings.fromValue(String.valueOf(value));
        }
    }
}
