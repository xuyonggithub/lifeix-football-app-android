package com.l99.chinafootball.utils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.l99.chinafootball.base.BaseApplication;

/**
 * Created by lifeix-101 on 2016/6/23.
 */
public class ImageUtils {

    public static void setImage(ImageView imageView ,String url){
        Glide.with(BaseApplication.sContext).load(url).into(imageView);
    }
}