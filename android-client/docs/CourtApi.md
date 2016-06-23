# CourtApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCourt**](CourtApi.md#addCourt) | **POST** /games/courts | 新增球场


<a name="addCourt"></a>
# **addCourt**
> Court addCourt(key, court)

新增球场

新增球场

### Example
```java
// Import classes:
//import io.swagger.client.api.CourtApi;

CourtApi apiInstance = new CourtApi();
String key = "visitor"; // String | key
Court court = new Court(); // Court | 球场
try {
    Court result = apiInstance.addCourt(key, court);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourtApi#addCourt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **court** | [**Court**](Court.md)| 球场 |

### Return type

[**Court**](Court.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

