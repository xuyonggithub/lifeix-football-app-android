package com.l99.chinafootball.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/27.
 */
public class CompetitionBean {

    private int id;
    private String name;
    private long startDate;
    private long endDate;
    /**
     * id : 8089916318445
     * name : 世预赛
     * flag : http://o8g2ar58z.bkt.clouddn.com/football.jpg?imageView/2/w/200/h/200
     * rule : <p><b>第一阶段：</b>资格赛阶段：47队 -> 32队（或40队）；</p>
     <p><b>第二阶段：</b>32强赛阶段（或40强赛）：32队（或40队）-> 12队；小组第一名直接出线，4个成绩最好的小组第二名亦出线。</p>
     <p><b>第三阶段：</b>12强赛阶段；小组前两名直接晋级2018年世界杯决赛圈；</p>
     <p><b>第四阶段：</b>亚洲区附加赛阶段。12强赛A、B组第三名对阵决出胜者；</p>
     <p><b>第五阶段：</b>终极附加赛阶段。12强赛A、B组第三名对阵决出的胜者，对阵其他大洲球队，胜者进军2018年世界杯决赛圈。（前提：亚洲为4.5个名额）</p>
     * scheduleType : 1
     * teamType : 0
     * host :
     */

    private CompetitionCategoryBean competitionCategory;
    /**
     * id : 1
     * name : 中国国家队
     * introduce : 12强赛中国队
     * setupDate : 1470009600000
     * group : A
     * teamInfo : {"id":1,"name":"中国国家队","flag":"CF_flag_China.jpg","teamCategory":{"id":8089215429517,"name":"龙之队","fId":8089397712087,"isLeaf":1}}
     */

    private List<TeamsBean> teams;
    /**
     * id : 1
     * hostTeam : {"id":1,"setupDate":1472688000000,"competitionId":5,"competitionTeamId":2,"teamInfo":{"id":2,"name":"韩国国家队","flag":"CF_flag_Korea.jpg","teamCategory":{"id":8089788327693,"name":"国外国家队","fId":8089219533483,"isLeaf":1}}}
     * awayTeam : {"id":2,"setupDate":1472688000000,"competitionId":5,"competitionTeamId":1,"teamInfo":{"id":1,"name":"中国国家队","flag":"CF_flag_China.jpg","teamCategory":{"id":8089215429517,"name":"龙之队","fId":8089397712087,"isLeaf":1}}}
     * startDate : 1472688000000
     * startTime : 1472756400000
     * position : 韩国首尔
     * stage : 第一轮
     * group : A
     * competitionInfo : {"id":"5","name":"2018世预赛12强赛","startDate":1472688000000,"endDate":1504569600000}
     * court : {"id":1,"name":"首尔世界杯体育场","images":"http://d.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=7481f3f977c6a7efad2ba0749c93c434/aa64034f78f0f7363c531a270b55b319ebc41362.jpg","country":"韩国","position":"韩国首尔","buildTime":1464825600000,"capacity":50000}
     */

    private List<MatchesBean> matches;

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

    public CompetitionCategoryBean getCompetitionCategory() {
        return competitionCategory;
    }

    public void setCompetitionCategory(CompetitionCategoryBean competitionCategory) {
        this.competitionCategory = competitionCategory;
    }

