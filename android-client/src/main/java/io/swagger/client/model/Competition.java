package io.swagger.client.model;

import io.swagger.client.model.CompetitionCategory;
import io.swagger.client.model.Match;
import io.swagger.client.model.Team;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 赛事：比如12强赛
 **/
@ApiModel(description = "赛事：比如12强赛")
public class Competition  {
  
  @SerializedName("teams")
  private List<Team> teams = null;
  @SerializedName("endDate")
  private Date endDate = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("competitionCategory")
  private CompetitionCategory competitionCategory = null;
  @SerializedName("matches")
  private List<Match> matches = null;
  @SerializedName("startDate")
  private Date startDate = null;

  /**
   * 参赛队伍
   **/
  @ApiModelProperty(value = "参赛队伍")
  public List<Team> getTeams() {
    return teams;
  }
  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }

  /**
   * 赛季起始时间
   **/
  @ApiModelProperty(value = "赛季起始时间")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   * 12强赛
   **/
  @ApiModelProperty(value = "12强赛")
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
  public CompetitionCategory getCompetitionCategory() {
    return competitionCategory;
  }
  public void setCompetitionCategory(CompetitionCategory competitionCategory) {
    this.competitionCategory = competitionCategory;
  }

  /**
   * 比赛
   **/
  @ApiModelProperty(value = "比赛")
  public List<Match> getMatches() {
    return matches;
  }
  public void setMatches(List<Match> matches) {
    this.matches = matches;
  }

  /**
   * 赛季起始时间
   **/
  @ApiModelProperty(value = "赛季起始时间")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Competition competition = (Competition) o;
    return (teams == null ? competition.teams == null : teams.equals(competition.teams)) &&
        (endDate == null ? competition.endDate == null : endDate.equals(competition.endDate)) &&
        (name == null ? competition.name == null : name.equals(competition.name)) &&
        (id == null ? competition.id == null : id.equals(competition.id)) &&
        (competitionCategory == null ? competition.competitionCategory == null : competitionCategory.equals(competition.competitionCategory)) &&
        (matches == null ? competition.matches == null : matches.equals(competition.matches)) &&
        (startDate == null ? competition.startDate == null : startDate.equals(competition.startDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (teams == null ? 0: teams.hashCode());
    result = 31 * result + (endDate == null ? 0: endDate.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (competitionCategory == null ? 0: competitionCategory.hashCode());
    result = 31 * result + (matches == null ? 0: matches.hashCode());
    result = 31 * result + (startDate == null ? 0: startDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Competition {\n");
    
    sb.append("  teams: ").append(teams).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  competitionCategory: ").append(competitionCategory).append("\n");
    sb.append("  matches: ").append(matches).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
