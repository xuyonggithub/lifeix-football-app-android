package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 赛事概要
 **/
@ApiModel(description = "赛事概要")
public class CompetitionInfo  {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("startTime")
  private Date startTime = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("endTime")
  private Date endTime = null;

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
   * 赛季起始时间
   **/
  @ApiModelProperty(value = "赛季起始时间")
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
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * 赛季起始时间
   **/
  @ApiModelProperty(value = "赛季起始时间")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitionInfo competitionInfo = (CompetitionInfo) o;
    return (name == null ? competitionInfo.name == null : name.equals(competitionInfo.name)) &&
        (startTime == null ? competitionInfo.startTime == null : startTime.equals(competitionInfo.startTime)) &&
        (id == null ? competitionInfo.id == null : id.equals(competitionInfo.id)) &&
        (endTime == null ? competitionInfo.endTime == null : endTime.equals(competitionInfo.endTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (startTime == null ? 0: startTime.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (endTime == null ? 0: endTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitionInfo {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  startTime: ").append(startTime).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  endTime: ").append(endTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
