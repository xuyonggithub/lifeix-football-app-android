package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.UploadToken;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class FileApi {
  String basePath = "http://api.c-f.com:8000/football";
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
  * 从文件授权服务器上获取覆盖令牌
  * 从文件授权服务器上获取覆盖令牌
   * @param key key
   * @param fileName 要覆盖的文件名称列表，如果要覆盖多个，则传多个file_name并列， eg. file_name&#x3D;xxx&amp;file_name&#x3D;xxx
   * @return List<String>
  */
  public List<String> getOverwriteToken (String key, List<String> fileName) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getOverwriteToken",
      new ApiException(400, "Missing the required parameter 'key' when calling getOverwriteToken"));
      }
  
      // verify the required parameter 'fileName' is set
      if (fileName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'fileName' when calling getOverwriteToken",
      new ApiException(400, "Missing the required parameter 'fileName' when calling getOverwriteToken"));
      }
  

  // create path and map variables
  String path = "/file/token/overwrite".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("multi", "file_name", fileName));

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
           return (List<String>) ApiInvoker.deserialize(localVarResponse, "array", String.class);
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
   * 从文件授权服务器上获取覆盖令牌
   * 从文件授权服务器上获取覆盖令牌
   * @param key key   * @param fileName 要覆盖的文件名称列表，如果要覆盖多个，则传多个file_name并列， eg. file_name&#x3D;xxx&amp;file_name&#x3D;xxx
  */
  public void getOverwriteToken (String key, List<String> fileName, final Response.Listener<List<String>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getOverwriteToken",
         new ApiException(400, "Missing the required parameter 'key' when calling getOverwriteToken"));
    }
    
    // verify the required parameter 'fileName' is set
    if (fileName == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'fileName' when calling getOverwriteToken",
         new ApiException(400, "Missing the required parameter 'fileName' when calling getOverwriteToken"));
    }
    

    // create path and map variables
    String path = "/file/token/overwrite".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "file_name", fileName));

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
              responseListener.onResponse((List<String>) ApiInvoker.deserialize(localVarResponse,  "array", String.class));
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
  * 从文件授权服务器上获取上传令牌
  * 从文件授权服务器上获取上传令牌
   * @param key key
   * @param type 上传文件类型，|0 任意类型|1 图片|2 音频|3 视频|
   * @param fileName 原文件名列表，用于生成上传后的文件名列表，如果想保持原名不变，则可以不传，如果要上传多个，则传多个file_name并列， eg. file_name&#x3D;xxx&amp;file_name&#x3D;xxx
   * @return UploadToken
  */
  public UploadToken getUploadToken (String key, Integer type, List<String> fileName) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getUploadToken",
      new ApiException(400, "Missing the required parameter 'key' when calling getUploadToken"));
      }
  
      // verify the required parameter 'type' is set
      if (type == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'type' when calling getUploadToken",
      new ApiException(400, "Missing the required parameter 'type' when calling getUploadToken"));
      }
  

  // create path and map variables
  String path = "/file/token/upload".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "type", type));
          queryParams.addAll(ApiInvoker.parameterToPairs("multi", "file_name", fileName));

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
           return (UploadToken) ApiInvoker.deserialize(localVarResponse, "", UploadToken.class);
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
   * 从文件授权服务器上获取上传令牌
   * 从文件授权服务器上获取上传令牌
   * @param key key   * @param type 上传文件类型，|0 任意类型|1 图片|2 音频|3 视频|   * @param fileName 原文件名列表，用于生成上传后的文件名列表，如果想保持原名不变，则可以不传，如果要上传多个，则传多个file_name并列， eg. file_name&#x3D;xxx&amp;file_name&#x3D;xxx
  */
  public void getUploadToken (String key, Integer type, List<String> fileName, final Response.Listener<UploadToken> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getUploadToken",
         new ApiException(400, "Missing the required parameter 'key' when calling getUploadToken"));
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'type' when calling getUploadToken",
         new ApiException(400, "Missing the required parameter 'type' when calling getUploadToken"));
    }
    

    // create path and map variables
    String path = "/file/token/upload".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "type", type));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "file_name", fileName));

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
              responseListener.onResponse((UploadToken) ApiInvoker.deserialize(localVarResponse,  "", UploadToken.class));
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
