package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Pdf417ErrorLevel. PDF417 barcode error correction level. Mirrors
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/pdf417errorlevel/
 */
@JsonAdapter(Pdf417ErrorLevel.Adapter.class)
public enum Pdf417ErrorLevel {
    LEVEL0("Level0"),

    LEVEL1("Level1"),

    LEVEL2("Level2"),

    LEVEL3("Level3"),

    LEVEL4("Level4"),

    LEVEL5("Level5"),

    LEVEL6("Level6"),

    LEVEL7("Level7"),

    LEVEL8("Level8");

    private final String value;

    Pdf417ErrorLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create Pdf417ErrorLevel from String. */
    public static Pdf417ErrorLevel fromValue(String text) {
        for (Pdf417ErrorLevel b : Pdf417ErrorLevel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<Pdf417ErrorLevel> {
        @Override
        public void write(final JsonWriter jsonWriter, final Pdf417ErrorLevel enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Pdf417ErrorLevel read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Pdf417ErrorLevel.fromValue(String.valueOf(value));
        }
    }
}
