package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Optional QR barcode generation parameters. Applies to QR, GS1QR, MicroQR, and RectMicroQR barcode
 * types.
 */
public class QrParams {
    @SerializedName(value = "qrEncodeMode")
    private QREncodeMode qrEncodeMode;

    @SerializedName(value = "qrErrorLevel")
    private QRErrorLevel qrErrorLevel;

    @SerializedName(value = "qrVersion")
    private QRVersion qrVersion;

    @SerializedName(value = "qrECIEncoding")
    private ECIEncodings qrECIEncoding;

    @SerializedName(value = "qrAspectRatio")
    private Float qrAspectRatio;

    @SerializedName(value = "microQRVersion")
    private MicroQRVersion microQRVersion;

    @SerializedName(value = "rectMicroQrVersion")
    private RectMicroQRVersion rectMicroQrVersion;

    /**
     * Get qrEncodeMode
     *
     * @return qrEncodeMode
     */
    public QREncodeMode getQrEncodeMode() {
        return qrEncodeMode;
    }

    public void setQrEncodeMode(QREncodeMode qrEncodeMode) {
        this.qrEncodeMode = qrEncodeMode;
    }

    /**
     * Get qrErrorLevel
     *
     * @return qrErrorLevel
     */
    public QRErrorLevel getQrErrorLevel() {
        return qrErrorLevel;
    }

    public void setQrErrorLevel(QRErrorLevel qrErrorLevel) {
        this.qrErrorLevel = qrErrorLevel;
    }

    /**
     * Get qrVersion
     *
     * @return qrVersion
     */
    public QRVersion getQrVersion() {
        return qrVersion;
    }

    public void setQrVersion(QRVersion qrVersion) {
        this.qrVersion = qrVersion;
    }

    /**
     * Get qrECIEncoding
     *
     * @return qrECIEncoding
     */
    public ECIEncodings getQrECIEncoding() {
        return qrECIEncoding;
    }

    public void setQrECIEncoding(ECIEncodings qrECIEncoding) {
        this.qrECIEncoding = qrECIEncoding;
    }

    /**
     * QR barcode aspect ratio. Values: 0 to 1. minimum: 0.001 maximum: 1
     *
     * @return qrAspectRatio
     */
    public Float getQrAspectRatio() {
        return qrAspectRatio;
    }

    public void setQrAspectRatio(Float qrAspectRatio) {
        this.qrAspectRatio = qrAspectRatio;
    }

    /**
     * Get microQRVersion
     *
     * @return microQRVersion
     */
    public MicroQRVersion getMicroQRVersion() {
        return microQRVersion;
    }

    public void setMicroQRVersion(MicroQRVersion microQRVersion) {
        this.microQRVersion = microQRVersion;
    }

    /**
     * Get rectMicroQrVersion
     *
     * @return rectMicroQrVersion
     */
    public RectMicroQRVersion getRectMicroQrVersion() {
        return rectMicroQrVersion;
    }

    public void setRectMicroQrVersion(RectMicroQRVersion rectMicroQrVersion) {
        this.rectMicroQrVersion = rectMicroQrVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QrParams qrParams = (QrParams) o;
        return Objects.equals(this.qrEncodeMode, qrParams.qrEncodeMode)
                && Objects.equals(this.qrErrorLevel, qrParams.qrErrorLevel)
                && Objects.equals(this.qrVersion, qrParams.qrVersion)
                && Objects.equals(this.qrECIEncoding, qrParams.qrECIEncoding)
                && Objects.equals(this.qrAspectRatio, qrParams.qrAspectRatio)
                && Objects.equals(this.microQRVersion, qrParams.microQRVersion)
                && Objects.equals(this.rectMicroQrVersion, qrParams.rectMicroQrVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                qrEncodeMode,
                qrErrorLevel,
                qrVersion,
                qrECIEncoding,
                qrAspectRatio,
                microQRVersion,
                rectMicroQrVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QrParams {\n");

        sb.append("    qrEncodeMode: ").append(toIndentedString(qrEncodeMode)).append("\n");
        sb.append("    qrErrorLevel: ").append(toIndentedString(qrErrorLevel)).append("\n");
        sb.append("    qrVersion: ").append(toIndentedString(qrVersion)).append("\n");
        sb.append("    qrECIEncoding: ").append(toIndentedString(qrECIEncoding)).append("\n");
        sb.append("    qrAspectRatio: ").append(toIndentedString(qrAspectRatio)).append("\n");
        sb.append("    microQRVersion: ").append(toIndentedString(microQRVersion)).append("\n");
        sb.append("    rectMicroQrVersion: ")
                .append(toIndentedString(rectMicroQrVersion))
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
