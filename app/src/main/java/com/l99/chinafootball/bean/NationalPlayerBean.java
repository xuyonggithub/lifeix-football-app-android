package com.l99.chinafootball.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/28.
 */
public class NationalPlayerBean {




    private String topName;

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

        private List<PlayersBean> players;

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<PlayersBean> getPlayers() {
            return players;
        }

        public void setPlayers(List<PlayersBean> players) {
            this.players = players;
        }

        public static class PlayersBean {
            private String id;
            private String name;
            private String sex;
            private String englishName;
            private String country;
            private String avatar;
            private long birthday;
            private String birthplace;
            private int height;
            private int weight;
            private String position;
            private int jeserysNum;
            private String introduce;

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

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getEnglishName() {
                return englishName;
            }

            public void setEnglishName(String englishName) {
                this.englishName = englishName;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

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

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public int getJeserysNum() {
                return jeserysNum;
            }

            public void setJeserysNum(int jeserysNum) {
                this.jeserysNum = jeserysNum;
            }

            public String getIntroduce() {
                return introduce;
            }

            public void setIntroduce(String introduce) {
                this.introduce = introduce;
            }
        }
    }
}
