package io.swagger.client.api;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;
import io.swagger.client.model.Menu;

public class MenuApi {
  String basePath = "http://192.168.50.154:8000/football";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 创建一个展示类目
  * 类目用于WEB菜单栏
   * @param key key
   * @param platform 平台：wap、web、app
   * @param menus 相应平台对应的完整菜单列表
   * @return Menu
  */
  public Menu addMenu (String key, String platform, List<Menu> menus) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = menus;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addMenu",
      new ApiException(400, "Missing the required parameter 'key' when calling addMenu"));
      }
  
      // verify the required parameter 'platform' is set
      if (platform == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'platform' when calling addMenu",
      new ApiException(400, "Missing the required parameter 'platform' when calling addMenu"));
      }
  
      // verify the required parameter 'menus' is set
      if (menus == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'menus' when calling addMenu",
      new ApiException(400, "Missing the required parameter 'menus' when calling addMenu"));
      }
  

  // create path and map variables
  String path = "/category/menus/{platform}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "platform" + "\\}", apiInvoker.escapeString(platform.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("key", ApiInvoker.parameterToString(key));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Menu) ApiInvoker.deserialize(localVarResponse, "", Menu.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 创建一个展示类目
   * 类目用于WEB菜单栏
   * @param key key   * @param platform 平台：wap、web、app   * @param menus 相应平台对应的完整菜单列表
  */
  public void addMenu (String key, String platform, List<Menu> menus, final Response.Listener<Menu> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = menus;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addMenu",
         new ApiException(400, "Missing the required parameter 'key' when calling addMenu"));
    }
    
    // verify the required parameter 'platform' is set
    if (platform == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'platform' when calling addMenu",
         new ApiException(400, "Missing the required parameter 'platform' when calling addMenu"));
    }
    
    // verify the required parameter 'menus' is set
    if (menus == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'menus' when calling addMenu",
         new ApiException(400, "Missing the required parameter 'menus' when calling addMenu"));
    }
    

    // create path and map variables
    String path = "/category/menus/{platform}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "platform" + "\\}", apiInvoker.escapeString(platform.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("key", ApiInvoker.parameterToString(key));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Menu) ApiInvoker.deserialize(localVarResponse,  "", Menu.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 获取相应平台的整个菜单
  * 需要通过不同的参数来获取不同的菜单,app、app_wemedia对应APP的媒体资讯菜单，wap,web
   * @param key key
   * @param platform 平台：wap、web、app
   * @return List<Menu>
  */
  public List<Menu> getMenuList (String key, String platform) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getMenuList",
      new ApiException(400, "Missing the required parameter 'key' when calling getMenuList"));
      }
  
      // verify the required parameter 'platform' is set
      if (platform == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'platform' when calling getMenuList",
      new ApiException(400, "Missing the required parameter 'platform' when calling getMenuList"));
      }
  

  // create path and map variables
  String path = "/category/menus/{platform}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "platform" + "\\}", apiInvoker.escapeString(platform.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("key", ApiInvoker.parameterToString(key));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Menu>) ApiInvoker.deserialize(localVarResponse, "array", Menu.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

    /**
     * 获取相应平台的整个菜单
     * 需要通过不同的参数来获取不同的菜单,app、app_wemedia对应APP的媒体资讯菜单，wap,web
     * @param key key
     * @param platform 平台：wap、web、app
     * @return List<Menu>
     */
    public void getMenuListAsync (Response.Listener<String> stringRequest, Response.ErrorListener errorListener, String key, String platform) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
        Object postBody = null;

        // verify the required parameter 'key' is set
        if (key == null) {
            VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getMenuList",
                    new ApiException(400, "Missing the required parameter 'key' when calling getMenuList"));
        }

        // verify the required parameter 'platform' is set
        if (platform == null) {
            VolleyError error = new VolleyError("Missing the required parameter 'platform' when calling getMenuList",
                    new ApiException(400, "Missing the required parameter 'platform' when calling getMenuList"));
        }


        // create path and map variables
        String path = "/category/menus/{platform}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "platform" + "\\}", apiInvoker.escapeString(platform.toString()));

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        // header params
        Map<String, String> headerParams = new HashMap<String, String>();
        // form params
        Map<String, String> formParams = new HashMap<String, String>();


        headerParams.put("key", ApiInvoker.parameterToString(key));

        String[] contentTypes = {
                "application/json"
        };
        String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

        if (contentType.startsWith("multipart/form-data")) {
            // file uploading
            MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();


            HttpEntity httpEntity = localVarBuilder.build();
            postBody = httpEntity;
        } else {
            // normal form params
        }

        String[] authNames = new String[] {  };

        try {
            boolean localVarResponse = apiInvoker.invokeAPIAsync (stringRequest, errorListener, basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);

/*            if(localVarResponse){
                return (List<Menu>) ApiInvoker.deserialize(localVarResponse, "array", Menu.class);
            } else {
                return null;
            }*/
        } catch (ApiException ex) {
            throw ex;
        } catch (InterruptedException ex) {
            throw ex;
        } catch (ExecutionException ex) {
            if(ex.getCause() instanceof VolleyError) {
                VolleyError volleyError = (VolleyError)ex.getCause();
                if (volleyError.networkResponse != null) {
                    throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
                }
            }
            throw ex;
        } catch (TimeoutException ex) {
            throw ex;
        }
    }

      /**
   * 获取相应平台的整个菜单
   * 需要通过不同的参数来获取不同的菜单,app、app_wemedia对应APP的媒体资讯菜单，wap,web
   * @param key key   * @param platform 平台：wap、web、app
  */
  public void getMenuList (String key, String platform, final Response.Listener<List<Menu>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getMenuList",
         new ApiException(400, "Missing the required parameter 'key' when calling getMenuList"));
    }
    
    // verify the required parameter 'platform' is set
    if (platform == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'platform' when calling getMenuList",
         new ApiException(400, "Missing the required parameter 'platform' when calling getMenuList"));
    }
    

    // create path and map variables
    String path = "/category/menus/{platform}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "platform" + "\\}", apiInvoker.escapeString(platform.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("key", ApiInvoker.parameterToString(key));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Menu>) ApiInvoker.deserialize(localVarResponse,  "array", Menu.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
