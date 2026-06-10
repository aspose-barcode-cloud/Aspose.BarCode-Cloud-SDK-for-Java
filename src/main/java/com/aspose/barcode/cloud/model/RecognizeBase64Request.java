package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Barcode recognition request. */
public class RecognizeBase64Request {
    @SerializedName(value = "barcodeTypes")
    private List<DecodeBarcodeType> barcodeTypes = new ArrayList<>();

    @SerializedName(value = "fileBase64")
    private String fileBase64;

    @SerializedName(value = "recognitionMode")
    private RecognitionMode recognitionMode;

    @SerializedName(value = "recognitionImageKind")
    private RecognitionImageKind recognitionImageKind;

    /**
     * .
     *
     * @param barcodeTypes Array of barcode decode types to find.
     * @param fileBase64 Barcode image bytes encoded as base-64.
     */
    public RecognizeBase64Request(List<DecodeBarcodeType> barcodeTypes, String fileBase64) {
        this.barcodeTypes = barcodeTypes;
        this.fileBase64 = fileBase64;
    }

    /**
     * Array of barcode decode types to find.
     *
     * @return barcodeTypes
     */
    public List<DecodeBarcodeType> getBarcodeTypes() {
        return barcodeTypes;
    }

    public void setBarcodeTypes(List<DecodeBarcodeType> barcodeTypes) {
        this.barcodeTypes = barcodeTypes;
    }

    /**
     * Barcode image bytes encoded as base-64.
     *
     * @return fileBase64
     */
    public String getFileBase64() {
        return fileBase64;
    }

    public void setFileBase64(String fileBase64) {
        this.fileBase64 = fileBase64;
    }

    /**
     * Get recognitionMode
     *
     * @return recognitionMode
     */
    public RecognitionMode getRecognitionMode() {
        return recognitionMode;
    }

    public void setRecognitionMode(RecognitionMode recognitionMode) {
        this.recognitionMode = recognitionMode;
    }

    /**
     * Get recognitionImageKind
     *
     * @return recognitionImageKind
     */
    public RecognitionImageKind getRecognitionImageKind() {
        return recognitionImageKind;
    }

    public void setRecognitionImageKind(RecognitionImageKind recognitionImageKind) {
        this.recognitionImageKind = recognitionImageKind;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeBase64Request recognizeBase64Request = (RecognizeBase64Request) o;
        return Objects.equals(this.barcodeTypes, recognizeBase64Request.barcodeTypes)
                && Objects.equals(this.fileBase64, recognizeBase64Request.fileBase64)
                && Objects.equals(this.recognitionMode, recognizeBase64Request.recognitionMode)
                && Objects.equals(
                        this.recognitionImageKind, recognizeBase64Request.recognitionImageKind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcodeTypes, fileBase64, recognitionMode, recognitionImageKind);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeBase64Request {\n");

        sb.append("    barcodeTypes: ").append(toIndentedString(barcodeTypes)).append("\n");
        sb.append("    fileBase64: ").append(toIndentedString(fileBase64)).append("\n");
        sb.append("    recognitionMode: ").append(toIndentedString(recognitionMode)).append("\n");
        sb.append("    recognitionImageKind: ")
                .append(toIndentedString(recognitionImageKind))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
