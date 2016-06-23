# CompetitionTeamApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCompetitionTeam**](CompetitionTeamApi.md#addCompetitionTeam) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam | 新增赛事参赛队
[**addCompetitionTeamCoaches**](CompetitionTeamApi.md#addCompetitionTeamCoaches) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/coaches | 新增赛事参赛队教练
[**addCompetitionTeamPlayers**](CompetitionTeamApi.md#addCompetitionTeamPlayers) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/players | 新增赛事参赛队球员
[**addCompetitionTeamStaffs**](CompetitionTeamApi.md#addCompetitionTeamStaffs) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/staffs | 新增赛事参赛队职员
[**getCompetitionTeam**](CompetitionTeamApi.md#getCompetitionTeam) | **GET** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam | 获得参赛球队的详细信息,包括教练、球员、工作人员信息
[**getCompetitionTeams**](CompetitionTeamApi.md#getCompetitionTeams) | **GET** /games/teams/{teamId}/competitionTeam | 查询一只球队对应的赛事球队（1-n）


<a name="addCompetitionTeam"></a>
# **addCompetitionTeam**
> CompetitionTeam addCompetitionTeam(key, competitionId, teamId, competitionTeam)

新增赛事参赛队

新增赛事参赛队

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionTeamApi;

CompetitionTeamApi apiInstance = new CompetitionTeamApi();
String key = "visitor"; // String | key
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 队伍Id
CompetitionTeam competitionTeam = new CompetitionTeam(); // CompetitionTeam | 赛事参赛队
try {
    CompetitionTeam result = apiInstance.addCompetitionTeam(key, competitionId, teamId, competitionTeam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionTeamApi#addCompetitionTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 队伍Id |
 **competitionTeam** | [**CompetitionTeam**](CompetitionTeam.md)| 赛事参赛队 |

### Return type

[**CompetitionTeam**](CompetitionTeam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCompetitionTeamCoaches"></a>
# **addCompetitionTeamCoaches**
> addCompetitionTeamCoaches(key, competitionId, teamId, competitionTeamId, coachIds, positions)

新增赛事参赛队教练

新增赛事参赛队教练

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionTeamApi;

CompetitionTeamApi apiInstance = new CompetitionTeamApi();
String key = "visitor"; // String | key
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 队伍Id
Long competitionTeamId = 789L; // Long | 赛事参赛队的Id
String coachIds = "coachIds_example"; // String | 教练id example:1,2 
String positions = "positions_example"; // String | 球员报名位置 example:主教练,助理教练
try {
    apiInstance.addCompetitionTeamCoaches(key, competitionId, teamId, competitionTeamId, coachIds, positions);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionTeamApi#addCompetitionTeamCoaches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 队伍Id |
 **competitionTeamId** | **Long**| 赛事参赛队的Id |
 **coachIds** | **String**| 教练id example:1,2  |
 **positions** | **String**| 球员报名位置 example:主教练,助理教练 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCompetitionTeamPlayers"></a>
# **addCompetitionTeamPlayers**
> addCompetitionTeamPlayers(key, competitionId, teamId, competitionTeamId, playerIds, positions, jerseryNums)

新增赛事参赛队球员

新增赛事参赛队球员

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionTeamApi;

CompetitionTeamApi apiInstance = new CompetitionTeamApi();
String key = "visitor"; // String | key
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 队伍Id
Long competitionTeamId = 789L; // Long | 赛事参赛队的Id
String playerIds = "playerIds_example"; // String | 球员id example:1,2,13,14 
String positions = "positions_example"; // String | 球员报名位置 example:前锋,前锋,中场,门将 
String jerseryNums = "jerseryNums_example"; // String | 球员球衣号码 example:10,9,8,7 
try {
    apiInstance.addCompetitionTeamPlayers(key, competitionId, teamId, competitionTeamId, playerIds, positions, jerseryNums);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionTeamApi#addCompetitionTeamPlayers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 队伍Id |
 **competitionTeamId** | **Long**| 赛事参赛队的Id |
 **playerIds** | **String**| 球员id example:1,2,13,14  |
 **positions** | **String**| 球员报名位置 example:前锋,前锋,中场,门将  |
 **jerseryNums** | **String**| 球员球衣号码 example:10,9,8,7  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCompetitionTeamStaffs"></a>
# **addCompetitionTeamStaffs**
> addCompetitionTeamStaffs(key, competitionId, teamId, competitionTeamId, staffIds, positions)

新增赛事参赛队职员

新增赛事参赛队职员

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionTeamApi;

CompetitionTeamApi apiInstance = new CompetitionTeamApi();
String key = "visitor"; // String | key
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 队伍Id
Long competitionTeamId = 789L; // Long | 赛事参赛队的Id
String staffIds = "staffIds_example"; // String | 职员id example:1,2 
String positions = "positions_example"; // String | 职员位置 example:领队,队医 
try {
    apiInstance.addCompetitionTeamStaffs(key, competitionId, teamId, competitionTeamId, staffIds, positions);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionTeamApi#addCompetitionTeamStaffs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 队伍Id |
 **competitionTeamId** | **Long**| 赛事参赛队的Id |
 **staffIds** | **String**| 职员id example:1,2  |
 **positions** | **String**| 职员位置 example:领队,队医  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompetitionTeam"></a>
# **getCompetitionTeam**
> CompetitionTeam getCompetitionTeam(competitionId, teamId)

获得参赛球队的详细信息,包括教练、球员、工作人员信息

获得球队信息

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionTeamApi;

CompetitionTeamApi apiInstance = new CompetitionTeamApi();
Long competitionId = 789L; // Long | 赛事的Id
Long teamId = 789L; // Long | 队伍Id
try {
    CompetitionTeam result = apiInstance.getCompetitionTeam(competitionId, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionTeamApi#getCompetitionTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionId** | **Long**| 赛事的Id |
 **teamId** | **Long**| 队伍Id |

### Return type

[**CompetitionTeam**](CompetitionTeam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompetitionTeams"></a>
# **getCompetitionTeams**
> List&lt;CompetitionTeam&gt; getCompetitionTeams(teamId, setupDate)

查询一只球队对应的赛事球队（1-n）

查询一只球队对应的赛事球队（1-n）

### Example
```java
// Import classes:
//import io.swagger.client.api.CompetitionTeamApi;

CompetitionTeamApi apiInstance = new CompetitionTeamApi();
Long teamId = 789L; // Long | 队伍Id
String setupDate = "setupDate_example"; // String | 大名单公布时间
try {
    List<CompetitionTeam> result = apiInstance.getCompetitionTeams(teamId, setupDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionTeamApi#getCompetitionTeams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| 队伍Id |
 **setupDate** | **String**| 大名单公布时间 | [optional]

### Return type

[**List&lt;CompetitionTeam&gt;**](CompetitionTeam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

