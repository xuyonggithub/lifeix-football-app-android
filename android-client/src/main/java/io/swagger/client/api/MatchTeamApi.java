package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.MatchTeamJerseys;
import java.util.*;
import io.swagger.client.model.MatchTeamPlayer;
import io.swagger.client.model.MatchTeam;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class MatchTeamApi {
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
  * 添加参加比赛球队的球衣样式
  * 添加参加比赛球队的球衣样式
   * @param competitionId 赛事的Id
   * @param teamId 队伍Id
   * @param competitionTeamId 赛事参赛队的Id
   * @param matchTeamId 比赛球队的Id
   * @param matchTeamJerseys 参加比赛球队的球衣样式
   * @return MatchTeamJerseys
  */
  public MatchTeamJerseys addMatchTeamJerseys (Long competitionId, Long teamId, Long competitionTeamId, Long matchTeamId, MatchTeamJerseys matchTeamJerseys) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = matchTeamJerseys;
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addMatchTeamJerseys",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addMatchTeamJerseys"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addMatchTeamJerseys",
      new ApiException(400, "Missing the required parameter 'teamId' when calling addMatchTeamJerseys"));
      }
  
      // verify the required parameter 'competitionTeamId' is set
      if (competitionTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addMatchTeamJerseys",
      new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addMatchTeamJerseys"));
      }
  
      // verify the required parameter 'matchTeamId' is set
      if (matchTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'matchTeamId' when calling addMatchTeamJerseys",
      new ApiException(400, "Missing the required parameter 'matchTeamId' when calling addMatchTeamJerseys"));
      }
  
      // verify the required parameter 'matchTeamJerseys' is set
      if (matchTeamJerseys == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'matchTeamJerseys' when calling addMatchTeamJerseys",
      new ApiException(400, "Missing the required parameter 'matchTeamJerseys' when calling addMatchTeamJerseys"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}/jerseys".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString())).replaceAll("\\{" + "matchTeamId" + "\\}", apiInvoker.escapeString(matchTeamId.toString()));

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
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (MatchTeamJerseys) ApiInvoker.deserialize(localVarResponse, "", MatchTeamJerseys.class);
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
   * 添加参加比赛球队的球衣样式
   * 添加参加比赛球队的球衣样式
   * @param competitionId 赛事的Id   * @param teamId 队伍Id   * @param competitionTeamId 赛事参赛队的Id   * @param matchTeamId 比赛球队的Id   * @param matchTeamJerseys 参加比赛球队的球衣样式
  */
  public void addMatchTeamJerseys (Long competitionId, Long teamId, Long competitionTeamId, Long matchTeamId, MatchTeamJerseys matchTeamJerseys, final Response.Listener<MatchTeamJerseys> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = matchTeamJerseys;

  
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addMatchTeamJerseys",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addMatchTeamJerseys"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addMatchTeamJerseys",
         new ApiException(400, "Missing the required parameter 'teamId' when calling addMatchTeamJerseys"));
    }
    
    // verify the required parameter 'competitionTeamId' is set
    if (competitionTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addMatchTeamJerseys",
         new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addMatchTeamJerseys"));
    }
    
    // verify the required parameter 'matchTeamId' is set
    if (matchTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'matchTeamId' when calling addMatchTeamJerseys",
         new ApiException(400, "Missing the required parameter 'matchTeamId' when calling addMatchTeamJerseys"));
    }
    
    // verify the required parameter 'matchTeamJerseys' is set
    if (matchTeamJerseys == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'matchTeamJerseys' when calling addMatchTeamJerseys",
         new ApiException(400, "Missing the required parameter 'matchTeamJerseys' when calling addMatchTeamJerseys"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}/jerseys".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString())).replaceAll("\\{" + "matchTeamId" + "\\}", apiInvoker.escapeString(matchTeamId.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((MatchTeamJerseys) ApiInvoker.deserialize(localVarResponse,  "", MatchTeamJerseys.class));
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
  * 添加参加比赛的球员
  * 添加参加比赛的球员
   * @param competitionId 赛事的Id
   * @param teamId 队伍Id
   * @param competitionTeamId 赛事参赛队的Id
   * @param matchTeamId 比赛球队的Id
   * @param playerRecords 参加比赛的球员列表
   * @return void
  */
  public void addMatchTeamPlayers (Long competitionId, Long teamId, Long competitionTeamId, Long matchTeamId, List<MatchTeamPlayer> playerRecords) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = playerRecords;
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addMatchTeamPlayers",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling addMatchTeamPlayers"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addMatchTeamPlayers",
      new ApiException(400, "Missing the required parameter 'teamId' when calling addMatchTeamPlayers"));
      }
  
      // verify the required parameter 'competitionTeamId' is set
      if (competitionTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addMatchTeamPlayers",
      new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addMatchTeamPlayers"));
      }
  
      // verify the required parameter 'matchTeamId' is set
      if (matchTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'matchTeamId' when calling addMatchTeamPlayers",
      new ApiException(400, "Missing the required parameter 'matchTeamId' when calling addMatchTeamPlayers"));
      }
  
      // verify the required parameter 'playerRecords' is set
      if (playerRecords == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'playerRecords' when calling addMatchTeamPlayers",
      new ApiException(400, "Missing the required parameter 'playerRecords' when calling addMatchTeamPlayers"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}/players".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString())).replaceAll("\\{" + "matchTeamId" + "\\}", apiInvoker.escapeString(matchTeamId.toString()));

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
   * 添加参加比赛的球员
   * 添加参加比赛的球员
   * @param competitionId 赛事的Id   * @param teamId 队伍Id   * @param competitionTeamId 赛事参赛队的Id   * @param matchTeamId 比赛球队的Id   * @param playerRecords 参加比赛的球员列表
  */
  public void addMatchTeamPlayers (Long competitionId, Long teamId, Long competitionTeamId, Long matchTeamId, List<MatchTeamPlayer> playerRecords, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = playerRecords;

  
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling addMatchTeamPlayers",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling addMatchTeamPlayers"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling addMatchTeamPlayers",
         new ApiException(400, "Missing the required parameter 'teamId' when calling addMatchTeamPlayers"));
    }
    
    // verify the required parameter 'competitionTeamId' is set
    if (competitionTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling addMatchTeamPlayers",
         new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling addMatchTeamPlayers"));
    }
    
    // verify the required parameter 'matchTeamId' is set
    if (matchTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'matchTeamId' when calling addMatchTeamPlayers",
         new ApiException(400, "Missing the required parameter 'matchTeamId' when calling addMatchTeamPlayers"));
    }
    
    // verify the required parameter 'playerRecords' is set
    if (playerRecords == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'playerRecords' when calling addMatchTeamPlayers",
         new ApiException(400, "Missing the required parameter 'playerRecords' when calling addMatchTeamPlayers"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}/players".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString())).replaceAll("\\{" + "matchTeamId" + "\\}", apiInvoker.escapeString(matchTeamId.toString()));

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
  * 获得比赛球队的详细信息,包括教练、球员(首发、替补)、工作人员信息、球衣
  * 获得比赛球队的详细信息,包括教练、球员(首发、替补)、工作人员信息、球衣
   * @param competitionId 赛事的Id
   * @param teamId 队伍Id
   * @param competitionTeamId 赛事参赛队的Id
   * @param matchTeamId 比赛球队的Id
   * @return MatchTeam
  */
  public MatchTeam getMatchTeam (Long competitionId, Long teamId, Long competitionTeamId, Long matchTeamId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'competitionId' is set
      if (competitionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getMatchTeam",
      new ApiException(400, "Missing the required parameter 'competitionId' when calling getMatchTeam"));
      }
  
      // verify the required parameter 'teamId' is set
      if (teamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling getMatchTeam",
      new ApiException(400, "Missing the required parameter 'teamId' when calling getMatchTeam"));
      }
  
      // verify the required parameter 'competitionTeamId' is set
      if (competitionTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling getMatchTeam",
      new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling getMatchTeam"));
      }
  
      // verify the required parameter 'matchTeamId' is set
      if (matchTeamId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'matchTeamId' when calling getMatchTeam",
      new ApiException(400, "Missing the required parameter 'matchTeamId' when calling getMatchTeam"));
      }
  

  // create path and map variables
  String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString())).replaceAll("\\{" + "matchTeamId" + "\\}", apiInvoker.escapeString(matchTeamId.toString()));

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
           return (MatchTeam) ApiInvoker.deserialize(localVarResponse, "", MatchTeam.class);
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
   * 获得比赛球队的详细信息,包括教练、球员(首发、替补)、工作人员信息、球衣
   * 获得比赛球队的详细信息,包括教练、球员(首发、替补)、工作人员信息、球衣
   * @param competitionId 赛事的Id   * @param teamId 队伍Id   * @param competitionTeamId 赛事参赛队的Id   * @param matchTeamId 比赛球队的Id
  */
  public void getMatchTeam (Long competitionId, Long teamId, Long competitionTeamId, Long matchTeamId, final Response.Listener<MatchTeam> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'competitionId' is set
    if (competitionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionId' when calling getMatchTeam",
         new ApiException(400, "Missing the required parameter 'competitionId' when calling getMatchTeam"));
    }
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'teamId' when calling getMatchTeam",
         new ApiException(400, "Missing the required parameter 'teamId' when calling getMatchTeam"));
    }
    
    // verify the required parameter 'competitionTeamId' is set
    if (competitionTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'competitionTeamId' when calling getMatchTeam",
         new ApiException(400, "Missing the required parameter 'competitionTeamId' when calling getMatchTeam"));
    }
    
    // verify the required parameter 'matchTeamId' is set
    if (matchTeamId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'matchTeamId' when calling getMatchTeam",
         new ApiException(400, "Missing the required parameter 'matchTeamId' when calling getMatchTeam"));
    }
    

    // create path and map variables
    String path = "/games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "competitionId" + "\\}", apiInvoker.escapeString(competitionId.toString())).replaceAll("\\{" + "teamId" + "\\}", apiInvoker.escapeString(teamId.toString())).replaceAll("\\{" + "competitionTeamId" + "\\}", apiInvoker.escapeString(competitionTeamId.toString())).replaceAll("\\{" + "matchTeamId" + "\\}", apiInvoker.escapeString(matchTeamId.toString()));

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
              responseListener.onResponse((MatchTeam) ApiInvoker.deserialize(localVarResponse,  "", MatchTeam.class));
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
