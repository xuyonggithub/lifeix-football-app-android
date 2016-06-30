package com.l99.chinafootball.api;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.l99.chinafootball.bean.NationalPlayerBean;
import com.l99.chinafootball.getDataListener;
import com.l99.chinafootball.utils.LogUtil;
import com.l99.chinafootball.utils.Url;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by lifeix-101 on 2016/6/28.
 */
public class PlayerApi {

    private String url =  Url.BASE_URL+"/games/players/national";

    private Context context;

    private ArrayList<NationalPlayerBean> nationalPlayerBeans;

    public PlayerApi(Context context) {
        this.context = context;
    }

    public void getNationalPlayer(String key ,final getDataListener listener){

    // http://192.168.50.154:8000/football/games/players/national?key=visitor

        listener.onLoading();
        url = url +"?key="+key;
        LogUtil.e(url);
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        nationalPlayerBeans = new ArrayList<>();
                        nationalPlayerBeans = processNationalPlayer(response);
                        listener.onSuccess(nationalPlayerBeans);
                        LogUtil.e(nationalPlayerBeans.size()+"");
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

    private ArrayList<NationalPlayerBean> processNationalPlayer(String json) {
        nationalPlayerBeans = new ArrayList<>();
        ArrayList<NationalPlayerBean.CategoryBean.PlayersBean> playersBeans = new ArrayList<>();
        ArrayList<NationalPlayerBean.CategoryBean> categoryBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);

            for(int i = 0; i < jsonArray.length(); i++) {
               JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String topName = jsonObject.optString("topName");

                JSONArray category = jsonObject.optJSONArray("category");
                for(int j = 0; j < category.length(); j++) {
                    JSONObject jsonObject1 = (JSONObject)category.get(j);
                    String category_categoryName = jsonObject1.optString("categoryName");
                    JSONArray category_players = jsonObject1.optJSONArray("players");
                    
                    for(int z = 0; z < category_players.length(); z++) {

                        JSONObject jsonObject2 = (JSONObject)category_players.get(z);
                        String play_avatar = jsonObject2.optString("avatar");
                        long play_birthday = jsonObject2.optLong("birthday");
                        String play_birthplace = jsonObject2.optString("birthplace");
                        String play_country = jsonObject2.optString("country");
                        String play_englishName = jsonObject2.optString("englishName");
                        int play_height = jsonObject2.optInt("height");
                        String play_id = jsonObject2.optString("id");
                        String play_introduce = jsonObject2.optString("introduce");
                        int play_jeserysNum = jsonObject2.optInt("jeserysNum");
                        String play_name = jsonObject2.optString("name");
                        String play_position = jsonObject2.optString("position");
                        String play_sex = jsonObject2.optString("sex");
                        int play_weight = jsonObject2.optInt("weight");

                        NationalPlayerBean.CategoryBean.PlayersBean playersBean = new NationalPlayerBean.CategoryBean.PlayersBean();
                        playersBean.setAvatar(play_avatar);
                        playersBean.setBirthday(play_birthday);
                        playersBean.setBirthplace(play_birthplace);
                        playersBean.setCountry(play_country);
                        playersBean.setEnglishName(play_englishName);
                        playersBean.setHeight(play_height);
                        playersBean.setId(play_id);
                        playersBean.setIntroduce(play_introduce);
                        playersBean.setJeserysNum(play_jeserysNum);
                        playersBean.setName(play_name);
                        playersBean.setPosition(play_position);
                        playersBean.setSex(play_sex);
                        playersBean.setWeight(play_weight);

                        playersBeans.add(playersBean);

                    }

                    NationalPlayerBean.CategoryBean categoryBean = new NationalPlayerBean.CategoryBean();
                    categoryBean.setCategoryName(category_categoryName);
                    categoryBean.setPlayers(playersBeans);
                    categoryBeans.add(categoryBean);

                }

                NationalPlayerBean nationalPlayerBean = new NationalPlayerBean();
                nationalPlayerBean.setTopName(topName);
                nationalPlayerBean.setCategory(categoryBeans);

                nationalPlayerBeans.add(nationalPlayerBean);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return nationalPlayerBeans;
    }
}
