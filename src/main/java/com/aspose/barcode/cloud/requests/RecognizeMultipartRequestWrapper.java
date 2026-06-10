// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="RecognizeMultipartRequestWrapper.java">
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

import com.aspose.barcode.cloud.model.*;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.RecognitionImageKind;
import com.aspose.barcode.cloud.model.RecognitionMode;

import java.io.File;

/**
 * Recognize a barcode from a file in the request body using a POST request with multipart form
 * parameters.
 */
public class RecognizeMultipartRequestWrapper {
    /** . */
    public final DecodeBarcodeType barcodeType;

    /** Barcode image file.. */
    public final File file;

    /** . */
    public RecognitionMode recognitionMode;

    /** . */
    public RecognitionImageKind recognitionImageKind;

    /**
     * Recognize a barcode from a file in the request body using a POST request with multipart form
     * parameters..
     *
     * @param barcodeType Param of type DecodeBarcodeType
     * @param file Barcode image file.
     */
    public RecognizeMultipartRequestWrapper(DecodeBarcodeType barcodeType, File file) {
        this.barcodeType = barcodeType;
        this.file = file;
    }
}
