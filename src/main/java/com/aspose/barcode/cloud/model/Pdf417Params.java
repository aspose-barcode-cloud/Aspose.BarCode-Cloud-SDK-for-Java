package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Optional PDF417 barcode generation parameters. Applies to Pdf417, MacroPdf417, MicroPdf417, and
 * GS1MicroPdf417 barcode types.
 */
public class Pdf417Params {
    @SerializedName(value = "pdf417EncodeMode")
    private Pdf417EncodeMode pdf417EncodeMode;

    @SerializedName(value = "pdf417ErrorLevel")
    private Pdf417ErrorLevel pdf417ErrorLevel;

    @SerializedName(value = "pdf417Truncate")
    private Boolean pdf417Truncate;

    @SerializedName(value = "pdf417Columns")
    private Integer pdf417Columns;

    @SerializedName(value = "pdf417Rows")
    private Integer pdf417Rows;

    @SerializedName(value = "pdf417AspectRatio")
    private Float pdf417AspectRatio;

    @SerializedName(value = "pdf417ECIEncoding")
    private ECIEncodings pdf417ECIEncoding;

    @SerializedName(value = "pdf417IsReaderInitialization")
    private Boolean pdf417IsReaderInitialization;

    @SerializedName(value = "pdf417MacroCharacters")
    private MacroCharacter pdf417MacroCharacters;

    @SerializedName(value = "pdf417IsLinked")
    private Boolean pdf417IsLinked;

    @SerializedName(value = "pdf417IsCode128Emulation")
    private Boolean pdf417IsCode128Emulation;

    /**
     * PDF417 barcode encode mode.
     *
     * @return pdf417EncodeMode
     */
    public Pdf417EncodeMode getPdf417EncodeMode() {
        return pdf417EncodeMode;
    }

    public void setPdf417EncodeMode(Pdf417EncodeMode pdf417EncodeMode) {
        this.pdf417EncodeMode = pdf417EncodeMode;
    }

    /**
     * PDF417 barcode error correction level.
     *
     * @return pdf417ErrorLevel
     */
    public Pdf417ErrorLevel getPdf417ErrorLevel() {
        return pdf417ErrorLevel;
    }

    public void setPdf417ErrorLevel(Pdf417ErrorLevel pdf417ErrorLevel) {
        this.pdf417ErrorLevel = pdf417ErrorLevel;
    }

    /**
     * Whether to use truncated PDF417 format (removes right-side stop pattern).
     *
     * @return pdf417Truncate
     */
    public Boolean isgetPdf417Truncate() {
        return pdf417Truncate;
    }

    public void setPdf417Truncate(Boolean pdf417Truncate) {
        this.pdf417Truncate = pdf417Truncate;
    }

    /**
     * Number of columns in the PDF417 barcode. Values between 1 and 30. 0 for auto. minimum: 0
     * maximum: 30
     *
     * @return pdf417Columns
     */
    public Integer getPdf417Columns() {
        return pdf417Columns;
    }

    public void setPdf417Columns(Integer pdf417Columns) {
        this.pdf417Columns = pdf417Columns;
    }

    /**
     * Number of rows in the PDF417 barcode. Values between 3 and 90. 0 for automatic. minimum: 0
     * maximum: 90
     *
     * @return pdf417Rows
     */
    public Integer getPdf417Rows() {
        return pdf417Rows;
    }

    public void setPdf417Rows(Integer pdf417Rows) {
        this.pdf417Rows = pdf417Rows;
    }

    /**
     * PDF417 barcode aspect ratio (height/width of the barcode module). Values are defined by the
     * standard: 2 to 5 for MicroPdf417; 3 to 5 for Pdf417 and MacroPdf417. minimum: 2 maximum: 10
     *
     * @return pdf417AspectRatio
     */
    public Float getPdf417AspectRatio() {
        return pdf417AspectRatio;
    }

    public void setPdf417AspectRatio(Float pdf417AspectRatio) {
        this.pdf417AspectRatio = pdf417AspectRatio;
    }

    /**
     * ECI encoding for PDF417 barcode data.
     *
     * @return pdf417ECIEncoding
     */
    public ECIEncodings getPdf417ECIEncoding() {
        return pdf417ECIEncoding;
    }

    public void setPdf417ECIEncoding(ECIEncodings pdf417ECIEncoding) {
        this.pdf417ECIEncoding = pdf417ECIEncoding;
    }

