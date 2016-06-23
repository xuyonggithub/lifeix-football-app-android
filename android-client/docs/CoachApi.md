# CoachApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCoach**](CoachApi.md#addCoach) | **POST** /games/coaches | 新增教练
[**getCoach**](CoachApi.md#getCoach) | **GET** /games/coaches/{coachId} | 查看教练详情
[**getCoachByTeamCategory**](CoachApi.md#getCoachByTeamCategory) | **GET** /games/coaches/teamcategory/{teamCategoryId} | 查看球队分类下的所有教练
[**getNationalCoach**](CoachApi.md#getNationalCoach) | **GET** /games/coaches/national | 查看国家队下的所有教练


<a name="addCoach"></a>
# **addCoach**
> Coach addCoach(key, coach)

新增教练

教练的新增

### Example
```java
// Import classes:
//import io.swagger.client.api.CoachApi;

CoachApi apiInstance = new CoachApi();
String key = "visitor"; // String | key
Coach coach = new Coach(); // Coach | 教练
try {
    Coach result = apiInstance.addCoach(key, coach);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachApi#addCoach");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **coach** | [**Coach**](Coach.md)| 教练 |

### Return type

[**Coach**](Coach.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCoach"></a>
# **getCoach**
> Coach getCoach(coachId)

查看教练详情

查看一个教练详情

### Example
```java
// Import classes:
//import io.swagger.client.api.CoachApi;

CoachApi apiInstance = new CoachApi();
Long coachId = 789L; // Long | 教练Id
try {
    Coach result = apiInstance.getCoach(coachId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachApi#getCoach");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coachId** | **Long**| 教练Id |

### Return type

[**Coach**](Coach.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCoachByTeamCategory"></a>
# **getCoachByTeamCategory**
> List&lt;Coach&gt; getCoachByTeamCategory(teamCategoryId)

查看球队分类下的所有教练

查看球队分类下的所有教练

### Example
```java
// Import classes:
//import io.swagger.client.api.CoachApi;

CoachApi apiInstance = new CoachApi();
Long teamCategoryId = 789L; // Long | 球队分类的Id
try {
    List<Coach> result = apiInstance.getCoachByTeamCategory(teamCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachApi#getCoachByTeamCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamCategoryId** | **Long**| 球队分类的Id |

### Return type

[**List&lt;Coach&gt;**](Coach.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNationalCoach"></a>
# **getNationalCoach**
> List&lt;CoachCategoryTop&gt; getNationalCoach()

查看国家队下的所有教练

查看国家队下的所有教练

### Example
```java
// Import classes:
//import io.swagger.client.api.CoachApi;

CoachApi apiInstance = new CoachApi();
try {
    List<CoachCategoryTop> result = apiInstance.getNationalCoach();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachApi#getNationalCoach");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CoachCategoryTop&gt;**](CoachCategoryTop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

