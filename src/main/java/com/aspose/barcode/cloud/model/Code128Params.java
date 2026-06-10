package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/** Optional Code128 barcode generation parameters. */
public class Code128Params {
    @SerializedName(value = "code128EncodeMode")
    private Code128EncodeMode code128EncodeMode;

    /**
     * Get code128EncodeMode
     *
     * @return code128EncodeMode
     */
    public Code128EncodeMode getCode128EncodeMode() {
        return code128EncodeMode;
    }

    public void setCode128EncodeMode(Code128EncodeMode code128EncodeMode) {
        this.code128EncodeMode = code128EncodeMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Code128Params code128Params = (Code128Params) o;
        return Objects.equals(this.code128EncodeMode, code128Params.code128EncodeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code128EncodeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Code128Params {\n");

        sb.append("    code128EncodeMode: ")
                .append(toIndentedString(code128EncodeMode))
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
