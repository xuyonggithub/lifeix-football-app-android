package io.swagger.client.model;

import io.swagger.client.model.ElearningOption;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * elearning视频
 **/
@ApiModel(description = "elearning视频")
public class ElearningVideo  {
  
  @SerializedName("r2")
  private List<ElearningOption> r2 = null;
  @SerializedName("duration")
  private Long duration = null;
  @SerializedName("videoPath")
  private String videoPath = null;
  @SerializedName("imagePath")
  private String imagePath = null;
  @SerializedName("rule")
  private String rule = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("explanation")
  private String explanation = null;
  @SerializedName("r1")
  private List<ElearningOption> r1 = null;
  @SerializedName("considerations")
  private String considerations = null;

  /**
   * 答题选项列表2
   **/
  @ApiModelProperty(value = "答题选项列表2")
  public List<ElearningOption> getR2() {
    return r2;
  }
  public void setR2(List<ElearningOption> r2) {
    this.r2 = r2;
  }

  /**
   * 视频时长
   **/
  @ApiModelProperty(value = "视频时长")
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  /**
   * 视频地址
   **/
  @ApiModelProperty(value = "视频地址")
  public String getVideoPath() {
    return videoPath;
  }
  public void setVideoPath(String videoPath) {
    this.videoPath = videoPath;
  }

  /**
   * 视频图片地址
   **/
  @ApiModelProperty(value = "视频图片地址")
  public String getImagePath() {
    return imagePath;
  }
  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  /**
   * 视频引用足球规则
   **/
  @ApiModelProperty(value = "视频引用足球规则")
  public String getRule() {
    return rule;
  }
  public void setRule(String rule) {
    this.rule = rule;
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
   * 视频解释
   **/
  @ApiModelProperty(value = "视频解释")
  public String getExplanation() {
    return explanation;
  }
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  /**
   * 答题选项列表1
   **/
  @ApiModelProperty(value = "答题选项列表1")
  public List<ElearningOption> getR1() {
    return r1;
  }
  public void setR1(List<ElearningOption> r1) {
    this.r1 = r1;
  }

  /**
   * 视频思考点
   **/
  @ApiModelProperty(value = "视频思考点")
  public String getConsiderations() {
    return considerations;
  }
  public void setConsiderations(String considerations) {
    this.considerations = considerations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElearningVideo elearningVideo = (ElearningVideo) o;
    return (r2 == null ? elearningVideo.r2 == null : r2.equals(elearningVideo.r2)) &&
        (duration == null ? elearningVideo.duration == null : duration.equals(elearningVideo.duration)) &&
        (videoPath == null ? elearningVideo.videoPath == null : videoPath.equals(elearningVideo.videoPath)) &&
        (imagePath == null ? elearningVideo.imagePath == null : imagePath.equals(elearningVideo.imagePath)) &&
        (rule == null ? elearningVideo.rule == null : rule.equals(elearningVideo.rule)) &&
        (id == null ? elearningVideo.id == null : id.equals(elearningVideo.id)) &&
        (explanation == null ? elearningVideo.explanation == null : explanation.equals(elearningVideo.explanation)) &&
        (r1 == null ? elearningVideo.r1 == null : r1.equals(elearningVideo.r1)) &&
        (considerations == null ? elearningVideo.considerations == null : considerations.equals(elearningVideo.considerations));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (r2 == null ? 0: r2.hashCode());
    result = 31 * result + (duration == null ? 0: duration.hashCode());
    result = 31 * result + (videoPath == null ? 0: videoPath.hashCode());
    result = 31 * result + (imagePath == null ? 0: imagePath.hashCode());
    result = 31 * result + (rule == null ? 0: rule.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (explanation == null ? 0: explanation.hashCode());
    result = 31 * result + (r1 == null ? 0: r1.hashCode());
    result = 31 * result + (considerations == null ? 0: considerations.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElearningVideo {\n");
    
    sb.append("  r2: ").append(r2).append("\n");
    sb.append("  duration: ").append(duration).append("\n");
    sb.append("  videoPath: ").append(videoPath).append("\n");
    sb.append("  imagePath: ").append(imagePath).append("\n");
    sb.append("  rule: ").append(rule).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  explanation: ").append(explanation).append("\n");
    sb.append("  r1: ").append(r1).append("\n");
    sb.append("  considerations: ").append(considerations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
