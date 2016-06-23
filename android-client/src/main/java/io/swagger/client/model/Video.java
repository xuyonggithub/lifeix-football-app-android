package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 视频
 **/
@ApiModel(description = "视频")
public class Video  {
  
  @SerializedName("preview")
  private String preview = null;
  @SerializedName("time")
  private Integer time = null;
  @SerializedName("url")
  private String url = null;

  /**
   * 预览图片
   **/
  @ApiModelProperty(value = "预览图片")
  public String getPreview() {
    return preview;
  }
  public void setPreview(String preview) {
    this.preview = preview;
  }

  /**
   * 视频时常
   **/
  @ApiModelProperty(value = "视频时常")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }

  /**
   * 视频访问地址
   **/
  @ApiModelProperty(value = "视频访问地址")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return (preview == null ? video.preview == null : preview.equals(video.preview)) &&
        (time == null ? video.time == null : time.equals(video.time)) &&
        (url == null ? video.url == null : url.equals(video.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (preview == null ? 0: preview.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (url == null ? 0: url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("  preview: ").append(preview).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
