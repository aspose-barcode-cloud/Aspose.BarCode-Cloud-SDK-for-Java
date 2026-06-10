package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * MacroCharacter. PDF417 macro character mode. Mirrors
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/macrocharacter/
 */
@JsonAdapter(MacroCharacter.Adapter.class)
public enum MacroCharacter {
    NONE("None"),

    MACRO05("Macro05"),

    MACRO06("Macro06");

    private final String value;

    MacroCharacter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create MacroCharacter from String. */
    public static MacroCharacter fromValue(String text) {
        for (MacroCharacter b : MacroCharacter.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<MacroCharacter> {
        @Override
        public void write(final JsonWriter jsonWriter, final MacroCharacter enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MacroCharacter read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MacroCharacter.fromValue(String.valueOf(value));
        }
    }
}
