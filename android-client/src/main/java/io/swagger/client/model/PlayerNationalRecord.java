package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 球员国家队记录
 **/
@ApiModel(description = "球员国家队记录")
public class PlayerNationalRecord  {
  
  @SerializedName("substitution")
  private Integer substitution = null;
  @SerializedName("gamesplayed")
  private Integer gamesplayed = null;
  @SerializedName("dismissals")
  private Integer dismissals = null;
  @SerializedName("starts")
  private Integer starts = null;
  @SerializedName("bookings")
  private Integer bookings = null;
  @SerializedName("playerId")
  private Long playerId = null;
  @SerializedName("goals")
  private Integer goals = null;

  /**
   * 替补上场次数
   **/
  @ApiModelProperty(value = "替补上场次数")
  public Integer getSubstitution() {
    return substitution;
  }
  public void setSubstitution(Integer substitution) {
    this.substitution = substitution;
  }

  /**
   * 上场次数
   **/
  @ApiModelProperty(value = "上场次数")
  public Integer getGamesplayed() {
    return gamesplayed;
  }
  public void setGamesplayed(Integer gamesplayed) {
    this.gamesplayed = gamesplayed;
  }

  /**
   * 红牌数
   **/
  @ApiModelProperty(value = "红牌数")
  public Integer getDismissals() {
    return dismissals;
  }
  public void setDismissals(Integer dismissals) {
    this.dismissals = dismissals;
  }

  /**
   * 首发上场次数
   **/
  @ApiModelProperty(value = "首发上场次数")
  public Integer getStarts() {
    return starts;
  }
  public void setStarts(Integer starts) {
    this.starts = starts;
  }

  /**
   * 黄牌数
   **/
  @ApiModelProperty(value = "黄牌数")
  public Integer getBookings() {
    return bookings;
  }
  public void setBookings(Integer bookings) {
    this.bookings = bookings;
  }

  /**
   * playerId
   **/
  @ApiModelProperty(value = "playerId")
  public Long getPlayerId() {
    return playerId;
  }
  public void setPlayerId(Long playerId) {
    this.playerId = playerId;
  }

  /**
   * 进球数
   **/
  @ApiModelProperty(value = "进球数")
  public Integer getGoals() {
    return goals;
  }
  public void setGoals(Integer goals) {
    this.goals = goals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerNationalRecord playerNationalRecord = (PlayerNationalRecord) o;
    return (substitution == null ? playerNationalRecord.substitution == null : substitution.equals(playerNationalRecord.substitution)) &&
        (gamesplayed == null ? playerNationalRecord.gamesplayed == null : gamesplayed.equals(playerNationalRecord.gamesplayed)) &&
        (dismissals == null ? playerNationalRecord.dismissals == null : dismissals.equals(playerNationalRecord.dismissals)) &&
        (starts == null ? playerNationalRecord.starts == null : starts.equals(playerNationalRecord.starts)) &&
        (bookings == null ? playerNationalRecord.bookings == null : bookings.equals(playerNationalRecord.bookings)) &&
        (playerId == null ? playerNationalRecord.playerId == null : playerId.equals(playerNationalRecord.playerId)) &&
        (goals == null ? playerNationalRecord.goals == null : goals.equals(playerNationalRecord.goals));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (substitution == null ? 0: substitution.hashCode());
    result = 31 * result + (gamesplayed == null ? 0: gamesplayed.hashCode());
    result = 31 * result + (dismissals == null ? 0: dismissals.hashCode());
    result = 31 * result + (starts == null ? 0: starts.hashCode());
    result = 31 * result + (bookings == null ? 0: bookings.hashCode());
    result = 31 * result + (playerId == null ? 0: playerId.hashCode());
    result = 31 * result + (goals == null ? 0: goals.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerNationalRecord {\n");
    
    sb.append("  substitution: ").append(substitution).append("\n");
    sb.append("  gamesplayed: ").append(gamesplayed).append("\n");
    sb.append("  dismissals: ").append(dismissals).append("\n");
    sb.append("  starts: ").append(starts).append("\n");
    sb.append("  bookings: ").append(bookings).append("\n");
    sb.append("  playerId: ").append(playerId).append("\n");
    sb.append("  goals: ").append(goals).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
