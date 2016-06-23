# WemediaTopApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTopPosts**](WemediaTopApi.md#addTopPosts) | **POST** /wemedia/tops | 添加Posts到对应的Category的Top
[**deleteTopPosts**](WemediaTopApi.md#deleteTopPosts) | **DELETE** /wemedia/tops | 从对应的Category的Top上删除Posts
[**getTopPosts**](WemediaTopApi.md#getTopPosts) | **GET** /wemedia/tops | 获得类目下对应的文章列表


<a name="addTopPosts"></a>
# **addTopPosts**
> addTopPosts(key, categoryId, postIds)

添加Posts到对应的Category的Top

传入类目Id以及对应的PostIds

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaTopApi;

WemediaTopApi apiInstance = new WemediaTopApi();
String key = "visitor"; // String | key
String categoryId = "categoryId_example"; // String | 类目Id
List<String> postIds = Arrays.asList("postIds_example"); // List<String> | postIds
try {
    apiInstance.addTopPosts(key, categoryId, postIds);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaTopApi#addTopPosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **categoryId** | **String**| 类目Id | [optional]
 **postIds** | [**List&lt;String&gt;**](String.md)| postIds | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTopPosts"></a>
# **deleteTopPosts**
> deleteTopPosts(key, categoryId, postIds)

从对应的Category的Top上删除Posts

传入类目Id以及对应的PostIds

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaTopApi;

WemediaTopApi apiInstance = new WemediaTopApi();
String key = "visitor"; // String | key
String categoryId = "categoryId_example"; // String | 类目Id
List<String> postIds = Arrays.asList("postIds_example"); // List<String> | postIds
try {
    apiInstance.deleteTopPosts(key, categoryId, postIds);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaTopApi#deleteTopPosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **categoryId** | **String**| 类目Id | [optional]
 **postIds** | [**List&lt;String&gt;**](String.md)| postIds | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopPosts"></a>
# **getTopPosts**
> List&lt;Post&gt; getTopPosts(key, categoryIds)

获得类目下对应的文章列表

传入类目Ids能够获得对应的posts:之所以用列表是因为console需要获知某一组类目下所有posts

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaTopApi;

WemediaTopApi apiInstance = new WemediaTopApi();
String key = "visitor"; // String | key
List<String> categoryIds = Arrays.asList("categoryIds_example"); // List<String> | 类目列表
try {
    List<Post> result = apiInstance.getTopPosts(key, categoryIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaTopApi#getTopPosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **categoryIds** | [**List&lt;String&gt;**](String.md)| 类目列表 | [optional]

### Return type

[**List&lt;Post&gt;**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

