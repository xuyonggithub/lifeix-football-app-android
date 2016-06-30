package com.l99.chinafootball.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/27.
 */
public class NationalCoachBean {


    public NationalCoachBean(String topName, List<CategoryBean> category) {
        this.topName = topName;
        this.category = category;
    }

    /**
     * category : [{"categoryName":"中国国家队","coaches":[{"avatar":"o_1am2vmb6m1g2910bakq71dd317do7.jpg","birthday":-123811200000,"birthplace":"北京","country":"中国","id":1,"level":"s","name":"高洪波","position":"主教练"},{"avatar":"o_1am35f07qmh5124e1gjpp5aoec.jpg","birthday":-157766400000,"birthplace":"辽宁","country":"中国","id":2,"level":"S","name":"傅博","position":"助理教练"}]},{"categoryName":"中国国奥队","coaches":[]},{"categoryName":"中国国青队","coaches":[]},{"categoryName":"男子5人制国家队","coaches":[]},{"categoryName":"男子沙滩足球国家队","coaches":[]}]
     * topName : 男足教练
     */

    private String topName;
    /**
     * categoryName : 中国国家队
     * coaches : [{"avatar":"o_1am2vmb6m1g2910bakq71dd317do7.jpg","birthday":-123811200000,"birthplace":"北京","country":"中国","id":1,"level":"s","name":"高洪波","position":"主教练"},{"avatar":"o_1am35f07qmh5124e1gjpp5aoec.jpg","birthday":-157766400000,"birthplace":"辽宁","country":"中国","id":2,"level":"S","name":"傅博","position":"助理教练"}]
     */

    private List<CategoryBean> category;

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    public List<CategoryBean> getCategory() {
        return category;
    }

    public void setCategory(List<CategoryBean> category) {
        this.category = category;
    }

    public static class CategoryBean {
        private String categoryName;
        /**
         * avatar : o_1am2vmb6m1g2910bakq71dd317do7.jpg
         * birthday : -123811200000
         * birthplace : 北京
         * country : 中国
         * id : 1
         * level : s
         * name : 高洪波
         * position : 主教练
         */

        private List<CoachesBean> coaches;

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<CoachesBean> getCoaches() {
            return coaches;
        }

        public void setCoaches(List<CoachesBean> coaches) {
            this.coaches = coaches;
        }

        public static class CoachesBean {
            private String avatar;
            private long birthday;
            private String birthplace;
            private String country;
            private int id;
            private String level;
            private String name;
            private String position;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public long getBirthday() {
                return birthday;
            }

            public void setBirthday(long birthday) {
                this.birthday = birthday;
            }

            public String getBirthplace() {
                return birthplace;
            }

            public void setBirthplace(String birthplace) {
                this.birthplace = birthplace;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }
        }
    }
}
