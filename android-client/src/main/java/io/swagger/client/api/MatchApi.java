package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.FrontMatch;
import java.util.*;
import io.swagger.client.model.MatchInfo;
import io.swagger.client.model.Match;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class MatchApi {
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
  * 新增比赛
  * 新增比赛
   * @param key key
   * @param competitionId 赛事的Id
   * @param frontMatches 对阵列表
   * @return void
  */
  public void addMatch (String key, Long competitionId, List<FrontMatch> frontMatches) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = frontMatches;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addMatch",
      new ApiException(400, "Missing the required parameter 'key' when calling addMatch"));
      }
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addMatch",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addMatch"));
      }
  
      // verify the required parameter 'frontMatches' is set
      if (frontMatches == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'frontMatches' when calling addMatch",
      new ApiException(400, "Missing the required parameter 'frontMatches' when calling addMatch"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/matches".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString()));

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
   * 新增比赛
   * 新增比赛
   * @param key key   * @param competitionId 赛事的Id   * @param frontMatches 对阵列表
  */
  public void addMatch (String key, Long competitionId, List<FrontMatch> frontMatches, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = frontMatches;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addMatch",
         new ApiException(400, "Missing the required parameter 'key' when calling addMatch"));
    }
    
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addMatch",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addMatch"));
    }
    
    // verify the required parameter 'frontMatches' is set
    if (frontMatches == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'frontMatches' when calling addMatch",
         new ApiException(400, "Missing the required parameter 'frontMatches' when calling addMatch"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/matches".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString()));

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
  * 新增比赛工作人员
  * 新增比赛工作人员
   * @param key key
   * @param competitionId 赛事的Id
   * @param matchId 比赛Id
   * @param matchStaffIds 比赛工作人员id example:1,2 
   * @param positions 比赛工作人员位置 example:bsjd,cpjd
   * @return void
  */
  public void addRelationMatchAndMatchStaff (String key, Long competitionId, Long matchId, String matchStaffIds, String positions) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addRelationMatchAndMatchStaff",
      new ApiException(400, "Missing the required parameter 'key' when calling addRelationMatchAndMatchStaff"));
      }
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addRelationMatchAndMatchStaff",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addRelationMatchAndMatchStaff"));
      }
  
      // verify the required parameter 'matchId' is set
      if (matchId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'matchId' when calling addRelationMatchAndMatchStaff",
      new ApiException(400, "Missing the required parameter 'matchId' when calling addRelationMatchAndMatchStaff"));
      }
  
      // verify the required parameter 'matchStaffIds' is set
      if (matchStaffIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'matchStaffIds' when calling addRelationMatchAndMatchStaff",
      new ApiException(400, "Missing the required parameter 'matchStaffIds' when calling addRelationMatchAndMatchStaff"));
      }
  
      // verify the required parameter 'positions' is set
      if (positions == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addRelationMatchAndMatchStaff",
      new ApiException(400, "Missing the required parameter 'positions' when calling addRelationMatchAndMatchStaff"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/matches/{matchId}/matchstaffs".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "matchId" + "\\}", apiInvoker.escapeString(matchId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "matchStaffIds", matchStaffIds));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "positions", positions));

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
   * 新增比赛工作人员
   * 新增比赛工作人员
   * @param key key   * @param competitionId 赛事的Id   * @param matchId 比赛Id   * @param matchStaffIds 比赛工作人员id example:1,2    * @param positions 比赛工作人员位置 example:bsjd,cpjd
  */
  public void addRelationMatchAndMatchStaff (String key, Long competitionId, Long matchId, String matchStaffIds, String positions, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addRelationMatchAndMatchStaff",
         new ApiException(400, "Missing the required parameter 'key' when calling addRelationMatchAndMatchStaff"));
    }
    
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addRelationMatchAndMatchStaff",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addRelationMatchAndMatchStaff"));
    }
    
    // verify the required parameter 'matchId' is set
    if (matchId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'matchId' when calling addRelationMatchAndMatchStaff",
         new ApiException(400, "Missing the required parameter 'matchId' when calling addRelationMatchAndMatchStaff"));
    }
    
    // verify the required parameter 'matchStaffIds' is set
    if (matchStaffIds == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'matchStaffIds' when calling addRelationMatchAndMatchStaff",
         new ApiException(400, "Missing the required parameter 'matchStaffIds' when calling addRelationMatchAndMatchStaff"));
    }
    
    // verify the required parameter 'positions' is set
    if (positions == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addRelationMatchAndMatchStaff",
         new ApiException(400, "Missing the required parameter 'positions' when calling addRelationMatchAndMatchStaff"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/matches/{matchId}/matchstaffs".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "matchId" + "\\}", apiInvoker.escapeString(matchId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "matchStaffIds", matchStaffIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "positions", positions));

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
  * 新增比赛裁判
  * 新增比赛裁判
   * @param key key
   * @param competitionId 赛事的Id
   * @param matchId 比赛Id
   * @param refereeIds 比赛裁判id example:1,2,3 
   * @param positions 比赛裁判位置 example:主裁,边裁,第四官员
   * @return void
  */
  public void addRelationMatchAndReferee (String key, Long competitionId, Long matchId, String refereeIds, String positions) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addRelationMatchAndReferee",
      new ApiException(400, "Missing the required parameter 'key' when calling addRelationMatchAndReferee"));
      }
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addRelationMatchAndReferee",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addRelationMatchAndReferee"));
      }
  
      // verify the required parameter 'matchId' is set
      if (matchId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'matchId' when calling addRelationMatchAndReferee",
      new ApiException(400, "Missing the required parameter 'matchId' when calling addRelationMatchAndReferee"));
      }
  
      // verify the required parameter 'refereeIds' is set
      if (refereeIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'refereeIds' when calling addRelationMatchAndReferee",
      new ApiException(400, "Missing the required parameter 'refereeIds' when calling addRelationMatchAndReferee"));
      }
  
      // verify the required parameter 'positions' is set
      if (positions == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addRelationMatchAndReferee",
      new ApiException(400, "Missing the required parameter 'positions' when calling addRelationMatchAndReferee"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/matches/{matchId}/referees".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "matchId" + "\\}", apiInvoker.escapeString(matchId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "refereeIds", refereeIds));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "positions", positions));

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
   * 新增比赛裁判
   * 新增比赛裁判
   * @param key key   * @param competitionId 赛事的Id   * @param matchId 比赛Id   * @param refereeIds 比赛裁判id example:1,2,3    * @param positions 比赛裁判位置 example:主裁,边裁,第四官员
  */
  public void addRelationMatchAndReferee (String key, Long competitionId, Long matchId, String refereeIds, String positions, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addRelationMatchAndReferee",
         new ApiException(400, "Missing the required parameter 'key' when calling addRelationMatchAndReferee"));
    }
    
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addRelationMatchAndReferee",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addRelationMatchAndReferee"));
    }
    
    // verify the required parameter 'matchId' is set
    if (matchId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'matchId' when calling addRelationMatchAndReferee",
         new ApiException(400, "Missing the required parameter 'matchId' when calling addRelationMatchAndReferee"));
    }
    
    // verify the required parameter 'refereeIds' is set
    if (refereeIds == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'refereeIds' when calling addRelationMatchAndReferee",
         new ApiException(400, "Missing the required parameter 'refereeIds' when calling addRelationMatchAndReferee"));
    }
    
    // verify the required parameter 'positions' is set
    if (positions == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addRelationMatchAndReferee",
         new ApiException(400, "Missing the required parameter 'positions' when calling addRelationMatchAndReferee"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/matches/{matchId}/referees".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "matchId" + "\\}", apiInvoker.escapeString(matchId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "refereeIds", refereeIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "positions", positions));

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
  * 获取赛事比赛列表,即时间轴
  * 获取赛事比赛列表
   * @param competitionId 赛事的Id
   * @param teamId 球队id
   * @return List<MatchInfo>
  */
  public List<MatchInfo> getByCompetitionIdAndTeamId (Long competitionId, Long teamId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getByCompetitionIdAndTeamId",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling getByCompetitionIdAndTeamId"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling getByCompetitionIdAndTeamId",
      new ApiException(400, "Missing the required parameter 'teamId' when calling getByCompetitionIdAndTeamId"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/matches".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "teamId", teamId));


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
           return (List<MatchInfo>) ApiInvoker.deserialize(localVarResponse, "array", MatchInfo.class);
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
   * 获取赛事比赛列表,即时间轴
   * 获取赛事比赛列表
   * @param competitionId 赛事的Id   * @param teamId 球队id
  */
  public void getByCompetitionIdAndTeamId (Long competitionId, Long teamId, final Response.Listener<List<MatchInfo>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getByCompetitionIdAndTeamId",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling getByCompetitionIdAndTeamId"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling getByCompetitionIdAndTeamId",
         new ApiException(400, "Missing the required parameter 'teamId' when calling getByCompetitionIdAndTeamId"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/matches".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "teamId", teamId));


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
              responseListener.onResponse((List<MatchInfo>) ApiInvoker.deserialize(localVarResponse,  "array", MatchInfo.class));
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
  * 获得比赛信息
  * 获得比赛信息
   * @param competitionId 赛事的Id
   * @param matchId 比赛Id
   * @return Match
  */
  public Match getMatch (Long competitionId, Long matchId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getMatch",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling getMatch"));
      }
  
      // verify the required parameter 'matchId' is set
      if (matchId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'matchId' when calling getMatch",
      new ApiException(400, "Missing the required parameter 'matchId' when calling getMatch"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/matches/{matchId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "matchId" + "\\}", apiInvoker.escapeString(matchId.toString()));

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
           return (Match) ApiInvoker.deserialize(localVarResponse, "", Match.class);
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
   * 获得比赛信息
   * 获得比赛信息
   * @param competitionId 赛事的Id   * @param matchId 比赛Id
  */
  public void getMatch (Long competitionId, Long matchId, final Response.Listener<Match> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getMatch",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling getMatch"));
    }
    
    // verify the required parameter 'matchId' is set
    if (matchId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'matchId' when calling getMatch",
         new ApiException(400, "Missing the required parameter 'matchId' when calling getMatch"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/matches/{matchId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "matchId" + "\\}", apiInvoker.escapeString(matchId.toString()));

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
              responseListener.onResponse((Match) ApiInvoker.deserialize(localVarResponse,  "", Match.class));
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
