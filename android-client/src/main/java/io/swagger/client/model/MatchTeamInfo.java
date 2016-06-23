package io.swagger.client.model;

import io.swagger.client.model.TeamInfo;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 比赛队伍信息
 **/
@ApiModel(description = "比赛队伍信息")
public class MatchTeamInfo  {
  
  @SerializedName("setupDate")
  private Date setupDate = null;
  @SerializedName("introduce")
  private String introduce = null;
  @SerializedName("teamId")
  private Long teamId = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("teamInfo")
  private TeamInfo teamInfo = null;

  /**
   * 大名单公布时间
   **/
  @ApiModelProperty(value = "大名单公布时间")
  public Date getSetupDate() {
    return setupDate;
  }
  public void setSetupDate(Date setupDate) {
    this.setupDate = setupDate;
  }

  /**
   * 介绍
   **/
  @ApiModelProperty(value = "介绍")
  public String getIntroduce() {
    return introduce;
  }
  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  public Long getTeamId() {
    return teamId;
  }
  public void setTeamId(Long teamId) {
    this.teamId = teamId;
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
   **/
  @ApiModelProperty(value = "")
  public TeamInfo getTeamInfo() {
    return teamInfo;
  }
  public void setTeamInfo(TeamInfo teamInfo) {
    this.teamInfo = teamInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTeamInfo matchTeamInfo = (MatchTeamInfo) o;
    return (setupDate == null ? matchTeamInfo.setupDate == null : setupDate.equals(matchTeamInfo.setupDate)) &&
        (introduce == null ? matchTeamInfo.introduce == null : introduce.equals(matchTeamInfo.introduce)) &&
        (teamId == null ? matchTeamInfo.teamId == null : teamId.equals(matchTeamInfo.teamId)) &&
        (id == null ? matchTeamInfo.id == null : id.equals(matchTeamInfo.id)) &&
        (teamInfo == null ? matchTeamInfo.teamInfo == null : teamInfo.equals(matchTeamInfo.teamInfo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (setupDate == null ? 0: setupDate.hashCode());
    result = 31 * result + (introduce == null ? 0: introduce.hashCode());
    result = 31 * result + (teamId == null ? 0: teamId.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (teamInfo == null ? 0: teamInfo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTeamInfo {\n");
    
    sb.append("  setupDate: ").append(setupDate).append("\n");
    sb.append("  introduce: ").append(introduce).append("\n");
    sb.append("  teamId: ").append(teamId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  teamInfo: ").append(teamInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
