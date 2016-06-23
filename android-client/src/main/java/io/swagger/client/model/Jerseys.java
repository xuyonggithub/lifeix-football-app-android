package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 球衣
 **/
@ApiModel(description = "球衣")
public class Jerseys  {
  
  @SerializedName("image")
  private String image = null;
  @SerializedName("endDate")
  private Date endDate = null;
  @SerializedName("introduce")
  private String introduce = null;
  @SerializedName("teamId")
  private String teamId = null;
  @SerializedName("socks")
  private String socks = null;
  @SerializedName("jacket")
  private String jacket = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("shorts")
  private String shorts = null;
  @SerializedName("startDate")
  private Date startDate = null;

  /**
   * 球衣图片
   **/
  @ApiModelProperty(value = "球衣图片")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * 球衣停止使用时间
   **/
  @ApiModelProperty(value = "球衣停止使用时间")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   * 球衣创意介绍
   **/
  @ApiModelProperty(value = "球衣创意介绍")
  public String getIntroduce() {
    return introduce;
  }
  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  /**
   * 球队id
   **/
  @ApiModelProperty(value = "球队id")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  /**
   * 袜子
   **/
  @ApiModelProperty(value = "袜子")
  public String getSocks() {
    return socks;
  }
  public void setSocks(String socks) {
    this.socks = socks;
  }

  /**
   * 上衣
   **/
  @ApiModelProperty(value = "上衣")
  public String getJacket() {
    return jacket;
  }
  public void setJacket(String jacket) {
    this.jacket = jacket;
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
   * 球裤
   **/
  @ApiModelProperty(value = "球裤")
  public String getShorts() {
    return shorts;
  }
  public void setShorts(String shorts) {
    this.shorts = shorts;
  }

  /**
   * 球衣开始使用时间
   **/
  @ApiModelProperty(value = "球衣开始使用时间")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jerseys jerseys = (Jerseys) o;
    return (image == null ? jerseys.image == null : image.equals(jerseys.image)) &&
        (endDate == null ? jerseys.endDate == null : endDate.equals(jerseys.endDate)) &&
        (introduce == null ? jerseys.introduce == null : introduce.equals(jerseys.introduce)) &&
        (teamId == null ? jerseys.teamId == null : teamId.equals(jerseys.teamId)) &&
        (socks == null ? jerseys.socks == null : socks.equals(jerseys.socks)) &&
        (jacket == null ? jerseys.jacket == null : jacket.equals(jerseys.jacket)) &&
        (id == null ? jerseys.id == null : id.equals(jerseys.id)) &&
        (shorts == null ? jerseys.shorts == null : shorts.equals(jerseys.shorts)) &&
        (startDate == null ? jerseys.startDate == null : startDate.equals(jerseys.startDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (image == null ? 0: image.hashCode());
    result = 31 * result + (endDate == null ? 0: endDate.hashCode());
    result = 31 * result + (introduce == null ? 0: introduce.hashCode());
    result = 31 * result + (teamId == null ? 0: teamId.hashCode());
    result = 31 * result + (socks == null ? 0: socks.hashCode());
    result = 31 * result + (jacket == null ? 0: jacket.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (shorts == null ? 0: shorts.hashCode());
    result = 31 * result + (startDate == null ? 0: startDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jerseys {\n");
    
    sb.append("  image: ").append(image).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  introduce: ").append(introduce).append("\n");
    sb.append("  teamId: ").append(teamId).append("\n");
    sb.append("  socks: ").append(socks).append("\n");
    sb.append("  jacket: ").append(jacket).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  shorts: ").append(shorts).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
