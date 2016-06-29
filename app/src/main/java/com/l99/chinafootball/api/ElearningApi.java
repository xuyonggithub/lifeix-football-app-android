package com.l99.testokhttp.api;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.l99.testokhttp.LogUtil;
import com.l99.testokhttp.Url;
import com.l99.testokhttp.bean.ElearningQuizCategoriesTreeBean;
import com.l99.testokhttp.bean.ElearningQuizPageListBean;
import com.l99.testokhttp.bean.ElearningTrainingCategoriesTreeBean;
import com.l99.testokhttp.bean.ElearningTrainingPageListBean;
import com.l99.testokhttp.bean.ElearningTrainingSubCategoriesBean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by lifeix-101 on 2016/6/27.
 */
public class ElearningApi {

    private String url =  Url.BASE_URL+"/elearning";

    private Context context;

    private ArrayList<ElearningQuizCategoriesTreeBean> elearningQuizCategoriesTreeBeans;

    private ArrayList<ElearningTrainingCategoriesTreeBean> elearningTrainingCategoriesTreeBeans;
    private ArrayList<ElearningQuizPageListBean> elearningQuizPageListBeans;
    private ArrayList<ElearningTrainingPageListBean> elearningTrainingPageListBeans;
    private ArrayList<ElearningTrainingSubCategoriesBean> elearningTrainingSubCategoriesBeans;

    public ElearningApi(Context context) {
        this.context = context;
    }

