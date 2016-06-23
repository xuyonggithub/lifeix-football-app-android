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
import io.swagger.client.model.Post;

public class WemediaTopApi {
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
  * 添加Posts到对应的Category的Top
  * 传入类目Id以及对应的PostIds
   * @param key key
   * @param categoryId 类目Id
   * @param postIds postIds
   * @return void
  */
  public void addTopPosts (String key, String categoryId, List<String> postIds) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addTopPosts",
      new ApiException(400, "Missing the required parameter 'key' when calling addTopPosts"));
      }
  

  // create path and map variables
  String path = "/wemedia/tops".replaceAll("\\{format\\}","json");

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
  
          if (categoryId != null) {
          localVarBuilder.addTextBody("categoryId", ApiInvoker.parameterToString(categoryId), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (postIds != null) {
          localVarBuilder.addTextBody("postIds", ApiInvoker.parameterToString(postIds), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("categoryId", ApiInvoker.parameterToString(categoryId));
formParams.put("postIds", ApiInvoker.parameterToString(postIds));
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
   * 添加Posts到对应的Category的Top
   * 传入类目Id以及对应的PostIds
   * @param key key   * @param categoryId 类目Id   * @param postIds postIds
  */
  public void addTopPosts (String key, String categoryId, List<String> postIds, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addTopPosts",
         new ApiException(400, "Missing the required parameter 'key' when calling addTopPosts"));
    }
    

    // create path and map variables
    String path = "/wemedia/tops".replaceAll("\\{format\\}","json");

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
      
      if (categoryId != null) {
        localVarBuilder.addTextBody("categoryId", ApiInvoker.parameterToString(categoryId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (postIds != null) {
        localVarBuilder.addTextBody("postIds", ApiInvoker.parameterToString(postIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("categoryId", ApiInvoker.parameterToString(categoryId));
formParams.put("postIds", ApiInvoker.parameterToString(postIds));
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
  * 从对应的Category的Top上删除Posts
  * 传入类目Id以及对应的PostIds
   * @param key key
   * @param categoryId 类目Id
   * @param postIds postIds
   * @return void
  */
  public void deleteTopPosts (String key, String categoryId, List<String> postIds) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling deleteTopPosts",
      new ApiException(400, "Missing the required parameter 'key' when calling deleteTopPosts"));
      }
  

  // create path and map variables
  String path = "/wemedia/tops".replaceAll("\\{format\\}","json");

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
  
          if (categoryId != null) {
          localVarBuilder.addTextBody("categoryId", ApiInvoker.parameterToString(categoryId), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (postIds != null) {
          localVarBuilder.addTextBody("postIds", ApiInvoker.parameterToString(postIds), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("categoryId", ApiInvoker.parameterToString(categoryId));
formParams.put("postIds", ApiInvoker.parameterToString(postIds));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
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
   * 从对应的Category的Top上删除Posts
   * 传入类目Id以及对应的PostIds
   * @param key key   * @param categoryId 类目Id   * @param postIds postIds
  */
  public void deleteTopPosts (String key, String categoryId, List<String> postIds, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling deleteTopPosts",
         new ApiException(400, "Missing the required parameter 'key' when calling deleteTopPosts"));
    }
    

    // create path and map variables
    String path = "/wemedia/tops".replaceAll("\\{format\\}","json");

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
      
      if (categoryId != null) {
        localVarBuilder.addTextBody("categoryId", ApiInvoker.parameterToString(categoryId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (postIds != null) {
        localVarBuilder.addTextBody("postIds", ApiInvoker.parameterToString(postIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("categoryId", ApiInvoker.parameterToString(categoryId));
formParams.put("postIds", ApiInvoker.parameterToString(postIds));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
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
  * 获得类目下对应的文章列表
  * 传入类目Ids能够获得对应的posts:之所以用列表是因为console需要获知某一组类目下所有posts
   * @param key key
   * @param categoryIds 类目列表
   * @return List<Post>
  */
  public List<Post> getTopPosts (String key, List<String> categoryIds) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getTopPosts",
      new ApiException(400, "Missing the required parameter 'key' when calling getTopPosts"));
      }
  

  // create path and map variables
  String path = "/wemedia/tops".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("multi", "categoryIds", categoryIds));

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
           return (List<Post>) ApiInvoker.deserialize(localVarResponse, "array", Post.class);
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
   * 获得类目下对应的文章列表
   * 传入类目Ids能够获得对应的posts:之所以用列表是因为console需要获知某一组类目下所有posts
   * @param key key   * @param categoryIds 类目列表
  */
  public void getTopPosts (String key, List<String> categoryIds, final Response.Listener<List<Post>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getTopPosts",
         new ApiException(400, "Missing the required parameter 'key' when calling getTopPosts"));
    }
    

    // create path and map variables
    String path = "/wemedia/tops".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "categoryIds", categoryIds));

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
              responseListener.onResponse((List<Post>) ApiInvoker.deserialize(localVarResponse,  "array", Post.class));
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
