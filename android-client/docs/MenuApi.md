# MenuApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMenu**](MenuApi.md#addMenu) | **POST** /category/menus/{platform} | 创建一个展示类目
[**getMenuList**](MenuApi.md#getMenuList) | **GET** /category/menus/{platform} | 获取相应平台的整个菜单


<a name="addMenu"></a>
# **addMenu**
> Menu addMenu(key, platform, menus)

创建一个展示类目

类目用于WEB菜单栏

### Example
```java
// Import classes:
//import io.swagger.client.api.MenuApi;

MenuApi apiInstance = new MenuApi();
String key = "visitor"; // String | key
String platform = "platform_example"; // String | 平台：wap、web、app
List<Menu> menus = Arrays.asList(new Menu()); // List<Menu> | 相应平台对应的完整菜单列表
try {
    Menu result = apiInstance.addMenu(key, platform, menus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#addMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **platform** | **String**| 平台：wap、web、app |
 **menus** | [**List&lt;Menu&gt;**](Menu.md)| 相应平台对应的完整菜单列表 |

### Return type

[**Menu**](Menu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMenuList"></a>
# **getMenuList**
> List&lt;Menu&gt; getMenuList(key, platform)

获取相应平台的整个菜单

需要通过不同的参数来获取不同的菜单,app、app_wemedia对应APP的媒体资讯菜单，wap,web

### Example
```java
// Import classes:
//import io.swagger.client.api.MenuApi;

MenuApi apiInstance = new MenuApi();
String key = "visitor"; // String | key
String platform = "platform_example"; // String | 平台：wap、web、app
try {
    List<Menu> result = apiInstance.getMenuList(key, platform);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#getMenuList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **platform** | **String**| 平台：wap、web、app |

### Return type

[**List&lt;Menu&gt;**](Menu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

