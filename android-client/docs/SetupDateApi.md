# SetupDateApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompetitionTeamSetUpDate**](SetupDateApi.md#getCompetitionTeamSetUpDate) | **GET** /games/teams/{teamId}/competitionTeam/setupDates | 查询一只球队对应的赛事球队的公布时间


<a name="getCompetitionTeamSetUpDate"></a>
# **getCompetitionTeamSetUpDate**
> List&lt;String&gt; getCompetitionTeamSetUpDate(teamId)

查询一只球队对应的赛事球队的公布时间

查询一只球队对应的赛事球队的公布时间

### Example
```java
// Import classes:
//import io.swagger.client.api.SetupDateApi;

SetupDateApi apiInstance = new SetupDateApi();
Long teamId = 789L; // Long | 队伍Id
try {
    List<String> result = apiInstance.getCompetitionTeamSetUpDate(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SetupDateApi#getCompetitionTeamSetUpDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| 队伍Id |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

