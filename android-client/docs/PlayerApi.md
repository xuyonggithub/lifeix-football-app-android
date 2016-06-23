# PlayerApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPlayer**](PlayerApi.md#addPlayer) | **POST** /games/players | 新增球员
[**getNationalPlayer**](PlayerApi.md#getNationalPlayer) | **GET** /games/players/national | 查看国家队下的所有球员
[**getPlayer**](PlayerApi.md#getPlayer) | **GET** /games/players/{playerId} | 获得球员信息
[**getPlayerByTeamCategory**](PlayerApi.md#getPlayerByTeamCategory) | **GET** /games/players/teamcategory/{teamCategoryId} | 查看球队分类下的所有球员


<a name="addPlayer"></a>
# **addPlayer**
> Player addPlayer(key, player)

新增球员

球员的新增

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
Player player = new Player(); // Player | 球员
try {
    Player result = apiInstance.addPlayer(key, player);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#addPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **player** | [**Player**](Player.md)| 球员 |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNationalPlayer"></a>
# **getNationalPlayer**
> List&lt;PlayerCategoryTop&gt; getNationalPlayer()

查看国家队下的所有球员

查看国家队下的所有球员

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
try {
    List<PlayerCategoryTop> result = apiInstance.getNationalPlayer();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getNationalPlayer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PlayerCategoryTop&gt;**](PlayerCategoryTop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayer"></a>
# **getPlayer**
> Player getPlayer(playerId)

获得球员信息

查看球员信息

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
Long playerId = 789L; // Long | 球员Id
try {
    Player result = apiInstance.getPlayer(playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **Long**| 球员Id |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayerByTeamCategory"></a>
# **getPlayerByTeamCategory**
> List&lt;Player&gt; getPlayerByTeamCategory(teamCategoryId)

查看球队分类下的所有球员

查看球队分类下的所有球员

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
Long teamCategoryId = 789L; // Long | 球队分类的Id
try {
    List<Player> result = apiInstance.getPlayerByTeamCategory(teamCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayerByTeamCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamCategoryId** | **Long**| 球队分类的Id |

### Return type

[**List&lt;Player&gt;**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

