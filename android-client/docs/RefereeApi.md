# RefereeApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReferee**](RefereeApi.md#getReferee) | **GET** /games/referees/{refereeId} | 获得裁判详细信息
[**getReferees**](RefereeApi.md#getReferees) | **GET** /games/referees | 获得裁判列表


<a name="getReferee"></a>
# **getReferee**
> Referee getReferee(refereeId)

获得裁判详细信息

查看裁判信息

### Example
```java
// Import classes:
//import io.swagger.client.api.RefereeApi;

RefereeApi apiInstance = new RefereeApi();
Long refereeId = 789L; // Long | 裁判Id
try {
    Referee result = apiInstance.getReferee(refereeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefereeApi#getReferee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refereeId** | **Long**| 裁判Id |

### Return type

[**Referee**](Referee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReferees"></a>
# **getReferees**
> List&lt;RefereeCategoryTop&gt; getReferees(level, startId, pageSize)

获得裁判列表

获得裁判列表

### Example
```java
// Import classes:
//import io.swagger.client.api.RefereeApi;

RefereeApi apiInstance = new RefereeApi();
String level = "level_example"; // String | 裁判级别
Long startId = 789L; // Long | 开始查询的id
Integer pageSize = 56; // Integer | 一页显示多少
try {
    List<RefereeCategoryTop> result = apiInstance.getReferees(level, startId, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefereeApi#getReferees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **level** | **String**| 裁判级别 |
 **startId** | **Long**| 开始查询的id | [optional]
 **pageSize** | **Integer**| 一页显示多少 | [optional]

### Return type

[**List&lt;RefereeCategoryTop&gt;**](RefereeCategoryTop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

