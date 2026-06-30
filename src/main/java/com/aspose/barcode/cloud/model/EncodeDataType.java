package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** EncodeDataType. Types of data that can be encoded into a barcode. */
@JsonAdapter(EncodeDataType.Adapter.class)
public enum EncodeDataType {
    STRING_DATA("StringData"),

    BASE64_BYTES("Base64Bytes"),

    HEX_BYTES("HexBytes");

    private final String value;

    EncodeDataType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create EncodeDataType from String. */
    public static EncodeDataType fromValue(String text) {
        for (EncodeDataType b : EncodeDataType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<EncodeDataType> {
        @Override
        public void write(final JsonWriter jsonWriter, final EncodeDataType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EncodeDataType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EncodeDataType.fromValue(String.valueOf(value));
        }
    }
}
