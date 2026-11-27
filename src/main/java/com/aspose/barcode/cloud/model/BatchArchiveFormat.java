package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** BatchArchiveFormat. Archive format for batch barcode generation. */
@JsonAdapter(BatchArchiveFormat.Adapter.class)
public enum BatchArchiveFormat {
    ZIP("Zip"),

    TAR("Tar"),

    TAR_GZIP("TarGzip");

    private final String value;

    BatchArchiveFormat(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create BatchArchiveFormat from String. */
    public static BatchArchiveFormat fromValue(String text) {
        for (BatchArchiveFormat b : BatchArchiveFormat.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<BatchArchiveFormat> {
        @Override
        public void write(final JsonWriter jsonWriter, final BatchArchiveFormat enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BatchArchiveFormat read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BatchArchiveFormat.fromValue(String.valueOf(value));
        }
    }
}
