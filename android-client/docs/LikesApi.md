# LikesApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLike**](LikesApi.md#addLike) | **POST** /like/likes | 对某一个目标点赞
[**getLikes**](LikesApi.md#getLikes) | **GET** /like/likes | 获取喜欢列表
[**getPostLikeds**](LikesApi.md#getPostLikeds) | **GET** /like/likes/{target} | 获得某一个Post的点赞信息


<a name="addLike"></a>
# **addLike**
> addLike(key, type, target, like)

对某一个目标点赞

一个Ip地址只能对一个目标点赞/踩一次，第二次仍会返回正确，但是数目不会变化

### Example
```java
// Import classes:
//import io.swagger.client.api.LikesApi;

LikesApi apiInstance = new LikesApi();
String key = "visitor"; // String | key
String type = "type_example"; // String | target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post
String target = "target_example"; // String | 目标：比如可以nationteam的memberid，也可以是post的id
Boolean like = true; // Boolean | ture 点赞，false 踩
try {
    apiInstance.addLike(key, type, target, like);
} catch (ApiException e) {
    System.err.println("Exception when calling LikesApi#addLike");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **type** | **String**| target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post |
 **target** | **String**| 目标：比如可以nationteam的memberid，也可以是post的id |
 **like** | **Boolean**| ture 点赞，false 踩 | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLikes"></a>
# **getLikes**
> List&lt;Like&gt; getLikes(key, type)

获取喜欢列表

将type&#x3D;${type}的所有目标的喜欢情况返回，同时加入当前喜欢与否情况

### Example
```java
// Import classes:
//import io.swagger.client.api.LikesApi;

LikesApi apiInstance = new LikesApi();
String key = "visitor"; // String | key
String type = "type_example"; // String | target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post
try {
    List<Like> result = apiInstance.getLikes(key, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LikesApi#getLikes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **type** | **String**| target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post |

### Return type

[**List&lt;Like&gt;**](Like.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPostLikeds"></a>
# **getPostLikeds**
> Like getPostLikeds(key, target, type)

获得某一个Post的点赞信息

比如：立方体育XX like 100 unlike20 like true

### Example
```java
// Import classes:
//import io.swagger.client.api.LikesApi;

LikesApi apiInstance = new LikesApi();
String key = "visitor"; // String | key
String target = "target_example"; // String | 目标：比如可以nationteam的memberid，也可以是post的id
String type = "type_example"; // String | target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post
try {
    Like result = apiInstance.getPostLikeds(key, target, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LikesApi#getPostLikeds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **target** | **String**| 目标：比如可以nationteam的memberid，也可以是post的id |
 **type** | **String**| target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post |

### Return type

[**Like**](Like.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

