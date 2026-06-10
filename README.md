# Aspose.BarCode Cloud SDK for Java

[![License](https://img.shields.io/github/license/aspose-barcode-cloud/Aspose.BarCode-Cloud-SDK-for-Java)](LICENSE)
[![Java CI with Maven](https://github.com/aspose-barcode-cloud/Aspose.BarCode-Cloud-SDK-for-Java/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/aspose-barcode-cloud/Aspose.BarCode-Cloud-SDK-for-Java/actions/workflows/ci.yml)
[![Maven metadata URL](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Freleases.aspose.cloud%2Fjava%2Frepo%2Fcom%2Faspose%2Faspose-barcode-cloud%2Fmaven-metadata.xml)](https://releases.aspose.cloud/java/repo/com/aspose/aspose-barcode-cloud/)

- API version: 4.0
- SDK version: 26.6.0

## SDK and API Version Compatibility:

- SDK Version 25.1 and Later: Starting from SDK version 25.1, all subsequent versions are compatible with API Version v4.0.
- SDK Version 24.12 and Earlier: These versions are compatible with API Version v3.0.

## Demo applications

[Scan QR](https://products.aspose.app/barcode/scanqr) | [Generate Barcode](https://products.aspose.app/barcode/generate) | [Recognize Barcode](https://products.aspose.app/barcode/recognize)
:---: | :---: | :---:
[![ScanQR](https://products.aspose.app/barcode/scanqr/img/aspose_scanqr-app-48.png)](https://products.aspose.app/barcode/scanqr) | [![Generate](https://products.aspose.app/barcode/generate/img/aspose_generate-app-48.png)](https://products.aspose.app/barcode/generate) | [![Recognize](https://products.aspose.app/barcode/recognize/img/aspose_recognize-app-48.png)](https://products.aspose.app/barcode/recognize)
[**Generate Wi-Fi QR**](https://products.aspose.app/barcode/wifi-qr) | [**Embed Barcode**](https://products.aspose.app/barcode/embed) | [**Scan Barcode**](https://products.aspose.app/barcode/scan)
[![Wi-FiQR](https://products.aspose.app/barcode/embed/img/aspose_wifi-qr-app-48.png)](https://products.aspose.app/barcode/wifi-qr) | [![Embed](https://products.aspose.app/barcode/embed/img/aspose_embed-app-48.png)](https://products.aspose.app/barcode/embed) | [![Scan](https://products.aspose.app/barcode/embed/img/aspose_scan-app-48.png)](https://products.aspose.app/barcode/scan)

[Aspose.BarCode for Cloud](https://products.aspose.cloud/barcode/) is a REST API for Linear, 2D and postal barcode generation and recognition in the cloud. API recognizes and generates barcode images in a variety of formats. Barcode REST API allows to specify barcode image attributes like image width, height, border style and output image format in order to customize the generation process. Developers can also specify the barcode type and text attributes such as text location and font styles in order to suit the application requirements.

This repository contains Aspose.BarCode Cloud SDK for Java source code. This SDK allows you to work with Aspose.BarCode for Cloud REST APIs in your Java applications quickly and easily.

## AI Agent Skills

This repository includes an AI-agent skill in [`skills/generate-and-scan-barcode-java/SKILL.md`](skills/generate-and-scan-barcode-java/SKILL.md). Point your coding agent to it when working with this SDK so it follows the repo workflow and SDK-specific API patterns.

## Requirements

Building the API client library requires:

1. Java 8 (JDK 1.8)
2. Maven

## Prerequisites

To use Aspose.BarCode Cloud SDK for Java you need to register an account with [Aspose Cloud](https://www.aspose.cloud) and lookup/create Client Id and Client Secret at [Cloud Dashboard](https://dashboard.aspose.cloud/applications). There is free quota available. For more details, see [Aspose Cloud Pricing](https://purchase.aspose.cloud/).

## Installation

### Install Aspose.BarCode-Cloud from Maven

Add Aspose Cloud repository to your application pom.xml

```xml
<repository>
    <id>aspose-cloud</id>
    <name>Aspose Cloud Repository</name>
    <url>https://releases.aspose.cloud/java/repo/</url>
</repository>
```

### Install from source

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.aspose</groupId>
  <artifactId>aspose-barcode-cloud</artifactId>
  <version>26.6.0</version>
  <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/aspose-barcode-cloud-26.6.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
package com.aspose.barcode.cloud.examples;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.QREncodeMode;
import com.aspose.barcode.cloud.model.QRErrorLevel;
import com.aspose.barcode.cloud.model.QRVersion;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;

import java.io.File;

public class Example {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");

        GenerateApi genApi = new GenerateApi(client);
        ScanApi scanApi = new ScanApi(client);

        try {
            System.out.println("Generating barcode...");
            File barcodeImage = generateBarcode(genApi);
            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

            System.out.println("Recognizing barcode on image...");
            BarcodeResponseList recognized = scanBarcode(scanApi, barcodeImage);
            System.out.print("Barcode on image:");
            System.out.println(recognized.toString());
        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

    private static File generateBarcode(GenerateApi api) throws ApiException {
        EncodeBarcodeType type = EncodeBarcodeType.QR;
        String text = "Aspose.BarCode for Cloud Sample";
        GenerateRequestWrapper request = new GenerateRequestWrapper(type, text);
        request.imageFormat = BarcodeImageFormat.JPEG;
        request.qrEncodeMode = QREncodeMode.AUTO;
        request.qrErrorLevel = QRErrorLevel.LEVEL_M;
        request.qrVersion = QRVersion.AUTO;
        request.qrAspectRatio = 0.75f;

        return api.generate(request);
    }

    private static BarcodeResponseList scanBarcode(ScanApi api, File barcodeImage)
            throws ApiException {
        ScanMultipartRequestWrapper request = new ScanMultipartRequestWrapper(barcodeImage);

        return api.scanMultipart(request);
    }
}

```

## Licensing

All Aspose.BarCode for Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

## Resources

- [**Website**](https://www.aspose.cloud)
- [**Product Home**](https://products.aspose.cloud/barcode/)
- [**Documentation**](https://docs.aspose.cloud/barcode/)
- [**Free Support Forum**](https://forum.aspose.cloud/c/barcode)
- [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)
- [**Blog**](https://blog.aspose.cloud/categories/aspose.barcode-cloud-product-family/)

## Documentation for API Endpoints

All URIs are relative to *<https://api.aspose.cloud/v4.0>*

Class | Method | HTTP request | Description
----- | ------ | ------------ | -----------
*GenerateApi* | [**generate**](docs/GenerateApi.md#generate) | **GET** /barcode/generate/{barcodeType} | Generate a barcode using a GET request with parameters in the route and query string.
*GenerateApi* | [**generateBody**](docs/GenerateApi.md#generateBody) | **POST** /barcode/generate-body | Generate a barcode using a POST request with parameters in the request body in JSON or XML format.
*GenerateApi* | [**generateMultipart**](docs/GenerateApi.md#generateMultipart) | **POST** /barcode/generate-multipart | Generate a barcode using a POST request with parameters in a multipart form.
*RecognizeApi* | [**recognize**](docs/RecognizeApi.md#recognize) | **GET** /barcode/recognize | Recognize a barcode from a file on an Internet server using a GET request with a query string parameter. For recognizing files from your hard drive, use &#x60;recognize-body&#x60; or &#x60;recognize-multipart&#x60; endpoints instead.
*RecognizeApi* | [**recognizeBase64**](docs/RecognizeApi.md#recognizeBase64) | **POST** /barcode/recognize-body | Recognize a barcode from a file in the request body using a POST request with JSON or XML body parameters.
*RecognizeApi* | [**recognizeMultipart**](docs/RecognizeApi.md#recognizeMultipart) | **POST** /barcode/recognize-multipart | Recognize a barcode from a file in the request body using a POST request with multipart form parameters.
*ScanApi* | [**scan**](docs/ScanApi.md#scan) | **GET** /barcode/scan | Scan a barcode from a file on an Internet server using a GET request with a query string parameter. For scanning files from your hard drive, use &#x60;scan-body&#x60; or &#x60;scan-multipart&#x60; endpoints instead.
*ScanApi* | [**scanBase64**](docs/ScanApi.md#scanBase64) | **POST** /barcode/scan-body | Scan a barcode from a file in the request body using a POST request with a JSON or XML body parameter.
*ScanApi* | [**scanMultipart**](docs/ScanApi.md#scanMultipart) | **POST** /barcode/scan-multipart | Scan a barcode from a file in the request body using a POST request with a multipart form parameter.

## Documentation for Models

- [ApiError](docs/ApiError.md)
- [ApiErrorResponse](docs/ApiErrorResponse.md)
- [BarcodeImageFormat](docs/BarcodeImageFormat.md)
- [BarcodeImageParams](docs/BarcodeImageParams.md)
- [BarcodeResponse](docs/BarcodeResponse.md)
- [BarcodeResponseList](docs/BarcodeResponseList.md)
- [Code128EncodeMode](docs/Code128EncodeMode.md)
- [Code128Params](docs/Code128Params.md)
- [CodeLocation](docs/CodeLocation.md)
- [DecodeBarcodeType](docs/DecodeBarcodeType.md)
- [ECIEncodings](docs/ECIEncodings.md)
- [EncodeBarcodeType](docs/EncodeBarcodeType.md)
- [EncodeData](docs/EncodeData.md)
- [EncodeDataType](docs/EncodeDataType.md)
- [GenerateParams](docs/GenerateParams.md)
- [GraphicsUnit](docs/GraphicsUnit.md)
- [MacroCharacter](docs/MacroCharacter.md)
- [MicroQRVersion](docs/MicroQRVersion.md)
- [Pdf417EncodeMode](docs/Pdf417EncodeMode.md)
- [Pdf417ErrorLevel](docs/Pdf417ErrorLevel.md)
- [Pdf417Params](docs/Pdf417Params.md)
- [QREncodeMode](docs/QREncodeMode.md)
- [QRErrorLevel](docs/QRErrorLevel.md)
- [QRVersion](docs/QRVersion.md)
- [QrParams](docs/QrParams.md)
- [RecognitionImageKind](docs/RecognitionImageKind.md)
- [RecognitionMode](docs/RecognitionMode.md)
- [RecognizeBase64Request](docs/RecognizeBase64Request.md)
- [RectMicroQRVersion](docs/RectMicroQRVersion.md)
- [RegionPoint](docs/RegionPoint.md)
- [ScanBase64Request](docs/ScanBase64Request.md)

## Documentation for Authorization

Authentication schemes defined for the API:

### JWT

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: <https://id.aspose.cloud/connect/token>

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
