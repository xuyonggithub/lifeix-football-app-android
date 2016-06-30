package com.l99.chinafootball.bean;

import java.util.ArrayList;

/**
 * Created by lifeix-101 on 2016/6/28.
 */
public class MenuBean {

    private String iconUrl;
    private String id;
    private String name;
    private ArrayList menus;
    private String page;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
