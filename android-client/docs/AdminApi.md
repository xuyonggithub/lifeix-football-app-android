# AdminApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdminList**](AdminApi.md#getAdminList) | **GET** /admin/admins | 获得Admin列表
[**loginAdmin**](AdminApi.md#loginAdmin) | **POST** /admin/admins/login | Admin登录
[**registAdmin**](AdminApi.md#registAdmin) | **POST** /admin/admins/regist | Admin注册


<a name="getAdminList"></a>
# **getAdminList**
> List&lt;Admin&gt; getAdminList(key)

获得Admin列表

返回所有的管理员

### Example
```java
// Import classes:
//import io.swagger.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
String key = "visitor"; // String | key
try {
    List<Admin> result = apiInstance.getAdminList(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getAdminList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]

### Return type

[**List&lt;Admin&gt;**](Admin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loginAdmin"></a>
# **loginAdmin**
> Admin loginAdmin(admin)

Admin登录

Admin登录，传入Email,Password的加密形式·

### Example
```java
// Import classes:
//import io.swagger.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
Admin admin = new Admin(); // Admin | 管理员
try {
    Admin result = apiInstance.loginAdmin(admin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#loginAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin** | [**Admin**](Admin.md)| 管理员 |

### Return type

[**Admin**](Admin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registAdmin"></a>
# **registAdmin**
> Admin registAdmin(admin)

Admin注册

Admin注册，必须提供Email,Password,Name

### Example
```java
// Import classes:
//import io.swagger.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
Admin admin = new Admin(); // Admin | 管理员
try {
    Admin result = apiInstance.registAdmin(admin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#registAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin** | [**Admin**](Admin.md)| 管理员 |

### Return type

[**Admin**](Admin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

