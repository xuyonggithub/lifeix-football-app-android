# StaffApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStaff**](StaffApi.md#addStaff) | **POST** /games/staffs | 新增职员
[**getStaff**](StaffApi.md#getStaff) | **GET** /games/staffs/{staffId} | 获得职员信息


<a name="addStaff"></a>
# **addStaff**
> Staff addStaff(key, staff)

新增职员

新增职员

### Example
```java
// Import classes:
//import io.swagger.client.api.StaffApi;

StaffApi apiInstance = new StaffApi();
String key = "visitor"; // String | key
Staff staff = new Staff(); // Staff | 职员
try {
    Staff result = apiInstance.addStaff(key, staff);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaffApi#addStaff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **staff** | [**Staff**](Staff.md)| 职员 |

### Return type

[**Staff**](Staff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStaff"></a>
# **getStaff**
> Staff getStaff(staffId)

获得职员信息

查看职员信息

### Example
```java
// Import classes:
//import io.swagger.client.api.StaffApi;

StaffApi apiInstance = new StaffApi();
Long staffId = 789L; // Long | 员工的Id
try {
    Staff result = apiInstance.getStaff(staffId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaffApi#getStaff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staffId** | **Long**| 员工的Id |

### Return type

[**Staff**](Staff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

