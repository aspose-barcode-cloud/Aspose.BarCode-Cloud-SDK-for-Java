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

        if (request.imageFormat != null) {
            queryParams.addAll(apiClient.parameterToPair("imageFormat", request.imageFormat));
        }

        if (request.textLocation != null) {
            queryParams.addAll(apiClient.parameterToPair("textLocation", request.textLocation));
        }

        if (request.foregroundColor != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("foregroundColor", request.foregroundColor));
        }

        if (request.backgroundColor != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("backgroundColor", request.backgroundColor));
        }

        if (request.units != null) {
            queryParams.addAll(apiClient.parameterToPair("units", request.units));
        }

        if (request.resolution != null) {
            queryParams.addAll(apiClient.parameterToPair("resolution", request.resolution));
        }

        if (request.imageHeight != null) {
            queryParams.addAll(apiClient.parameterToPair("imageHeight", request.imageHeight));
        }

        if (request.imageWidth != null) {
            queryParams.addAll(apiClient.parameterToPair("imageWidth", request.imageWidth));
        }

        if (request.rotationAngle != null) {
            queryParams.addAll(apiClient.parameterToPair("rotationAngle", request.rotationAngle));
        }

        if (request.qrEncodeMode != null) {
            queryParams.addAll(apiClient.parameterToPair("qrEncodeMode", request.qrEncodeMode));
        }

        if (request.qrErrorLevel != null) {
            queryParams.addAll(apiClient.parameterToPair("qrErrorLevel", request.qrErrorLevel));
        }

        if (request.qrVersion != null) {
            queryParams.addAll(apiClient.parameterToPair("qrVersion", request.qrVersion));
        }

        if (request.qrECIEncoding != null) {
            queryParams.addAll(apiClient.parameterToPair("qrECIEncoding", request.qrECIEncoding));
        }

        if (request.qrAspectRatio != null) {
            queryParams.addAll(apiClient.parameterToPair("qrAspectRatio", request.qrAspectRatio));
        }

        if (request.microQRVersion != null) {
            queryParams.addAll(apiClient.parameterToPair("microQRVersion", request.microQRVersion));
        }

        if (request.rectMicroQrVersion != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("rectMicroQrVersion", request.rectMicroQrVersion));
        }

        if (request.code128EncodeMode != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("code128EncodeMode", request.code128EncodeMode));
        }

        if (request.pdf417EncodeMode != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("pdf417EncodeMode", request.pdf417EncodeMode));
        }

        if (request.pdf417ErrorLevel != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("pdf417ErrorLevel", request.pdf417ErrorLevel));
        }

        if (request.pdf417Truncate != null) {
            queryParams.addAll(apiClient.parameterToPair("pdf417Truncate", request.pdf417Truncate));
        }

        if (request.pdf417Columns != null) {
            queryParams.addAll(apiClient.parameterToPair("pdf417Columns", request.pdf417Columns));
        }

        if (request.pdf417Rows != null) {
            queryParams.addAll(apiClient.parameterToPair("pdf417Rows", request.pdf417Rows));
        }

        if (request.pdf417AspectRatio != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("pdf417AspectRatio", request.pdf417AspectRatio));
        }

        if (request.pdf417ECIEncoding != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("pdf417ECIEncoding", request.pdf417ECIEncoding));
        }

        if (request.pdf417IsReaderInitialization != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417IsReaderInitialization", request.pdf417IsReaderInitialization));
        }

        if (request.pdf417MacroCharacters != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417MacroCharacters", request.pdf417MacroCharacters));
        }

        if (request.pdf417IsLinked != null) {
            queryParams.addAll(apiClient.parameterToPair("pdf417IsLinked", request.pdf417IsLinked));
        }

        if (request.pdf417IsCode128Emulation != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "pdf417IsCode128Emulation", request.pdf417IsCode128Emulation));
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

        if (request.imageFormat != null) {
            formParams.put("imageFormat", request.imageFormat);
        }

        if (request.textLocation != null) {
            formParams.put("textLocation", request.textLocation);
        }

        if (request.foregroundColor != null) {
            formParams.put("foregroundColor", request.foregroundColor);
        }

        if (request.backgroundColor != null) {
            formParams.put("backgroundColor", request.backgroundColor);
        }

        if (request.units != null) {
            formParams.put("units", request.units);
        }

        if (request.resolution != null) {
            formParams.put("resolution", request.resolution);
        }

        if (request.imageHeight != null) {
            formParams.put("imageHeight", request.imageHeight);
        }

        if (request.imageWidth != null) {
            formParams.put("imageWidth", request.imageWidth);
        }

        if (request.rotationAngle != null) {
            formParams.put("rotationAngle", request.rotationAngle);
        }

        if (request.qrEncodeMode != null) {
            formParams.put("qrEncodeMode", request.qrEncodeMode);
        }

        if (request.qrErrorLevel != null) {
            formParams.put("qrErrorLevel", request.qrErrorLevel);
        }

        if (request.qrVersion != null) {
            formParams.put("qrVersion", request.qrVersion);
        }

        if (request.qrECIEncoding != null) {
            formParams.put("qrECIEncoding", request.qrECIEncoding);
        }

        if (request.qrAspectRatio != null) {
            formParams.put("qrAspectRatio", request.qrAspectRatio);
        }

        if (request.microQRVersion != null) {
            formParams.put("microQRVersion", request.microQRVersion);
        }

        if (request.rectMicroQrVersion != null) {
            formParams.put("rectMicroQrVersion", request.rectMicroQrVersion);
        }

        if (request.code128EncodeMode != null) {
            formParams.put("code128EncodeMode", request.code128EncodeMode);
        }

        if (request.pdf417EncodeMode != null) {
            formParams.put("pdf417EncodeMode", request.pdf417EncodeMode);
        }

        if (request.pdf417ErrorLevel != null) {
            formParams.put("pdf417ErrorLevel", request.pdf417ErrorLevel);
        }

        if (request.pdf417Truncate != null) {
            formParams.put("pdf417Truncate", request.pdf417Truncate);
        }

        if (request.pdf417Columns != null) {
            formParams.put("pdf417Columns", request.pdf417Columns);
        }

        if (request.pdf417Rows != null) {
            formParams.put("pdf417Rows", request.pdf417Rows);
        }

        if (request.pdf417AspectRatio != null) {
            formParams.put("pdf417AspectRatio", request.pdf417AspectRatio);
        }

        if (request.pdf417ECIEncoding != null) {
            formParams.put("pdf417ECIEncoding", request.pdf417ECIEncoding);
        }

        if (request.pdf417IsReaderInitialization != null) {
            formParams.put("pdf417IsReaderInitialization", request.pdf417IsReaderInitialization);
        }

        if (request.pdf417MacroCharacters != null) {
            formParams.put("pdf417MacroCharacters", request.pdf417MacroCharacters);
        }

        if (request.pdf417IsLinked != null) {
            formParams.put("pdf417IsLinked", request.pdf417IsLinked);
        }

        if (request.pdf417IsCode128Emulation != null) {
            formParams.put("pdf417IsCode128Emulation", request.pdf417IsCode128Emulation);
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
