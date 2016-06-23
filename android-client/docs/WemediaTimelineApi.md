# WemediaTimelineApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimelinePosts**](WemediaTimelineApi.md#getTimelinePosts) | **GET** /wemedia/posts/timeline | 获取时间轴形式的Post列表


<a name="getTimelinePosts"></a>
# **getTimelinePosts**
> List&lt;TimeLineNews&gt; getTimelinePosts(categoryId, startDate, limit)

获取时间轴形式的Post列表

返回TimeLineNews对象，默认按时间倒叙

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaTimelineApi;

WemediaTimelineApi apiInstance = new WemediaTimelineApi();
String categoryId = "categoryId_example"; // String | 类目Id
Date startDate = new Date(); // Date | 查询开始日期,单位天.默认为当天
Integer limit = 5; // Integer | 一页显示数目，如果不传默认=5
try {
    List<TimeLineNews> result = apiInstance.getTimelinePosts(categoryId, startDate, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaTimelineApi#getTimelinePosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| 类目Id | [optional]
 **startDate** | **Date**| 查询开始日期,单位天.默认为当天 | [optional]
 **limit** | **Integer**| 一页显示数目，如果不传默认&#x3D;5 | [optional] [default to 5]

### Return type

[**List&lt;TimeLineNews&gt;**](TimeLineNews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

