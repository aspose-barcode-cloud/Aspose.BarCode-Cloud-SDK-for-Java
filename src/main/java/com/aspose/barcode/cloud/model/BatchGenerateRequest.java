package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Batch barcode generation request. */
public class BatchGenerateRequest {
    @SerializedName(value = "archiveFormat")
    private BatchArchiveFormat archiveFormat = BatchArchiveFormat.ZIP;

    @SerializedName(value = "items")
    private List<BatchGenerateItem> items = new ArrayList<>();

    /**
     * .
     *
     * @param items Barcodes to generate. A batch must contain between one and three items.
     */
    public BatchGenerateRequest(List<BatchGenerateItem> items) {
        this.items = items;
    }

    /**
     * Format of the returned archive. Default value: Zip.
     *
     * @return archiveFormat
     */
    public BatchArchiveFormat getArchiveFormat() {
        return archiveFormat;
    }

    public void setArchiveFormat(BatchArchiveFormat archiveFormat) {
        this.archiveFormat = archiveFormat;
    }

    /**
     * Barcodes to generate. A batch must contain between one and three items.
     *
     * @return items
     */
    public List<BatchGenerateItem> getItems() {
        return items;
    }

    public void setItems(List<BatchGenerateItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchGenerateRequest batchGenerateRequest = (BatchGenerateRequest) o;
        return Objects.equals(this.archiveFormat, batchGenerateRequest.archiveFormat)
                && Objects.equals(this.items, batchGenerateRequest.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archiveFormat, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGenerateRequest {\n");

        sb.append("    archiveFormat: ").append(toIndentedString(archiveFormat)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
