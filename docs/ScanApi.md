# ScanApi

All URIs are relative to *<https://api.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**scan**](ScanApi.md#scan) | **GET** /barcode/scan | Scan a barcode from a file on an Internet server using a GET request with a query string parameter. For scanning files from your hard drive, use &#x60;scan-body&#x60; or &#x60;scan-multipart&#x60; endpoints instead.
[**scanBase64**](ScanApi.md#scanBase64) | **POST** /barcode/scan-body | Scan a barcode from a file in the request body using a POST request with a JSON or XML body parameter.
[**scanMultipart**](ScanApi.md#scanMultipart) | **POST** /barcode/scan-multipart | Scan a barcode from a file in the request body using a POST request with a multipart form parameter.

## scan

> BarcodeResponseList scan(fileUrl)

Scan a barcode from a file on an Internet server using a GET request with a query string parameter. For scanning files from your hard drive, use &#x60;scan-body&#x60; or &#x60;scan-multipart&#x60; endpoints instead.


### scan parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **fileUrl** | **URI**| URL to the barcode image. |

### scan return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## scanBase64

> BarcodeResponseList scanBase64(scanBase64Request)

Scan a barcode from a file in the request body using a POST request with a JSON or XML body parameter.


### scanBase64 parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **scanBase64Request** | [**ScanBase64Request**](ScanBase64Request.md)| Barcode scan request. |

### scanBase64 return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## scanMultipart

> BarcodeResponseList scanMultipart(_file)

Scan a barcode from a file in the request body using a POST request with a multipart form parameter.


### scanMultipart parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **_file** | **File**| Barcode image file. |

### scanMultipart return type

[**BarcodeResponseList**](BarcodeResponseList.md)

