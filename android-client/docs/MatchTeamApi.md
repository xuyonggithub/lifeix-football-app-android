# MatchTeamApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMatchTeamJerseys**](MatchTeamApi.md#addMatchTeamJerseys) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}/jerseys | 添加参加比赛球队的球衣样式
[**addMatchTeamPlayers**](MatchTeamApi.md#addMatchTeamPlayers) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}/players | 添加参加比赛的球员
[**getMatchTeam**](MatchTeamApi.md#getMatchTeam) | **GET** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId} | 获得比赛球队的详细信息,包括教练、球员(首发、替补)、工作人员信息、球衣


<a name="addMatchTeamJerseys"></a>
# **addMatchTeamJerseys**
> MatchTeamJerseys addMatchTeamJerseys(competitionId, teamId, competitionTeamId, matchTeamId, matchTeamJerseys)

添加参加比赛球队的球衣样式

添加参加比赛球队的球衣样式

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchTeamApi;

MatchTeamApi apiInstance = new MatchTeamApi();
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 队伍Id
Long competitionTeamId = 789L; // Long | 赛事参赛队的Id
Long matchTeamId = 789L; // Long | 比赛球队的Id
MatchTeamJerseys matchTeamJerseys = new MatchTeamJerseys(); // MatchTeamJerseys | 参加比赛球队的球衣样式
try {
    MatchTeamJerseys result = apiInstance.addMatchTeamJerseys(competitionId, teamId, competitionTeamId, matchTeamId, matchTeamJerseys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchTeamApi#addMatchTeamJerseys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 队伍Id |
 **competitionTeamId** | **Long**| 赛事参赛队的Id |
 **matchTeamId** | **Long**| 比赛球队的Id |
 **matchTeamJerseys** | [**MatchTeamJerseys**](MatchTeamJerseys.md)| 参加比赛球队的球衣样式 |

### Return type

[**MatchTeamJerseys**](MatchTeamJerseys.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addMatchTeamPlayers"></a>
# **addMatchTeamPlayers**
> addMatchTeamPlayers(competitionId, teamId, competitionTeamId, matchTeamId, playerRecords)

添加参加比赛的球员

添加参加比赛的球员

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchTeamApi;

MatchTeamApi apiInstance = new MatchTeamApi();
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 队伍Id
Long competitionTeamId = 789L; // Long | 赛事参赛队的Id
Long matchTeamId = 789L; // Long | 比赛球队的Id
List<MatchTeamPlayer> playerRecords = Arrays.asList(new MatchTeamPlayer()); // List<MatchTeamPlayer> | 参加比赛的球员列表
try {
    apiInstance.addMatchTeamPlayers(competitionId, teamId, competitionTeamId, matchTeamId, playerRecords);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchTeamApi#addMatchTeamPlayers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 队伍Id |
 **competitionTeamId** | **Long**| 赛事参赛队的Id |
 **matchTeamId** | **Long**| 比赛球队的Id |
 **playerRecords** | [**List&lt;MatchTeamPlayer&gt;**](MatchTeamPlayer.md)| 参加比赛的球员列表 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMatchTeam"></a>
# **getMatchTeam**
> MatchTeam getMatchTeam(competitionId, teamId, competitionTeamId, matchTeamId)

获得比赛球队的详细信息,包括教练、球员(首发、替补)、工作人员信息、球衣

获得比赛球队的详细信息,包括教练、球员(首发、替补)、工作人员信息、球衣

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchTeamApi;

MatchTeamApi apiInstance = new MatchTeamApi();
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 队伍Id
Long competitionTeamId = 789L; // Long | 赛事参赛队的Id
Long matchTeamId = 789L; // Long | 比赛球队的Id
try {
    MatchTeam result = apiInstance.getMatchTeam(competitionId, teamId, competitionTeamId, matchTeamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchTeamApi#getMatchTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 队伍Id |
 **competitionTeamId** | **Long**| 赛事参赛队的Id |
 **matchTeamId** | **Long**| 比赛球队的Id |

### Return type

[**MatchTeam**](MatchTeam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

