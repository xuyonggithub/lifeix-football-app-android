package io.swagger.client.model;

import io.swagger.client.model.CompetitionInfo;
import io.swagger.client.model.Court;
import io.swagger.client.model.MatchTeamInfo;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 比赛信息
 **/
@ApiModel(description = "比赛信息")
public class MatchInfo  {
  
  @SerializedName("hostScore")
  private Integer hostScore = null;
  @SerializedName("awayTeam")
  private MatchTeamInfo awayTeam = null;
  @SerializedName("competitionInfo")
  private CompetitionInfo competitionInfo = null;
  @SerializedName("introduce")
  private String introduce = null;
  @SerializedName("court")
  private Court court = null;
  @SerializedName("hostTeam")
  private MatchTeamInfo hostTeam = null;
  @SerializedName("stage")
  private String stage = null;
  @SerializedName("awayScore")
  private Integer awayScore = null;
  @SerializedName("startTime")
  private Date startTime = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("state")
  private Integer state = null;
  @SerializedName("startDate")
  private Date startDate = null;
  @SerializedName("group")
  private String group = null;

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
  public MatchTeamInfo getAwayTeam() {
    return awayTeam;
  }
  public void setAwayTeam(MatchTeamInfo awayTeam) {
    this.awayTeam = awayTeam;
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
  public Court getCourt() {
    return court;
  }
  public void setCourt(Court court) {
    this.court = court;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MatchTeamInfo getHostTeam() {
    return hostTeam;
  }
  public void setHostTeam(MatchTeamInfo hostTeam) {
    this.hostTeam = hostTeam;
  }

  /**
   * 比赛阶段
   **/
  @ApiModelProperty(value = "比赛阶段")
  public String getStage() {
    return stage;
  }
  public void setStage(String stage) {
    this.stage = stage;
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
   * 比赛时间
   **/
  @ApiModelProperty(value = "比赛时间")
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
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   * 比赛状态
   **/
  @ApiModelProperty(value = "比赛状态")
  public Integer getState() {
    return state;
  }
  public void setState(Integer state) {
    this.state = state;
  }

  /**
   * 比赛日期
   **/
  @ApiModelProperty(value = "比赛日期")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * 赛事分组
   **/
  @ApiModelProperty(value = "赛事分组")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchInfo matchInfo = (MatchInfo) o;
    return (hostScore == null ? matchInfo.hostScore == null : hostScore.equals(matchInfo.hostScore)) &&
        (awayTeam == null ? matchInfo.awayTeam == null : awayTeam.equals(matchInfo.awayTeam)) &&
        (competitionInfo == null ? matchInfo.competitionInfo == null : competitionInfo.equals(matchInfo.competitionInfo)) &&
        (introduce == null ? matchInfo.introduce == null : introduce.equals(matchInfo.introduce)) &&
        (court == null ? matchInfo.court == null : court.equals(matchInfo.court)) &&
        (hostTeam == null ? matchInfo.hostTeam == null : hostTeam.equals(matchInfo.hostTeam)) &&
        (stage == null ? matchInfo.stage == null : stage.equals(matchInfo.stage)) &&
        (awayScore == null ? matchInfo.awayScore == null : awayScore.equals(matchInfo.awayScore)) &&
        (startTime == null ? matchInfo.startTime == null : startTime.equals(matchInfo.startTime)) &&
        (id == null ? matchInfo.id == null : id.equals(matchInfo.id)) &&
        (position == null ? matchInfo.position == null : position.equals(matchInfo.position)) &&
        (state == null ? matchInfo.state == null : state.equals(matchInfo.state)) &&
        (startDate == null ? matchInfo.startDate == null : startDate.equals(matchInfo.startDate)) &&
        (group == null ? matchInfo.group == null : group.equals(matchInfo.group));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (hostScore == null ? 0: hostScore.hashCode());
    result = 31 * result + (awayTeam == null ? 0: awayTeam.hashCode());
    result = 31 * result + (competitionInfo == null ? 0: competitionInfo.hashCode());
    result = 31 * result + (introduce == null ? 0: introduce.hashCode());
    result = 31 * result + (court == null ? 0: court.hashCode());
    result = 31 * result + (hostTeam == null ? 0: hostTeam.hashCode());
    result = 31 * result + (stage == null ? 0: stage.hashCode());
    result = 31 * result + (awayScore == null ? 0: awayScore.hashCode());
    result = 31 * result + (startTime == null ? 0: startTime.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    result = 31 * result + (state == null ? 0: state.hashCode());
    result = 31 * result + (startDate == null ? 0: startDate.hashCode());
    result = 31 * result + (group == null ? 0: group.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchInfo {\n");
    
    sb.append("  hostScore: ").append(hostScore).append("\n");
    sb.append("  awayTeam: ").append(awayTeam).append("\n");
    sb.append("  competitionInfo: ").append(competitionInfo).append("\n");
    sb.append("  introduce: ").append(introduce).append("\n");
    sb.append("  court: ").append(court).append("\n");
    sb.append("  hostTeam: ").append(hostTeam).append("\n");
    sb.append("  stage: ").append(stage).append("\n");
    sb.append("  awayScore: ").append(awayScore).append("\n");
    sb.append("  startTime: ").append(startTime).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  group: ").append(group).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
