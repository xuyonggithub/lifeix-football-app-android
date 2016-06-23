# QuizCategoryApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getElearningQuizCategories**](QuizCategoryApi.md#getElearningQuizCategories) | **GET** /elearning/quiz_categories | 获取elearning测试类目
[**getElearningQuizPageList**](QuizCategoryApi.md#getElearningQuizPageList) | **GET** /elearning/quiz_categories/{categoryId}/pages | 随机获取测试分类下的单篇列表


<a name="getElearningQuizCategories"></a>
# **getElearningQuizCategories**
> List&lt;ElearningQuizCategory&gt; getElearningQuizCategories()

获取elearning测试类目

获取elearning测试类目

### Example
```java
// Import classes:
//import io.swagger.client.api.QuizCategoryApi;

QuizCategoryApi apiInstance = new QuizCategoryApi();
try {
    List<ElearningQuizCategory> result = apiInstance.getElearningQuizCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuizCategoryApi#getElearningQuizCategories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ElearningQuizCategory&gt;**](ElearningQuizCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElearningQuizPageList"></a>
# **getElearningQuizPageList**
> List&lt;ElearningPage&gt; getElearningQuizPageList(categoryId)

随机获取测试分类下的单篇列表

随机获取测试分类下的单篇列表

### Example
```java
// Import classes:
//import io.swagger.client.api.QuizCategoryApi;

QuizCategoryApi apiInstance = new QuizCategoryApi();
String categoryId = "categoryId_example"; // String | elearning测试类目Id
try {
    List<ElearningPage> result = apiInstance.getElearningQuizPageList(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuizCategoryApi#getElearningQuizPageList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| elearning测试类目Id |

### Return type

[**List&lt;ElearningPage&gt;**](ElearningPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

