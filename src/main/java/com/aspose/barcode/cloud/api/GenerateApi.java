// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="GenerateApi.java">
//   Copyright (c) 2026 Aspose.BarCode for Cloud
// </copyright>
// <summary>
//   Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.ApiResponse;
import com.aspose.barcode.cloud.Pair;
import com.aspose.barcode.cloud.ProgressRequestBody;
import com.aspose.barcode.cloud.ProgressResponseBody;
import com.aspose.barcode.cloud.requests.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** GenerateApi. */
public class GenerateApi {
    private final ApiClient apiClient;

    public GenerateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for generate
     *
     * @param request See {@link GenerateRequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected okhttp3.Call generateCall(
            GenerateRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path =
                "/barcode/generate/{barcodeType}"
                        .replace("{" + "barcodeType" + "}", request.barcodeType.toString());

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.dataType != null) {
            queryParams.addAll(apiClient.parameterToPair("dataType", request.dataType));
        }

        if (request.data != null) {
            queryParams.addAll(apiClient.parameterToPair("data", request.data));
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getImageFormat() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "imageFormat", request.barcodeImageParams.getImageFormat()));
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getTextLocation() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "textLocation", request.barcodeImageParams.getTextLocation()));
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getForegroundColor() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "foregroundColor", request.barcodeImageParams.getForegroundColor()));
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getBackgroundColor() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "backgroundColor", request.barcodeImageParams.getBackgroundColor()));
        }

        if (request.barcodeImageParams != null && request.barcodeImageParams.getUnits() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("units", request.barcodeImageParams.getUnits()));
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getResolution() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "resolution", request.barcodeImageParams.getResolution()));
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getImageHeight() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "imageHeight", request.barcodeImageParams.getImageHeight()));
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getImageWidth() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "imageWidth", request.barcodeImageParams.getImageWidth()));
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getRotationAngle() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "rotationAngle", request.barcodeImageParams.getRotationAngle()));
        }

        if (request.qrParams != null && request.qrParams.getQrEncodeMode() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("qrEncodeMode", request.qrParams.getQrEncodeMode()));
        }

        if (request.qrParams != null && request.qrParams.getQrErrorLevel() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("qrErrorLevel", request.qrParams.getQrErrorLevel()));
        }

        if (request.qrParams != null && request.qrParams.getQrVersion() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("qrVersion", request.qrParams.getQrVersion()));
        }

        if (request.qrParams != null && request.qrParams.getQrECIEncoding() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "qrECIEncoding", request.qrParams.getQrECIEncoding()));
        }

        if (request.qrParams != null && request.qrParams.getQrAspectRatio() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "qrAspectRatio", request.qrParams.getQrAspectRatio()));
        }

        if (request.qrParams != null && request.qrParams.getMicroQRVersion() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "microQRVersion", request.qrParams.getMicroQRVersion()));
        }

        if (request.qrParams != null && request.qrParams.getRectMicroQrVersion() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "rectMicroQrVersion", request.qrParams.getRectMicroQrVersion()));
        }

        if (request.code128Params != null && request.code128Params.getCode128EncodeMode() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "code128EncodeMode", request.code128Params.getCode128EncodeMode()));
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417EncodeMode() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417EncodeMode", request.pdf417Params.getPdf417EncodeMode()));
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417ErrorLevel() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417ErrorLevel", request.pdf417Params.getPdf417ErrorLevel()));
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417Truncate() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417Truncate", request.pdf417Params.getPdf417Truncate()));
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417Columns() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417Columns", request.pdf417Params.getPdf417Columns()));
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417Rows() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("pdf417Rows", request.pdf417Params.getPdf417Rows()));
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417AspectRatio() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417AspectRatio", request.pdf417Params.getPdf417AspectRatio()));
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417ECIEncoding() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417ECIEncoding", request.pdf417Params.getPdf417ECIEncoding()));
        }

        if (request.pdf417Params != null
                && request.pdf417Params.getPdf417IsReaderInitialization() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417IsReaderInitialization",
                            request.pdf417Params.getPdf417IsReaderInitialization()));
        }

        if (request.pdf417Params != null
                && request.pdf417Params.getPdf417MacroCharacters() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417MacroCharacters",
                            request.pdf417Params.getPdf417MacroCharacters()));
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417IsLinked() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417IsLinked", request.pdf417Params.getPdf417IsLinked()));
        }

        if (request.pdf417Params != null
                && request.pdf417Params.getPdf417IsCode128Emulation() != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417IsCode128Emulation",
                            request.pdf417Params.getPdf417IsCode128Emulation()));
        }

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        final String[] accepts = {
            "image/png",
            "image/bmp",
            "image/gif",
            "image/jpeg",
            "image/svg+xml",
            "image/tiff",
            "application/json",
            "application/xml"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) {
            headerParams.put("Accept", accept);
        }

        final String[] contentTypes = {};

        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new okhttp3.Interceptor() {
                                @Override
                                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain)
                                        throws IOException {
                                    okhttp3.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "GET",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private okhttp3.Call generateValidateBeforeCall(
            GenerateRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.barcodeType' is set
        if (request.barcodeType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.barcodeType'"
                            + " when calling generate(...)");
        }

        // verify the required parameter 'request.data' is set
        if (request.data == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.data'"
                            + " when calling generate(...)");
        }

        okhttp3.Call call = generateCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate a barcode using a GET request with parameters in the route and query string.
     *
     * @param request See {@link GenerateRequestWrapper}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File generate(GenerateRequestWrapper request) throws ApiException {
        ApiResponse<File> resp = generateWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate a barcode using a GET request with parameters in the route and query string.
     *
     * @param request See {@link GenerateRequestWrapper}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> generateWithHttpInfo(GenerateRequestWrapper request)
            throws ApiException {
        okhttp3.Call call = generateValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate a barcode using a GET request with parameters in the route and query string.
     * (asynchronously)
     *
     * @param request See {@link GenerateRequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public okhttp3.Call generateAsync(
            GenerateRequestWrapper request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        okhttp3.Call call =
                generateValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for generateBody
     *
     * @param request See {@link GenerateBodyRequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected okhttp3.Call generateBodyCall(
            GenerateBodyRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = request.generateParams;

        // create path and map variables
        String path = "/barcode/generate-body";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        final String[] accepts = {
            "image/png",
            "image/bmp",
            "image/gif",
            "image/jpeg",
            "image/svg+xml",
            "image/tiff",
            "application/json",
            "application/xml"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) {
            headerParams.put("Accept", accept);
        }

        final String[] contentTypes = {"application/json", "application/xml"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new okhttp3.Interceptor() {
                                @Override
                                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain)
                                        throws IOException {
                                    okhttp3.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "POST",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private okhttp3.Call generateBodyValidateBeforeCall(
            GenerateBodyRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.generateParams' is set
        if (request.generateParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.generateParams'"
                            + " when calling generateBody(...)");
        }

        okhttp3.Call call = generateBodyCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate a barcode using a POST request with parameters in the request body in JSON or XML
     * format.
     *
     * @param request See {@link GenerateBodyRequestWrapper}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File generateBody(GenerateBodyRequestWrapper request) throws ApiException {
        ApiResponse<File> resp = generateBodyWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate a barcode using a POST request with parameters in the request body in JSON or XML
     * format.
     *
     * @param request See {@link GenerateBodyRequestWrapper}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> generateBodyWithHttpInfo(GenerateBodyRequestWrapper request)
            throws ApiException {
        okhttp3.Call call = generateBodyValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate a barcode using a POST request with parameters in the request body in JSON or XML
     * format. (asynchronously)
     *
     * @param request See {@link GenerateBodyRequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public okhttp3.Call generateBodyAsync(
            GenerateBodyRequestWrapper request, final ApiCallback<File> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        okhttp3.Call call =
                generateBodyValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for generateMultipart
     *
     * @param request See {@link GenerateMultipartRequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected okhttp3.Call generateMultipartCall(
            GenerateMultipartRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/generate-multipart";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        if (request.barcodeType != null) {
            formParams.put("barcodeType", request.barcodeType);
        }

        if (request.dataType != null) {
            formParams.put("dataType", request.dataType);
        }

        if (request.data != null) {
            formParams.put("data", request.data);
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getImageFormat() != null) {
            formParams.put("imageFormat", request.barcodeImageParams.getImageFormat());
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getTextLocation() != null) {
            formParams.put("textLocation", request.barcodeImageParams.getTextLocation());
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getForegroundColor() != null) {
            formParams.put("foregroundColor", request.barcodeImageParams.getForegroundColor());
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getBackgroundColor() != null) {
            formParams.put("backgroundColor", request.barcodeImageParams.getBackgroundColor());
        }

        if (request.barcodeImageParams != null && request.barcodeImageParams.getUnits() != null) {
            formParams.put("units", request.barcodeImageParams.getUnits());
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getResolution() != null) {
            formParams.put("resolution", request.barcodeImageParams.getResolution());
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getImageHeight() != null) {
            formParams.put("imageHeight", request.barcodeImageParams.getImageHeight());
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getImageWidth() != null) {
            formParams.put("imageWidth", request.barcodeImageParams.getImageWidth());
        }

        if (request.barcodeImageParams != null
                && request.barcodeImageParams.getRotationAngle() != null) {
            formParams.put("rotationAngle", request.barcodeImageParams.getRotationAngle());
        }

        if (request.qrParams != null && request.qrParams.getQrEncodeMode() != null) {
            formParams.put("qrEncodeMode", request.qrParams.getQrEncodeMode());
        }

        if (request.qrParams != null && request.qrParams.getQrErrorLevel() != null) {
            formParams.put("qrErrorLevel", request.qrParams.getQrErrorLevel());
        }

        if (request.qrParams != null && request.qrParams.getQrVersion() != null) {
            formParams.put("qrVersion", request.qrParams.getQrVersion());
        }

        if (request.qrParams != null && request.qrParams.getQrECIEncoding() != null) {
            formParams.put("qrECIEncoding", request.qrParams.getQrECIEncoding());
        }

        if (request.qrParams != null && request.qrParams.getQrAspectRatio() != null) {
            formParams.put("qrAspectRatio", request.qrParams.getQrAspectRatio());
        }

        if (request.qrParams != null && request.qrParams.getMicroQRVersion() != null) {
            formParams.put("microQRVersion", request.qrParams.getMicroQRVersion());
        }

        if (request.qrParams != null && request.qrParams.getRectMicroQrVersion() != null) {
            formParams.put("rectMicroQrVersion", request.qrParams.getRectMicroQrVersion());
        }

        if (request.code128Params != null && request.code128Params.getCode128EncodeMode() != null) {
            formParams.put("code128EncodeMode", request.code128Params.getCode128EncodeMode());
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417EncodeMode() != null) {
            formParams.put("pdf417EncodeMode", request.pdf417Params.getPdf417EncodeMode());
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417ErrorLevel() != null) {
            formParams.put("pdf417ErrorLevel", request.pdf417Params.getPdf417ErrorLevel());
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417Truncate() != null) {
            formParams.put("pdf417Truncate", request.pdf417Params.getPdf417Truncate());
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417Columns() != null) {
            formParams.put("pdf417Columns", request.pdf417Params.getPdf417Columns());
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417Rows() != null) {
            formParams.put("pdf417Rows", request.pdf417Params.getPdf417Rows());
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417AspectRatio() != null) {
            formParams.put("pdf417AspectRatio", request.pdf417Params.getPdf417AspectRatio());
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417ECIEncoding() != null) {
            formParams.put("pdf417ECIEncoding", request.pdf417Params.getPdf417ECIEncoding());
        }

        if (request.pdf417Params != null
                && request.pdf417Params.getPdf417IsReaderInitialization() != null) {
            formParams.put(
                    "pdf417IsReaderInitialization",
                    request.pdf417Params.getPdf417IsReaderInitialization());
        }

        if (request.pdf417Params != null
                && request.pdf417Params.getPdf417MacroCharacters() != null) {
            formParams.put(
                    "pdf417MacroCharacters", request.pdf417Params.getPdf417MacroCharacters());
        }

        if (request.pdf417Params != null && request.pdf417Params.getPdf417IsLinked() != null) {
            formParams.put("pdf417IsLinked", request.pdf417Params.getPdf417IsLinked());
        }

        if (request.pdf417Params != null
                && request.pdf417Params.getPdf417IsCode128Emulation() != null) {
            formParams.put(
                    "pdf417IsCode128Emulation",
                    request.pdf417Params.getPdf417IsCode128Emulation());
        }

        final String[] accepts = {
            "image/png",
            "image/bmp",
            "image/gif",
            "image/jpeg",
            "image/svg+xml",
            "image/tiff",
            "application/json",
            "application/xml"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) {
            headerParams.put("Accept", accept);
        }

        final String[] contentTypes = {"multipart/form-data"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new okhttp3.Interceptor() {
                                @Override
                                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain)
                                        throws IOException {
                                    okhttp3.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "POST",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private okhttp3.Call generateMultipartValidateBeforeCall(
            GenerateMultipartRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.barcodeType' is set
        if (request.barcodeType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.barcodeType'"
                            + " when calling generateMultipart(...)");
        }

        // verify the required parameter 'request.data' is set
        if (request.data == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.data'"
                            + " when calling generateMultipart(...)");
        }

        okhttp3.Call call =
                generateMultipartCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate a barcode using a POST request with parameters in a multipart form.
     *
     * @param request See {@link GenerateMultipartRequestWrapper}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File generateMultipart(GenerateMultipartRequestWrapper request) throws ApiException {
        ApiResponse<File> resp = generateMultipartWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate a barcode using a POST request with parameters in a multipart form.
     *
     * @param request See {@link GenerateMultipartRequestWrapper}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> generateMultipartWithHttpInfo(GenerateMultipartRequestWrapper request)
            throws ApiException {
        okhttp3.Call call = generateMultipartValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate a barcode using a POST request with parameters in a multipart form. (asynchronously)
     *
     * @param request See {@link GenerateMultipartRequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public okhttp3.Call generateMultipartAsync(
            GenerateMultipartRequestWrapper request, final ApiCallback<File> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        okhttp3.Call call =
                generateMultipartValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
}
