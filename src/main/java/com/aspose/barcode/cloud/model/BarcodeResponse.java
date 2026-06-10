package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/** Represents information about a barcode. */
public class BarcodeResponse {
    @SerializedName(value = "barcodeValue")
    private String barcodeValue;

    @SerializedName(value = "type")
    private String type;

    @SerializedName(value = "region")
    private List<RegionPoint> region = null;

    @SerializedName(value = "checksum")
    private String checksum;

    /**
     * Barcode data.
     *
     * @return barcodeValue
     */
    public String getBarcodeValue() {
        return barcodeValue;
    }

    public void setBarcodeValue(String barcodeValue) {
        this.barcodeValue = barcodeValue;
    }

    /**
     * Type of the barcode.
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Region with the barcode.
     *
     * @return region
     */
    public List<RegionPoint> getRegion() {
        return region;
    }

    public void setRegion(List<RegionPoint> region) {
        this.region = region;
    }

    /**
     * Checksum of the barcode.
     *
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BarcodeResponse barcodeResponse = (BarcodeResponse) o;
        return Objects.equals(this.barcodeValue, barcodeResponse.barcodeValue)
                && Objects.equals(this.type, barcodeResponse.type)
                && Objects.equals(this.region, barcodeResponse.region)
                && Objects.equals(this.checksum, barcodeResponse.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcodeValue, type, region, checksum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BarcodeResponse {\n");

        sb.append("    barcodeValue: ").append(toIndentedString(barcodeValue)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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
