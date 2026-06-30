package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/** Barcode generation parameters. */
public class GenerateParams {
    @SerializedName(value = "barcodeType")
    private EncodeBarcodeType barcodeType;

    @SerializedName(value = "encodeData")
    private EncodeData encodeData;

    @SerializedName(value = "barcodeImageParams")
    private BarcodeImageParams barcodeImageParams;

    @SerializedName(value = "qrParams")
    private QrParams qrParams;

    @SerializedName(value = "code128Params")
    private Code128Params code128Params;

    @SerializedName(value = "pdf417Params")
    private Pdf417Params pdf417Params;

    /**
     * .
     *
     * @param barcodeType Barcode type.
     * @param encodeData Data to encode into a barcode.
     */
    public GenerateParams(EncodeBarcodeType barcodeType, EncodeData encodeData) {
        this.barcodeType = barcodeType;
        this.encodeData = encodeData;
    }

    /**
     * Barcode type.
     *
     * @return barcodeType
     */
    public EncodeBarcodeType getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(EncodeBarcodeType barcodeType) {
        this.barcodeType = barcodeType;
    }

    /**
     * Data to encode into a barcode.
     *
     * @return encodeData
     */
    public EncodeData getEncodeData() {
        return encodeData;
    }

    public void setEncodeData(EncodeData encodeData) {
        this.encodeData = encodeData;
    }

    /**
     * Optional barcode image parameters.
     *
     * @return barcodeImageParams
     */
    public BarcodeImageParams getBarcodeImageParams() {
        return barcodeImageParams;
    }

    public void setBarcodeImageParams(BarcodeImageParams barcodeImageParams) {
        this.barcodeImageParams = barcodeImageParams;
    }

    /**
     * Optional QR barcode generation parameters.
     *
     * @return qrParams
     */
    public QrParams getQrParams() {
        return qrParams;
    }

    public void setQrParams(QrParams qrParams) {
        this.qrParams = qrParams;
    }

    /**
     * Optional Code128 barcode generation parameters.
     *
     * @return code128Params
     */
    public Code128Params getCode128Params() {
        return code128Params;
    }

    public void setCode128Params(Code128Params code128Params) {
        this.code128Params = code128Params;
    }

    /**
     * Optional PDF417 barcode generation parameters.
     *
     * @return pdf417Params
     */
    public Pdf417Params getPdf417Params() {
        return pdf417Params;
    }

    public void setPdf417Params(Pdf417Params pdf417Params) {
        this.pdf417Params = pdf417Params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateParams generateParams = (GenerateParams) o;
        return Objects.equals(this.barcodeType, generateParams.barcodeType)
                && Objects.equals(this.encodeData, generateParams.encodeData)
                && Objects.equals(this.barcodeImageParams, generateParams.barcodeImageParams)
                && Objects.equals(this.qrParams, generateParams.qrParams)
                && Objects.equals(this.code128Params, generateParams.code128Params)
                && Objects.equals(this.pdf417Params, generateParams.pdf417Params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                barcodeType, encodeData, barcodeImageParams, qrParams, code128Params, pdf417Params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateParams {\n");

        sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
        sb.append("    encodeData: ").append(toIndentedString(encodeData)).append("\n");
        sb.append("    barcodeImageParams: ")
                .append(toIndentedString(barcodeImageParams))
                .append("\n");
        sb.append("    qrParams: ").append(toIndentedString(qrParams)).append("\n");
        sb.append("    code128Params: ").append(toIndentedString(code128Params)).append("\n");
        sb.append("    pdf417Params: ").append(toIndentedString(pdf417Params)).append("\n");
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
