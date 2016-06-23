package io.swagger.client.model;

import io.swagger.client.model.CompetitionInfo;
import io.swagger.client.model.Court;
import io.swagger.client.model.MatchStaff;
import io.swagger.client.model.MatchTeam;
import io.swagger.client.model.Referee;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 比赛
 **/
@ApiModel(description = "比赛")
public class Match  {
  
  @SerializedName("chiefReferee")
  private Referee chiefReferee = null;
  @SerializedName("hostScore")
  private Integer hostScore = null;
  @SerializedName("awayTeam")
  private MatchTeam awayTeam = null;
  @SerializedName("bsjd")
  private MatchStaff bsjd = null;
  @SerializedName("competitionInfo")
  private CompetitionInfo competitionInfo = null;
  @SerializedName("introduce")
  private String introduce = null;
  @SerializedName("cpjd")
  private MatchStaff cpjd = null;
  @SerializedName("court")
  private Court court = null;
  @SerializedName("hostTeam")
  private MatchTeam hostTeam = null;
  @SerializedName("fourthReferee")
  private Referee fourthReferee = null;
  @SerializedName("awayScore")
  private Integer awayScore = null;
  @SerializedName("sideReferees")
  private List<Referee> sideReferees = null;
  @SerializedName("startTime")
  private Date startTime = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("position")
  private Date position = null;
  @SerializedName("state")
  private Integer state = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Referee getChiefReferee() {
    return chiefReferee;
  }
  public void setChiefReferee(Referee chiefReferee) {
    this.chiefReferee = chiefReferee;
  }

  /**
   * 主队进球数
   **/
  @ApiModelProperty(value = "主队进球数")
  public Integer getHostScore() {
    return hostScore;
  }
  public void setHostScore(Integer hostScore) {
    this.hostScore = hostScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MatchTeam getAwayTeam() {
    return awayTeam;
  }
  public void setAwayTeam(MatchTeam awayTeam) {
    this.awayTeam = awayTeam;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MatchStaff getBsjd() {
    return bsjd;
  }
  public void setBsjd(MatchStaff bsjd) {
    this.bsjd = bsjd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CompetitionInfo getCompetitionInfo() {
    return competitionInfo;
  }
  public void setCompetitionInfo(CompetitionInfo competitionInfo) {
    this.competitionInfo = competitionInfo;
  }

  /**
   * 比赛介绍，如历史战绩等
   **/
  @ApiModelProperty(value = "比赛介绍，如历史战绩等")
  public String getIntroduce() {
    return introduce;
  }
  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MatchStaff getCpjd() {
    return cpjd;
  }
  public void setCpjd(MatchStaff cpjd) {
    this.cpjd = cpjd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Court getCourt() {
    return court;
  }
  public void setCourt(Court court) {
    this.court = court;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MatchTeam getHostTeam() {
    return hostTeam;
  }
  public void setHostTeam(MatchTeam hostTeam) {
    this.hostTeam = hostTeam;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Referee getFourthReferee() {
    return fourthReferee;
  }
  public void setFourthReferee(Referee fourthReferee) {
    this.fourthReferee = fourthReferee;
  }

  /**
   * 客队进球数
   **/
  @ApiModelProperty(value = "客队进球数")
  public Integer getAwayScore() {
    return awayScore;
  }
  public void setAwayScore(Integer awayScore) {
    this.awayScore = awayScore;
  }

  /**
   * 边裁
   **/
  @ApiModelProperty(value = "边裁")
  public List<Referee> getSideReferees() {
    return sideReferees;
  }
  public void setSideReferees(List<Referee> sideReferees) {
    this.sideReferees = sideReferees;
  }

  /**
   * 比赛开始时间
   **/
  @ApiModelProperty(value = "比赛开始时间")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
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
   * 比赛开始地点
   **/
  @ApiModelProperty(value = "比赛开始地点")
  public Date getPosition() {
    return position;
  }
  public void setPosition(Date position) {
    this.position = position;
  }

  /**
   * 比赛状态 0：未开始，1：已结束
   **/
  @ApiModelProperty(value = "比赛状态 0：未开始，1：已结束")
  public Integer getState() {
    return state;
  }
  public void setState(Integer state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return (chiefReferee == null ? match.chiefReferee == null : chiefReferee.equals(match.chiefReferee)) &&
        (hostScore == null ? match.hostScore == null : hostScore.equals(match.hostScore)) &&
        (awayTeam == null ? match.awayTeam == null : awayTeam.equals(match.awayTeam)) &&
        (bsjd == null ? match.bsjd == null : bsjd.equals(match.bsjd)) &&
        (competitionInfo == null ? match.competitionInfo == null : competitionInfo.equals(match.competitionInfo)) &&
        (introduce == null ? match.introduce == null : introduce.equals(match.introduce)) &&
        (cpjd == null ? match.cpjd == null : cpjd.equals(match.cpjd)) &&
        (court == null ? match.court == null : court.equals(match.court)) &&
        (hostTeam == null ? match.hostTeam == null : hostTeam.equals(match.hostTeam)) &&
        (fourthReferee == null ? match.fourthReferee == null : fourthReferee.equals(match.fourthReferee)) &&
        (awayScore == null ? match.awayScore == null : awayScore.equals(match.awayScore)) &&
        (sideReferees == null ? match.sideReferees == null : sideReferees.equals(match.sideReferees)) &&
        (startTime == null ? match.startTime == null : startTime.equals(match.startTime)) &&
        (id == null ? match.id == null : id.equals(match.id)) &&
        (position == null ? match.position == null : position.equals(match.position)) &&
        (state == null ? match.state == null : state.equals(match.state));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (chiefReferee == null ? 0: chiefReferee.hashCode());
    result = 31 * result + (hostScore == null ? 0: hostScore.hashCode());
    result = 31 * result + (awayTeam == null ? 0: awayTeam.hashCode());
    result = 31 * result + (bsjd == null ? 0: bsjd.hashCode());
    result = 31 * result + (competitionInfo == null ? 0: competitionInfo.hashCode());
    result = 31 * result + (introduce == null ? 0: introduce.hashCode());
    result = 31 * result + (cpjd == null ? 0: cpjd.hashCode());
    result = 31 * result + (court == null ? 0: court.hashCode());
    result = 31 * result + (hostTeam == null ? 0: hostTeam.hashCode());
    result = 31 * result + (fourthReferee == null ? 0: fourthReferee.hashCode());
    result = 31 * result + (awayScore == null ? 0: awayScore.hashCode());
    result = 31 * result + (sideReferees == null ? 0: sideReferees.hashCode());
    result = 31 * result + (startTime == null ? 0: startTime.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    result = 31 * result + (state == null ? 0: state.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    
    sb.append("  chiefReferee: ").append(chiefReferee).append("\n");
    sb.append("  hostScore: ").append(hostScore).append("\n");
    sb.append("  awayTeam: ").append(awayTeam).append("\n");
    sb.append("  bsjd: ").append(bsjd).append("\n");
    sb.append("  competitionInfo: ").append(competitionInfo).append("\n");
    sb.append("  introduce: ").append(introduce).append("\n");
    sb.append("  cpjd: ").append(cpjd).append("\n");
    sb.append("  court: ").append(court).append("\n");
    sb.append("  hostTeam: ").append(hostTeam).append("\n");
    sb.append("  fourthReferee: ").append(fourthReferee).append("\n");
    sb.append("  awayScore: ").append(awayScore).append("\n");
    sb.append("  sideReferees: ").append(sideReferees).append("\n");
    sb.append("  startTime: ").append(startTime).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
