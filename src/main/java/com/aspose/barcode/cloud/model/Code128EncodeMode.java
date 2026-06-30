package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Code128EncodeMode. Code128 barcode encode mode. Mirrors
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/code128encodemode/
 */
@JsonAdapter(Code128EncodeMode.Adapter.class)
public enum Code128EncodeMode {
    AUTO("Auto"),

    CODE_A("CodeA"),

    CODE_B("CodeB"),

    CODE_AB("CodeAB"),

    CODE_C("CodeC"),

    CODE_AC("CodeAC"),

    CODE_BC("CodeBC");

    private final String value;

    Code128EncodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create Code128EncodeMode from String. */
    public static Code128EncodeMode fromValue(String text) {
        for (Code128EncodeMode b : Code128EncodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<Code128EncodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final Code128EncodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Code128EncodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Code128EncodeMode.fromValue(String.valueOf(value));
        }
    }
}
