package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 比赛信息
 **/
@ApiModel(description = "比赛信息")
public class MatchTeamPlayer  {
  
  @SerializedName("booking")
  private Integer booking = null;
  @SerializedName("goal")
  private Integer goal = null;
  @SerializedName("dismissal")
  private Integer dismissal = null;
  @SerializedName("showTime")
  private Integer showTime = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("matchTeamId")
  private Long matchTeamId = null;
  @SerializedName("jeserysNum")
  private Integer jeserysNum = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("first")
  private Integer first = null;
  @SerializedName("playerId")
  private Long playerId = null;

  /**
   * 黄牌数
   **/
  @ApiModelProperty(value = "黄牌数")
  public Integer getBooking() {
    return booking;
  }
  public void setBooking(Integer booking) {
    this.booking = booking;
  }

  /**
   * 本场进球数
   **/
  @ApiModelProperty(value = "本场进球数")
  public Integer getGoal() {
    return goal;
  }
  public void setGoal(Integer goal) {
    this.goal = goal;
  }

  /**
   * 红牌数
   **/
  @ApiModelProperty(value = "红牌数")
  public Integer getDismissal() {
    return dismissal;
  }
  public void setDismissal(Integer dismissal) {
    this.dismissal = dismissal;
  }

  /**
   * 上场时间
   **/
  @ApiModelProperty(value = "上场时间")
  public Integer getShowTime() {
    return showTime;
  }
  public void setShowTime(Integer showTime) {
    this.showTime = showTime;
  }

  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
   * 球衣号码
   **/
  @ApiModelProperty(value = "球衣号码")
  public Integer getJeserysNum() {
    return jeserysNum;
  }
  public void setJeserysNum(Integer jeserysNum) {
    this.jeserysNum = jeserysNum;
  }

  /**
   * 场上位置
   **/
  @ApiModelProperty(value = "场上位置")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   * 是否首发,1:首发 0：替补
   **/
  @ApiModelProperty(value = "是否首发,1:首发 0：替补")
  public Integer getFirst() {
    return first;
  }
  public void setFirst(Integer first) {
    this.first = first;
  }

  /**
   * 球员id
   **/
  @ApiModelProperty(value = "球员id")
  public Long getPlayerId() {
    return playerId;
  }
  public void setPlayerId(Long playerId) {
    this.playerId = playerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTeamPlayer matchTeamPlayer = (MatchTeamPlayer) o;
    return (booking == null ? matchTeamPlayer.booking == null : booking.equals(matchTeamPlayer.booking)) &&
        (goal == null ? matchTeamPlayer.goal == null : goal.equals(matchTeamPlayer.goal)) &&
        (dismissal == null ? matchTeamPlayer.dismissal == null : dismissal.equals(matchTeamPlayer.dismissal)) &&
        (showTime == null ? matchTeamPlayer.showTime == null : showTime.equals(matchTeamPlayer.showTime)) &&
        (id == null ? matchTeamPlayer.id == null : id.equals(matchTeamPlayer.id)) &&
        (matchTeamId == null ? matchTeamPlayer.matchTeamId == null : matchTeamId.equals(matchTeamPlayer.matchTeamId)) &&
        (jeserysNum == null ? matchTeamPlayer.jeserysNum == null : jeserysNum.equals(matchTeamPlayer.jeserysNum)) &&
        (position == null ? matchTeamPlayer.position == null : position.equals(matchTeamPlayer.position)) &&
        (first == null ? matchTeamPlayer.first == null : first.equals(matchTeamPlayer.first)) &&
        (playerId == null ? matchTeamPlayer.playerId == null : playerId.equals(matchTeamPlayer.playerId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (booking == null ? 0: booking.hashCode());
    result = 31 * result + (goal == null ? 0: goal.hashCode());
    result = 31 * result + (dismissal == null ? 0: dismissal.hashCode());
    result = 31 * result + (showTime == null ? 0: showTime.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (matchTeamId == null ? 0: matchTeamId.hashCode());
    result = 31 * result + (jeserysNum == null ? 0: jeserysNum.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    result = 31 * result + (first == null ? 0: first.hashCode());
    result = 31 * result + (playerId == null ? 0: playerId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTeamPlayer {\n");
    
    sb.append("  booking: ").append(booking).append("\n");
    sb.append("  goal: ").append(goal).append("\n");
    sb.append("  dismissal: ").append(dismissal).append("\n");
    sb.append("  showTime: ").append(showTime).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  matchTeamId: ").append(matchTeamId).append("\n");
    sb.append("  jeserysNum: ").append(jeserysNum).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  first: ").append(first).append("\n");
    sb.append("  playerId: ").append(playerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
