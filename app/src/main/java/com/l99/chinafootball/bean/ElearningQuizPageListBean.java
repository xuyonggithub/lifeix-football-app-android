package com.l99.testokhttp.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/29.
 */
public class ElearningQuizPageListBean {


    /**
     * id : 5772800ce385d850d17b2a8d
     * index : 99
     * type : 1
     * videos : [{"duration":18,"id":"5772800ce385d850d17b2a0f","r1":[{"index":1,"right":false,"text":"NO FOUL"},{"index":2,"right":false,"text":"INDIRECT FREE KICK"},{"index":3,"right":true,"text":"DIRECT FREE KICK"},{"index":4,"right":false,"text":"PENALTY KICK"}],"r2":[{"index":1,"right":false,"text":"NO CARD"},{"index":2,"right":true,"text":"YELLOW CARD"},{"index":3,"right":false,"text":"RED CARD"}],"videoPath":"elearning/fmc2014/part1/medias/flv/fwc14-m45-usa-ger-02"}]
     */

    private String id;
    private int index;
    private int type;
    /**
     * duration : 18
     * id : 5772800ce385d850d17b2a0f
     * r1 : [{"index":1,"right":false,"text":"NO FOUL"},{"index":2,"right":false,"text":"INDIRECT FREE KICK"},{"index":3,"right":true,"text":"DIRECT FREE KICK"},{"index":4,"right":false,"text":"PENALTY KICK"}]
     * r2 : [{"index":1,"right":false,"text":"NO CARD"},{"index":2,"right":true,"text":"YELLOW CARD"},{"index":3,"right":false,"text":"RED CARD"}]
     * videoPath : elearning/fmc2014/part1/medias/flv/fwc14-m45-usa-ger-02
     */

    private List<VideosBean> videos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<VideosBean> getVideos() {
        return videos;
    }

    public void setVideos(List<VideosBean> videos) {
        this.videos = videos;
    }

    public static class VideosBean {
        private int duration;
        private String id;
        private String videoPath;
        /**
         * index : 1
         * right : false
         * text : NO FOUL
         */

        private List<R1Bean> r1;
        /**
         * index : 1
         * right : false
         * text : NO CARD
         */

        private List<R2Bean> r2;

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getVideoPath() {
            return videoPath;
        }

        public void setVideoPath(String videoPath) {
            this.videoPath = videoPath;
        }

        public List<R1Bean> getR1() {
            return r1;
        }

        public void setR1(List<R1Bean> r1) {
            this.r1 = r1;
        }

        public List<R2Bean> getR2() {
            return r2;
        }

        public void setR2(List<R2Bean> r2) {
            this.r2 = r2;
        }

        public static class R1Bean {
            private int index;
            private boolean right;
            private String text;

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public boolean isRight() {
                return right;
            }

            public void setRight(boolean right) {
                this.right = right;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }

        public static class R2Bean {
            private int index;
            private boolean right;
            private String text;

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public boolean isRight() {
                return right;
            }

            public void setRight(boolean right) {
                this.right = right;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }
}
