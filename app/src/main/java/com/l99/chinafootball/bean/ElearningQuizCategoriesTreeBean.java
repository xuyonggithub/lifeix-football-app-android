package com.l99.chinafootball.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/27.
 */
public class ElearningQuizCategoriesTreeBean {


    /**
     * id : elearning_q_fmc2014
     * image : elearning_q_fmc.jpg
     * name : 2014 FIFA男子足球比赛小测验
     * text : 下面的情况，裁判员将做出如何判罚？以下每种情况，我们将给你10秒时间做出选择，测试进行中，测试不能暂停。一旦做出选择，你的答案将不能被更改。如果选择跳过问题，该问题将被认为是回答错误计算。每个问题，你都要要做出“判罚”和“纪律处罚”两项。每题的结果，你都将在提交后看到，答对15题将被认为通过。
     * type : 3
     */

    private String id;
    private String image;
    private String name;
    private String text;
    private int type;

    private List<CatBean> catBeans;

    public List<CatBean> getCatBeans() {
        return catBeans;
    }

    public void setCatBeans(List<CatBean> catBeans) {
        this.catBeans = catBeans;
    }

    public static class CatBean {
        private String id;
        private String name;
        private String text;
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

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
