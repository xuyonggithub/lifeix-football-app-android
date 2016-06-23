package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Competition;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CompetitionApi {
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
  * 新增赛事
  * 新增赛事
   * @param key key
   * @param competition 赛事
   * @return Competition
  */
  public Competition addCompetition (String key, Competition competition) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = competition;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetition",
      new ApiException(400, "Missing the required parameter 'key' when calling addCompetition"));
      }
  
      // verify the required parameter 'competition' is set
      if (competition == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competition' when calling addCompetition",
      new ApiException(400, "Missing the required parameter 'competition' when calling addCompetition"));
      }
  

  // create path and map variables
  String path = "/games/competitions".replaceAll("\\{format\\}","json");

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
           return (Competition) ApiInvoker.deserialize(localVarResponse, "", Competition.class);
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
   * 新增赛事
   * 新增赛事
   * @param key key   * @param competition 赛事
  */
  public void addCompetition (String key, Competition competition, final Response.Listener<Competition> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = competition;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetition",
         new ApiException(400, "Missing the required parameter 'key' when calling addCompetition"));
    }
    
    // verify the required parameter 'competition' is set
    if (competition == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competition' when calling addCompetition",
         new ApiException(400, "Missing the required parameter 'competition' when calling addCompetition"));
    }
    

    // create path and map variables
    String path = "/games/competitions".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((Competition) ApiInvoker.deserialize(localVarResponse,  "", Competition.class));
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
  * 赛事所有的参赛球队信息和比赛信息（赛程）
  * 赛事所有的参赛球队信息和比赛信息（赛程）
   * @param competitionId 赛事的Id
   * @return Competition
  */
  public Competition getCompetition (Long competitionId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getCompetition",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling getCompetition"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString()));

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
           return (Competition) ApiInvoker.deserialize(localVarResponse, "", Competition.class);
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
   * 赛事所有的参赛球队信息和比赛信息（赛程）
   * 赛事所有的参赛球队信息和比赛信息（赛程）
   * @param competitionId 赛事的Id
  */
  public void getCompetition (Long competitionId, final Response.Listener<Competition> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getCompetition",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling getCompetition"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString()));

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
              responseListener.onResponse((Competition) ApiInvoker.deserialize(localVarResponse,  "", Competition.class));
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
