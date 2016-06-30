package com.l99.chinafootball.api;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.l99.chinafootball.bean.MenuBean;
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
public class MenuApi {


    private String url =  Url.BASE_URL+"/category/menus";

    private Context context;

    private ArrayList<MenuBean> menuBeans;

    public MenuApi(Context context) {
        this.context = context;
    }

    public void getMenuList(String key,String platform,final getDataListener listener){
        //http://192.168.50.154:8000/football/category/menus/app?key=visitor
        url = url +"/"+platform+"?key="+key;
        LogUtil.e(url);
        listener.onLoading();
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        menuBeans = new ArrayList<>();
                        menuBeans = processMenuList(response);
                        listener.onSuccess(menuBeans);
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

    private ArrayList<MenuBean> processMenuList(String json) {
        menuBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0; i < jsonArray.length(); i++) {
              JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String iconUrl = jsonObject.optString("iconUrl");
                String id = jsonObject.optString("id");
                String name = jsonObject.optString("name");
                String page = jsonObject.optString("page");

                MenuBean menuBean = new MenuBean();
                menuBean.setIconUrl(iconUrl);
                menuBean.setId(id);
                menuBean.setName(name);
                menuBean.setPage(page);
                menuBeans.add(menuBean);

            }

        } catch (JSONException e) {

        }

        return menuBeans;
    }
}
