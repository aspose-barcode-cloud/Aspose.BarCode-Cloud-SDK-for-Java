package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * MicroQRVersion. MicroQR barcode version. Mirrors
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/microqrversion/
 */
@JsonAdapter(MicroQRVersion.Adapter.class)
public enum MicroQRVersion {
    AUTO("Auto"),

    M1("M1"),

    M2("M2"),

    M3("M3"),

    M4("M4");

    private final String value;

    MicroQRVersion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create MicroQRVersion from String. */
    public static MicroQRVersion fromValue(String text) {
        for (MicroQRVersion b : MicroQRVersion.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<MicroQRVersion> {
        @Override
        public void write(final JsonWriter jsonWriter, final MicroQRVersion enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MicroQRVersion read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MicroQRVersion.fromValue(String.valueOf(value));
        }
    }
}
