package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Like;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class LikesApi {
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
  * 对某一个目标点赞
  * 一个Ip地址只能对一个目标点赞/踩一次，第二次仍会返回正确，但是数目不会变化
   * @param key key
   * @param type target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post
   * @param target 目标：比如可以nationteam的memberid，也可以是post的id
   * @param like ture 点赞，false 踩
   * @return void
  */
  public void addLike (String key, String type, String target, Boolean like) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addLike",
      new ApiException(400, "Missing the required parameter 'key' when calling addLike"));
      }
  
      // verify the required parameter 'type' is set
      if (type == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'type' when calling addLike",
      new ApiException(400, "Missing the required parameter 'type' when calling addLike"));
      }
  
      // verify the required parameter 'target' is set
      if (target == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'target' when calling addLike",
      new ApiException(400, "Missing the required parameter 'target' when calling addLike"));
      }
  

  // create path and map variables
  String path = "/like/likes".replaceAll("\\{format\\}","json");

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
  
          if (type != null) {
          localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (target != null) {
          localVarBuilder.addTextBody("target", ApiInvoker.parameterToString(target), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (like != null) {
          localVarBuilder.addTextBody("like", ApiInvoker.parameterToString(like), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("type", ApiInvoker.parameterToString(type));
formParams.put("target", ApiInvoker.parameterToString(target));
formParams.put("like", ApiInvoker.parameterToString(like));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return ;
        } else {
           return ;
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
   * 对某一个目标点赞
   * 一个Ip地址只能对一个目标点赞/踩一次，第二次仍会返回正确，但是数目不会变化
   * @param key key   * @param type target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post   * @param target 目标：比如可以nationteam的memberid，也可以是post的id   * @param like ture 点赞，false 踩
  */
  public void addLike (String key, String type, String target, Boolean like, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addLike",
         new ApiException(400, "Missing the required parameter 'key' when calling addLike"));
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'type' when calling addLike",
         new ApiException(400, "Missing the required parameter 'type' when calling addLike"));
    }
    
    // verify the required parameter 'target' is set
    if (target == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'target' when calling addLike",
         new ApiException(400, "Missing the required parameter 'target' when calling addLike"));
    }
    

    // create path and map variables
    String path = "/like/likes".replaceAll("\\{format\\}","json");

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
      
      if (type != null) {
        localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (target != null) {
        localVarBuilder.addTextBody("target", ApiInvoker.parameterToString(target), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (like != null) {
        localVarBuilder.addTextBody("like", ApiInvoker.parameterToString(like), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
formParams.put("target", ApiInvoker.parameterToString(target));
formParams.put("like", ApiInvoker.parameterToString(like));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
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
  * 获取喜欢列表
  * 将type&#x3D;${type}的所有目标的喜欢情况返回，同时加入当前喜欢与否情况
   * @param key key
   * @param type target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post
   * @return List<Like>
  */
  public List<Like> getLikes (String key, String type) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getLikes",
      new ApiException(400, "Missing the required parameter 'key' when calling getLikes"));
      }
  
      // verify the required parameter 'type' is set
      if (type == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'type' when calling getLikes",
      new ApiException(400, "Missing the required parameter 'type' when calling getLikes"));
      }
  

  // create path and map variables
  String path = "/like/likes".replaceAll("\\{format\\}","json");

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
  
          if (type != null) {
          localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("type", ApiInvoker.parameterToString(type));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Like>) ApiInvoker.deserialize(localVarResponse, "array", Like.class);
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
   * 获取喜欢列表
   * 将type&#x3D;${type}的所有目标的喜欢情况返回，同时加入当前喜欢与否情况
   * @param key key   * @param type target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post
  */
  public void getLikes (String key, String type, final Response.Listener<List<Like>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getLikes",
         new ApiException(400, "Missing the required parameter 'key' when calling getLikes"));
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'type' when calling getLikes",
         new ApiException(400, "Missing the required parameter 'type' when calling getLikes"));
    }
    

    // create path and map variables
    String path = "/like/likes".replaceAll("\\{format\\}","json");

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
      
      if (type != null) {
        localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Like>) ApiInvoker.deserialize(localVarResponse,  "array", Like.class));
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
  * 获得某一个Post的点赞信息
  * 比如：立方体育XX like 100 unlike20 like true
   * @param key key
   * @param target 目标：比如可以nationteam的memberid，也可以是post的id
   * @param type target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post
   * @return Like
  */
  public Like getPostLikeds (String key, String target, String type) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getPostLikeds",
      new ApiException(400, "Missing the required parameter 'key' when calling getPostLikeds"));
      }
  
      // verify the required parameter 'target' is set
      if (target == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'target' when calling getPostLikeds",
      new ApiException(400, "Missing the required parameter 'target' when calling getPostLikeds"));
      }
  
      // verify the required parameter 'type' is set
      if (type == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'type' when calling getPostLikeds",
      new ApiException(400, "Missing the required parameter 'type' when calling getPostLikeds"));
      }
  

  // create path and map variables
  String path = "/like/likes/{target}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "target" + "\\}", apiInvoker.escapeString(target.toString()));

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
  
          if (type != null) {
          localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("type", ApiInvoker.parameterToString(type));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Like) ApiInvoker.deserialize(localVarResponse, "", Like.class);
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
   * 获得某一个Post的点赞信息
   * 比如：立方体育XX like 100 unlike20 like true
   * @param key key   * @param target 目标：比如可以nationteam的memberid，也可以是post的id   * @param type target的类型，如果是国家队成员则写nationalteam，如果是文章则填入post
  */
  public void getPostLikeds (String key, String target, String type, final Response.Listener<Like> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getPostLikeds",
         new ApiException(400, "Missing the required parameter 'key' when calling getPostLikeds"));
    }
    
    // verify the required parameter 'target' is set
    if (target == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'target' when calling getPostLikeds",
         new ApiException(400, "Missing the required parameter 'target' when calling getPostLikeds"));
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'type' when calling getPostLikeds",
         new ApiException(400, "Missing the required parameter 'type' when calling getPostLikeds"));
    }
    

    // create path and map variables
    String path = "/like/likes/{target}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "target" + "\\}", apiInvoker.escapeString(target.toString()));

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
      
      if (type != null) {
        localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Like) ApiInvoker.deserialize(localVarResponse,  "", Like.class));
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
