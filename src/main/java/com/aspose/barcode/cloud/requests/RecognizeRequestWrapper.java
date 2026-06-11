// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="RecognizeRequestWrapper.java">
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

package com.aspose.barcode.cloud.requests;

import com.aspose.barcode.cloud.model.Code128EncodeMode;
import com.aspose.barcode.cloud.model.Code128Params;
import com.aspose.barcode.cloud.model.ECIEncodings;
import com.aspose.barcode.cloud.model.MacroCharacter;
import com.aspose.barcode.cloud.model.MicroQRVersion;
import com.aspose.barcode.cloud.model.Pdf417EncodeMode;
import com.aspose.barcode.cloud.model.Pdf417ErrorLevel;
import com.aspose.barcode.cloud.model.Pdf417Params;
import com.aspose.barcode.cloud.model.QREncodeMode;
import com.aspose.barcode.cloud.model.QRErrorLevel;
import com.aspose.barcode.cloud.model.QRVersion;
import com.aspose.barcode.cloud.model.QrParams;
import com.aspose.barcode.cloud.model.RectMicroQRVersion;

import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.RecognitionImageKind;
import com.aspose.barcode.cloud.model.RecognitionMode;

import java.net.URI;

/**
 * Recognize a barcode from a file on an Internet server using a GET request with a query string
 * parameter. For recognizing files from your hard drive, use `recognize-body` or
 * `recognize-multipart` endpoints instead.
 */
public class RecognizeRequestWrapper {
    /** Type of barcode to recognize.. */
    public final DecodeBarcodeType barcodeType;

    /** URL to the barcode image.. */
    public final URI fileUrl;

    /** Recognition mode.. */
    public RecognitionMode recognitionMode;

    /** Image kind for recognition.. */
    public RecognitionImageKind recognitionImageKind;

    /**
     * Recognize a barcode from a file on an Internet server using a GET request with a query string
     * parameter. For recognizing files from your hard drive, use `recognize-body` or
     * `recognize-multipart` endpoints instead..
     *
     * @param barcodeType Type of barcode to recognize.
     * @param fileUrl URL to the barcode image.
     */
    public RecognizeRequestWrapper(DecodeBarcodeType barcodeType, URI fileUrl) {
        this.barcodeType = barcodeType;
        this.fileUrl = fileUrl;
    }
}
