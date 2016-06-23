package io.swagger.client.model;

import io.swagger.client.model.CompetitionInfo;
import io.swagger.client.model.TeamInfo;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 队员国家队比赛记录
 **/
@ApiModel(description = "队员国家队比赛记录")
public class PlayerNationalMatch  {
  
  @SerializedName("hostTeam")
  private TeamInfo hostTeam = null;
  @SerializedName("booking")
  private Integer booking = null;
  @SerializedName("goal")
  private Integer goal = null;
  @SerializedName("hostScore")
  private Integer hostScore = null;
  @SerializedName("dismissal")
  private Integer dismissal = null;
  @SerializedName("awayTeam")
  private TeamInfo awayTeam = null;
  @SerializedName("awayScore")
  private Integer awayScore = null;
  @SerializedName("showTime")
  private Integer showTime = null;
  @SerializedName("competition")
  private CompetitionInfo competition = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("first")
  private Integer first = null;
  @SerializedName("playerId")
  private Long playerId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TeamInfo getHostTeam() {
    return hostTeam;
  }
  public void setHostTeam(TeamInfo hostTeam) {
    this.hostTeam = hostTeam;
  }

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
   * 进球数
   **/
  @ApiModelProperty(value = "进球数")
  public Integer getGoal() {
    return goal;
  }
  public void setGoal(Integer goal) {
    this.goal = goal;
  }

  /**
   * 主队进球
   **/
  @ApiModelProperty(value = "主队进球")
  public Integer getHostScore() {
    return hostScore;
  }
  public void setHostScore(Integer hostScore) {
    this.hostScore = hostScore;
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
   **/
  @ApiModelProperty(value = "")
  public TeamInfo getAwayTeam() {
    return awayTeam;
  }
  public void setAwayTeam(TeamInfo awayTeam) {
    this.awayTeam = awayTeam;
  }

  /**
   * 客队进球
   **/
  @ApiModelProperty(value = "客队进球")
  public Integer getAwayScore() {
    return awayScore;
  }
  public void setAwayScore(Integer awayScore) {
    this.awayScore = awayScore;
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
   **/
  @ApiModelProperty(value = "")
  public CompetitionInfo getCompetition() {
    return competition;
  }
  public void setCompetition(CompetitionInfo competition) {
    this.competition = competition;
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
   * 是否首发 0：为首发 1：首发
   **/
  @ApiModelProperty(value = "是否首发 0：为首发 1：首发")
  public Integer getFirst() {
    return first;
  }
  public void setFirst(Integer first) {
    this.first = first;
  }

  /**
   * playerId
   **/
  @ApiModelProperty(value = "playerId")
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
    PlayerNationalMatch playerNationalMatch = (PlayerNationalMatch) o;
    return (hostTeam == null ? playerNationalMatch.hostTeam == null : hostTeam.equals(playerNationalMatch.hostTeam)) &&
        (booking == null ? playerNationalMatch.booking == null : booking.equals(playerNationalMatch.booking)) &&
        (goal == null ? playerNationalMatch.goal == null : goal.equals(playerNationalMatch.goal)) &&
        (hostScore == null ? playerNationalMatch.hostScore == null : hostScore.equals(playerNationalMatch.hostScore)) &&
        (dismissal == null ? playerNationalMatch.dismissal == null : dismissal.equals(playerNationalMatch.dismissal)) &&
        (awayTeam == null ? playerNationalMatch.awayTeam == null : awayTeam.equals(playerNationalMatch.awayTeam)) &&
        (awayScore == null ? playerNationalMatch.awayScore == null : awayScore.equals(playerNationalMatch.awayScore)) &&
        (showTime == null ? playerNationalMatch.showTime == null : showTime.equals(playerNationalMatch.showTime)) &&
        (competition == null ? playerNationalMatch.competition == null : competition.equals(playerNationalMatch.competition)) &&
        (id == null ? playerNationalMatch.id == null : id.equals(playerNationalMatch.id)) &&
        (first == null ? playerNationalMatch.first == null : first.equals(playerNationalMatch.first)) &&
        (playerId == null ? playerNationalMatch.playerId == null : playerId.equals(playerNationalMatch.playerId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (hostTeam == null ? 0: hostTeam.hashCode());
    result = 31 * result + (booking == null ? 0: booking.hashCode());
    result = 31 * result + (goal == null ? 0: goal.hashCode());
    result = 31 * result + (hostScore == null ? 0: hostScore.hashCode());
    result = 31 * result + (dismissal == null ? 0: dismissal.hashCode());
    result = 31 * result + (awayTeam == null ? 0: awayTeam.hashCode());
    result = 31 * result + (awayScore == null ? 0: awayScore.hashCode());
    result = 31 * result + (showTime == null ? 0: showTime.hashCode());
    result = 31 * result + (competition == null ? 0: competition.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (first == null ? 0: first.hashCode());
    result = 31 * result + (playerId == null ? 0: playerId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerNationalMatch {\n");
    
    sb.append("  hostTeam: ").append(hostTeam).append("\n");
    sb.append("  booking: ").append(booking).append("\n");
    sb.append("  goal: ").append(goal).append("\n");
    sb.append("  hostScore: ").append(hostScore).append("\n");
    sb.append("  dismissal: ").append(dismissal).append("\n");
    sb.append("  awayTeam: ").append(awayTeam).append("\n");
    sb.append("  awayScore: ").append(awayScore).append("\n");
    sb.append("  showTime: ").append(showTime).append("\n");
    sb.append("  competition: ").append(competition).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  first: ").append(first).append("\n");
    sb.append("  playerId: ").append(playerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
