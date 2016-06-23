package io.swagger.client.model;

import io.swagger.client.model.Jerseys;
import io.swagger.client.model.TeamCategory;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 队伍信息
 **/
@ApiModel(description = "队伍信息")
public class TeamInfo  {
  
  @SerializedName("flag")
  private String flag = null;
  @SerializedName("teamCategory")
  private TeamCategory teamCategory = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("jerseys")
  private Jerseys jerseys = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("position")
  private String position = null;

  /**
   * 队旗
   **/
  @ApiModelProperty(value = "队旗")
  public String getFlag() {
    return flag;
  }
  public void setFlag(String flag) {
    this.flag = flag;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TeamCategory getTeamCategory() {
    return teamCategory;
  }
  public void setTeamCategory(TeamCategory teamCategory) {
    this.teamCategory = teamCategory;
  }

  /**
   * 球队名称：山东鲁能队
   **/
  @ApiModelProperty(value = "球队名称：山东鲁能队")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Jerseys getJerseys() {
    return jerseys;
  }
  public void setJerseys(Jerseys jerseys) {
    this.jerseys = jerseys;
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
   * 教练或者职员引用teamInfo时有数据,此人在球队中的位置
   **/
  @ApiModelProperty(value = "教练或者职员引用teamInfo时有数据,此人在球队中的位置")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamInfo teamInfo = (TeamInfo) o;
    return (flag == null ? teamInfo.flag == null : flag.equals(teamInfo.flag)) &&
        (teamCategory == null ? teamInfo.teamCategory == null : teamCategory.equals(teamInfo.teamCategory)) &&
        (name == null ? teamInfo.name == null : name.equals(teamInfo.name)) &&
        (jerseys == null ? teamInfo.jerseys == null : jerseys.equals(teamInfo.jerseys)) &&
        (id == null ? teamInfo.id == null : id.equals(teamInfo.id)) &&
        (position == null ? teamInfo.position == null : position.equals(teamInfo.position));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (flag == null ? 0: flag.hashCode());
    result = 31 * result + (teamCategory == null ? 0: teamCategory.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (jerseys == null ? 0: jerseys.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamInfo {\n");
    
    sb.append("  flag: ").append(flag).append("\n");
    sb.append("  teamCategory: ").append(teamCategory).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  jerseys: ").append(jerseys).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
