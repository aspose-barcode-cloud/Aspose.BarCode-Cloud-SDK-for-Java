package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Pdf417EncodeMode. PDF417 barcode encode mode. Mirrors
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/pdf417encodemode/
 */
@JsonAdapter(Pdf417EncodeMode.Adapter.class)
public enum Pdf417EncodeMode {
    AUTO("Auto"),

    BINARY("Binary"),

    ECI("ECI"),

    EXTENDED("Extended");

    private final String value;

    Pdf417EncodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create Pdf417EncodeMode from String. */
    public static Pdf417EncodeMode fromValue(String text) {
        for (Pdf417EncodeMode b : Pdf417EncodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<Pdf417EncodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final Pdf417EncodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Pdf417EncodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Pdf417EncodeMode.fromValue(String.valueOf(value));
        }
    }
}