    public ArrayList<ElearningQuizCategoriesTreeBean> getElearningQuizCategoriesTree(String key) {
//     http://192.168.50.154:8000/football/elearning/quiz_categories?key=visitor
        url = url +"/quiz_categories"+"?key="+key;
        LogUtil.e(url);
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        elearningQuizCategoriesTreeBeans = new ArrayList<>();
                        elearningQuizCategoriesTreeBeans = processElearningQuizCategoriesTree(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        mQueue.add(stringRequest);
        return elearningQuizCategoriesTreeBeans;

    }

    private ArrayList<ElearningQuizCategoriesTreeBean> processElearningQuizCategoriesTree(String json) {
        ArrayList<ElearningQuizCategoriesTreeBean.CatBean> catBeans = null;
        elearningQuizCategoriesTreeBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0; i < jsonArray.length(); i++) {

               JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String id = jsonObject.optString("id");
                String image = jsonObject.optString("image");
                String name = jsonObject.optString("name");
                String text = jsonObject.optString("text");
                int type = jsonObject.optInt("type");

                JSONArray cats = jsonObject.optJSONArray("cats");
                if(cats !=null && cats.length() >0) {
                    catBeans = new ArrayList<>();
                    for(int j = 0; j < cats.length(); j++) {
                        JSONObject object = (JSONObject) cats.get(j);
                        String cats_id = object.optString("id");
                        String cats_name = object.optString("name");
                        String cats_text = object.optString("text");
                        int cats_type = object.optInt("type");

                        ElearningQuizCategoriesTreeBean.CatBean catBean = new ElearningQuizCategoriesTreeBean.CatBean();
                        catBean.setId(cats_id);
                        catBean.setName(cats_name);
                        catBean.setText(cats_text);
                        catBean.setType(cats_type);

                        catBeans.add(catBean);

                    }
                }

                ElearningQuizCategoriesTreeBean elearningQuizCategoriesTreeBean = new ElearningQuizCategoriesTreeBean();
                elearningQuizCategoriesTreeBean.setId(id);
                elearningQuizCategoriesTreeBean.setImage(image);
                elearningQuizCategoriesTreeBean.setName(name);
                elearningQuizCategoriesTreeBean.setText(text);
                elearningQuizCategoriesTreeBean.setType(type);
                elearningQuizCategoriesTreeBean.setCatBeans(catBeans);

                elearningQuizCategoriesTreeBeans.add(elearningQuizCategoriesTreeBean);

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

        return elearningQuizCategoriesTreeBeans;
    }

    public ArrayList<ElearningTrainingCategoriesTreeBean> getElearningTrainingCategoriesTree(String key) {
//    http://192.168.50.154:8000/football/elearning/training_categories?key=visitor
        url = url +"/training_categories"+"?key="+key;
        LogUtil.e(url);
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        elearningTrainingCategoriesTreeBeans = new ArrayList<>();
                        elearningTrainingCategoriesTreeBeans = processElearningTrainingCategoriesTree(response);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        mQueue.add(stringRequest);

        return elearningTrainingCategoriesTreeBeans;
    }

    private ArrayList<ElearningTrainingCategoriesTreeBean> processElearningTrainingCategoriesTree(String json) {
        ArrayList<ElearningTrainingCategoriesTreeBean.CatsBean> cats1 = new ArrayList<>();
        elearningTrainingCategoriesTreeBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0; i < jsonArray.length(); i++) {
               JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String id = jsonObject.optString("id");
                String image = jsonObject.optString("image");
                String name = jsonObject.optString("name");
                int pageCount = jsonObject.optInt("pageCount");
                int type = jsonObject.optInt("type");

                JSONArray cats = jsonObject.optJSONArray("cats");
                if(cats !=null && cats.length() >0 ) {
                    for(int j = 0; j < cats.length(); j++) {
                        JSONObject obj = (JSONObject) cats.get(j);
                        String cat_id = obj.optString("id");
                        String cat_name = obj.optString("name");
                        int cat_pageCount = obj.optInt("pageCount");
                        int cat_type = obj.optInt("type");

                        ElearningTrainingCategoriesTreeBean.CatsBean cat = new ElearningTrainingCategoriesTreeBean.CatsBean();
                        cat.setId(cat_id);
                        cat.setName(cat_name);
                        cat.setPageCount(cat_pageCount);
                        cat.setType(cat_type);
                        cats1.add(cat);

                    }
                }

                ElearningTrainingCategoriesTreeBean elearningTrainingCategoriesTreeBean = new ElearningTrainingCategoriesTreeBean();
                elearningTrainingCategoriesTreeBean.setId(id);
                elearningTrainingCategoriesTreeBean.setImage(image);
                elearningTrainingCategoriesTreeBean.setName(name);
                elearningTrainingCategoriesTreeBean.setPageCount(pageCount);
                elearningTrainingCategoriesTreeBean.setType(type);
                elearningTrainingCategoriesTreeBean.setCats(cats1);

                elearningTrainingCategoriesTreeBeans.add(elearningTrainingCategoriesTreeBean);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return elearningTrainingCategoriesTreeBeans;
    }

    public ArrayList<ElearningQuizPageListBean> getElearningQuizPageList(String key,String categoryId){
//      http://192.168.50.154:8000/football/elearning/quiz_categories/elearning_q_fmc2014/pages
        url = url +"/quiz_categories/"+categoryId+"/pages?key="+key;
        LogUtil.e(url);
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        elearningQuizPageListBeans = new ArrayList<>();
                        elearningQuizPageListBeans = processElearningQuizPageList(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        mQueue.add(stringRequest);
        return  elearningQuizPageListBeans;

    }

    private ArrayList<ElearningQuizPageListBean> processElearningQuizPageList(String json) {
        elearningQuizPageListBeans = new ArrayList<>();
        ElearningQuizPageListBean.VideosBean.R2Bean r2Bean = new ElearningQuizPageListBean.VideosBean.R2Bean();
        ElearningQuizPageListBean.VideosBean.R1Bean r1Bean = new ElearningQuizPageListBean.VideosBean.R1Bean();
        ElearningQuizPageListBean.VideosBean videosBean = new ElearningQuizPageListBean.VideosBean();
        ElearningQuizPageListBean elearningQuizPageListBean = new ElearningQuizPageListBean();


        ArrayList<ElearningQuizPageListBean.VideosBean.R1Bean> r1Beans = new ArrayList<>();
        ArrayList<ElearningQuizPageListBean.VideosBean.R2Bean> r2Beans = new ArrayList<>();
        ArrayList<ElearningQuizPageListBean.VideosBean> videosBeans = new ArrayList<>();
        try {
                JSONArray jsonArray = new JSONArray(json);

                for(int i = 0; i < jsonArray.length(); i++) {

                    JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                    String id = jsonObject.optString("id");
                    int index = jsonObject.optInt("index");
                    int type = jsonObject.optInt("type");

                    JSONArray videos = jsonObject.optJSONArray("videos");
                    for(int j = 0; j < videos.length(); j++) {
                        JSONObject video = (JSONObject) videos.get(j);
                        int video_duration = video.optInt("duration");
                        String video_id = video.optString("id");
                        String video_videoPath = video.optString("videoPath");
                        JSONArray video_r1 = video.optJSONArray("r1");

                        for(int z = 0; z < video_r1.length(); z++) {
                           JSONObject video_r1_obj = (JSONObject) video_r1.get(z);
                            int video_r1_index = video_r1_obj.optInt("index");
                            boolean video_r1_right = video_r1_obj.optBoolean("right");
                            String video_r1_text = video_r1_obj.optString("text");

                            r1Bean.setIndex(video_r1_index);
                            r1Bean.setRight(video_r1_right);
                            r1Bean.setText(video_r1_text);
                            r1Beans.add(r1Bean);
                        }

                        JSONArray video_r2 = video.optJSONArray("r2");
                        for(int z = 0; z < video_r2.length(); z++) {
                            JSONObject video_r2_obj = (JSONObject) video_r2.get(z);
                            int video_r2_index = video_r2_obj.optInt("index");
                            boolean video_r2_right = video_r2_obj.optBoolean("right");
                            String video_r2_text = video_r2_obj.optString("text");


                            r2Bean.setIndex(video_r2_index);
                            r2Bean.setRight(video_r2_right);
                            r2Bean.setText(video_r2_text);
                            r2Beans.add(r2Bean);
                        }

                        videosBean.setDuration(video_duration);
                        videosBean.setId(video_id);
                        videosBean.setVideoPath(video_videoPath);
                        videosBean.setR1(r1Beans);
                        videosBean.setR2(r2Beans);

                        videosBeans.add(videosBean);

                    }

                    elearningQuizPageListBean.setId(id);
                    elearningQuizPageListBean.setIndex(index);
                    elearningQuizPageListBean.setType(type);
                    elearningQuizPageListBean.setVideos(videosBeans);

                    elearningQuizPageListBeans.add(elearningQuizPageListBean);
                }


        } catch (JSONException e) {

        }

        return elearningQuizPageListBeans;
    }

    public ArrayList<ElearningTrainingPageListBean> getElearningTrainingPageList(String key,String categoryId){
//     http://192.168.50.154:8000/football/elearning/training_categories/elearning_t_fmc2014/pages?key=visitor
        url = url +"/training_categories/"+categoryId+"/pages?key="+key;
        LogUtil.e(url);
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        elearningTrainingPageListBeans = new ArrayList<>();
                        elearningTrainingPageListBeans = processElearningTrainingPageList(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        mQueue.add(stringRequest);
        return elearningTrainingPageListBeans;

    }

    private ArrayList<ElearningTrainingPageListBean> processElearningTrainingPageList(String json) {
        ElearningTrainingPageListBean elearningTrainingPageListBean = new ElearningTrainingPageListBean();
        ElearningTrainingPageListBean.VideosBean videosBean = new ElearningTrainingPageListBean.VideosBean();
        ArrayList<ElearningTrainingPageListBean.VideosBean> videosBeans = new ArrayList<>();

        elearningTrainingPageListBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);

            for(int i = 0; i < jsonArray.length(); i++) {
               JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String id = jsonObject.optString("id");
                String title = jsonObject.optString("title");
                int type = jsonObject.optInt("type");
                JSONArray videos = jsonObject.optJSONArray("videos");
                for(int j = 0; j < videos.length(); j++) {

                    JSONObject videos_object = (JSONObject) videos.get(j);
                    String video_id = videos_object.optString("id");
                    String video_imagePath = videos_object.optString("imagePath");

                    videosBean.setId(video_id);
                    videosBean.setImagePath(video_imagePath);

                    videosBeans.add(videosBean);
                }

                elearningTrainingPageListBean.setId(id);
                elearningTrainingPageListBean.setTitle(title);
                elearningTrainingPageListBean.setType(type);
                elearningTrainingPageListBean.setVideos(videosBeans);

                elearningTrainingPageListBeans.add(elearningTrainingPageListBean);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return elearningTrainingPageListBeans;
    }

    public ArrayList<ElearningTrainingSubCategoriesBean> getElearningTrainingSubCategories(String key,String categoryId){
    //http://192.168.50.154:8000/football/elearning/training_categories/elearning_t_fmc2014/subCats
        url = url +"/training_categories/"+categoryId+"/subCats?key="+key;
        LogUtil.e(url);
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        LogUtil.e(response);
                        elearningTrainingSubCategoriesBeans = new ArrayList<>();
                        elearningTrainingSubCategoriesBeans = processElearningTrainingSubCategories(response);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        mQueue.add(stringRequest);
        return elearningTrainingSubCategoriesBeans;

    }

    private ArrayList<ElearningTrainingSubCategoriesBean> processElearningTrainingSubCategories(String json) {
        ElearningTrainingSubCategoriesBean elearningTrainingSubCategoriesBean = new ElearningTrainingSubCategoriesBean();
        elearningTrainingSubCategoriesBeans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0; i < jsonArray.length(); i++) {
               JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String id = jsonObject.optString("id");
                String name = jsonObject.optString("name");
                int pageCount = jsonObject.optInt("pageCount");
                int type = jsonObject.optInt("type");

                elearningTrainingSubCategoriesBean.setId(id);
                elearningTrainingSubCategoriesBean.setName(name);
                elearningTrainingSubCategoriesBean.setPageCount(pageCount);
                elearningTrainingSubCategoriesBean.setType(type);

                elearningTrainingSubCategoriesBeans.add(elearningTrainingSubCategoriesBean);
            }
        } catch (JSONException e) {

        }

        return elearningTrainingSubCategoriesBeans;
    }

}
