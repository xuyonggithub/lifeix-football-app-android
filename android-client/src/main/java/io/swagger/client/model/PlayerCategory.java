package io.swagger.client.model;

import io.swagger.client.model.PlayerInfo;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 球员分类
 **/
@ApiModel(description = "球员分类")
public class PlayerCategory  {
  
  @SerializedName("players")
  private List<PlayerInfo> players = null;
  @SerializedName("categoryName")
  private String categoryName = null;

  /**
   * 球员列表
   **/
  @ApiModelProperty(value = "球员列表")
  public List<PlayerInfo> getPlayers() {
    return players;
  }
  public void setPlayers(List<PlayerInfo> players) {
    this.players = players;
  }

  /**
   * 分类名称
   **/
  @ApiModelProperty(value = "分类名称")
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerCategory playerCategory = (PlayerCategory) o;
    return (players == null ? playerCategory.players == null : players.equals(playerCategory.players)) &&
        (categoryName == null ? playerCategory.categoryName == null : categoryName.equals(playerCategory.categoryName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (players == null ? 0: players.hashCode());
    result = 31 * result + (categoryName == null ? 0: categoryName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerCategory {\n");
    
    sb.append("  players: ").append(players).append("\n");
    sb.append("  categoryName: ").append(categoryName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
