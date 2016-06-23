package io.swagger.client.model;

import io.swagger.client.model.Coach;
import io.swagger.client.model.CompetitionInfo;
import io.swagger.client.model.CompetitionTeamInfo;
import io.swagger.client.model.PlayerInfo;
import io.swagger.client.model.Staff;
import io.swagger.client.model.TeamInfo;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 比赛队伍信息
 **/
@ApiModel(description = "比赛队伍信息")
public class MatchTeam  {
  
  @SerializedName("doctor")
  private Staff doctor = null;
  @SerializedName("setupDate")
  private Date setupDate = null;
  @SerializedName("chiefCoach")
  private Coach chiefCoach = null;
  @SerializedName("introduce")
  private String introduce = null;
  @SerializedName("competitionInfo")
  private CompetitionInfo competitionInfo = null;
  @SerializedName("substitutionPlayers")
  private List<PlayerInfo> substitutionPlayers = null;
  @SerializedName("assistantCoach")
  private List<Coach> assistantCoach = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("teamLeader")
  private Staff teamLeader = null;
  @SerializedName("teamInfo")
  private TeamInfo teamInfo = null;
  @SerializedName("competitionTeamInfo")
  private CompetitionTeamInfo competitionTeamInfo = null;
  @SerializedName("firstPlayers")
  private List<PlayerInfo> firstPlayers = null;

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
  public List<PlayerInfo> getSubstitutionPlayers() {
    return substitutionPlayers;
  }
  public void setSubstitutionPlayers(List<PlayerInfo> substitutionPlayers) {
    this.substitutionPlayers = substitutionPlayers;
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
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
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

  /**
   **/
  @ApiModelProperty(value = "")
  public CompetitionTeamInfo getCompetitionTeamInfo() {
    return competitionTeamInfo;
  }
  public void setCompetitionTeamInfo(CompetitionTeamInfo competitionTeamInfo) {
    this.competitionTeamInfo = competitionTeamInfo;
  }

  /**
   * 球员
   **/
  @ApiModelProperty(value = "球员")
  public List<PlayerInfo> getFirstPlayers() {
    return firstPlayers;
  }
  public void setFirstPlayers(List<PlayerInfo> firstPlayers) {
    this.firstPlayers = firstPlayers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTeam matchTeam = (MatchTeam) o;
    return (doctor == null ? matchTeam.doctor == null : doctor.equals(matchTeam.doctor)) &&
        (setupDate == null ? matchTeam.setupDate == null : setupDate.equals(matchTeam.setupDate)) &&
        (chiefCoach == null ? matchTeam.chiefCoach == null : chiefCoach.equals(matchTeam.chiefCoach)) &&
        (introduce == null ? matchTeam.introduce == null : introduce.equals(matchTeam.introduce)) &&
        (competitionInfo == null ? matchTeam.competitionInfo == null : competitionInfo.equals(matchTeam.competitionInfo)) &&
        (substitutionPlayers == null ? matchTeam.substitutionPlayers == null : substitutionPlayers.equals(matchTeam.substitutionPlayers)) &&
        (assistantCoach == null ? matchTeam.assistantCoach == null : assistantCoach.equals(matchTeam.assistantCoach)) &&
        (id == null ? matchTeam.id == null : id.equals(matchTeam.id)) &&
        (teamLeader == null ? matchTeam.teamLeader == null : teamLeader.equals(matchTeam.teamLeader)) &&
        (teamInfo == null ? matchTeam.teamInfo == null : teamInfo.equals(matchTeam.teamInfo)) &&
        (competitionTeamInfo == null ? matchTeam.competitionTeamInfo == null : competitionTeamInfo.equals(matchTeam.competitionTeamInfo)) &&
        (firstPlayers == null ? matchTeam.firstPlayers == null : firstPlayers.equals(matchTeam.firstPlayers));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (doctor == null ? 0: doctor.hashCode());
    result = 31 * result + (setupDate == null ? 0: setupDate.hashCode());
    result = 31 * result + (chiefCoach == null ? 0: chiefCoach.hashCode());
    result = 31 * result + (introduce == null ? 0: introduce.hashCode());
    result = 31 * result + (competitionInfo == null ? 0: competitionInfo.hashCode());
    result = 31 * result + (substitutionPlayers == null ? 0: substitutionPlayers.hashCode());
    result = 31 * result + (assistantCoach == null ? 0: assistantCoach.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (teamLeader == null ? 0: teamLeader.hashCode());
    result = 31 * result + (teamInfo == null ? 0: teamInfo.hashCode());
    result = 31 * result + (competitionTeamInfo == null ? 0: competitionTeamInfo.hashCode());
    result = 31 * result + (firstPlayers == null ? 0: firstPlayers.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTeam {\n");
    
    sb.append("  doctor: ").append(doctor).append("\n");
    sb.append("  setupDate: ").append(setupDate).append("\n");
    sb.append("  chiefCoach: ").append(chiefCoach).append("\n");
    sb.append("  introduce: ").append(introduce).append("\n");
    sb.append("  competitionInfo: ").append(competitionInfo).append("\n");
    sb.append("  substitutionPlayers: ").append(substitutionPlayers).append("\n");
    sb.append("  assistantCoach: ").append(assistantCoach).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  teamLeader: ").append(teamLeader).append("\n");
    sb.append("  teamInfo: ").append(teamInfo).append("\n");
    sb.append("  competitionTeamInfo: ").append(competitionTeamInfo).append("\n");
    sb.append("  firstPlayers: ").append(firstPlayers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
