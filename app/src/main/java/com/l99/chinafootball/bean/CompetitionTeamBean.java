package com.l99.chinafootball.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/27.
 */
public class CompetitionTeamBean {

    private int id;
    private String name;
    private String introduce;
    private long setupDate;
    private String group;
    /**
     * id : 5
     * name : 2018世预赛12强赛
     * startDate : 1472688000000
     * endDate : 1504569600000
     */

    private CompetitionInfoBean competitionInfo;
    /**
     * id : 1
     * name : 中国
     * flag : CF_flag_China.jpg
     * teamCategory : {"id":8089215429517,"name":"龙之队","fId":8089397712087,"isLeaf":1}
     */

    private TeamInfoBean teamInfo;
    /**
     * id : 1
     * name : 高洪波
     * avatar : o_1am2vmb6m1g2910bakq71dd317do7.jpg
     * country : 中国
     * birthday : -123811200000
     * birthplace : 北京
     * level : s
     * position : 主教练
     */

    private ChiefCoachBean chiefCoach;
    /**
     * id : 1
     * name : 刘殿秋
     * country : 中国
     * avatar : ldq
     * position : 领队
     * birthday : 1464825600000
     * birthplace : bj
     */

    private TeamLeaderBean teamLeader;
    /**
     * id : 2
     * name : 傅博
     * avatar : o_1am35f07qmh5124e1gjpp5aoec.jpg
     * country : 中国
     * birthday : -157766400000
     * birthplace : 辽宁
     * level : S
     * position : 助理教练
     */

    private List<AssistantCoachBean> assistantCoach;


    private List<PlayersBean> players;

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

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public long getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(long setupDate) {
        this.setupDate = setupDate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public CompetitionInfoBean getCompetitionInfo() {
        return competitionInfo;
    }

    public void setCompetitionInfo(CompetitionInfoBean competitionInfo) {
        this.competitionInfo = competitionInfo;
    }

    public TeamInfoBean getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(TeamInfoBean teamInfo) {
        this.teamInfo = teamInfo;
    }

    public ChiefCoachBean getChiefCoach() {
        return chiefCoach;
    }

    public void setChiefCoach(ChiefCoachBean chiefCoach) {
        this.chiefCoach = chiefCoach;
    }

    public TeamLeaderBean getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(TeamLeaderBean teamLeader) {
        this.teamLeader = teamLeader;
    }

    public List<AssistantCoachBean> getAssistantCoach() {
        return assistantCoach;
    }

    public void setAssistantCoach(List<AssistantCoachBean> assistantCoach) {
        this.assistantCoach = assistantCoach;
    }

    public List<PlayersBean> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayersBean> players) {
        this.players = players;
    }

    public static class CompetitionInfoBean {
        private String id;
        private String name;
        private long startDate;
        private long endDate;

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

        public long getStartDate() {
            return startDate;
        }

        public void setStartDate(long startDate) {
            this.startDate = startDate;
        }

        public long getEndDate() {
            return endDate;
        }

        public void setEndDate(long endDate) {
            this.endDate = endDate;
        }
    }

    public static class TeamInfoBean {
        private int id;
        private String name;
        private String flag;
        /**
         * id : 8089215429517
         * name : 龙之队
         * fId : 8089397712087
         * isLeaf : 1
         */

        private TeamCategoryBean teamCategory;

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

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public TeamCategoryBean getTeamCategory() {
            return teamCategory;
        }

        public void setTeamCategory(TeamCategoryBean teamCategory) {
            this.teamCategory = teamCategory;
        }

        public static class TeamCategoryBean {
            private long id;
            private String name;
            private long fId;
            private int isLeaf;

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getFId() {
                return fId;
            }

            public void setFId(long fId) {
                this.fId = fId;
            }

            public int getIsLeaf() {
                return isLeaf;
            }

            public void setIsLeaf(int isLeaf) {
                this.isLeaf = isLeaf;
            }
        }
    }

    public static class ChiefCoachBean {
        private int id;
        private String name;
        private String avatar;
        private String country;
        private long birthday;
        private String birthplace;
        private String level;
        private String position;

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

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
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

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
    }

    public static class TeamLeaderBean {
        private int id;
        private String name;
        private String country;
        private String avatar;
        private String position;
        private long birthday;
        private String birthplace;

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

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
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
    }

    public static class AssistantCoachBean {
        private int id;
        private String name;
        private String avatar;
        private String country;
        private long birthday;
        private String birthplace;
        private String level;
        private String position;

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

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
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

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
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
        /**
         * playerId : 11
         * gamesplayed : 33
         * starts : 31
         * substitution : 2
         * goals : 0
         * assists : 0
         * bookings : 0
         * dismissals : 0
         */

        private RecordBean record;
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

        public RecordBean getRecord() {
            return record;
        }

        public void setRecord(RecordBean record) {
            this.record = record;
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

        public static class RecordBean {
            private int playerId;
            private int gamesplayed;
            private int starts;
            private int substitution;
            private int goals;
            private int assists;
            private int bookings;
            private int dismissals;

            public int getPlayerId() {
                return playerId;
            }

            public void setPlayerId(int playerId) {
                this.playerId = playerId;
            }

            public int getGamesplayed() {
                return gamesplayed;
            }

            public void setGamesplayed(int gamesplayed) {
                this.gamesplayed = gamesplayed;
            }

            public int getStarts() {
                return starts;
            }

            public void setStarts(int starts) {
                this.starts = starts;
            }

            public int getSubstitution() {
                return substitution;
            }

            public void setSubstitution(int substitution) {
                this.substitution = substitution;
            }

            public int getGoals() {
                return goals;
            }

            public void setGoals(int goals) {
                this.goals = goals;
            }

            public int getAssists() {
                return assists;
            }

            public void setAssists(int assists) {
                this.assists = assists;
            }

            public int getBookings() {
                return bookings;
            }

            public void setBookings(int bookings) {
                this.bookings = bookings;
            }

            public int getDismissals() {
                return dismissals;
            }

            public void setDismissals(int dismissals) {
                this.dismissals = dismissals;
            }
        }
    }
}
