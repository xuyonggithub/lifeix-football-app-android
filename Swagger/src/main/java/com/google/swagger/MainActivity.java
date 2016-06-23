package com.google.swagger;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.api.WemediaTopApi;
import io.swagger.client.model.Post;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiInvoker.initializeInstance();


        new Thread(){
            @Override
            public void run() {

                try {
                    WemediaTopApi wemediaTopApi = new WemediaTopApi();
                    wemediaTopApi.setBasePath("http://192.168.50.154:8000/football");
                    List<Post> visitor = wemediaTopApi.getTopPosts("visitor", Arrays.asList("referee"));

                    Log.e("test","每个类目 的 头部轮播图："+visitor.toString());
                    Log.e("Swagger",wemediaTopApi.toString());
                } catch (TimeoutException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ApiException e) {
                    e.printStackTrace();
                }

            }
        }.start();

    }
}
