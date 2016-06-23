package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Post;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class WemediaPostApi {
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
  * 创建一个Post
  * 创建一个Post,其中title必填。content、images、videos三者至少有一个不为空
   * @param key key
   * @param post 帖子
   * @return Post
  */
  public Post addPost (String key, Post post) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = post;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addPost",
      new ApiException(400, "Missing the required parameter 'key' when calling addPost"));
      }
  
      // verify the required parameter 'post' is set
      if (post == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'post' when calling addPost",
      new ApiException(400, "Missing the required parameter 'post' when calling addPost"));
      }
  

  // create path and map variables
  String path = "/wemedia/posts".replaceAll("\\{format\\}","json");

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
           return (Post) ApiInvoker.deserialize(localVarResponse, "", Post.class);
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
   * 创建一个Post
   * 创建一个Post,其中title必填。content、images、videos三者至少有一个不为空
   * @param key key   * @param post 帖子
  */
  public void addPost (String key, Post post, final Response.Listener<Post> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = post;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addPost",
         new ApiException(400, "Missing the required parameter 'key' when calling addPost"));
    }
    
    // verify the required parameter 'post' is set
    if (post == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'post' when calling addPost",
         new ApiException(400, "Missing the required parameter 'post' when calling addPost"));
    }
    

    // create path and map variables
    String path = "/wemedia/posts".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((Post) ApiInvoker.deserialize(localVarResponse,  "", Post.class));
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
  * 为Post添加类目
  * 如果类目有层级需要把多层id都传入，比如&lt;国家队&gt;,&lt;男足&gt;，&lt;M23&gt;
   * @param key key
   * @param postId Post的ID
   * @param categoryIds 类目Id
   * @return void
  */
  public void addPostCategories (String key, String postId, List<String> categoryIds) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addPostCategories",
      new ApiException(400, "Missing the required parameter 'key' when calling addPostCategories"));
      }
  
      // verify the required parameter 'postId' is set
      if (postId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'postId' when calling addPostCategories",
      new ApiException(400, "Missing the required parameter 'postId' when calling addPostCategories"));
      }
  
      // verify the required parameter 'categoryIds' is set
      if (categoryIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'categoryIds' when calling addPostCategories",
      new ApiException(400, "Missing the required parameter 'categoryIds' when calling addPostCategories"));
      }
  

  // create path and map variables
  String path = "/wemedia/posts/{postId}/categories".replaceAll("\\{format\\}","json").replaceAll("\\{" + "postId" + "\\}", apiInvoker.escapeString(postId.toString()));

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
  
          if (categoryIds != null) {
          localVarBuilder.addTextBody("categoryIds", ApiInvoker.parameterToString(categoryIds), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("categoryIds", ApiInvoker.parameterToString(categoryIds));
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
   * 为Post添加类目
   * 如果类目有层级需要把多层id都传入，比如&lt;国家队&gt;,&lt;男足&gt;，&lt;M23&gt;
   * @param key key   * @param postId Post的ID   * @param categoryIds 类目Id
  */
  public void addPostCategories (String key, String postId, List<String> categoryIds, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addPostCategories",
         new ApiException(400, "Missing the required parameter 'key' when calling addPostCategories"));
    }
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'postId' when calling addPostCategories",
         new ApiException(400, "Missing the required parameter 'postId' when calling addPostCategories"));
    }
    
    // verify the required parameter 'categoryIds' is set
    if (categoryIds == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'categoryIds' when calling addPostCategories",
         new ApiException(400, "Missing the required parameter 'categoryIds' when calling addPostCategories"));
    }
    

    // create path and map variables
    String path = "/wemedia/posts/{postId}/categories".replaceAll("\\{format\\}","json").replaceAll("\\{" + "postId" + "\\}", apiInvoker.escapeString(postId.toString()));

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
      
      if (categoryIds != null) {
        localVarBuilder.addTextBody("categoryIds", ApiInvoker.parameterToString(categoryIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("categoryIds", ApiInvoker.parameterToString(categoryIds));
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
  * 删除Post的分类
  * 删除Post Category
   * @param key key
   * @param postId Post的ID
   * @param categoryIds 类目Id
   * @return void
  */
  public void deletePostCategories (String key, String postId, List<String> categoryIds) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling deletePostCategories",
      new ApiException(400, "Missing the required parameter 'key' when calling deletePostCategories"));
      }
  
      // verify the required parameter 'postId' is set
      if (postId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'postId' when calling deletePostCategories",
      new ApiException(400, "Missing the required parameter 'postId' when calling deletePostCategories"));
      }
  
      // verify the required parameter 'categoryIds' is set
      if (categoryIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'categoryIds' when calling deletePostCategories",
      new ApiException(400, "Missing the required parameter 'categoryIds' when calling deletePostCategories"));
      }
  

  // create path and map variables
  String path = "/wemedia/posts/{postId}/categories".replaceAll("\\{format\\}","json").replaceAll("\\{" + "postId" + "\\}", apiInvoker.escapeString(postId.toString()));

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
  
          if (categoryIds != null) {
          localVarBuilder.addTextBody("categoryIds", ApiInvoker.parameterToString(categoryIds), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("categoryIds", ApiInvoker.parameterToString(categoryIds));
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
   * 删除Post的分类
   * 删除Post Category
   * @param key key   * @param postId Post的ID   * @param categoryIds 类目Id
  */
  public void deletePostCategories (String key, String postId, List<String> categoryIds, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling deletePostCategories",
         new ApiException(400, "Missing the required parameter 'key' when calling deletePostCategories"));
    }
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'postId' when calling deletePostCategories",
         new ApiException(400, "Missing the required parameter 'postId' when calling deletePostCategories"));
    }
    
    // verify the required parameter 'categoryIds' is set
    if (categoryIds == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'categoryIds' when calling deletePostCategories",
         new ApiException(400, "Missing the required parameter 'categoryIds' when calling deletePostCategories"));
    }
    

    // create path and map variables
    String path = "/wemedia/posts/{postId}/categories".replaceAll("\\{format\\}","json").replaceAll("\\{" + "postId" + "\\}", apiInvoker.escapeString(postId.toString()));

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
      
      if (categoryIds != null) {
        localVarBuilder.addTextBody("categoryIds", ApiInvoker.parameterToString(categoryIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("categoryIds", ApiInvoker.parameterToString(categoryIds));
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
  * 删除Post
  * 删除Post：只有管理员才有权限
   * @param key key
   * @param postIds 帖子Id列表,删除多个时，传多次postIds.example:xxx?postIds&#x3D;111&amp;postIds&#x3D;222
   * @return void
  */
  public void deletePosts (String key, List<String> postIds) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling deletePosts",
      new ApiException(400, "Missing the required parameter 'key' when calling deletePosts"));
      }
  
      // verify the required parameter 'postIds' is set
      if (postIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'postIds' when calling deletePosts",
      new ApiException(400, "Missing the required parameter 'postIds' when calling deletePosts"));
      }
  

  // create path and map variables
  String path = "/wemedia/posts".replaceAll("\\{format\\}","json");

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
  
          if (postIds != null) {
          localVarBuilder.addTextBody("postIds", ApiInvoker.parameterToString(postIds), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
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
   * 删除Post
   * 删除Post：只有管理员才有权限
   * @param key key   * @param postIds 帖子Id列表,删除多个时，传多次postIds.example:xxx?postIds&#x3D;111&amp;postIds&#x3D;222
  */
  public void deletePosts (String key, List<String> postIds, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling deletePosts",
         new ApiException(400, "Missing the required parameter 'key' when calling deletePosts"));
    }
    
    // verify the required parameter 'postIds' is set
    if (postIds == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'postIds' when calling deletePosts",
         new ApiException(400, "Missing the required parameter 'postIds' when calling deletePosts"));
    }
    

    // create path and map variables
    String path = "/wemedia/posts".replaceAll("\\{format\\}","json");

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
      
      if (postIds != null) {
        localVarBuilder.addTextBody("postIds", ApiInvoker.parameterToString(postIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
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
  * 根据Id获取Post详情
  * 返回Post详情对象
   * @param key key
   * @param postId Post的ID
   * @return Post
  */
  public Post getPostDetail (String key, String postId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getPostDetail",
      new ApiException(400, "Missing the required parameter 'key' when calling getPostDetail"));
      }
  
      // verify the required parameter 'postId' is set
      if (postId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'postId' when calling getPostDetail",
      new ApiException(400, "Missing the required parameter 'postId' when calling getPostDetail"));
      }
  

  // create path and map variables
  String path = "/wemedia/posts/{postId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "postId" + "\\}", apiInvoker.escapeString(postId.toString()));

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
           return (Post) ApiInvoker.deserialize(localVarResponse, "", Post.class);
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
   * 根据Id获取Post详情
   * 返回Post详情对象
   * @param key key   * @param postId Post的ID
  */
  public void getPostDetail (String key, String postId, final Response.Listener<Post> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getPostDetail",
         new ApiException(400, "Missing the required parameter 'key' when calling getPostDetail"));
    }
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'postId' when calling getPostDetail",
         new ApiException(400, "Missing the required parameter 'postId' when calling getPostDetail"));
    }
    

    // create path and map variables
    String path = "/wemedia/posts/{postId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "postId" + "\\}", apiInvoker.escapeString(postId.toString()));

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
              responseListener.onResponse((Post) ApiInvoker.deserialize(localVarResponse,  "", Post.class));
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
  * 获得Posts
  * 根据Id获取Post
   * @param key key
   * @param postIds 文章的id,多个时以,分隔
   * @return List<Post>
  */
  public List<Post> list (String key, List<String> postIds) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling list",
      new ApiException(400, "Missing the required parameter 'key' when calling list"));
      }
  

  // create path and map variables
  String path = "/wemedia/posts".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("multi", "postIds", postIds));

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
   * 获得Posts
   * 根据Id获取Post
   * @param key key   * @param postIds 文章的id,多个时以,分隔
  */
  public void list (String key, List<String> postIds, final Response.Listener<List<Post>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling list",
         new ApiException(400, "Missing the required parameter 'key' when calling list"));
    }
    

    // create path and map variables
    String path = "/wemedia/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "postIds", postIds));

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
  /**
  * 搜索Post
  * 根据搜索条件获取Post列表，每次搜索不能超过30条
   * @param key key
   * @param categoryId 类目id
   * @param authorId 作者id
   * @param startDate 查询开始日期,单位天
   * @param endDate 查询结束日期,单位天
   * @param date 查询开始时间。example:分页时，传递第一页最后一条记录的createTime(long)
   * @param limit 一页显示多少
   * @param orderBy 按照那个字段排序
   * @param isDesc 是否按时间倒序,默认值true
   * @return List<Post>
  */
  public List<Post> search (String key, String categoryId, String authorId, Date startDate, Date endDate, Date date, Integer limit, String orderBy, Boolean isDesc) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling search",
      new ApiException(400, "Missing the required parameter 'key' when calling search"));
      }
  

  // create path and map variables
  String path = "/wemedia/posts/search".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "categoryId", categoryId));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "authorId", authorId));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "startDate", startDate));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "endDate", endDate));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "date", date));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "orderBy", orderBy));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "isDesc", isDesc));

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
   * 搜索Post
   * 根据搜索条件获取Post列表，每次搜索不能超过30条
   * @param key key   * @param categoryId 类目id   * @param authorId 作者id   * @param startDate 查询开始日期,单位天   * @param endDate 查询结束日期,单位天   * @param date 查询开始时间。example:分页时，传递第一页最后一条记录的createTime(long)   * @param limit 一页显示多少   * @param orderBy 按照那个字段排序   * @param isDesc 是否按时间倒序,默认值true
  */
  public void search (String key, String categoryId, String authorId, Date startDate, Date endDate, Date date, Integer limit, String orderBy, Boolean isDesc, final Response.Listener<List<Post>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling search",
         new ApiException(400, "Missing the required parameter 'key' when calling search"));
    }
    

    // create path and map variables
    String path = "/wemedia/posts/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "categoryId", categoryId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "authorId", authorId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startDate", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endDate", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "date", date));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "orderBy", orderBy));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "isDesc", isDesc));

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
