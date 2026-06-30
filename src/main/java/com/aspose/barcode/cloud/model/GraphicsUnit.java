package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** GraphicsUnit. Subset of https://reference.aspose.com/drawing/net/system.drawing/graphicsunit/ */
@JsonAdapter(GraphicsUnit.Adapter.class)
public enum GraphicsUnit {
    PIXEL("Pixel"),

    POINT("Point"),

    INCH("Inch"),

    MILLIMETER("Millimeter");

    private final String value;

    GraphicsUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create GraphicsUnit from String. */
    public static GraphicsUnit fromValue(String text) {
        for (GraphicsUnit b : GraphicsUnit.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<GraphicsUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final GraphicsUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GraphicsUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GraphicsUnit.fromValue(String.valueOf(value));
        }
    }
}
