package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * EncodeBarcodeType. See
 * https://reference.aspose.com/barcode/net/aspose.barcode.generation/encodetypes/
 */
@JsonAdapter(EncodeBarcodeType.Adapter.class)
public enum EncodeBarcodeType {
    QR("QR"),

    AUSTRALIA_POST("AustraliaPost"),

    AUSTRALIAN_POSTE_PARCEL("AustralianPosteParcel"),

    AZTEC("Aztec"),

    CODABAR("Codabar"),

    CODABLOCK_F("CodablockF"),

    CODE11("Code11"),

    CODE128("Code128"),

    CODE16_K("Code16K"),

    CODE32("Code32"),

    CODE39("Code39"),

    CODE39_FULL_ASCII("Code39FullASCII"),

    CODE93("Code93"),

    DATA_LOGIC2OF5("DataLogic2of5"),

    DATA_MATRIX("DataMatrix"),

    DATABAR_EXPANDED("DatabarExpanded"),

    DATABAR_EXPANDED_STACKED("DatabarExpandedStacked"),

    DATABAR_LIMITED("DatabarLimited"),

    DATABAR_OMNI_DIRECTIONAL("DatabarOmniDirectional"),

    DATABAR_STACKED("DatabarStacked"),

    DATABAR_STACKED_OMNI_DIRECTIONAL("DatabarStackedOmniDirectional"),

    DATABAR_TRUNCATED("DatabarTruncated"),

    DEUTSCHE_POST_IDENTCODE("DeutschePostIdentcode"),

    DEUTSCHE_POST_LEITCODE("DeutschePostLeitcode"),

    DOT_CODE("DotCode"),

    DUTCH_KIX("DutchKIX"),

    EAN13("EAN13"),

    EAN14("EAN14"),

    EAN8("EAN8"),

    GS1_AZTEC("GS1Aztec"),

    GS1_CODABLOCK_F("GS1CodablockF"),

    GS1_CODE128("GS1Code128"),

    GS1_DATA_MATRIX("GS1DataMatrix"),

    GS1_DOT_CODE("GS1DotCode"),

    GS1_HAN_XIN("GS1HanXin"),

    GS1_MICRO_PDF417("GS1MicroPdf417"),

    GS1_QR("GS1QR"),

    HAN_XIN("HanXin"),

    IATA2OF5("IATA2of5"),

    ISBN("ISBN"),

    ISMN("ISMN"),

    ISSN("ISSN"),

    ITF14("ITF14"),

    ITF6("ITF6"),

    INTERLEAVED2OF5("Interleaved2of5"),

    ITALIAN_POST25("ItalianPost25"),

    MSI("MSI"),

    MACRO_PDF417("MacroPdf417"),

    MAILMARK("Mailmark"),

    MATRIX2OF5("Matrix2of5"),

    MAXI_CODE("MaxiCode"),

    MICRO_PDF417("MicroPdf417"),

    MICRO_QR("MicroQR"),

    OPC("OPC"),

    ONE_CODE("OneCode"),

    PZN("PZN"),

    PATCH_CODE("PatchCode"),

    PDF417("Pdf417"),

    PHARMACODE("Pharmacode"),

    PLANET("Planet"),

    POSTNET("Postnet"),

    RM4_SCC("RM4SCC"),

    RECT_MICRO_QR("RectMicroQR"),

    SCC14("SCC14"),

    SSCC18("SSCC18"),

    SINGAPORE_POST("SingaporePost"),

    STANDARD2OF5("Standard2of5"),

    SWISS_POST_PARCEL("SwissPostParcel"),

    UPCA("UPCA"),

    UPCE("UPCE"),

    UPCA_GS1_CODE128_COUPON("UpcaGs1Code128Coupon"),

    UPCA_GS1_DATABAR_COUPON("UpcaGs1DatabarCoupon"),

    VIN("VIN");

    private final String value;

    EncodeBarcodeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create EncodeBarcodeType from String. */
    public static EncodeBarcodeType fromValue(String text) {
        for (EncodeBarcodeType b : EncodeBarcodeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<EncodeBarcodeType> {
        @Override
        public void write(final JsonWriter jsonWriter, final EncodeBarcodeType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EncodeBarcodeType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EncodeBarcodeType.fromValue(String.valueOf(value));
        }
    }
}
