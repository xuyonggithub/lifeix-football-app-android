package io.swagger.client.model;

import io.swagger.client.model.CompetitionTeamInfo;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 创建比赛使用的中间对象，
 **/
@ApiModel(description = "创建比赛使用的中间对象，")
public class FrontMatch  {
  
  @SerializedName("hostTeam")
  private CompetitionTeamInfo hostTeam = null;
  @SerializedName("awayTeam")
  private CompetitionTeamInfo awayTeam = null;
  @SerializedName("startTime")
  private Date startTime = null;
  @SerializedName("startDate")
  private Date startDate = null;
  @SerializedName("courtId")
  private Long courtId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CompetitionTeamInfo getHostTeam() {
    return hostTeam;
  }
  public void setHostTeam(CompetitionTeamInfo hostTeam) {
    this.hostTeam = hostTeam;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CompetitionTeamInfo getAwayTeam() {
    return awayTeam;
  }
  public void setAwayTeam(CompetitionTeamInfo awayTeam) {
    this.awayTeam = awayTeam;
  }

  /**
   * 2016-07-04T19:30:00.000+0800
   **/
  @ApiModelProperty(value = "2016-07-04T19:30:00.000+0800")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * 2016-07-05
   **/
  @ApiModelProperty(value = "2016-07-05")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * 球场id
   **/
  @ApiModelProperty(value = "球场id")
  public Long getCourtId() {
    return courtId;
  }
  public void setCourtId(Long courtId) {
    this.courtId = courtId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrontMatch frontMatch = (FrontMatch) o;
    return (hostTeam == null ? frontMatch.hostTeam == null : hostTeam.equals(frontMatch.hostTeam)) &&
        (awayTeam == null ? frontMatch.awayTeam == null : awayTeam.equals(frontMatch.awayTeam)) &&
        (startTime == null ? frontMatch.startTime == null : startTime.equals(frontMatch.startTime)) &&
        (startDate == null ? frontMatch.startDate == null : startDate.equals(frontMatch.startDate)) &&
        (courtId == null ? frontMatch.courtId == null : courtId.equals(frontMatch.courtId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (hostTeam == null ? 0: hostTeam.hashCode());
    result = 31 * result + (awayTeam == null ? 0: awayTeam.hashCode());
    result = 31 * result + (startTime == null ? 0: startTime.hashCode());
    result = 31 * result + (startDate == null ? 0: startDate.hashCode());
    result = 31 * result + (courtId == null ? 0: courtId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrontMatch {\n");
    
    sb.append("  hostTeam: ").append(hostTeam).append("\n");
    sb.append("  awayTeam: ").append(awayTeam).append("\n");
    sb.append("  startTime: ").append(startTime).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  courtId: ").append(courtId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
