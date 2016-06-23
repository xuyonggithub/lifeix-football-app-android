# CompetitionCategoryApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCompetitionCategory**](CompetitionCategoryApi.md#addCompetitionCategory) | **POST** /games/competitionCategory | 新增赛事分类
[**getCompetitionCategories**](CompetitionCategoryApi.md#getCompetitionCategories) | **GET** /games/competitionCategory | 获取赛事分类列表


<a name="addCompetitionCategory"></a>
# **addCompetitionCategory**
> CompetitionCategory addCompetitionCategory(key, competitionCategory)

新增赛事分类

新增赛事分类

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionCategoryApi;

CompetitionCategoryApi apiInstance = new CompetitionCategoryApi();
String key = "visitor"; // String | key
CompetitionCategory competitionCategory = new CompetitionCategory(); // CompetitionCategory | 赛事分类
try {
    CompetitionCategory result = apiInstance.addCompetitionCategory(key, competitionCategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionCategoryApi#addCompetitionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competitionCategory** | [**CompetitionCategory**](CompetitionCategory.md)| 赛事分类 |

### Return type

[**CompetitionCategory**](CompetitionCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompetitionCategories"></a>
# **getCompetitionCategories**
> List&lt;CompetitionCategory&gt; getCompetitionCategories(teamType)

获取赛事分类列表

获取赛事分类列表

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionCategoryApi;

CompetitionCategoryApi apiInstance = new CompetitionCategoryApi();
Integer teamType = 56; // Integer | 0：国家队 类别 1：职业俱乐部 类别 2：业余俱乐部 4：校园足球队 5：其他
try {
    List<CompetitionCategory> result = apiInstance.getCompetitionCategories(teamType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionCategoryApi#getCompetitionCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamType** | **Integer**| 0：国家队 类别 1：职业俱乐部 类别 2：业余俱乐部 4：校园足球队 5：其他 | [optional]

### Return type

[**List&lt;CompetitionCategory&gt;**](CompetitionCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

