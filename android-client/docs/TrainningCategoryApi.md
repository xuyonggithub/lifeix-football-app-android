# TrainningCategoryApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getElearningTrainingCategories**](TrainningCategoryApi.md#getElearningTrainingCategories) | **GET** /elearning/training_categories | 获取elearning培训类目
[**getElearningTrainingPageList**](TrainningCategoryApi.md#getElearningTrainingPageList) | **GET** /elearning/training_categories/{categoryId}/pages | 分页获取培训分类下的单篇列表


<a name="getElearningTrainingCategories"></a>
# **getElearningTrainingCategories**
> List&lt;ElearningTrainingCategory&gt; getElearningTrainingCategories()

获取elearning培训类目

获取elearning培训类目

### Example
```java
// Import classes:
//import io.swagger.client.api.TrainningCategoryApi;

TrainningCategoryApi apiInstance = new TrainningCategoryApi();
try {
    List<ElearningTrainingCategory> result = apiInstance.getElearningTrainingCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrainningCategoryApi#getElearningTrainingCategories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ElearningTrainingCategory&gt;**](ElearningTrainingCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElearningTrainingPageList"></a>
# **getElearningTrainingPageList**
> List&lt;ElearningPage&gt; getElearningTrainingPageList(categoryId, start, limit)

分页获取培训分类下的单篇列表

分页获取培训分类下的单篇列表

### Example
```java
// Import classes:
//import io.swagger.client.api.TrainningCategoryApi;

TrainningCategoryApi apiInstance = new TrainningCategoryApi();
String categoryId = "categoryId_example"; // String | elearning培训类目Id
Integer start = 56; // Integer | 跳过的单篇数量，不传返回第一页
Integer limit = 56; // Integer | 每页显示的单篇数量，默认值20
try {
    List<ElearningPage> result = apiInstance.getElearningTrainingPageList(categoryId, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrainningCategoryApi#getElearningTrainingPageList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| elearning培训类目Id |
 **start** | **Integer**| 跳过的单篇数量，不传返回第一页 | [optional]
 **limit** | **Integer**| 每页显示的单篇数量，默认值20 | [optional]

### Return type

[**List&lt;ElearningPage&gt;**](ElearningPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

