package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/** One barcode to generate in a batch. */
public class BatchGenerateItem {
    @SerializedName(value = "fileName")
    private String fileName;

    @SerializedName(value = "generation")
    private GenerateParams generation;

    /**
     * .
     *
     * @param generation Barcode generation parameters.
     */
    public BatchGenerateItem(GenerateParams generation) {
        this.generation = generation;
    }

    /**
     * Optional file name inside the archive. When omitted or blank, a sequential name is generated.
     * Supplied safe names are preserved; the image format is independent of the file extension.
     *
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Barcode generation parameters.
     *
     * @return generation
     */
    public GenerateParams getGeneration() {
        return generation;
    }

    public void setGeneration(GenerateParams generation) {
        this.generation = generation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchGenerateItem batchGenerateItem = (BatchGenerateItem) o;
        return Objects.equals(this.fileName, batchGenerateItem.fileName)
                && Objects.equals(this.generation, batchGenerateItem.generation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, generation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGenerateItem {\n");

        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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
