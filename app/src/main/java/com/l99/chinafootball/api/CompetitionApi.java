package com.l99.chinafootball.api;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.l99.chinafootball.bean.CompetitionBean;
import com.l99.chinafootball.getDataListener;
import com.l99.chinafootball.utils.LogUtil;
import com.l99.chinafootball.utils.Url;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by lifeix-101 on 2016/6/27.
 */
public class CompetitionApi {

    private String url =  Url.BASE_URL+"/games/competitionCategory";

    private Context context;

    private CompetitionBean competitionBean ;

    public CompetitionApi(Context context) {
        this.context = context;
    }

    public void getCompetition(String key,long id , final getDataListener listener) {
//      http://192.168.50.154:8000/football/games/competitionCategory/8089916318445/lastestCompetition?key=visitor
        url = url + "/"+id+"/lastestCompetition"+"?key="+key;
        LogUtil.e(url);
        listener.onLoading();
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        competitionBean = processCompetition(response);
                        listener.onSuccess(competitionBean);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", error.getMessage(), error);
                        listener.onError();
                    }
                });

        mQueue.add(stringRequest);

    }

    private CompetitionBean processCompetition(String json) {

        CompetitionBean competitionBean  = new CompetitionBean();
        ArrayList<CompetitionBean.MatchesBean> matchesBeans = new ArrayList<>();

        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject competitionCategory = jsonObject.optJSONObject("competitionCategory");
            String competitionCategory_flag = competitionCategory.optString("flag");
            String competitionCategory_host = competitionCategory.optString("host");
            int competitionCategory_id = competitionCategory.optInt("id");
            String competitionCategory_name = competitionCategory.optString("name");
            String competitionCategory_rule = competitionCategory.optString("rule");
            int competitionCategory_scheduleType = competitionCategory.optInt("scheduleType");
            int competitionCategory_teamType = competitionCategory.optInt("teamType");

            CompetitionBean.CompetitionCategoryBean competitionCategoryBean = new CompetitionBean.CompetitionCategoryBean();
            competitionCategoryBean.setFlag(competitionCategory_flag);
            competitionCategoryBean.setHost(competitionCategory_host);
            competitionCategoryBean.setId(competitionCategory_id);
            competitionCategoryBean.setName(competitionCategory_name);
            competitionCategoryBean.setRule(competitionCategory_rule);
            competitionCategoryBean.setScheduleType(competitionCategory_scheduleType);
            competitionCategoryBean.setTeamType(competitionCategory_teamType);
            competitionBean.setCompetitionCategory(competitionCategoryBean);


            long endDate = jsonObject.optLong("endDate");
            competitionBean.setEndDate(endDate);
            int id = jsonObject.optInt("id");
            competitionBean.setId(id);

            JSONArray matches_array = jsonObject.optJSONArray("matches");

            for(int i = 0; i < matches_array.length(); i++) {
               JSONObject match = (JSONObject) matches_array.get(i);
                JSONObject match_awayTeam = match.optJSONObject("awayTeam");
                int match_awayTeam_competitionId = match_awayTeam.optInt("competitionId");
                int match_awayTeam_competitionTeamId = match_awayTeam.optInt("competitionTeamId");
                int match_awayTeam_id = match_awayTeam.optInt("id");
                long match_awayTeam_setupDate = match_awayTeam.optLong("setupDate");

                JSONObject match_awayTeam_teamInfo = match_awayTeam.optJSONObject("teamInfo");
                String match_awayTeam_teamInfo_flag = match_awayTeam_teamInfo.optString("flag");
                int match_awayTeam_teamInfo_id = match_awayTeam_teamInfo.optInt("id");
                String match_awayTeam_teamInfo_name = match_awayTeam_teamInfo.optString("name");

                JSONObject match_awayTeam_teamInfo_teamCategory = match_awayTeam_teamInfo.optJSONObject("teamCategory");
                long match_awayTeam_teamInfo_teamCategory_fId = match_awayTeam_teamInfo_teamCategory.optLong("fId");
                long match_awayTeam_teamInfo_teamCategory_id = match_awayTeam_teamInfo_teamCategory.optLong("id");
                int match_awayTeam_teamInfo_teamCategory_isLeaf = match_awayTeam_teamInfo_teamCategory.optInt("isLeaf");
                String match_awayTeam_teamInfo_teamCategory_name = match_awayTeam_teamInfo_teamCategory.optString("name");


                CompetitionBean.MatchesBean.AwayTeamBean.TeamInfoBean.TeamCategoryBean teamCategoryBean = new CompetitionBean.MatchesBean.AwayTeamBean.TeamInfoBean.TeamCategoryBean();
                teamCategoryBean.setFId(match_awayTeam_teamInfo_teamCategory_fId);
                teamCategoryBean.setId(match_awayTeam_teamInfo_teamCategory_id);
                teamCategoryBean.setIsLeaf(match_awayTeam_teamInfo_teamCategory_isLeaf);
                teamCategoryBean.setName(match_awayTeam_teamInfo_teamCategory_name);


                CompetitionBean.MatchesBean.AwayTeamBean.TeamInfoBean teamInfoBean = new CompetitionBean.MatchesBean.AwayTeamBean.TeamInfoBean();
                teamInfoBean.setFlag(match_awayTeam_teamInfo_flag);
                teamInfoBean.setId(match_awayTeam_teamInfo_id);
                teamInfoBean.setName(match_awayTeam_teamInfo_name);
                teamInfoBean.setTeamCategory(teamCategoryBean);

                CompetitionBean.MatchesBean.AwayTeamBean awayTeamBean = new CompetitionBean.MatchesBean.AwayTeamBean();
                awayTeamBean.setCompetitionId(match_awayTeam_competitionId);
                awayTeamBean.setCompetitionTeamId(match_awayTeam_competitionTeamId);
                awayTeamBean.setId(match_awayTeam_id);
                awayTeamBean.setSetupDate(match_awayTeam_setupDate);
                awayTeamBean.setTeamInfo(teamInfoBean);


                JSONObject match_competitionInfo = match.optJSONObject("competitionInfo");
                long match_competitionInfo_endDate = match_competitionInfo.optLong("endDate");
                String match_competitionInfo_id = match_competitionInfo.optString("id");
                String match_competitionInfo_name = match_competitionInfo.optString("name");
                long match_competitionInfo_startDate = match_competitionInfo.optLong("startDate");

                CompetitionBean.MatchesBean.CompetitionInfoBean competitionInfoBean = new CompetitionBean.MatchesBean.CompetitionInfoBean();
                competitionInfoBean.setEndDate(match_competitionInfo_endDate);
                competitionInfoBean.setId(match_competitionInfo_id);
                competitionInfoBean.setName(match_competitionInfo_name);
                competitionInfoBean.setStartDate(match_competitionInfo_startDate);

                JSONObject match_court = match.optJSONObject("court");
                CompetitionBean.MatchesBean.CourtBean courtBean = new CompetitionBean.MatchesBean.CourtBean();
                if(match_court != null) {
                    long match_court_buildTime = match_court.optLong("buildTime");
                    int match_court_capacity = match_court.optInt("capacity");
                    String match_court_country = match_court.optString("country");
                    int match_court_id = match_court.optInt("id");
                    String match_court_images = match_court.optString("images");
                    String match_court_name = match_court.optString("name");
                    String match_court_position = match_court.optString("position");

                    courtBean.setBuildTime(match_court_buildTime);
                    courtBean.setCapacity(match_court_capacity);
                    courtBean.setCountry(match_court_country);
                    courtBean.setId(match_court_id);
                    courtBean.setImages(match_court_images);
                    courtBean.setName(match_court_name);
                    courtBean.setPosition(match_court_position);
                }

                String match_group = match.optString("group");

                JSONObject match_hostTeam = match.optJSONObject("hostTeam");
                int match_hostTeam_competitionId = match_hostTeam.optInt("competitionId");
                int match_hostTeam_competitionTeamId = match_hostTeam.optInt("competitionTeamId");
                int match_hostTeam_id = match_hostTeam.optInt("id");
                long match_hostTeam_setupDate = match_competitionInfo.optLong("setupDate");

                JSONObject match_hostTeam_teamInfo = match_hostTeam.optJSONObject("teamInfo");
                String match_hostTeam_teamInfo_flag = match_hostTeam_teamInfo.optString("flag");
                int match_hostTeam_teamInfo_id = match_hostTeam_teamInfo.optInt("id");
                String match_hostTeam_teamInfo_name = match_hostTeam_teamInfo.optString("name");

                JSONObject match_hostTeam_teamInfo_teamCategory = match_hostTeam_teamInfo.optJSONObject("teamCategory");
                long match_hostTeam_teamInfo_teamCategory_fId = match_hostTeam_teamInfo_teamCategory.optLong("fId");
                long match_hostTeam_teamInfo_teamCategory_id = match_hostTeam_teamInfo_teamCategory.optLong("id");
                int match_hostTeam_teamInfo_teamCategory_isLeaf = match_hostTeam_teamInfo_teamCategory.optInt("isLeaf");
                String match_hostTeam_teamInfo_teamCategory_name = match_hostTeam_teamInfo_teamCategory.optString("name");

                CompetitionBean.MatchesBean.HostTeamBean.TeamInfoBean.TeamCategoryBean teamCategoryBean1 = new CompetitionBean.MatchesBean.HostTeamBean.TeamInfoBean.TeamCategoryBean();
                teamCategoryBean1.setFId(match_hostTeam_teamInfo_teamCategory_fId);
                teamCategoryBean1.setId(match_hostTeam_teamInfo_teamCategory_id);
                teamCategoryBean1.setIsLeaf(match_hostTeam_teamInfo_teamCategory_isLeaf);
                teamCategoryBean1.setName(match_hostTeam_teamInfo_teamCategory_name);

                CompetitionBean.MatchesBean.HostTeamBean.TeamInfoBean teamInfoBean1 = new CompetitionBean.MatchesBean.HostTeamBean.TeamInfoBean();
                teamInfoBean1.setFlag(match_hostTeam_teamInfo_flag);
                teamInfoBean1.setId(match_hostTeam_teamInfo_id);
                teamInfoBean1.setName(match_hostTeam_teamInfo_name);
                teamInfoBean1.setTeamCategory(teamCategoryBean1);

                CompetitionBean.MatchesBean.HostTeamBean hostTeamBean = new CompetitionBean.MatchesBean.HostTeamBean();
                hostTeamBean.setCompetitionId(match_hostTeam_competitionId);
                hostTeamBean.setCompetitionTeamId(match_hostTeam_competitionTeamId);
                hostTeamBean.setId(match_hostTeam_id);
                hostTeamBean.setSetupDate(match_hostTeam_setupDate);
                hostTeamBean.setTeamInfo(teamInfoBean1);

                String match_id = match.optString("id");
                String match_position = match.optString("position");
                String match_stage = match.optString("stage");
                long match_startDate = match.optLong("startDate");
                long match_startTime = match.optLong("startTime");

                CompetitionBean.MatchesBean matchesBean = new CompetitionBean.MatchesBean();
                matchesBean.setAwayTeam(awayTeamBean);
                matchesBean.setCompetitionInfo(competitionInfoBean);
                matchesBean.setCourt(courtBean);
                matchesBean.setGroup(match_group);
                matchesBean.setHostTeam(hostTeamBean);
                matchesBean.setId(match_id);
                matchesBean.setPosition(match_position);
                matchesBean.setStage(match_stage);
                matchesBean.setStartDate(match_startDate);
                matchesBean.setStartTime(match_startTime);

                matchesBeans.add(matchesBean);

            }

            competitionBean.setMatches(matchesBeans);
            String name = jsonObject.optString("name");
            competitionBean.setName(name);
            long startDate = jsonObject.optLong("startDate");
            competitionBean.setStartDate(startDate);

            JSONArray teams_array = jsonObject.optJSONArray("teams");
            ArrayList<CompetitionBean.TeamsBean> teamsBeans = new ArrayList<>();
            for(int i = 0; i < teams_array.length(); i++) {

                JSONObject team = (JSONObject) teams_array.get(i);
                String team_group = team.optString("group");
                int team_id = team.optInt("id");
                String team_introduce = team.optString("introduce");
                String team_name = team.optString("name");
                long team_setupDate = team.optLong("setupDate");

                JSONObject team_teamInfo = team.optJSONObject("teamInfo");
                String team_teamInfo_flag = team_teamInfo.optString("flag");
                int team_teamInfo_id = team_teamInfo.optInt("id");
                String team_teamInfo_name = team_teamInfo.optString("name");

                JSONObject team_teamInfo_teamCategory = team_teamInfo.optJSONObject("teamCategory");
                long team_teamInfo_teamCategory_fId = team_teamInfo_teamCategory.optLong("fId");
                long team_teamInfo_teamCategory_id = team_teamInfo_teamCategory.optLong("id");
                int team_teamInfo_teamCategory_isLeaf = team_teamInfo_teamCategory.optInt("isLeaf");
                String team_teamInfo_teamCategory_name = team_teamInfo_teamCategory.optString("name");

                CompetitionBean.TeamsBean.TeamInfoBean.TeamCategoryBean teamCategoryBean = new CompetitionBean.TeamsBean.TeamInfoBean.TeamCategoryBean();
                teamCategoryBean.setFId(team_teamInfo_teamCategory_fId);
                teamCategoryBean.setId(team_teamInfo_teamCategory_id);
                teamCategoryBean.setIsLeaf(team_teamInfo_teamCategory_isLeaf);
                teamCategoryBean.setName(team_teamInfo_teamCategory_name);

                CompetitionBean.TeamsBean.TeamInfoBean teamInfoBean = new CompetitionBean.TeamsBean.TeamInfoBean();
                teamInfoBean.setFlag(team_teamInfo_flag);
                teamInfoBean.setId(team_teamInfo_id);
                teamInfoBean.setName(team_teamInfo_name);
                teamInfoBean.setTeamCategory(teamCategoryBean);

                CompetitionBean.TeamsBean teamsBean = new CompetitionBean.TeamsBean();
                teamsBean.setGroup(team_group);
                teamsBean.setId(team_id);
                teamsBean.setIntroduce(team_introduce);
                teamsBean.setName(team_name);
                teamsBean.setSetupDate(team_setupDate);
                teamsBean.setTeamInfo(teamInfoBean);

                teamsBeans.add(teamsBean);

            }

            competitionBean.setTeams(teamsBeans);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return competitionBean;
    }
}
