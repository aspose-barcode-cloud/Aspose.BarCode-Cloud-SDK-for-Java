package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.time.OffsetDateTime;
import java.util.Objects;

/** Api Error. */
public class ApiError {
    @SerializedName(value = "code")
    private String code;

    @SerializedName(value = "message")
    private String message;

    @SerializedName(value = "description")
    private String description;

    @SerializedName(value = "dateTime")
    private OffsetDateTime dateTime;

    @SerializedName(value = "innerError")
    private ApiError innerError;

    /**
     * .
     *
     * @param code Gets or sets api error code.
     * @param message Gets or sets error message.
     */
    public ApiError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Gets or sets api error code.
     *
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets or sets error message.
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets or sets error description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets or sets server datetime.
     *
     * @return dateTime
     */
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Gets or sets inner error.
     *
     * @return innerError
     */
    public ApiError getInnerError() {
        return innerError;
    }

    public void setInnerError(ApiError innerError) {
        this.innerError = innerError;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiError apiError = (ApiError) o;
        return Objects.equals(this.code, apiError.code)
                && Objects.equals(this.message, apiError.message)
                && Objects.equals(this.description, apiError.description)
                && Objects.equals(this.dateTime, apiError.dateTime)
                && Objects.equals(this.innerError, apiError.innerError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, description, dateTime, innerError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiError {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    innerError: ").append(toIndentedString(innerError)).append("\n");
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
