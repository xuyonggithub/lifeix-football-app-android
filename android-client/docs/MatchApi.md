# MatchApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMatch**](MatchApi.md#addMatch) | **POST** /games/competitions/{competitionId}/matches | 新增比赛
[**addRelationMatchAndMatchStaff**](MatchApi.md#addRelationMatchAndMatchStaff) | **POST** /games/competitions/{competitionId}/matches/{matchId}/matchstaffs | 新增比赛工作人员
[**addRelationMatchAndReferee**](MatchApi.md#addRelationMatchAndReferee) | **POST** /games/competitions/{competitionId}/matches/{matchId}/referees | 新增比赛裁判
[**getByCompetitionIdAndTeamId**](MatchApi.md#getByCompetitionIdAndTeamId) | **GET** /games/competitions/{competitionId}/matches | 获取赛事比赛列表,即时间轴
[**getMatch**](MatchApi.md#getMatch) | **GET** /games/competitions/{competitionId}/matches/{matchId} | 获得比赛信息


<a name="addMatch"></a>
# **addMatch**
> addMatch(key, competitionId, frontMatches)

新增比赛

新增比赛

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchApi;

MatchApi apiInstance = new MatchApi();
String key = "visitor"; // String | key
Long competitionId = 789L; // Long | 赛事的Id
List<FrontMatch> frontMatches = Arrays.asList(new FrontMatch()); // List<FrontMatch> | 对阵列表
try {
    apiInstance.addMatch(key, competitionId, frontMatches);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#addMatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competitionId** | **Long**| 赛事的Id |
 **frontMatches** | [**List&lt;FrontMatch&gt;**](FrontMatch.md)| 对阵列表 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRelationMatchAndMatchStaff"></a>
# **addRelationMatchAndMatchStaff**
> addRelationMatchAndMatchStaff(key, competitionId, matchId, matchStaffIds, positions)

新增比赛工作人员

新增比赛工作人员

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchApi;

MatchApi apiInstance = new MatchApi();
String key = "visitor"; // String | key
Long competitionId = 789L; // Long | 赛事的Id
Long matchId = 789L; // Long | 比赛Id
String matchStaffIds = "matchStaffIds_example"; // String | 比赛工作人员id example:1,2 
String positions = "positions_example"; // String | 比赛工作人员位置 example:bsjd,cpjd
try {
    apiInstance.addRelationMatchAndMatchStaff(key, competitionId, matchId, matchStaffIds, positions);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#addRelationMatchAndMatchStaff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competitionId** | **Long**| 赛事的Id |
 **matchId** | **Long**| 比赛Id |
 **matchStaffIds** | **String**| 比赛工作人员id example:1,2  |
 **positions** | **String**| 比赛工作人员位置 example:bsjd,cpjd |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRelationMatchAndReferee"></a>
# **addRelationMatchAndReferee**
> addRelationMatchAndReferee(key, competitionId, matchId, refereeIds, positions)

新增比赛裁判

新增比赛裁判

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchApi;

MatchApi apiInstance = new MatchApi();
String key = "visitor"; // String | key
Long competitionId = 789L; // Long | 赛事的Id
Long matchId = 789L; // Long | 比赛Id
String refereeIds = "refereeIds_example"; // String | 比赛裁判id example:1,2,3 
String positions = "positions_example"; // String | 比赛裁判位置 example:主裁,边裁,第四官员
try {
    apiInstance.addRelationMatchAndReferee(key, competitionId, matchId, refereeIds, positions);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#addRelationMatchAndReferee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competitionId** | **Long**| 赛事的Id |
 **matchId** | **Long**| 比赛Id |
 **refereeIds** | **String**| 比赛裁判id example:1,2,3  |
 **positions** | **String**| 比赛裁判位置 example:主裁,边裁,第四官员 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getByCompetitionIdAndTeamId"></a>
# **getByCompetitionIdAndTeamId**
> List&lt;MatchInfo&gt; getByCompetitionIdAndTeamId(competitionId, teamId)

获取赛事比赛列表,即时间轴

获取赛事比赛列表

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchApi;

MatchApi apiInstance = new MatchApi();
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 球队id
try {
    List<MatchInfo> result = apiInstance.getByCompetitionIdAndTeamId(competitionId, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getByCompetitionIdAndTeamId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 球队id |

### Return type

[**List&lt;MatchInfo&gt;**](MatchInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMatch"></a>
# **getMatch**
> Match getMatch(competitionId, matchId)

获得比赛信息

获得比赛信息

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchApi;

MatchApi apiInstance = new MatchApi();
Long competitionId = 789L; // Long | 赛事的Id
Long matchId = 789L; // Long | 比赛Id
try {
    Match result = apiInstance.getMatch(competitionId, matchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionId** | **Long**| 赛事的Id |
 **matchId** | **Long**| 比赛Id |

### Return type

[**Match**](Match.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

