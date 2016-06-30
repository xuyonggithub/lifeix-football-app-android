package com.l99.chinafootball.api;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.l99.chinafootball.bean.CompetitionTeamBean;
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
public class CompetitionTeamApi {

    private String url =  Url.BASE_URL+"/games";

    private Context context;

    private ArrayList<CompetitionTeamBean> competitionTeamBeans;

    private CompetitionTeamBean competitionTeamBean;

    public CompetitionTeamApi(Context context) {
        this.context = context;
    }

    public void getCompetitionTeam(String key,int competitionId , int teamId ,final getDataListener listener) {
//     http://192.168.50.154:8000/football/games/competitions/5/teams/1/competitionTeam?key=visitor
        url = url +"/competitions" + "/"+competitionId+"/teams/"+teamId+"/competitionTeam?key="+key;
        LogUtil.e(url);
        listener.onLoading();
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        competitionTeamBean = processCompetitionTeam(response);
                        listener.onSuccess(competitionTeamBean);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError();
                    }
                });

        mQueue.add(stringRequest);

    }

    private CompetitionTeamBean processCompetitionTeam(String json) {
        CompetitionTeamBean competitionTeamBean = new CompetitionTeamBean();

        try {
            JSONObject jsonObject = new JSONObject(json);
            competitionTeamBean = parseJsonObject(jsonObject);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return competitionTeamBean;
    }

    private CompetitionTeamBean parseJsonObject(JSONObject jsonObject) {

        ArrayList<CompetitionTeamBean.AssistantCoachBean> assistantCoachBeans = new ArrayList<>();
        ArrayList<CompetitionTeamBean.PlayersBean> playersBeans = new ArrayList<>();
        ArrayList<CompetitionTeamBean.PlayersBean.RecordBean> recordBeans = new ArrayList<>();

        try {
            JSONArray assistantCoach_array = jsonObject.optJSONArray("assistantCoach");
            for(int i = 0; i < assistantCoach_array.length(); i++) {
                JSONObject assistantCoach = (JSONObject) assistantCoach_array.get(i);
                String avatar = assistantCoach.optString("avatar");
                long birthday = assistantCoach.optLong("birthday");
                String birthplace = assistantCoach.optString("birthplace");
                String country = assistantCoach.optString("country");
                int id = assistantCoach.optInt("id");
                String level = assistantCoach.optString("level");
                String name = assistantCoach.optString("name");
                String position = assistantCoach.optString("position");

                CompetitionTeamBean.AssistantCoachBean assistantCoachBean = new CompetitionTeamBean.AssistantCoachBean();
                assistantCoachBean.setAvatar(avatar);
                assistantCoachBean.setBirthday(birthday);
                assistantCoachBean.setBirthplace(birthplace);
                assistantCoachBean.setCountry(country);
                assistantCoachBean.setId(id);
                assistantCoachBean.setLevel(level);
                assistantCoachBean.setName(name);
                assistantCoachBean.setPosition(position);

                assistantCoachBeans.add(assistantCoachBean);
            }

            JSONObject chiefCoach = jsonObject.optJSONObject("chiefCoach");
            String chiefCoach_avatar = chiefCoach.optString("avatar");
            long chiefCoach_birthday = chiefCoach.optLong("birthday");
            String chiefCoach_birthplace = chiefCoach.optString("birthplace");
            String chiefCoach_country = chiefCoach.optString("country");
            int chiefCoach_id = chiefCoach.optInt("id");
            String chiefCoach_level = chiefCoach.optString("level");
            String chiefCoach_name = chiefCoach.optString("name");
            String chiefCoach_position = chiefCoach.optString("position");

            CompetitionTeamBean.ChiefCoachBean chiefCoachBean = new CompetitionTeamBean.ChiefCoachBean();
            chiefCoachBean.setAvatar(chiefCoach_avatar);
            chiefCoachBean.setBirthday(chiefCoach_birthday);
            chiefCoachBean.setBirthplace(chiefCoach_birthplace);
            chiefCoachBean.setCountry(chiefCoach_country);
            chiefCoachBean.setId(chiefCoach_id);
            chiefCoachBean.setLevel(chiefCoach_level);
            chiefCoachBean.setName(chiefCoach_name);
            chiefCoachBean.setPosition(chiefCoach_position);

            JSONObject competitionInfo = jsonObject.optJSONObject("competitionInfo");
            long competitionInfo_endDate = competitionInfo.optLong("endDate");
            String competitionInfo_id = competitionInfo.optString("id");
            String competitionInfo_name = competitionInfo.optString("name");
            long competitionInfo_startDate = competitionInfo.optLong("startDate");

            CompetitionTeamBean.CompetitionInfoBean competitionInfoBean = new CompetitionTeamBean.CompetitionInfoBean();
            competitionInfoBean.setEndDate(competitionInfo_endDate);
            competitionInfoBean.setId(competitionInfo_id);
            competitionInfoBean.setName(competitionInfo_name);
            competitionInfoBean.setStartDate(competitionInfo_startDate);


            String group = jsonObject.optString("group");
            int id = jsonObject.optInt("id");
            String introduce = jsonObject.optString("introduce");
            String name = jsonObject.optString("name");

            JSONArray players = jsonObject.optJSONArray("players");
            for(int i = 0; i < players.length(); i++) {
                JSONObject player = (JSONObject) players.get(i);
                String player_avatar = player.optString("avatar");
                long player_birthday = player.optLong("birthday");
                String player_birthplace = player.optString("birthplace");
                String player_country = player.optString("country");
                String player_englishName = player.optString("englishName");
                int player_height = player.optInt("height");
                String player_id = player.optString("id");
                String player_introduce = player.optString("introduce");
                int player_jeserysNum = player.optInt("jeserysNum");
                String player_name = player.optString("name");
                String player_position = player.optString("position");
                String player_sex = player.optString("sex");
                int player_weight = player.optInt("weight");
                JSONArray player_record = player.optJSONArray("record");
                if(player_record !=null && player_record.length() >0) {
                    for (int j=0 ; j<player_record.length();j++){
                        JSONObject record = (JSONObject) player_record.get(j);
                        int record_assists = record.optInt("assists");
                        int record_bookings = record.optInt("bookings");
                        int record_dismissals = record.optInt("dismissals");
                        int record_gamesplayed = record.optInt("gamesplayed");
                        int record_goals = record.optInt("goals");
                        int record_playerId = record.optInt("playerId");
                        int record_starts = record.optInt("starts");
                        int record_substitution = record.optInt("substitution");

                        CompetitionTeamBean.PlayersBean.RecordBean recordBean = new CompetitionTeamBean.PlayersBean.RecordBean();
                        recordBean.setAssists(record_assists);
                        recordBean.setBookings(record_bookings);
                        recordBean.setDismissals(record_dismissals);
                        recordBean.setGamesplayed(record_gamesplayed);
                        recordBean.setGoals(record_goals);
                        recordBean.setPlayerId(record_playerId);
                        recordBean.setStarts(record_starts);
                        recordBean.setSubstitution(record_substitution);
                        recordBeans.add(recordBean);
                    }
                }

                CompetitionTeamBean.PlayersBean playerBean = new CompetitionTeamBean.PlayersBean();
                playerBean.setAvatar(player_avatar);
                playerBean.setBirthday(player_birthday);
                playerBean.setBirthplace(player_birthplace);
                playerBean.setCountry(player_country);
                playerBean.setEnglishName(player_englishName);
                playerBean.setHeight(player_height);
                playerBean.setId(player_id);
                playerBean.setIntroduce(player_introduce);
                playerBean.setJeserysNum(player_jeserysNum);
                playerBean.setName(player_name);
                playerBean.setPosition(player_position);
                playerBean.setSex(player_sex);
                playerBean.setWeight(player_weight);

                playersBeans.add(playerBean);

            }

            long setupDate = jsonObject.optLong("setupDate");

            JSONObject teamInfo_obj = jsonObject.optJSONObject("teamInfo");

            String teamInfo_flag = teamInfo_obj.optString("flag");
            int teamInfo_id = teamInfo_obj.optInt("id");
            String teamInfo_name = teamInfo_obj.optString("name");
            JSONObject teamInfo_teamCategory = teamInfo_obj.optJSONObject("teamCategory");

            long teamInfo_teamCategory_fId = teamInfo_teamCategory.optLong("fId");
            long teamInfo_teamCategory_id = teamInfo_teamCategory.optLong("id");
            int teamInfo_teamCategory_isLeaf = teamInfo_teamCategory.optInt("isLeaf");
            String teamInfo_teamCategory_name = teamInfo_teamCategory.optString("name");

            CompetitionTeamBean.TeamInfoBean teamInfoBean = new CompetitionTeamBean.TeamInfoBean();
            teamInfoBean.setFlag(teamInfo_flag);
            teamInfoBean.setId(teamInfo_id);
            teamInfoBean.setName(teamInfo_name);

            CompetitionTeamBean.TeamInfoBean.TeamCategoryBean teamCategoryBean = new CompetitionTeamBean.TeamInfoBean.TeamCategoryBean();
            teamCategoryBean.setFId(teamInfo_teamCategory_fId);
            teamCategoryBean.setId(teamInfo_teamCategory_id);
            teamCategoryBean.setIsLeaf(teamInfo_teamCategory_isLeaf);
            teamCategoryBean.setName(teamInfo_teamCategory_name);

            teamInfoBean.setTeamCategory(teamCategoryBean);

            JSONObject teamLeader = jsonObject.optJSONObject("teamLeader");
            String teamLeader_avatar = teamLeader.optString("avatar");
            long teamLeader_birthday = teamLeader.optLong("birthday");
            String teamLeader_birthplace = teamLeader.optString("birthplace");
            String teamLeader_country = teamLeader.optString("country");
            int teamLeader_id = teamLeader.optInt("id");
            String teamLeader_name = teamLeader.optString("name");
            String teamLeader_position = teamLeader.optString("position");

            CompetitionTeamBean.TeamLeaderBean teamLeaderBean = new CompetitionTeamBean.TeamLeaderBean();
            teamLeaderBean.setAvatar(teamLeader_avatar);
            teamLeaderBean.setBirthday(teamLeader_birthday);
            teamLeaderBean.setBirthplace(teamLeader_birthplace);

            teamLeaderBean.setCountry(teamLeader_country);
            teamLeaderBean.setId(teamLeader_id);
            teamLeaderBean.setName(teamLeader_name);
            teamLeaderBean.setPosition(teamLeader_position);


            competitionTeamBean.setAssistantCoach(assistantCoachBeans);

            competitionTeamBean.setChiefCoach(chiefCoachBean);
            competitionTeamBean.setCompetitionInfo(competitionInfoBean);
            competitionTeamBean.setGroup(group);
            competitionTeamBean.setId(id);
            competitionTeamBean.setIntroduce(introduce);
            competitionTeamBean.setName(name);
            competitionTeamBean.setPlayers(playersBeans);
            competitionTeamBean.setSetupDate(setupDate);
            competitionTeamBean.setTeamInfo(teamInfoBean);
            competitionTeamBean.setTeamLeader(teamLeaderBean);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return competitionTeamBean;
    }


    public void getCompetitionTeams(String key, int teamId, final getDataListener listener) {
//      http://192.168.50.154:8000/football/games/teams/1/competitionTeam?key=visitor
        url = url + "/teams"+"/"+teamId+"/competitionTeam?key="+key;
        LogUtil.e(url);
        listener.onLoading();
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        competitionTeamBeans = new ArrayList<>();
                        competitionTeamBeans = processCompetitionTeams(response);
                        listener.onSuccess(competitionTeamBeans);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError();
                    }
                });

        mQueue.add(stringRequest);
    }

    private ArrayList<CompetitionTeamBean> processCompetitionTeams(String json) {
        competitionTeamBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0; i < jsonArray.length(); i++) {
               JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                CompetitionTeamBean competitionTeamBean = parseJsonObject(jsonObject);
                competitionTeamBeans.add(competitionTeamBean);
            }
        } catch (JSONException e) {

        }
        return competitionTeamBeans;
    }
}
