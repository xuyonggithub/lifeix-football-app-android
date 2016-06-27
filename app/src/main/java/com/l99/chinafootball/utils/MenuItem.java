package com.l99.chinafootball.utils;

import android.support.v4.app.Fragment;

import io.swagger.client.model.Menu;

/**
 * Created by xuyong on 16/6/27.
 */
public class MenuItem extends Menu{
    public boolean isFixed = true;
    public int drawableId;
    public Class<? extends Fragment> fragmentClass;

    public MenuItem(String name, String id, Class<? extends Fragment> fragmentClass, int drawableId) {
        super();
        this.setName(name);
        this.setId(id);
        this.drawableId = drawableId;
        this.fragmentClass = fragmentClass;
    }

}
