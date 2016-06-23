package io.swagger.client.model;

import io.swagger.client.model.Coach;
import io.swagger.client.model.CompetitionInfo;
import io.swagger.client.model.PlayerInfo;
import io.swagger.client.model.Staff;
import io.swagger.client.model.TeamInfo;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 赛事队伍信息
 **/
@ApiModel(description = "赛事队伍信息")
public class CompetitionTeam  {
  
  @SerializedName("doctor")
  private Staff doctor = null;
  @SerializedName("setupDate")
  private Date setupDate = null;
  @SerializedName("chiefCoach")
  private Coach chiefCoach = null;
  @SerializedName("competitionInfo")
  private CompetitionInfo competitionInfo = null;
  @SerializedName("players")
  private List<PlayerInfo> players = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("assistantCoach")
  private List<Coach> assistantCoach = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("teamLeader")
  private Staff teamLeader = null;
  @SerializedName("teamInfo")
  private TeamInfo teamInfo = null;

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
   **/
  @ApiModelProperty(value = "")
  public Coach getChiefCoach() {
    return chiefCoach;
  }
  public void setChiefCoach(Coach chiefCoach) {
    this.chiefCoach = chiefCoach;
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
   * 球员
   **/
  @ApiModelProperty(value = "球员")
  public List<PlayerInfo> getPlayers() {
    return players;
  }
  public void setPlayers(List<PlayerInfo> players) {
    this.players = players;
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
    CompetitionTeam competitionTeam = (CompetitionTeam) o;
    return (doctor == null ? competitionTeam.doctor == null : doctor.equals(competitionTeam.doctor)) &&
        (setupDate == null ? competitionTeam.setupDate == null : setupDate.equals(competitionTeam.setupDate)) &&
        (chiefCoach == null ? competitionTeam.chiefCoach == null : chiefCoach.equals(competitionTeam.chiefCoach)) &&
        (competitionInfo == null ? competitionTeam.competitionInfo == null : competitionInfo.equals(competitionTeam.competitionInfo)) &&
        (players == null ? competitionTeam.players == null : players.equals(competitionTeam.players)) &&
        (name == null ? competitionTeam.name == null : name.equals(competitionTeam.name)) &&
        (assistantCoach == null ? competitionTeam.assistantCoach == null : assistantCoach.equals(competitionTeam.assistantCoach)) &&
        (id == null ? competitionTeam.id == null : id.equals(competitionTeam.id)) &&
        (teamLeader == null ? competitionTeam.teamLeader == null : teamLeader.equals(competitionTeam.teamLeader)) &&
        (teamInfo == null ? competitionTeam.teamInfo == null : teamInfo.equals(competitionTeam.teamInfo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (doctor == null ? 0: doctor.hashCode());
    result = 31 * result + (setupDate == null ? 0: setupDate.hashCode());
    result = 31 * result + (chiefCoach == null ? 0: chiefCoach.hashCode());
    result = 31 * result + (competitionInfo == null ? 0: competitionInfo.hashCode());
    result = 31 * result + (players == null ? 0: players.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (assistantCoach == null ? 0: assistantCoach.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (teamLeader == null ? 0: teamLeader.hashCode());
    result = 31 * result + (teamInfo == null ? 0: teamInfo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitionTeam {\n");
    
    sb.append("  doctor: ").append(doctor).append("\n");
    sb.append("  setupDate: ").append(setupDate).append("\n");
    sb.append("  chiefCoach: ").append(chiefCoach).append("\n");
    sb.append("  competitionInfo: ").append(competitionInfo).append("\n");
    sb.append("  players: ").append(players).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  assistantCoach: ").append(assistantCoach).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  teamLeader: ").append(teamLeader).append("\n");
    sb.append("  teamInfo: ").append(teamInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
