package com.l99.chinafootball.bean;

/**
 * Created by lifeix-101 on 2016/6/27.
 */
public class TeamCoachBean {


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
