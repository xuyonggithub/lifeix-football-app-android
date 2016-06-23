# TraingVideoApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getElearningVideoDetail**](TraingVideoApi.md#getElearningVideoDetail) | **GET** /elearning/videos/{videoId} | 获取单个视频详细信息


<a name="getElearningVideoDetail"></a>
# **getElearningVideoDetail**
> ElearningVideo getElearningVideoDetail(videoId)

获取单个视频详细信息

获取单个视频详细信息

### Example
```java
// Import classes:
//import io.swagger.client.api.TraingVideoApi;

TraingVideoApi apiInstance = new TraingVideoApi();
String videoId = "videoId_example"; // String | elearning视频的ID
try {
    ElearningVideo result = apiInstance.getElearningVideoDetail(videoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TraingVideoApi#getElearningVideoDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **String**| elearning视频的ID |

### Return type

[**ElearningVideo**](ElearningVideo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

