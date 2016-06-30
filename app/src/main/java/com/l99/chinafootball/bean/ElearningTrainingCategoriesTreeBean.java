package com.l99.chinafootball.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/28.
 */
public class ElearningTrainingCategoriesTreeBean {


    /**
     * cats : [{"id":"elearning_t_fmc2014_01","name":"犯规和不正当行为","pageCount":126,"type":1},{"id":"elearning_t_fmc2014_02","name":"比赛管理","pageCount":37,"type":1},{"id":"elearning_t_fmc2014_03","name":"比赛官员技术","pageCount":32,"type":1},{"id":"elearning_t_fmc2014_04","name":"越位","pageCount":28,"type":1}]
     * id : elearning_t_fmc2014
     * image : elearning_t_fmc.jpg
     * name :  2014FIFA 男子足球比赛
     * pageCount : 223
     * type : 1
     */

    private String id;
    private String image;
    private String name;
    private int pageCount;
    private int type;
    /**
     * id : elearning_t_fmc2014_01
     * name : 犯规和不正当行为
     * pageCount : 126
     * type : 1
     */

    private List<CatsBean> cats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<CatsBean> getCats() {
        return cats;
    }

    public void setCats(List<CatsBean> cats) {
        this.cats = cats;
    }

    public static class CatsBean {
        private String id;
        private String name;
        private int pageCount;
        private int type;

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

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
