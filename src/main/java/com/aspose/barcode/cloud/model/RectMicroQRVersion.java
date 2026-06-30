package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * RectMicroQRVersion. RectMicroQR barcode version. Mirrors
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/rectmicroqrversion/
 */
@JsonAdapter(RectMicroQRVersion.Adapter.class)
public enum RectMicroQRVersion {
    AUTO("Auto"),

    R7X43("R7x43"),

    R7X59("R7x59"),

    R7X77("R7x77"),

    R7X99("R7x99"),

    R7X139("R7x139"),

    R9X43("R9x43"),

    R9X59("R9x59"),

    R9X77("R9x77"),

    R9X99("R9x99"),

    R9X139("R9x139"),

    R11X27("R11x27"),

    R11X43("R11x43"),

    R11X59("R11x59"),

    R11X77("R11x77"),

    R11X99("R11x99"),

    R11X139("R11x139"),

    R13X27("R13x27"),

    R13X43("R13x43"),

    R13X59("R13x59"),

    R13X77("R13x77"),

    R13X99("R13x99"),

    R13X139("R13x139"),

    R15X43("R15x43"),

    R15X59("R15x59"),

    R15X77("R15x77"),

    R15X99("R15x99"),

    R15X139("R15x139"),

    R17X43("R17x43"),

    R17X59("R17x59"),

    R17X77("R17x77"),

    R17X99("R17x99"),

    R17X139("R17x139");

    private final String value;

    RectMicroQRVersion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create RectMicroQRVersion from String. */
    public static RectMicroQRVersion fromValue(String text) {
        for (RectMicroQRVersion b : RectMicroQRVersion.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<RectMicroQRVersion> {
        @Override
        public void write(final JsonWriter jsonWriter, final RectMicroQRVersion enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public RectMicroQRVersion read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return RectMicroQRVersion.fromValue(String.valueOf(value));
        }
    }
}
