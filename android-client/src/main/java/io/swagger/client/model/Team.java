package io.swagger.client.model;

import io.swagger.client.model.Coach;
import io.swagger.client.model.Jerseys;
import io.swagger.client.model.Player;
import io.swagger.client.model.Staff;
import io.swagger.client.model.TeamCategory;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 队伍信息
 **/
@ApiModel(description = "队伍信息")
public class Team  {
  
  @SerializedName("doctor")
  private Staff doctor = null;
  @SerializedName("chiefCoach")
  private Coach chiefCoach = null;
  @SerializedName("flag")
  private String flag = null;
  @SerializedName("players")
  private List<Player> players = null;
  @SerializedName("teamCategory")
  private TeamCategory teamCategory = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("assistantCoach")
  private List<Coach> assistantCoach = null;
  @SerializedName("jerseys")
  private Jerseys jerseys = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("teamLeader")
  private Staff teamLeader = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Staff getDoctor() {
    return doctor;
  }
  public void setDoctor(Staff doctor) {
    this.doctor = doctor;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Coach getChiefCoach() {
    return chiefCoach;
  }
  public void setChiefCoach(Coach chiefCoach) {
    this.chiefCoach = chiefCoach;
  }

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
   * 球员
   **/
  @ApiModelProperty(value = "球员")
  public List<Player> getPlayers() {
    return players;
  }
  public void setPlayers(List<Player> players) {
    this.players = players;
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
   * 球队名称：中国队
   **/
  @ApiModelProperty(value = "球队名称：中国队")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 助理教练
   **/
  @ApiModelProperty(value = "助理教练")
  public List<Coach> getAssistantCoach() {
    return assistantCoach;
  }
  public void setAssistantCoach(List<Coach> assistantCoach) {
    this.assistantCoach = assistantCoach;
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
   **/
  @ApiModelProperty(value = "")
  public Staff getTeamLeader() {
    return teamLeader;
  }
  public void setTeamLeader(Staff teamLeader) {
    this.teamLeader = teamLeader;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return (doctor == null ? team.doctor == null : doctor.equals(team.doctor)) &&
        (chiefCoach == null ? team.chiefCoach == null : chiefCoach.equals(team.chiefCoach)) &&
        (flag == null ? team.flag == null : flag.equals(team.flag)) &&
        (players == null ? team.players == null : players.equals(team.players)) &&
        (teamCategory == null ? team.teamCategory == null : teamCategory.equals(team.teamCategory)) &&
        (name == null ? team.name == null : name.equals(team.name)) &&
        (assistantCoach == null ? team.assistantCoach == null : assistantCoach.equals(team.assistantCoach)) &&
        (jerseys == null ? team.jerseys == null : jerseys.equals(team.jerseys)) &&
        (id == null ? team.id == null : id.equals(team.id)) &&
        (teamLeader == null ? team.teamLeader == null : teamLeader.equals(team.teamLeader));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (doctor == null ? 0: doctor.hashCode());
    result = 31 * result + (chiefCoach == null ? 0: chiefCoach.hashCode());
    result = 31 * result + (flag == null ? 0: flag.hashCode());
    result = 31 * result + (players == null ? 0: players.hashCode());
    result = 31 * result + (teamCategory == null ? 0: teamCategory.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (assistantCoach == null ? 0: assistantCoach.hashCode());
    result = 31 * result + (jerseys == null ? 0: jerseys.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (teamLeader == null ? 0: teamLeader.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    
    sb.append("  doctor: ").append(doctor).append("\n");
    sb.append("  chiefCoach: ").append(chiefCoach).append("\n");
    sb.append("  flag: ").append(flag).append("\n");
    sb.append("  players: ").append(players).append("\n");
    sb.append("  teamCategory: ").append(teamCategory).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  assistantCoach: ").append(assistantCoach).append("\n");
    sb.append("  jerseys: ").append(jerseys).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  teamLeader: ").append(teamLeader).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
