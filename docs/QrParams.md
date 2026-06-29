

# QrParams

Optional QR barcode generation parameters. Applies to QR, GS1QR, MicroQR, and RectMicroQR barcode types.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**qrEncodeMode** | **QREncodeMode** | QR barcode encode mode. |  [optional] |
|**qrErrorLevel** | **QRErrorLevel** | QR barcode error correction level. |  [optional] |
|**qrVersion** | **QRVersion** | QR barcode version. Automatically selects the smallest version that fits the data. |  [optional] |
|**qrECIEncoding** | **ECIEncodings** | ECI encoding for QR barcode data. |  [optional] |
|**qrAspectRatio** | **Float** | QR barcode aspect ratio. Values: 0 to 1. |  [optional] |
|**microQRVersion** | **MicroQRVersion** | MicroQR barcode version. Used when BarcodeType is MicroQR. |  [optional] |
|**rectMicroQrVersion** | **RectMicroQRVersion** | RectMicroQR barcode version. Used when BarcodeType is RectMicroQR. |  [optional] |



