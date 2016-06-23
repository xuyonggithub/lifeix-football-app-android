package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 比赛信息
 **/
@ApiModel(description = "比赛信息")
public class MatchTeamJerseys  {
  
  @SerializedName("image")
  private String image = null;
  @SerializedName("socks")
  private String socks = null;
  @SerializedName("jacket")
  private String jacket = null;
  @SerializedName("matchTeamId")
  private Long matchTeamId = null;
  @SerializedName("shorts")
  private String shorts = null;

  /**
   * 球服照片
   **/
  @ApiModelProperty(value = "球服照片")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * 球袜
   **/
  @ApiModelProperty(value = "球袜")
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
   * matchTeamId
   **/
  @ApiModelProperty(value = "matchTeamId")
  public Long getMatchTeamId() {
    return matchTeamId;
  }
  public void setMatchTeamId(Long matchTeamId) {
    this.matchTeamId = matchTeamId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTeamJerseys matchTeamJerseys = (MatchTeamJerseys) o;
    return (image == null ? matchTeamJerseys.image == null : image.equals(matchTeamJerseys.image)) &&
        (socks == null ? matchTeamJerseys.socks == null : socks.equals(matchTeamJerseys.socks)) &&
        (jacket == null ? matchTeamJerseys.jacket == null : jacket.equals(matchTeamJerseys.jacket)) &&
        (matchTeamId == null ? matchTeamJerseys.matchTeamId == null : matchTeamId.equals(matchTeamJerseys.matchTeamId)) &&
        (shorts == null ? matchTeamJerseys.shorts == null : shorts.equals(matchTeamJerseys.shorts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (image == null ? 0: image.hashCode());
    result = 31 * result + (socks == null ? 0: socks.hashCode());
    result = 31 * result + (jacket == null ? 0: jacket.hashCode());
    result = 31 * result + (matchTeamId == null ? 0: matchTeamId.hashCode());
    result = 31 * result + (shorts == null ? 0: shorts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTeamJerseys {\n");
    
    sb.append("  image: ").append(image).append("\n");
    sb.append("  socks: ").append(socks).append("\n");
    sb.append("  jacket: ").append(jacket).append("\n");
    sb.append("  matchTeamId: ").append(matchTeamId).append("\n");
    sb.append("  shorts: ").append(shorts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
