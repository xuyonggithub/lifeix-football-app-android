# CategoryApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCategory**](CategoryApi.md#addCategory) | **POST** /category/categories | 创建一个展示类目
[**getCategoryList**](CategoryApi.md#getCategoryList) | **GET** /category/categories | 获取整个类目


<a name="addCategory"></a>
# **addCategory**
> Category addCategory(key, categories)

创建一个展示类目

类目用于WEB菜单栏

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String key = "visitor"; // String | key
List<Category> categories = Arrays.asList(new Category()); // List<Category> | 类目
try {
    Category result = apiInstance.addCategory(key, categories);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#addCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **categories** | [**List&lt;Category&gt;**](Category.md)| 类目 |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCategoryList"></a>
# **getCategoryList**
> List&lt;Category&gt; getCategoryList()

获取整个类目

将数据库（缓存）中所有类目都返回

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
try {
    List<Category> result = apiInstance.getCategoryList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#getCategoryList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

