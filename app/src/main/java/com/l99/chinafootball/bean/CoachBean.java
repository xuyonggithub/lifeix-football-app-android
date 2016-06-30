package com.l99.chinafootball.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/24.
 */
public class CoachBean {


    /**
     * avatar : ghb.jpg
     * birthday : -123811200000
     * birthplace : 北京
     * career : [{"flag":"http://o8rg11ywr.bkt.clouddn.com/CF_flag_China.jpg","id":1,"name":"中国国家队","position":"主教练","teamCategory":{"fId":8089397712087,"id":8089215429517,"isLeaf":1,"name":"龙之队"}}]
     * country : 中国
     * id : 1
     * level : s
     * name : 高洪波
     * team : {"flag":"http://o8rg11ywr.bkt.clouddn.com/CF_flag_China.jpg","id":1,"name":"中国国家队","position":"主教练","teamCategory":{"fId":8089397712087,"id":8089215429517,"isLeaf":1,"name":"龙之队"}}
     */

    private String avatar;
    private long birthday;
    private String birthplace;
    private String country;
    private int id;
    private String level;
    private String name;
    /**
     * flag : http://o8rg11ywr.bkt.clouddn.com/CF_flag_China.jpg
     * id : 1
     * name : 中国国家队
     * position : 主教练
     * teamCategory : {"fId":8089397712087,"id":8089215429517,"isLeaf":1,"name":"龙之队"}
     */

    private TeamBean team;
    /**
     * flag : http://o8rg11ywr.bkt.clouddn.com/CF_flag_China.jpg
     * id : 1
     * name : 中国国家队
     * position : 主教练
     * teamCategory : {"fId":8089397712087,"id":8089215429517,"isLeaf":1,"name":"龙之队"}
     */

    private List<CareerBean> career;

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

    public TeamBean getTeam() {
        return team;
    }

    public void setTeam(TeamBean team) {
        this.team = team;
    }

    public List<CareerBean> getCareer() {
        return career;
    }

    public void setCareer(List<CareerBean> career) {
        this.career = career;
    }

    public static class TeamBean {
        private String flag;
        private int id;
        private String name;
        private String position;
        /**
         * fId : 8089397712087
         * id : 8089215429517
         * isLeaf : 1
         * name : 龙之队
         */

        private TeamCategoryBean teamCategory;

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public TeamCategoryBean getTeamCategory() {
            return teamCategory;
        }

        public void setTeamCategory(TeamCategoryBean teamCategory) {
            this.teamCategory = teamCategory;
        }

        public static class TeamCategoryBean {
            private long fId;
            private long id;
            private int isLeaf;
            private String name;

            public long getFId() {
                return fId;
            }

            public void setFId(long fId) {
                this.fId = fId;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public int getIsLeaf() {
                return isLeaf;
            }

            public void setIsLeaf(int isLeaf) {
                this.isLeaf = isLeaf;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class CareerBean {
        private String flag;
        private int id;
        private String name;
        private String position;
        /**
         * fId : 8089397712087
         * id : 8089215429517
         * isLeaf : 1
         * name : 龙之队
         */

        private TeamCategoryBean teamCategory;

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public TeamCategoryBean getTeamCategory() {
            return teamCategory;
        }

        public void setTeamCategory(TeamCategoryBean teamCategory) {
            this.teamCategory = teamCategory;
        }

        public static class TeamCategoryBean {
            private long fId;
            private long id;
            private int isLeaf;
            private String name;

            public long getFId() {
                return fId;
            }

            public void setFId(long fId) {
                this.fId = fId;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public int getIsLeaf() {
                return isLeaf;
            }

            public void setIsLeaf(int isLeaf) {
                this.isLeaf = isLeaf;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
