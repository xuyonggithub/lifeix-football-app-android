package com.l99.chinafootball.api;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.l99.chinafootball.bean.CompetitionCategoryBean;
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
public class CompetitionCategoryApi {

    private String url =  Url.BASE_URL+"/games/competitionCategory";

    private Context context;

    private ArrayList<CompetitionCategoryBean> competitionCategoryBeans;

    public CompetitionCategoryApi(String url) {
        this.url = url;
    }

    public CompetitionCategoryApi(Context context) {
        this.context = context;
    }

    public void getCompetitionCategories(String key, final getDataListener lisener) {
//      http://192.168.50.154:8000/football/games/competitionCategory?key=visitor

        url = url +"?key="+key;
        LogUtil.e(url);
        lisener.onLoading();
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        competitionCategoryBeans = new ArrayList<>();
                        competitionCategoryBeans = processCompetitionCategories(response);
                        lisener.onSuccess(competitionCategoryBeans);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        lisener.onError();
                    }
                });

        mQueue.add(stringRequest);

    }

    private ArrayList<CompetitionCategoryBean> processCompetitionCategories(String json) {
        competitionCategoryBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);
            for (int i=0; i < jsonArray.length() ; i++) {
              JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String flag = jsonObject.getString("flag");
                long id = jsonObject.getLong("id");
                String name = jsonObject.getString("name");
                int scheduleType = jsonObject.optInt("scheduleType");
                int teamType = jsonObject.optInt("teamType");

                CompetitionCategoryBean competitionCategoryBean = new CompetitionCategoryBean();
                competitionCategoryBean.setFlag(flag);
                competitionCategoryBean.setId(id);
                competitionCategoryBean.setName(name);
                competitionCategoryBean.setScheduleType(scheduleType);
                competitionCategoryBean.setTeamType(teamType);

                competitionCategoryBeans.add(competitionCategoryBean);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return competitionCategoryBeans;
    }

}
