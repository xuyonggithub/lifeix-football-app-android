package com.l99.testokhttp.bean;

import java.util.List;

/**
 * Created by lifeix-101 on 2016/6/29.
 */
public class ElearningTrainingPageListBean {


    /**
     * id : 57728000e385d850d17b286d
     * title : video 1
     * videos : [{"id":"57728000e385d850d17b27ef","imagePath":"elearning/fmc2014/part1/medias/th/fwc14-m01-bra-cro-01.jpg"}]
     * type : 1
     */

    private String id;
    private String title;
    private int type;
    /**
     * id : 57728000e385d850d17b27ef
     * imagePath : elearning/fmc2014/part1/medias/th/fwc14-m01-bra-cro-01.jpg
     */

    private List<VideosBean> videos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        private String id;
        private String imagePath;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }
    }
}
