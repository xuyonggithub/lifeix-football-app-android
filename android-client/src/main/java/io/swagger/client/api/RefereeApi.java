package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Referee;
import io.swagger.client.model.RefereeCategoryTop;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class RefereeApi {
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
  * 获得裁判详细信息
  * 查看裁判信息
   * @param refereeId 裁判Id
   * @return Referee
  */
  public Referee getReferee (Long refereeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'refereeId' is set
      if (refereeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'refereeId' when calling getReferee",
      new ApiException(400, "Missing the required parameter 'refereeId' when calling getReferee"));
      }
  

  // create path and map variables
  String path = "/games/referees/{refereeId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "refereeId" + "\\}", apiInvoker.escapeString(refereeId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



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
           return (Referee) ApiInvoker.deserialize(localVarResponse, "", Referee.class);
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
   * 获得裁判详细信息
   * 查看裁判信息
   * @param refereeId 裁判Id
  */
  public void getReferee (Long refereeId, final Response.Listener<Referee> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'refereeId' is set
    if (refereeId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'refereeId' when calling getReferee",
         new ApiException(400, "Missing the required parameter 'refereeId' when calling getReferee"));
    }
    

    // create path and map variables
    String path = "/games/referees/{refereeId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "refereeId" + "\\}", apiInvoker.escapeString(refereeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



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
              responseListener.onResponse((Referee) ApiInvoker.deserialize(localVarResponse,  "", Referee.class));
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
  * 获得裁判列表
  * 获得裁判列表
   * @param level 裁判级别
   * @param startId 开始查询的id
   * @param pageSize 一页显示多少
   * @return List<RefereeCategoryTop>
  */
  public List<RefereeCategoryTop> getReferees (String level, Long startId, Integer pageSize) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'level' is set
      if (level == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'level' when calling getReferees",
      new ApiException(400, "Missing the required parameter 'level' when calling getReferees"));
      }
  

  // create path and map variables
  String path = "/games/referees".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "level", level));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "startId", startId));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "pageSize", pageSize));


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
           return (List<RefereeCategoryTop>) ApiInvoker.deserialize(localVarResponse, "array", RefereeCategoryTop.class);
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
   * 获得裁判列表
   * 获得裁判列表
   * @param level 裁判级别   * @param startId 开始查询的id   * @param pageSize 一页显示多少
  */
  public void getReferees (String level, Long startId, Integer pageSize, final Response.Listener<List<RefereeCategoryTop>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'level' is set
    if (level == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'level' when calling getReferees",
         new ApiException(400, "Missing the required parameter 'level' when calling getReferees"));
    }
    

    // create path and map variables
    String path = "/games/referees".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "level", level));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startId", startId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pageSize", pageSize));


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
              responseListener.onResponse((List<RefereeCategoryTop>) ApiInvoker.deserialize(localVarResponse,  "array", RefereeCategoryTop.class));
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
