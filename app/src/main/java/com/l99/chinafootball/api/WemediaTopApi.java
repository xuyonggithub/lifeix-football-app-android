package com.l99.chinafootball.api;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.l99.chinafootball.getDataListener;
import com.l99.chinafootball.utils.LogUtil;
import com.l99.chinafootball.utils.Url;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by lifeix-101 on 2016/6/30.
 */
public class WemediaTopApi {

    private String url =  Url.BASE_URL+"/wemedia/tops";

    private Context context;

    public WemediaTopApi(Context context) {
        this.context = context;
    }

    public void getTopPosts(String key ,long categoryIds ,final getDataListener listener) {
//  //http://192.168.50.154:8000/football/wemedia/tops?key=visitor&categoryIds=8089916318445

        //http://192.168.:8000/football/wemedia/tops
        listener.onLoading();
        url = url +"?key="+key+"&categoryIds="+categoryIds;
        LogUtil.e(url);
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
//                        listener.onSuccess(categoryBeans);
                        processTopsPosts(response);
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

    private void processTopsPosts(String json) {
        try {
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                JSONObject author = jsonObject.optJSONObject("author");
                String author_image = author.optString("image");
                String author_name = author.optString("name");

                JSONArray categoryIds = jsonObject.optJSONArray("categoryIds");
                for(int j = 0; j < categoryIds.length(); j++) {
                  
                }

                boolean containVideo = jsonObject.optBoolean("containVideo");
                long createTime = jsonObject.optLong("createTime");
                String id = jsonObject.optString("id");
                String image = jsonObject.optString("image");

                JSONArray images = jsonObject.optJSONArray("images");
                for(int j = 0; j < images.length(); j++) {

                }

                String source = jsonObject.optString("source");
                int status = jsonObject.optInt("status");
                String title = jsonObject.optString("title");
                String url = jsonObject.optString("url");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
