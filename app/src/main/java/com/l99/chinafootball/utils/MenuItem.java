package com.l99.chinafootball.utils;

import io.swagger.client.model.Menu;

/**
 * Created by xuyong on 16/6/27.
 */
public class MenuItem extends Menu{
    public boolean isFixed = true;
    public int drawableId;

    public MenuItem(String name, String id, int drawableId) {
        super();
        this.setName(name);
        this.setId(id);
        this.drawableId = drawableId;
    }

}
