package com.l99.chinafootball.api;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.l99.chinafootball.bean.CoachBean;
import com.l99.chinafootball.bean.NationalCoachBean;
import com.l99.chinafootball.bean.TeamCoachBean;
import com.l99.chinafootball.getDataListener;
import com.l99.chinafootball.utils.LogUtil;
import com.l99.chinafootball.utils.Url;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by lifeix-101 on 2016/6/24.
 */
public class CoachApi {

    private String url =  Url.BASE_URL+"/games/coaches";

    public ArrayList<NationalCoachBean> nationalCoachBeans;

    private Context context;
    private CoachBean coachBean;

    private ArrayList<TeamCoachBean> teamCoachBeans;

    public CoachApi(Context context) {
        this.context = context;
        nationalCoachBeans = new ArrayList<>();
    }

    public void getCoach(String key,int coachId,final getDataListener listener) {
//        http://api.c-f.com:8000/football/games/coaches/{coachId}
        url = url +"/"+coachId+"?key="+key;
        LogUtil.e(url);
        listener.onLoading();
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        coachBean = processCoach(response);
                        listener.onSuccess(coachBean);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", error.getMessage(), error);
                    }
                });

        mQueue.add(stringRequest);
    }

    private CoachBean processCoach(String json) {
        LogUtil.e("processCoach");
        String avatar;
        long birthday;
        String birthplace;
        String career_flag;
        int career_id;
        String career_name;
        String career_position;
        long career_teamCategory_fId;
        long career_teamCategory_id;
        int career_teamCategory_isLeaf;
        String career_teamCategory_name = null;
        String country;
        int id;
        String level;
        String name;
        String team_flag ;
        int team_id ;
        String team_name ;
        String team_position ;
        long team_teamCategory_fId ;
        long team_teamCategory_id ;
        int team_teamCategory_isLeaf ;
        String team_teamCategory_name ;
        CoachBean coachBean = null;
        ArrayList<CoachBean.CareerBean> careerBeans = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(json);
            avatar = jsonObject.optString("avatar");
            birthday = jsonObject.optLong("birthday");
            birthplace = jsonObject.optString("birthplace");

            JSONArray career = jsonObject.optJSONArray("career");
            for (int i=0 ; i<career.length();i++){
                JSONObject jsonObject_career = (JSONObject) career.get(i);
                career_flag = jsonObject_career.optString("flag");
                career_id = jsonObject_career.optInt("id");
                career_name = jsonObject_career.optString("name");
                career_position = jsonObject_career.optString("position");

                JSONObject career_teamCategory = jsonObject_career.optJSONObject("teamCategory");

                career_teamCategory_fId = career_teamCategory.optLong("fId");
                career_teamCategory_id = career_teamCategory.optLong("id");
                career_teamCategory_isLeaf = career_teamCategory.optInt("isLeaf");
                career_teamCategory_name = career_teamCategory.optString("name");

                CoachBean.CareerBean careerBean = new CoachBean.CareerBean();
                careerBean.setFlag(career_flag);
                careerBean.setId(career_id);
                careerBean.setName(career_name);
                careerBean.setPosition(career_position);
                CoachBean.CareerBean.TeamCategoryBean teamCategoryBean = new CoachBean.CareerBean.TeamCategoryBean();
                teamCategoryBean.setFId(career_teamCategory_fId);
                teamCategoryBean.setId(career_teamCategory_id);
                teamCategoryBean.setIsLeaf(career_teamCategory_isLeaf);
                teamCategoryBean.setName(career_teamCategory_name);

                careerBeans.add(careerBean);

            }


            country = jsonObject.optString("country");
            id = jsonObject.optInt("id");
            level = jsonObject.optString("level");
            name = jsonObject.optString("name");
            JSONObject team = jsonObject.optJSONObject("team");

            team_flag = team.optString("flag");
            team_id = team.optInt("id");
            team_name = team.optString("name");
            team_position = team.optString("position");
            JSONObject team_teamCategory = team.optJSONObject("teamCategory");
            team_teamCategory_fId = team_teamCategory.optLong("fId");
            team_teamCategory_id = team_teamCategory.optLong("id");
            team_teamCategory_isLeaf = team_teamCategory.optInt("isLeaf");
            team_teamCategory_name = team_teamCategory.optString("name");

            CoachBean.TeamBean teamBean = new CoachBean.TeamBean();
            teamBean.setFlag(team_flag);
            teamBean.setId(team_id);
            teamBean.setName(team_name);
            teamBean.setPosition(team_position);
            CoachBean.TeamBean.TeamCategoryBean teamCategoryBean = new CoachBean.TeamBean.TeamCategoryBean();
            teamCategoryBean.setFId(team_teamCategory_fId);
            teamCategoryBean.setId(team_teamCategory_id);
            teamCategoryBean.setIsLeaf(team_teamCategory_isLeaf);
            teamCategoryBean.setName(team_teamCategory_name);

            coachBean = new CoachBean();
            coachBean.setAvatar(avatar);
            coachBean.setBirthday(birthday);
            coachBean.setBirthplace(birthplace);

            coachBean.setCareer(careerBeans);
            coachBean.setCountry(country);
            coachBean.setId(id);
            coachBean.setLevel(level);
            coachBean.setName(name);
            coachBean.setTeam(teamBean);


        } catch (JSONException e) {
            e.printStackTrace();
        }

        return coachBean;
    }


    public void getCoachByTeamCategory(String key,long teamCategoryId,final getDataListener listener) {
//        http://api.c-f.com:8000/football/games/coaches/teamcategory/{teamCategoryId}
        url = url + "/teamcategory"+"/"+teamCategoryId+"?key="+key;
        LogUtil.e(url);
        listener.onLoading();
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("TAG", response);
                        teamCoachBeans = processCoachByTeamCategory(response);
                        listener.onSuccess(teamCoachBeans);
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

    private ArrayList<TeamCoachBean> processCoachByTeamCategory(String json) {
        Log.e("TAG", "处理数据");
        ArrayList<TeamCoachBean> teamCoachBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0; i < jsonArray.length(); i++) {
              JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String avatar = jsonObject.optString("avatar");
                long birthday = jsonObject.optLong("birthday");
                String birthplace = jsonObject.optString("birthplace");
                String country = jsonObject.optString("country");
                int id = jsonObject.optInt("id");
                String level = jsonObject.optString("level");
                String name = jsonObject.optString("name");
                String position = jsonObject.optString("position");
                TeamCoachBean teamCoachBean = new TeamCoachBean();
                teamCoachBean.setAvatar(avatar);
                teamCoachBean.setBirthday(birthday);
                teamCoachBean.setBirthplace(birthplace);
                teamCoachBean.setCountry(country);
                teamCoachBean.setId(id);
                teamCoachBean.setLevel(level);
                teamCoachBean.setName(name);
                teamCoachBean.setPosition(position);

                teamCoachBeans.add(teamCoachBean);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return teamCoachBeans;
    }

    public void getNationalCoach(String key,final getDataListener listener){
//        http://api.c-f.com:8000/football/games/coaches/national

        url = url +"/national"+"?key="+key;
        LogUtil.e(url);
        listener.onLoading();
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        nationalCoachBeans = processNationCoach(response);
                        listener.onSuccess(nationalCoachBeans);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", error.getMessage(), error);
                    }
                });

        mQueue.add(stringRequest);
    }

    private ArrayList<NationalCoachBean> processNationCoach(String json) {
        String topName = null;
        String category_name;
        String coach_avater;
        String coach_birthplace;
        String coach_country;
        int coach_id;
        String coach_level;
        String coach_name;
        String coach_position = null;
        long coach_birthday;
        ArrayList<NationalCoachBean.CategoryBean> categoryBeans = new ArrayList<>();
        ArrayList<NationalCoachBean> nationalCoachBeans = new ArrayList<>();
        ArrayList<NationalCoachBean.CategoryBean.CoachesBean> coachesBeans = new ArrayList<>();
        try {

            JSONArray jsonArray = new JSONArray(json);
            for (int i=0; i<jsonArray.length();i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                topName = jsonObject.optString("topName");
                JSONArray category = jsonObject.optJSONArray("category");
                for (int j=0 ;j<category.length() ; j++){
                   JSONObject jsonObject_category= (JSONObject) category.get(j);
                    category_name = jsonObject_category.optString("categoryName");
                    JSONArray category_coaches = jsonObject_category.optJSONArray("coaches");
                    for (int z=0 ; z<category_coaches.length() ; z++){
                        JSONObject jsonObject_coach = (JSONObject) category_coaches.get(z);
                        coach_avater = jsonObject_coach.optString("avatar");
                        coach_birthday = jsonObject_coach.optLong("birthday");
                        coach_birthplace = jsonObject_coach.optString("birthplace");
                        coach_country = jsonObject_coach.optString("country");
                        coach_id = jsonObject_coach.optInt("id");
                        coach_level = jsonObject_coach.optString("level");
                        coach_name = jsonObject_coach.optString("name");
                        coach_position = jsonObject_coach.optString("position");

                        NationalCoachBean.CategoryBean.CoachesBean coachesBean = new NationalCoachBean.CategoryBean.CoachesBean();
                        coachesBean.setAvatar(coach_avater);
                        coachesBean.setBirthday(coach_birthday);
                        coachesBean.setBirthplace(coach_birthplace);
                        coachesBean.setCountry(coach_country);
                        coachesBean.setId(coach_id);
                        coachesBean.setLevel(coach_level);
                        coachesBean.setName(coach_name);
                        coachesBean.setPosition(coach_position);
                        coachesBeans.add(coachesBean);
                    }

                    NationalCoachBean.CategoryBean categoryBean = new NationalCoachBean.CategoryBean();
                    categoryBean.setCategoryName(category_name);
                    categoryBean.setCoaches(coachesBeans);
                    categoryBeans.add(categoryBean);
                }


                NationalCoachBean nationalCoachBean = new NationalCoachBean(topName, categoryBeans);
                nationalCoachBeans.add(nationalCoachBean);

            }

        } catch (JSONException e) {

        }

        return nationalCoachBeans;


    }

}
