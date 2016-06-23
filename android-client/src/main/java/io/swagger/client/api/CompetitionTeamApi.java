package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.CompetitionTeam;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CompetitionTeamApi {
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
  * 新增赛事参赛队
  * 新增赛事参赛队
   * @param key key
   * @param competitionId 赛事的Id
   * @param teamId 队伍Id
   * @param competitionTeam 赛事参赛队
   * @return CompetitionTeam
  */
  public CompetitionTeam addCompetitionTeam (String key, Long competitionId, Long teamId, CompetitionTeam competitionTeam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = competitionTeam;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetitionTeam",
      new ApiException(400, "Missing the required parameter 'key' when calling addCompetitionTeam"));
      }
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addCompetitionTeam",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addCompetitionTeam"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addCompetitionTeam",
      new ApiException(400, "Missing the required parameter 'teamId' when calling addCompetitionTeam"));
      }
  
      // verify the required parameter 'competitionTeam' is set
      if (competitionTeam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionTeam' when calling addCompetitionTeam",
      new ApiException(400, "Missing the required parameter 'competitionTeam' when calling addCompetitionTeam"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString()));

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
           return (CompetitionTeam) ApiInvoker.deserialize(localVarResponse, "", CompetitionTeam.class);
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
   * 新增赛事参赛队
   * 新增赛事参赛队
   * @param key key   * @param competitionId 赛事的Id   * @param teamId 队伍Id   * @param competitionTeam 赛事参赛队
  */
  public void addCompetitionTeam (String key, Long competitionId, Long teamId, CompetitionTeam competitionTeam, final Response.Listener<CompetitionTeam> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = competitionTeam;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetitionTeam",
         new ApiException(400, "Missing the required parameter 'key' when calling addCompetitionTeam"));
    }
    
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addCompetitionTeam",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addCompetitionTeam"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addCompetitionTeam",
         new ApiException(400, "Missing the required parameter 'teamId' when calling addCompetitionTeam"));
    }
    
    // verify the required parameter 'competitionTeam' is set
    if (competitionTeam == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionTeam' when calling addCompetitionTeam",
         new ApiException(400, "Missing the required parameter 'competitionTeam' when calling addCompetitionTeam"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString()));

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
              responseListener.onResponse((CompetitionTeam) ApiInvoker.deserialize(localVarResponse,  "", CompetitionTeam.class));
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
  * 新增赛事参赛队教练
  * 新增赛事参赛队教练
   * @param key key
   * @param competitionId 赛事的Id
   * @param teamId 队伍Id
   * @param competitionTeamId 赛事参赛队的Id
   * @param coachIds 教练id example:1,2 
   * @param positions 球员报名位置 example:主教练,助理教练
   * @return void
  */
  public void addCompetitionTeamCoaches (String key, Long competitionId, Long teamId, Long competitionTeamId, String coachIds, String positions) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetitionTeamCoaches",
      new ApiException(400, "Missing the required parameter 'key' when calling addCompetitionTeamCoaches"));
      }
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addCompetitionTeamCoaches",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addCompetitionTeamCoaches"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addCompetitionTeamCoaches",
      new ApiException(400, "Missing the required parameter 'teamId' when calling addCompetitionTeamCoaches"));
      }
  
      // verify the required parameter 'competitionTeamId' is set
      if (competitionTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamCoaches",
      new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamCoaches"));
      }
  
      // verify the required parameter 'coachIds' is set
      if (coachIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'coachIds' when calling addCompetitionTeamCoaches",
      new ApiException(400, "Missing the required parameter 'coachIds' when calling addCompetitionTeamCoaches"));
      }
  
      // verify the required parameter 'positions' is set
      if (positions == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addCompetitionTeamCoaches",
      new ApiException(400, "Missing the required parameter 'positions' when calling addCompetitionTeamCoaches"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/coaches".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "coachIds", coachIds));
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
   * 新增赛事参赛队教练
   * 新增赛事参赛队教练
   * @param key key   * @param competitionId 赛事的Id   * @param teamId 队伍Id   * @param competitionTeamId 赛事参赛队的Id   * @param coachIds 教练id example:1,2    * @param positions 球员报名位置 example:主教练,助理教练
  */
  public void addCompetitionTeamCoaches (String key, Long competitionId, Long teamId, Long competitionTeamId, String coachIds, String positions, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetitionTeamCoaches",
         new ApiException(400, "Missing the required parameter 'key' when calling addCompetitionTeamCoaches"));
    }
    
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addCompetitionTeamCoaches",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addCompetitionTeamCoaches"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addCompetitionTeamCoaches",
         new ApiException(400, "Missing the required parameter 'teamId' when calling addCompetitionTeamCoaches"));
    }
    
    // verify the required parameter 'competitionTeamId' is set
    if (competitionTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamCoaches",
         new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamCoaches"));
    }
    
    // verify the required parameter 'coachIds' is set
    if (coachIds == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'coachIds' when calling addCompetitionTeamCoaches",
         new ApiException(400, "Missing the required parameter 'coachIds' when calling addCompetitionTeamCoaches"));
    }
    
    // verify the required parameter 'positions' is set
    if (positions == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addCompetitionTeamCoaches",
         new ApiException(400, "Missing the required parameter 'positions' when calling addCompetitionTeamCoaches"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/coaches".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "coachIds", coachIds));
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
  * 新增赛事参赛队球员
  * 新增赛事参赛队球员
   * @param key key
   * @param competitionId 赛事的Id
   * @param teamId 队伍Id
   * @param competitionTeamId 赛事参赛队的Id
   * @param playerIds 球员id example:1,2,13,14 
   * @param positions 球员报名位置 example:前锋,前锋,中场,门将 
   * @param jerseryNums 球员球衣号码 example:10,9,8,7 
   * @return void
  */
  public void addCompetitionTeamPlayers (String key, Long competitionId, Long teamId, Long competitionTeamId, String playerIds, String positions, String jerseryNums) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetitionTeamPlayers",
      new ApiException(400, "Missing the required parameter 'key' when calling addCompetitionTeamPlayers"));
      }
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addCompetitionTeamPlayers",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addCompetitionTeamPlayers"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addCompetitionTeamPlayers",
      new ApiException(400, "Missing the required parameter 'teamId' when calling addCompetitionTeamPlayers"));
      }
  
      // verify the required parameter 'competitionTeamId' is set
      if (competitionTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamPlayers",
      new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamPlayers"));
      }
  
      // verify the required parameter 'playerIds' is set
      if (playerIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'playerIds' when calling addCompetitionTeamPlayers",
      new ApiException(400, "Missing the required parameter 'playerIds' when calling addCompetitionTeamPlayers"));
      }
  
      // verify the required parameter 'positions' is set
      if (positions == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addCompetitionTeamPlayers",
      new ApiException(400, "Missing the required parameter 'positions' when calling addCompetitionTeamPlayers"));
      }
  
      // verify the required parameter 'jerseryNums' is set
      if (jerseryNums == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'jerseryNums' when calling addCompetitionTeamPlayers",
      new ApiException(400, "Missing the required parameter 'jerseryNums' when calling addCompetitionTeamPlayers"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/players".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "playerIds", playerIds));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "positions", positions));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "jerseryNums", jerseryNums));

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
   * 新增赛事参赛队球员
   * 新增赛事参赛队球员
   * @param key key   * @param competitionId 赛事的Id   * @param teamId 队伍Id   * @param competitionTeamId 赛事参赛队的Id   * @param playerIds 球员id example:1,2,13,14    * @param positions 球员报名位置 example:前锋,前锋,中场,门将    * @param jerseryNums 球员球衣号码 example:10,9,8,7 
  */
  public void addCompetitionTeamPlayers (String key, Long competitionId, Long teamId, Long competitionTeamId, String playerIds, String positions, String jerseryNums, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetitionTeamPlayers",
         new ApiException(400, "Missing the required parameter 'key' when calling addCompetitionTeamPlayers"));
    }
    
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addCompetitionTeamPlayers",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addCompetitionTeamPlayers"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addCompetitionTeamPlayers",
         new ApiException(400, "Missing the required parameter 'teamId' when calling addCompetitionTeamPlayers"));
    }
    
    // verify the required parameter 'competitionTeamId' is set
    if (competitionTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamPlayers",
         new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamPlayers"));
    }
    
    // verify the required parameter 'playerIds' is set
    if (playerIds == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'playerIds' when calling addCompetitionTeamPlayers",
         new ApiException(400, "Missing the required parameter 'playerIds' when calling addCompetitionTeamPlayers"));
    }
    
    // verify the required parameter 'positions' is set
    if (positions == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addCompetitionTeamPlayers",
         new ApiException(400, "Missing the required parameter 'positions' when calling addCompetitionTeamPlayers"));
    }
    
    // verify the required parameter 'jerseryNums' is set
    if (jerseryNums == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'jerseryNums' when calling addCompetitionTeamPlayers",
         new ApiException(400, "Missing the required parameter 'jerseryNums' when calling addCompetitionTeamPlayers"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/players".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "playerIds", playerIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "positions", positions));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "jerseryNums", jerseryNums));

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
  * 新增赛事参赛队职员
  * 新增赛事参赛队职员
   * @param key key
   * @param competitionId 赛事的Id
   * @param teamId 队伍Id
   * @param competitionTeamId 赛事参赛队的Id
   * @param staffIds 职员id example:1,2 
   * @param positions 职员位置 example:领队,队医 
   * @return void
  */
  public void addCompetitionTeamStaffs (String key, Long competitionId, Long teamId, Long competitionTeamId, String staffIds, String positions) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'key' is set
      if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetitionTeamStaffs",
      new ApiException(400, "Missing the required parameter 'key' when calling addCompetitionTeamStaffs"));
      }
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addCompetitionTeamStaffs",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addCompetitionTeamStaffs"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addCompetitionTeamStaffs",
      new ApiException(400, "Missing the required parameter 'teamId' when calling addCompetitionTeamStaffs"));
      }
  
      // verify the required parameter 'competitionTeamId' is set
      if (competitionTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamStaffs",
      new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamStaffs"));
      }
  
      // verify the required parameter 'staffIds' is set
      if (staffIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'staffIds' when calling addCompetitionTeamStaffs",
      new ApiException(400, "Missing the required parameter 'staffIds' when calling addCompetitionTeamStaffs"));
      }
  
      // verify the required parameter 'positions' is set
      if (positions == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addCompetitionTeamStaffs",
      new ApiException(400, "Missing the required parameter 'positions' when calling addCompetitionTeamStaffs"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/staffs".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "staffIds", staffIds));
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
   * 新增赛事参赛队职员
   * 新增赛事参赛队职员
   * @param key key   * @param competitionId 赛事的Id   * @param teamId 队伍Id   * @param competitionTeamId 赛事参赛队的Id   * @param staffIds 职员id example:1,2    * @param positions 职员位置 example:领队,队医 
  */
  public void addCompetitionTeamStaffs (String key, Long competitionId, Long teamId, Long competitionTeamId, String staffIds, String positions, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling addCompetitionTeamStaffs",
         new ApiException(400, "Missing the required parameter 'key' when calling addCompetitionTeamStaffs"));
    }
    
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addCompetitionTeamStaffs",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addCompetitionTeamStaffs"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addCompetitionTeamStaffs",
         new ApiException(400, "Missing the required parameter 'teamId' when calling addCompetitionTeamStaffs"));
    }
    
    // verify the required parameter 'competitionTeamId' is set
    if (competitionTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamStaffs",
         new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addCompetitionTeamStaffs"));
    }
    
    // verify the required parameter 'staffIds' is set
    if (staffIds == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'staffIds' when calling addCompetitionTeamStaffs",
         new ApiException(400, "Missing the required parameter 'staffIds' when calling addCompetitionTeamStaffs"));
    }
    
    // verify the required parameter 'positions' is set
    if (positions == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'positions' when calling addCompetitionTeamStaffs",
         new ApiException(400, "Missing the required parameter 'positions' when calling addCompetitionTeamStaffs"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/staffs".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "staffIds", staffIds));
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
  * 获得参赛球队的详细信息,包括教练、球员、工作人员信息
  * 获得球队信息
   * @param competitionId 赛事的Id
   * @param teamId 队伍Id
   * @return CompetitionTeam
  */
  public CompetitionTeam getCompetitionTeam (Long competitionId, Long teamId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getCompetitionTeam",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling getCompetitionTeam"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling getCompetitionTeam",
      new ApiException(400, "Missing the required parameter 'teamId' when calling getCompetitionTeam"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString()));

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
           return (CompetitionTeam) ApiInvoker.deserialize(localVarResponse, "", CompetitionTeam.class);
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
   * 获得参赛球队的详细信息,包括教练、球员、工作人员信息
   * 获得球队信息
   * @param competitionId 赛事的Id   * @param teamId 队伍Id
  */
  public void getCompetitionTeam (Long competitionId, Long teamId, final Response.Listener<CompetitionTeam> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getCompetitionTeam",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling getCompetitionTeam"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling getCompetitionTeam",
         new ApiException(400, "Missing the required parameter 'teamId' when calling getCompetitionTeam"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString()));

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
              responseListener.onResponse((CompetitionTeam) ApiInvoker.deserialize(localVarResponse,  "", CompetitionTeam.class));
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
  * 查询一只球队对应的赛事球队（1-n）
  * 查询一只球队对应的赛事球队（1-n）
   * @param teamId 队伍Id
   * @param setupDate 大名单公布时间
   * @return List<CompetitionTeam>
  */
  public List<CompetitionTeam> getCompetitionTeams (Long teamId, String setupDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling getCompetitionTeams",
      new ApiException(400, "Missing the required parameter 'teamId' when calling getCompetitionTeams"));
      }
  

  // create path and map variables
  String path = "/games/teams/{teamId}/competitionTeam".replaceAll("\\{format\\}","json").replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "setupDate", setupDate));


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
           return (List<CompetitionTeam>) ApiInvoker.deserialize(localVarResponse, "array", CompetitionTeam.class);
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
   * 查询一只球队对应的赛事球队（1-n）
   * 查询一只球队对应的赛事球队（1-n）
   * @param teamId 队伍Id   * @param setupDate 大名单公布时间
  */
  public void getCompetitionTeams (Long teamId, String setupDate, final Response.Listener<List<CompetitionTeam>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling getCompetitionTeams",
         new ApiException(400, "Missing the required parameter 'teamId' when calling getCompetitionTeams"));
    }
    

    // create path and map variables
    String path = "/games/teams/{teamId}/competitionTeam".replaceAll("\\{format\\}","json").replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "setupDate", setupDate));


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
              responseListener.onResponse((List<CompetitionTeam>) ApiInvoker.deserialize(localVarResponse,  "array", CompetitionTeam.class));
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
