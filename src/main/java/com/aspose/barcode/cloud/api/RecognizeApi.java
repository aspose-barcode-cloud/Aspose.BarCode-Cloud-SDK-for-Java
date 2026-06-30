// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="RecognizeApi.java">
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
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.requests.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** RecognizeApi. */
public class RecognizeApi {
    private final ApiClient apiClient;

    public RecognizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for recognize
     *
     * @param request See {@link RecognizeRequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected okhttp3.Call recognizeCall(
            RecognizeRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/recognize";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.barcodeType != null) {
            queryParams.addAll(apiClient.parameterToPair("barcodeType", request.barcodeType));
        }

        if (request.fileUrl != null) {
            queryParams.addAll(apiClient.parameterToPair("fileUrl", request.fileUrl));
        }

        if (request.recognitionMode != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("recognitionMode", request.recognitionMode));
        }

        if (request.recognitionImageKind != null) {
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "recognitionImageKind", request.recognitionImageKind));
        }

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        final String[] accepts = {"application/json", "application/xml"};
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

    private okhttp3.Call recognizeValidateBeforeCall(
            RecognizeRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.barcodeType' is set
        if (request.barcodeType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.barcodeType'"
                            + " when calling recognize(...)");
        }

        // verify the required parameter 'request.fileUrl' is set
        if (request.fileUrl == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.fileUrl'"
                            + " when calling recognize(...)");
        }

        okhttp3.Call call = recognizeCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognize a barcode from a file on an Internet server using a GET request with a query string
     * parameter. For recognizing files from your hard drive, use &#x60;recognize-body&#x60; or
     * &#x60;recognize-multipart&#x60; endpoints instead.
     *
     * @param request See {@link RecognizeRequestWrapper}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList recognize(RecognizeRequestWrapper request) throws ApiException {
        ApiResponse<BarcodeResponseList> resp = recognizeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognize a barcode from a file on an Internet server using a GET request with a query string
     * parameter. For recognizing files from your hard drive, use &#x60;recognize-body&#x60; or
     * &#x60;recognize-multipart&#x60; endpoints instead.
     *
     * @param request See {@link RecognizeRequestWrapper}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> recognizeWithHttpInfo(RecognizeRequestWrapper request)
            throws ApiException {
        okhttp3.Call call = recognizeValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognize a barcode from a file on an Internet server using a GET request with a query string
     * parameter. For recognizing files from your hard drive, use &#x60;recognize-body&#x60; or
     * &#x60;recognize-multipart&#x60; endpoints instead. (asynchronously)
     *
     * @param request See {@link RecognizeRequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public okhttp3.Call recognizeAsync(
            RecognizeRequestWrapper request, final ApiCallback<BarcodeResponseList> callback)
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
                recognizeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for recognizeBase64
     *
     * @param request See {@link RecognizeBase64RequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected okhttp3.Call recognizeBase64Call(
            RecognizeBase64RequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = request.recognizeBase64Request;

        // create path and map variables
        String path = "/barcode/recognize-body";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        final String[] accepts = {"application/json", "application/xml"};
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

    private okhttp3.Call recognizeBase64ValidateBeforeCall(
            RecognizeBase64RequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.recognizeBase64Request' is set
        if (request.recognizeBase64Request == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.recognizeBase64Request'"
                            + " when calling recognizeBase64(...)");
        }

        okhttp3.Call call = recognizeBase64Call(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognize a barcode from a file in the request body using a POST request with JSON or XML
     * body parameters.
     *
     * @param request See {@link RecognizeBase64RequestWrapper}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList recognizeBase64(RecognizeBase64RequestWrapper request)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp = recognizeBase64WithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognize a barcode from a file in the request body using a POST request with JSON or XML
     * body parameters.
     *
     * @param request See {@link RecognizeBase64RequestWrapper}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> recognizeBase64WithHttpInfo(
            RecognizeBase64RequestWrapper request) throws ApiException {
        okhttp3.Call call = recognizeBase64ValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognize a barcode from a file in the request body using a POST request with JSON or XML
     * body parameters. (asynchronously)
     *
     * @param request See {@link RecognizeBase64RequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public okhttp3.Call recognizeBase64Async(
            RecognizeBase64RequestWrapper request, final ApiCallback<BarcodeResponseList> callback)
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
                recognizeBase64ValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for recognizeMultipart
     *
     * @param request See {@link RecognizeMultipartRequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected okhttp3.Call recognizeMultipartCall(
            RecognizeMultipartRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/recognize-multipart";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        if (request.barcodeType != null) {
            formParams.put("barcodeType", request.barcodeType);
        }

        if (request.file != null) {
            formParams.put("file", request.file);
        }

        if (request.recognitionMode != null) {
            formParams.put("recognitionMode", request.recognitionMode);
        }

        if (request.recognitionImageKind != null) {
            formParams.put("recognitionImageKind", request.recognitionImageKind);
        }

        final String[] accepts = {"application/json", "application/xml"};
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

    private okhttp3.Call recognizeMultipartValidateBeforeCall(
            RecognizeMultipartRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.barcodeType' is set
        if (request.barcodeType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.barcodeType'"
                            + " when calling recognizeMultipart(...)");
        }

        // verify the required parameter 'request.file' is set
        if (request.file == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.file'"
                            + " when calling recognizeMultipart(...)");
        }

        okhttp3.Call call =
                recognizeMultipartCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognize a barcode from a file in the request body using a POST request with multipart form
     * parameters.
     *
     * @param request See {@link RecognizeMultipartRequestWrapper}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList recognizeMultipart(RecognizeMultipartRequestWrapper request)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp = recognizeMultipartWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognize a barcode from a file in the request body using a POST request with multipart form
     * parameters.
     *
     * @param request See {@link RecognizeMultipartRequestWrapper}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> recognizeMultipartWithHttpInfo(
            RecognizeMultipartRequestWrapper request) throws ApiException {
        okhttp3.Call call = recognizeMultipartValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognize a barcode from a file in the request body using a POST request with multipart form
     * parameters. (asynchronously)
     *
     * @param request See {@link RecognizeMultipartRequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public okhttp3.Call recognizeMultipartAsync(
            RecognizeMultipartRequestWrapper request,
            final ApiCallback<BarcodeResponseList> callback)
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
                recognizeMultipartValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
}
