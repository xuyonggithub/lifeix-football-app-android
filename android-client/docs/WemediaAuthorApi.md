# WemediaAuthorApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAuthor**](WemediaAuthorApi.md#addAuthor) | **POST** /wemedia/authors | 创建一个Author
[**getAuthor**](WemediaAuthorApi.md#getAuthor) | **GET** /wemedia/authors/{authorId} | 获得单个作者
[**getAuthors**](WemediaAuthorApi.md#getAuthors) | **GET** /wemedia/authors | 获得Authors列表


<a name="addAuthor"></a>
# **addAuthor**
> Author addAuthor(key, author)

创建一个Author

创建一个Author,其中name必填

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaAuthorApi;

WemediaAuthorApi apiInstance = new WemediaAuthorApi();
String key = "visitor"; // String | key
Author author = new Author(); // Author | 作者
try {
    Author result = apiInstance.addAuthor(key, author);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaAuthorApi#addAuthor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **author** | [**Author**](Author.md)| 作者 |

### Return type

[**Author**](Author.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthor"></a>
# **getAuthor**
> Author getAuthor(key, authorId)

获得单个作者

查看单个作者的信息

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaAuthorApi;

WemediaAuthorApi apiInstance = new WemediaAuthorApi();
String key = "visitor"; // String | key
String authorId = "authorId_example"; // String | 作者的Id
try {
    Author result = apiInstance.getAuthor(key, authorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaAuthorApi#getAuthor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **authorId** | **String**| 作者的Id |

### Return type

[**Author**](Author.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthors"></a>
# **getAuthors**
> List&lt;Author&gt; getAuthors(key)

获得Authors列表

获得Authors列表

### Example
```java
// Import classes:
//import io.swagger.client.api.WemediaAuthorApi;

WemediaAuthorApi apiInstance = new WemediaAuthorApi();
String key = "visitor"; // String | key
try {
    List<Author> result = apiInstance.getAuthors(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WemediaAuthorApi#getAuthors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]

### Return type

[**List&lt;Author&gt;**](Author.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

