package io.swagger.client.model;

import io.swagger.client.model.ElearningVideo;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * elearning单篇
 **/
@ApiModel(description = "elearning单篇")
public class ElearningPage  {
  
  @SerializedName("images")
  private List<String> images = null;
  @SerializedName("subTitle")
  private String subTitle = null;
  @SerializedName("videos")
  private List<ElearningVideo> videos = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("type")
  private Integer type = null;
  @SerializedName("animation")
  private String animation = null;

  /**
   * 图片地址
   **/
  @ApiModelProperty(value = "图片地址")
  public List<String> getImages() {
    return images;
  }
  public void setImages(List<String> images) {
    this.images = images;
  }

  /**
   * 副标题
   **/
  @ApiModelProperty(value = "副标题")
  public String getSubTitle() {
    return subTitle;
  }
  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  /**
   * 视频列表
   **/
  @ApiModelProperty(value = "视频列表")
  public List<ElearningVideo> getVideos() {
    return videos;
  }
  public void setVideos(List<ElearningVideo> videos) {
    this.videos = videos;
  }

  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * 文字内容
   **/
  @ApiModelProperty(value = "文字内容")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * 主标题
   **/
  @ApiModelProperty(value = "主标题")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * 页面类型： 1-视频页  | 2-文章页|
   **/
  @ApiModelProperty(value = "页面类型： 1-视频页  | 2-文章页|")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * 动画地址
   **/
  @ApiModelProperty(value = "动画地址")
  public String getAnimation() {
    return animation;
  }
  public void setAnimation(String animation) {
    this.animation = animation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElearningPage elearningPage = (ElearningPage) o;
    return (images == null ? elearningPage.images == null : images.equals(elearningPage.images)) &&
        (subTitle == null ? elearningPage.subTitle == null : subTitle.equals(elearningPage.subTitle)) &&
        (videos == null ? elearningPage.videos == null : videos.equals(elearningPage.videos)) &&
        (id == null ? elearningPage.id == null : id.equals(elearningPage.id)) &&
        (text == null ? elearningPage.text == null : text.equals(elearningPage.text)) &&
        (title == null ? elearningPage.title == null : title.equals(elearningPage.title)) &&
        (type == null ? elearningPage.type == null : type.equals(elearningPage.type)) &&
        (animation == null ? elearningPage.animation == null : animation.equals(elearningPage.animation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (images == null ? 0: images.hashCode());
    result = 31 * result + (subTitle == null ? 0: subTitle.hashCode());
    result = 31 * result + (videos == null ? 0: videos.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (text == null ? 0: text.hashCode());
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (type == null ? 0: type.hashCode());
    result = 31 * result + (animation == null ? 0: animation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElearningPage {\n");
    
    sb.append("  images: ").append(images).append("\n");
    sb.append("  subTitle: ").append(subTitle).append("\n");
    sb.append("  videos: ").append(videos).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  animation: ").append(animation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