    /**
     * Whether the barcode is used for reader initialization (programming).
     *
     * @return pdf417IsReaderInitialization
     */
    public Boolean isgetPdf417IsReaderInitialization() {
        return pdf417IsReaderInitialization;
    }

    public void setPdf417IsReaderInitialization(Boolean pdf417IsReaderInitialization) {
        this.pdf417IsReaderInitialization = pdf417IsReaderInitialization;
    }

    /**
     * Macro character to prepend (structured append).
     *
     * @return pdf417MacroCharacters
     */
    public MacroCharacter getPdf417MacroCharacters() {
        return pdf417MacroCharacters;
    }

    public void setPdf417MacroCharacters(MacroCharacter pdf417MacroCharacters) {
        this.pdf417MacroCharacters = pdf417MacroCharacters;
    }

    /**
     * Whether to use linked mode (for MicroPdf417).
     *
     * @return pdf417IsLinked
     */
    public Boolean isgetPdf417IsLinked() {
        return pdf417IsLinked;
    }

    public void setPdf417IsLinked(Boolean pdf417IsLinked) {
        this.pdf417IsLinked = pdf417IsLinked;
    }

    /**
     * Whether to use Code128 emulation for MicroPdf417.
     *
     * @return pdf417IsCode128Emulation
     */
    public Boolean isgetPdf417IsCode128Emulation() {
        return pdf417IsCode128Emulation;
    }

    public void setPdf417IsCode128Emulation(Boolean pdf417IsCode128Emulation) {
        this.pdf417IsCode128Emulation = pdf417IsCode128Emulation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pdf417Params pdf417Params = (Pdf417Params) o;
        return Objects.equals(this.pdf417EncodeMode, pdf417Params.pdf417EncodeMode)
                && Objects.equals(this.pdf417ErrorLevel, pdf417Params.pdf417ErrorLevel)
                && Objects.equals(this.pdf417Truncate, pdf417Params.pdf417Truncate)
                && Objects.equals(this.pdf417Columns, pdf417Params.pdf417Columns)
                && Objects.equals(this.pdf417Rows, pdf417Params.pdf417Rows)
                && Objects.equals(this.pdf417AspectRatio, pdf417Params.pdf417AspectRatio)
                && Objects.equals(this.pdf417ECIEncoding, pdf417Params.pdf417ECIEncoding)
                && Objects.equals(
                        this.pdf417IsReaderInitialization,
                        pdf417Params.pdf417IsReaderInitialization)
                && Objects.equals(this.pdf417MacroCharacters, pdf417Params.pdf417MacroCharacters)
                && Objects.equals(this.pdf417IsLinked, pdf417Params.pdf417IsLinked)
                && Objects.equals(
                        this.pdf417IsCode128Emulation, pdf417Params.pdf417IsCode128Emulation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pdf417EncodeMode,
                pdf417ErrorLevel,
                pdf417Truncate,
                pdf417Columns,
                pdf417Rows,
                pdf417AspectRatio,
                pdf417ECIEncoding,
                pdf417IsReaderInitialization,
                pdf417MacroCharacters,
                pdf417IsLinked,
                pdf417IsCode128Emulation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pdf417Params {\n");

        sb.append("    pdf417EncodeMode: ").append(toIndentedString(pdf417EncodeMode)).append("\n");
        sb.append("    pdf417ErrorLevel: ").append(toIndentedString(pdf417ErrorLevel)).append("\n");
        sb.append("    pdf417Truncate: ").append(toIndentedString(pdf417Truncate)).append("\n");
        sb.append("    pdf417Columns: ").append(toIndentedString(pdf417Columns)).append("\n");
        sb.append("    pdf417Rows: ").append(toIndentedString(pdf417Rows)).append("\n");
        sb.append("    pdf417AspectRatio: ")
                .append(toIndentedString(pdf417AspectRatio))
                .append("\n");
        sb.append("    pdf417ECIEncoding: ")
                .append(toIndentedString(pdf417ECIEncoding))
                .append("\n");
        sb.append("    pdf417IsReaderInitialization: ")
                .append(toIndentedString(pdf417IsReaderInitialization))
                .append("\n");
        sb.append("    pdf417MacroCharacters: ")
                .append(toIndentedString(pdf417MacroCharacters))
                .append("\n");
        sb.append("    pdf417IsLinked: ").append(toIndentedString(pdf417IsLinked)).append("\n");
        sb.append("    pdf417IsCode128Emulation: ")
                .append(toIndentedString(pdf417IsCode128Emulation))
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
