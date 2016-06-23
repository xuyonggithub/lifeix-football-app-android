package com.l99.chinafootball.base;

import android.content.Context;
import android.view.View;

/**
 * Created by lifeix-101 on 2016/6/21.
 */
public abstract class BasePage {

    public Context context;

    public View rootView;

    public BasePage(Context context) {
        this.context = context;
        if(rootView == null) {
            rootView = initView();
        }
    }

    public abstract View initView();

    public abstract void initData();

}
