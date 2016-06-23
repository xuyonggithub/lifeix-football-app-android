# CompetitionApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCompetition**](CompetitionApi.md#addCompetition) | **POST** /games/competitions | 新增赛事
[**getCompetition**](CompetitionApi.md#getCompetition) | **GET** /games/competitions/{competitionId} | 赛事所有的参赛球队信息和比赛信息（赛程）


<a name="addCompetition"></a>
# **addCompetition**
> Competition addCompetition(key, competition)

新增赛事

新增赛事

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionApi;

CompetitionApi apiInstance = new CompetitionApi();
String key = "visitor"; // String | key
Competition competition = new Competition(); // Competition | 赛事
try {
    Competition result = apiInstance.addCompetition(key, competition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionApi#addCompetition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competition** | [**Competition**](Competition.md)| 赛事 |

### Return type

[**Competition**](Competition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompetition"></a>
# **getCompetition**
> Competition getCompetition(competitionId)

赛事所有的参赛球队信息和比赛信息（赛程）

赛事所有的参赛球队信息和比赛信息（赛程）

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionApi;

CompetitionApi apiInstance = new CompetitionApi();
Long competitionId = 789L; // Long | 赛事的Id
try {
    Competition result = apiInstance.getCompetition(competitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionApi#getCompetition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionId** | **Long**| 赛事的Id |

### Return type

[**Competition**](Competition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

