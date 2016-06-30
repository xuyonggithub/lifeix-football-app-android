package com.l99.chinafootball.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/24.
 */
public class CategoryBean {


    /**
     * categories : [{"iconUrl":"","id":"8089397712087","name":"男子11人制国家队"}]
     * iconUrl :
     * id : 80891115649354
     * name : 男足
     */

    private String iconUrl;
    private String id;
    private String name;
    /**
     * iconUrl :
     * id : 8089397712087
     * name : 男子11人制国家队
     */

    private List<CategoriesBean> categories;

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

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

    public static class CategoriesBean {
        private String iconUrl;
        private String id;
        private String name;

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
    }
}
