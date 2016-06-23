# WemediaPostApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPost**](WemediaPostApi.md#addPost) | **POST** /wemedia/posts | 创建一个Post
[**addPostCategories**](WemediaPostApi.md#addPostCategories) | **POST** /wemedia/posts/{postId}/categories | 为Post添加类目
[**deletePostCategories**](WemediaPostApi.md#deletePostCategories) | **DELETE** /wemedia/posts/{postId}/categories | 删除Post的分类
[**deletePosts**](WemediaPostApi.md#deletePosts) | **DELETE** /wemedia/posts | 删除Post
[**getPostDetail**](WemediaPostApi.md#getPostDetail) | **GET** /wemedia/posts/{postId} | 根据Id获取Post详情
[**list**](WemediaPostApi.md#list) | **GET** /wemedia/posts | 获得Posts
[**search**](WemediaPostApi.md#search) | **GET** /wemedia/posts/search | 搜索Post


<a name="addPost"></a>
# **addPost**
> Post addPost(key, post)

创建一个Post

创建一个Post,其中title必填。content、images、videos三者至少有一个不为空

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaPostApi;

WemediaPostApi apiInstance = new WemediaPostApi();
String key = "visitor"; // String | key
Post post = new Post(); // Post | 帖子
try {
    Post result = apiInstance.addPost(key, post);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaPostApi#addPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **post** | [**Post**](Post.md)| 帖子 |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPostCategories"></a>
# **addPostCategories**
> addPostCategories(key, postId, categoryIds)

为Post添加类目

如果类目有层级需要把多层id都传入，比如&lt;国家队&gt;,&lt;男足&gt;，&lt;M23&gt;

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaPostApi;

WemediaPostApi apiInstance = new WemediaPostApi();
String key = "visitor"; // String | key
String postId = "postId_example"; // String | Post的ID
List<String> categoryIds = Arrays.asList("categoryIds_example"); // List<String> | 类目Id
try {
    apiInstance.addPostCategories(key, postId, categoryIds);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaPostApi#addPostCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **postId** | **String**| Post的ID |
 **categoryIds** | [**List&lt;String&gt;**](String.md)| 类目Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePostCategories"></a>
# **deletePostCategories**
> deletePostCategories(key, postId, categoryIds)

删除Post的分类

删除Post Category

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaPostApi;

WemediaPostApi apiInstance = new WemediaPostApi();
String key = "visitor"; // String | key
String postId = "postId_example"; // String | Post的ID
List<String> categoryIds = Arrays.asList("categoryIds_example"); // List<String> | 类目Id
try {
    apiInstance.deletePostCategories(key, postId, categoryIds);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaPostApi#deletePostCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **postId** | **String**| Post的ID |
 **categoryIds** | [**List&lt;String&gt;**](String.md)| 类目Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePosts"></a>
# **deletePosts**
> deletePosts(key, postIds)

删除Post

删除Post：只有管理员才有权限

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaPostApi;

WemediaPostApi apiInstance = new WemediaPostApi();
String key = "visitor"; // String | key
List<String> postIds = Arrays.asList("postIds_example"); // List<String> | 帖子Id列表,删除多个时，传多次postIds.example:xxx?postIds=111&postIds=222
try {
    apiInstance.deletePosts(key, postIds);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaPostApi#deletePosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **postIds** | [**List&lt;String&gt;**](String.md)| 帖子Id列表,删除多个时，传多次postIds.example:xxx?postIds&#x3D;111&amp;postIds&#x3D;222 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPostDetail"></a>
# **getPostDetail**
> Post getPostDetail(key, postId)

根据Id获取Post详情

返回Post详情对象

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaPostApi;

WemediaPostApi apiInstance = new WemediaPostApi();
String key = "visitor"; // String | key
String postId = "postId_example"; // String | Post的ID
try {
    Post result = apiInstance.getPostDetail(key, postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaPostApi#getPostDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **postId** | **String**| Post的ID |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;Post&gt; list(key, postIds)

获得Posts

根据Id获取Post

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaPostApi;

WemediaPostApi apiInstance = new WemediaPostApi();
String key = "visitor"; // String | key
List<String> postIds = Arrays.asList("postIds_example"); // List<String> | 文章的id,多个时以,分隔
try {
    List<Post> result = apiInstance.list(key, postIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaPostApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **postIds** | [**List&lt;String&gt;**](String.md)| 文章的id,多个时以,分隔 | [optional]

### Return type

[**List&lt;Post&gt;**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="search"></a>
# **search**
> List&lt;Post&gt; search(key, categoryId, authorId, startDate, endDate, date, limit, orderBy, isDesc)

搜索Post

根据搜索条件获取Post列表，每次搜索不能超过30条

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaPostApi;

WemediaPostApi apiInstance = new WemediaPostApi();
String key = "visitor"; // String | key
String categoryId = "categoryId_example"; // String | 类目id
String authorId = "authorId_example"; // String | 作者id
Date startDate = new Date(); // Date | 查询开始日期,单位天
Date endDate = new Date(); // Date | 查询结束日期,单位天
Date date = new Date(); // Date | 查询开始时间。example:分页时，传递第一页最后一条记录的createTime(long)
Integer limit = 56; // Integer | 一页显示多少
String orderBy = "orderBy_example"; // String | 按照那个字段排序
Boolean isDesc = true; // Boolean | 是否按时间倒序,默认值true
try {
    List<Post> result = apiInstance.search(key, categoryId, authorId, startDate, endDate, date, limit, orderBy, isDesc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaPostApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **categoryId** | **String**| 类目id | [optional]
 **authorId** | **String**| 作者id | [optional]
 **startDate** | **Date**| 查询开始日期,单位天 | [optional]
 **endDate** | **Date**| 查询结束日期,单位天 | [optional]
 **date** | **Date**| 查询开始时间。example:分页时，传递第一页最后一条记录的createTime(long) | [optional]
 **limit** | **Integer**| 一页显示多少 | [optional]
 **orderBy** | **String**| 按照那个字段排序 | [optional]
 **isDesc** | **Boolean**| 是否按时间倒序,默认值true | [optional]

### Return type

[**List&lt;Post&gt;**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

