# NewsApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNewsDetail**](NewsApi.md#getNewsDetail) | **GET** /news/{newsId} | 根据Id获取News详情
[**publishNews**](NewsApi.md#publishNews) | **POST** /news/{newsId}/publish | 发布News到Post系统
[**searchNews**](NewsApi.md#searchNews) | **GET** /news/search | 搜索News


<a name="getNewsDetail"></a>
# **getNewsDetail**
> News getNewsDetail(key, newsId)

根据Id获取News详情

返回News详情对象

### Example
```java
// Import classes:
//import io.swagger.client.api.NewsApi;

NewsApi apiInstance = new NewsApi();
String key = "visitor"; // String | key
String newsId = "newsId_example"; // String | 新闻的Id
try {
    News result = apiInstance.getNewsDetail(key, newsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#getNewsDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **newsId** | **String**| 新闻的Id |

### Return type

[**News**](News.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="publishNews"></a>
# **publishNews**
> publishNews(key, newsId)

发布News到Post系统

News和Post不是同一系统，Post针对的是用户，News针对的是新闻来源以及管理员

### Example
```java
// Import classes:
//import io.swagger.client.api.NewsApi;

NewsApi apiInstance = new NewsApi();
String key = "visitor"; // String | key
String newsId = "newsId_example"; // String | 新闻的Id
try {
    apiInstance.publishNews(key, newsId);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#publishNews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **newsId** | **String**| 新闻的Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchNews"></a>
# **searchNews**
> List&lt;News&gt; searchNews(key, page, limit)

搜索News

根据搜索条件获取News列表，只有管理员才能查找

### Example
```java
// Import classes:
//import io.swagger.client.api.NewsApi;

NewsApi apiInstance = new NewsApi();
String key = "visitor"; // String | key
Integer page = 56; // Integer | 页码
Integer limit = 56; // Integer | 一页显示多少
try {
    List<News> result = apiInstance.searchNews(key, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#searchNews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **page** | **Integer**| 页码 | [optional]
 **limit** | **Integer**| 一页显示多少 | [optional]

### Return type

[**List&lt;News&gt;**](News.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

