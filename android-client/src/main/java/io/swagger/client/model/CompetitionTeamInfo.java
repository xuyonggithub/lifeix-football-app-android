package io.swagger.client.model;

import io.swagger.client.model.TeamInfo;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 赛事队伍信息
 **/
@ApiModel(description = "赛事队伍信息")
public class CompetitionTeamInfo  {
  
  @SerializedName("setupDate")
  private Date setupDate = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("teamInfo")
  private TeamInfo teamInfo = null;
  @SerializedName("group")
  private String group = null;

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
   * 球队名称：参见xxx赛事的中国队
   **/
  @ApiModelProperty(value = "球队名称：参见xxx赛事的中国队")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
   **/
  @ApiModelProperty(value = "")
  public TeamInfo getTeamInfo() {
    return teamInfo;
  }
  public void setTeamInfo(TeamInfo teamInfo) {
    this.teamInfo = teamInfo;
  }

  /**
   * 球队分组
   **/
  @ApiModelProperty(value = "球队分组")
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
    CompetitionTeamInfo competitionTeamInfo = (CompetitionTeamInfo) o;
    return (setupDate == null ? competitionTeamInfo.setupDate == null : setupDate.equals(competitionTeamInfo.setupDate)) &&
        (name == null ? competitionTeamInfo.name == null : name.equals(competitionTeamInfo.name)) &&
        (id == null ? competitionTeamInfo.id == null : id.equals(competitionTeamInfo.id)) &&
        (teamInfo == null ? competitionTeamInfo.teamInfo == null : teamInfo.equals(competitionTeamInfo.teamInfo)) &&
        (group == null ? competitionTeamInfo.group == null : group.equals(competitionTeamInfo.group));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (setupDate == null ? 0: setupDate.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (teamInfo == null ? 0: teamInfo.hashCode());
    result = 31 * result + (group == null ? 0: group.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitionTeamInfo {\n");
    
    sb.append("  setupDate: ").append(setupDate).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  teamInfo: ").append(teamInfo).append("\n");
    sb.append("  group: ").append(group).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
