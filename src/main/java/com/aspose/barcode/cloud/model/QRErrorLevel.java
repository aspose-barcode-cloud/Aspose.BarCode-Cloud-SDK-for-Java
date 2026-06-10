package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * QRErrorLevel. QR barcode error correction level. Mirrors
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/qrerrorlevel/
 */
@JsonAdapter(QRErrorLevel.Adapter.class)
public enum QRErrorLevel {
    LEVEL_L("LevelL"),

    LEVEL_M("LevelM"),

    LEVEL_Q("LevelQ"),

    LEVEL_H("LevelH");

    private final String value;

    QRErrorLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create QRErrorLevel from String. */
    public static QRErrorLevel fromValue(String text) {
        for (QRErrorLevel b : QRErrorLevel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<QRErrorLevel> {
        @Override
        public void write(final JsonWriter jsonWriter, final QRErrorLevel enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public QRErrorLevel read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return QRErrorLevel.fromValue(String.valueOf(value));
        }
    }
}
