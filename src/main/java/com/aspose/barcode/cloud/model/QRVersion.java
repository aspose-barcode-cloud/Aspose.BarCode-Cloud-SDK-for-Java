package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * QRVersion. QR barcode version. Subset of
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/qrversion/ MicroQR versions
 * (VersionM1–VersionM4) are omitted; use Aspose.BarCode.Cloud.DTO.Enums.MicroQRVersion instead.
 */
@JsonAdapter(QRVersion.Adapter.class)
public enum QRVersion {
    AUTO("Auto"),

    VERSION01("Version01"),

    VERSION02("Version02"),

    VERSION03("Version03"),

    VERSION04("Version04"),

    VERSION05("Version05"),

    VERSION06("Version06"),

    VERSION07("Version07"),

    VERSION08("Version08"),

    VERSION09("Version09"),

    VERSION10("Version10"),

    VERSION11("Version11"),

    VERSION12("Version12"),

    VERSION13("Version13"),

    VERSION14("Version14"),

    VERSION15("Version15"),

    VERSION16("Version16"),

    VERSION17("Version17"),

    VERSION18("Version18"),

    VERSION19("Version19"),

    VERSION20("Version20"),

    VERSION21("Version21"),

    VERSION22("Version22"),

    VERSION23("Version23"),

    VERSION24("Version24"),

    VERSION25("Version25"),

    VERSION26("Version26"),

    VERSION27("Version27"),

    VERSION28("Version28"),

    VERSION29("Version29"),

    VERSION30("Version30"),

    VERSION31("Version31"),

    VERSION32("Version32"),

    VERSION33("Version33"),

    VERSION34("Version34"),

    VERSION35("Version35"),

    VERSION36("Version36"),

    VERSION37("Version37"),

    VERSION38("Version38"),

    VERSION39("Version39"),

    VERSION40("Version40");

    private final String value;

    QRVersion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create QRVersion from String. */
    public static QRVersion fromValue(String text) {
        for (QRVersion b : QRVersion.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<QRVersion> {
        @Override
        public void write(final JsonWriter jsonWriter, final QRVersion enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public QRVersion read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return QRVersion.fromValue(String.valueOf(value));
        }
    }
}