    public List<TeamsBean> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamsBean> teams) {
        this.teams = teams;
    }

    public List<MatchesBean> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchesBean> matches) {
        this.matches = matches;
    }

    public static class CompetitionCategoryBean {
        private long id;
        private String name;
        private String flag;
        private String rule;
        private int scheduleType;
        private int teamType;
        private String host;

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

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public String getRule() {
            return rule;
        }

        public void setRule(String rule) {
            this.rule = rule;
        }

        public int getScheduleType() {
            return scheduleType;
        }

        public void setScheduleType(int scheduleType) {
            this.scheduleType = scheduleType;
        }

        public int getTeamType() {
            return teamType;
        }

        public void setTeamType(int teamType) {
            this.teamType = teamType;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }
    }

    public static class TeamsBean {
        private int id;
        private String name;
        private String introduce;
        private long setupDate;
        private String group;
        /**
         * id : 1
         * name : 中国国家队
         * flag : CF_flag_China.jpg
         * teamCategory : {"id":8089215429517,"name":"龙之队","fId":8089397712087,"isLeaf":1}
         */

        private TeamInfoBean teamInfo;

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

        public TeamInfoBean getTeamInfo() {
            return teamInfo;
        }

        public void setTeamInfo(TeamInfoBean teamInfo) {
            this.teamInfo = teamInfo;
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
    }

    public static class MatchesBean {
        private String id;
        /**
         * id : 1
         * setupDate : 1472688000000
         * competitionId : 5
         * competitionTeamId : 2
         * teamInfo : {"id":2,"name":"韩国国家队","flag":"CF_flag_Korea.jpg","teamCategory":{"id":8089788327693,"name":"国外国家队","fId":8089219533483,"isLeaf":1}}
         */

        private HostTeamBean hostTeam;
        /**
         * id : 2
         * setupDate : 1472688000000
         * competitionId : 5
         * competitionTeamId : 1
         * teamInfo : {"id":1,"name":"中国国家队","flag":"CF_flag_China.jpg","teamCategory":{"id":8089215429517,"name":"龙之队","fId":8089397712087,"isLeaf":1}}
         */

        private AwayTeamBean awayTeam;
        private long startDate;
        private long startTime;
        private String position;
        private String stage;
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
         * name : 首尔世界杯体育场
         * images : http://d.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=7481f3f977c6a7efad2ba0749c93c434/aa64034f78f0f7363c531a270b55b319ebc41362.jpg
         * country : 韩国
         * position : 韩国首尔
         * buildTime : 1464825600000
         * capacity : 50000
         */

        private CourtBean court;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public HostTeamBean getHostTeam() {
            return hostTeam;
        }

        public void setHostTeam(HostTeamBean hostTeam) {
            this.hostTeam = hostTeam;
        }

        public AwayTeamBean getAwayTeam() {
            return awayTeam;
        }

        public void setAwayTeam(AwayTeamBean awayTeam) {
            this.awayTeam = awayTeam;
        }

        public long getStartDate() {
            return startDate;
        }

        public void setStartDate(long startDate) {
            this.startDate = startDate;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
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

        public CourtBean getCourt() {
            return court;
        }

        public void setCourt(CourtBean court) {
            this.court = court;
        }

        public static class HostTeamBean {
            private int id;
            private long setupDate;
            private int competitionId;
            private int competitionTeamId;
            /**
             * id : 2
             * name : 韩国国家队
             * flag : CF_flag_Korea.jpg
             * teamCategory : {"id":8089788327693,"name":"国外国家队","fId":8089219533483,"isLeaf":1}
             */

            private TeamInfoBean teamInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public long getSetupDate() {
                return setupDate;
            }

            public void setSetupDate(long setupDate) {
                this.setupDate = setupDate;
            }

            public int getCompetitionId() {
                return competitionId;
            }

            public void setCompetitionId(int competitionId) {
                this.competitionId = competitionId;
            }

            public int getCompetitionTeamId() {
                return competitionTeamId;
            }

            public void setCompetitionTeamId(int competitionTeamId) {
                this.competitionTeamId = competitionTeamId;
            }

            public TeamInfoBean getTeamInfo() {
                return teamInfo;
            }

            public void setTeamInfo(TeamInfoBean teamInfo) {
                this.teamInfo = teamInfo;
            }

            public static class TeamInfoBean {
                private int id;
                private String name;
                private String flag;
                /**
                 * id : 8089788327693
                 * name : 国外国家队
                 * fId : 8089219533483
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
        }

        public static class AwayTeamBean {
            private int id;
            private long setupDate;
            private int competitionId;
            private int competitionTeamId;
            /**
             * id : 1
             * name : 中国国家队
             * flag : CF_flag_China.jpg
             * teamCategory : {"id":8089215429517,"name":"龙之队","fId":8089397712087,"isLeaf":1}
             */

            private TeamInfoBean teamInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public long getSetupDate() {
                return setupDate;
            }

            public void setSetupDate(long setupDate) {
                this.setupDate = setupDate;
            }

            public int getCompetitionId() {
                return competitionId;
            }

            public void setCompetitionId(int competitionId) {
                this.competitionId = competitionId;
            }

            public int getCompetitionTeamId() {
                return competitionTeamId;
            }

            public void setCompetitionTeamId(int competitionTeamId) {
                this.competitionTeamId = competitionTeamId;
            }

            public TeamInfoBean getTeamInfo() {
                return teamInfo;
            }

            public void setTeamInfo(TeamInfoBean teamInfo) {
                this.teamInfo = teamInfo;
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

        public static class CourtBean {
            private int id;
            private String name;
            private String images;
            private String country;
            private String position;
            private long buildTime;
            private int capacity;

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

            public String getImages() {
                return images;
            }

            public void setImages(String images) {
                this.images = images;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public long getBuildTime() {
                return buildTime;
            }

            public void setBuildTime(long buildTime) {
                this.buildTime = buildTime;
            }

            public int getCapacity() {
                return capacity;
            }

            public void setCapacity(int capacity) {
                this.capacity = capacity;
            }
        }
    }
}
