// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="GenerateMultipartRequestWrapper.java">
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
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.CodeLocation;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.model.GraphicsUnit;

/** Generate a barcode using a POST request with parameters in a multipart form. */
public class GenerateMultipartRequestWrapper {
    /** . */
    public final EncodeBarcodeType barcodeType;

    /** String that represents the data to encode.. */
    public final String data;

    /** . */
    public EncodeDataType dataType;

    /** . */
    public BarcodeImageFormat imageFormat;

    /** . */
    public CodeLocation textLocation;

    /**
     * Specify the display color for bars and content. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value starting with #.
     * For example: AliceBlue or #FF000000. Default value: Black..
     */
    public String foregroundColor = "Black";

    /**
     * Background color of the barcode image. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value starting with #.
     * For example: AliceBlue or #FF000000. Default value: White..
     */
    public String backgroundColor = "White";

    /** . */
    public GraphicsUnit units;

    /**
     * Resolution of the barcode image. One value for both dimensions. Default value: 96 dpi.
     * Decimal separator is a dot..
     */
    public Float resolution;

    /**
     * Height of the barcode image in the specified units. Default units: pixels. Decimal separator
     * is a dot..
     */
    public Float imageHeight;

    /**
     * Width of the barcode image in the specified units. Default units: pixels. Decimal separator
     * is a dot..
     */
    public Float imageWidth;

    /**
     * Barcode image rotation angle, measured in degrees. For example, RotationAngle = 0 or
     * RotationAngle = 360 means no rotation. If RotationAngle is not equal to 90, 180, 270, or 0,
     * it may increase the difficulty for the scanner to read the image. Default value: 0..
     */
    public Integer rotationAngle;

    /** . */
    public QREncodeMode qrEncodeMode;

    /** . */
    public QRErrorLevel qrErrorLevel;

    /** . */
    public QRVersion qrVersion;

    /** . */
    public ECIEncodings qrECIEncoding;

    /** QR barcode aspect ratio. Values: 0 to 1.. */
    public Float qrAspectRatio;

    /** . */
    public MicroQRVersion microQRVersion;

    /** . */
    public RectMicroQRVersion rectMicroQrVersion;

    /** . */
    public Code128EncodeMode code128EncodeMode;

    /** . */
    public Pdf417EncodeMode pdf417EncodeMode;

    /** . */
    public Pdf417ErrorLevel pdf417ErrorLevel;

    /** Whether to use truncated PDF417 format (removes right-side stop pattern).. */
    public Boolean pdf417Truncate;

    /** Number of columns in the PDF417 barcode. Values between 1 and 30. 0 for auto.. */
    public Integer pdf417Columns;

    /** Number of rows in the PDF417 barcode. Values between 3 and 90. 0 for automatic.. */
    public Integer pdf417Rows;

    /**
     * PDF417 barcode aspect ratio (height/width of the barcode module). Values are defined by the
     * standard: 2 to 5 for MicroPdf417; 3 to 5 for Pdf417 and MacroPdf417..
     */
    public Float pdf417AspectRatio;

    /** . */
    public ECIEncodings pdf417ECIEncoding;

    /** Whether the barcode is used for reader initialization (programming).. */
    public Boolean pdf417IsReaderInitialization;

    /** . */
    public MacroCharacter pdf417MacroCharacters;

    /** Whether to use linked mode (for MicroPdf417).. */
    public Boolean pdf417IsLinked;

    /** Whether to use Code128 emulation for MicroPdf417.. */
    public Boolean pdf417IsCode128Emulation;

    /**
     * Generate a barcode using a POST request with parameters in a multipart form..
     *
     * @param barcodeType Param of type EncodeBarcodeType
     * @param data String that represents the data to encode.
     */
    public GenerateMultipartRequestWrapper(EncodeBarcodeType barcodeType, String data) {
        this.barcodeType = barcodeType;
        this.data = data;
    }
}
