# FileApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOverwriteToken**](FileApi.md#getOverwriteToken) | **GET** /file/token/overwrite | 从文件授权服务器上获取覆盖令牌
[**getUploadToken**](FileApi.md#getUploadToken) | **GET** /file/token/upload | 从文件授权服务器上获取上传令牌


<a name="getOverwriteToken"></a>
# **getOverwriteToken**
> List&lt;String&gt; getOverwriteToken(key, fileName)

从文件授权服务器上获取覆盖令牌

从文件授权服务器上获取覆盖令牌

### Example
```java
// Import classes:
//import io.swagger.client.api.FileApi;

FileApi apiInstance = new FileApi();
String key = "visitor"; // String | key
List<String> fileName = Arrays.asList("fileName_example"); // List<String> | 要覆盖的文件名称列表，如果要覆盖多个，则传多个file_name并列， eg. file_name=xxx&file_name=xxx
try {
    List<String> result = apiInstance.getOverwriteToken(key, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#getOverwriteToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **fileName** | [**List&lt;String&gt;**](String.md)| 要覆盖的文件名称列表，如果要覆盖多个，则传多个file_name并列， eg. file_name&#x3D;xxx&amp;file_name&#x3D;xxx |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUploadToken"></a>
# **getUploadToken**
> UploadToken getUploadToken(key, type, fileName)

从文件授权服务器上获取上传令牌

从文件授权服务器上获取上传令牌

### Example
```java
// Import classes:
//import io.swagger.client.api.FileApi;

FileApi apiInstance = new FileApi();
String key = "visitor"; // String | key
Integer type = 56; // Integer | 上传文件类型，|0 任意类型|1 图片|2 音频|3 视频|
List<String> fileName = Arrays.asList("fileName_example"); // List<String> | 原文件名列表，用于生成上传后的文件名列表，如果想保持原名不变，则可以不传，如果要上传多个，则传多个file_name并列， eg. file_name=xxx&file_name=xxx
try {
    UploadToken result = apiInstance.getUploadToken(key, type, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#getUploadToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **type** | **Integer**| 上传文件类型，|0 任意类型|1 图片|2 音频|3 视频| |
 **fileName** | [**List&lt;String&gt;**](String.md)| 原文件名列表，用于生成上传后的文件名列表，如果想保持原名不变，则可以不传，如果要上传多个，则传多个file_name并列， eg. file_name&#x3D;xxx&amp;file_name&#x3D;xxx | [optional]

### Return type

[**UploadToken**](UploadToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

