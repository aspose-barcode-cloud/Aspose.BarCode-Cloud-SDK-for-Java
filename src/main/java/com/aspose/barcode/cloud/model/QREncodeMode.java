package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * QREncodeMode. QR barcode encode mode. Subset of
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/qrencodemode/ Obsolete members
 * (Bytes, Utf8BOM, Utf16BEBOM, ECIEncoding, ExtendedCodetext) are omitted.
 */
@JsonAdapter(QREncodeMode.Adapter.class)
public enum QREncodeMode {
    AUTO("Auto"),

    EXTENDED("Extended"),

    BINARY("Binary"),

    ECI("ECI");

    private final String value;

    QREncodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create QREncodeMode from String. */
    public static QREncodeMode fromValue(String text) {
        for (QREncodeMode b : QREncodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<QREncodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final QREncodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public QREncodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return QREncodeMode.fromValue(String.valueOf(value));
        }
    }
}
