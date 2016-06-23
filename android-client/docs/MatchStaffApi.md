# MatchStaffApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMatchStaff**](MatchStaffApi.md#addMatchStaff) | **POST** /games/matchStaffs | 新增比赛工作人员:比赛监督、赛事监督


<a name="addMatchStaff"></a>
# **addMatchStaff**
> addMatchStaff(key, matchStaffs)

新增比赛工作人员:比赛监督、赛事监督

新增比赛工作人员

### Example
```java
// Import classes:
//import io.swagger.client.api.MatchStaffApi;

MatchStaffApi apiInstance = new MatchStaffApi();
String key = "visitor"; // String | key
List<MatchStaff> matchStaffs = Arrays.asList(new MatchStaff()); // List<MatchStaff> | 对阵列表
try {
    apiInstance.addMatchStaff(key, matchStaffs);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchStaffApi#addMatchStaff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **matchStaffs** | [**List&lt;MatchStaff&gt;**](MatchStaff.md)| 对阵列表 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

