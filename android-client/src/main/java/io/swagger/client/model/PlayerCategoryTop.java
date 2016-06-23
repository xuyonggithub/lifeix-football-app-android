package io.swagger.client.model;

import io.swagger.client.model.PlayerCategory;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 球员分类
 **/
@ApiModel(description = "球员分类")
public class PlayerCategoryTop  {
  
  @SerializedName("topName")
  private String topName = null;
  @SerializedName("category")
  private List<PlayerCategory> category = null;

  /**
   * 顶级分类名称
   **/
  @ApiModelProperty(value = "顶级分类名称")
  public String getTopName() {
    return topName;
  }
  public void setTopName(String topName) {
    this.topName = topName;
  }

  /**
   * 下级分类
   **/
  @ApiModelProperty(value = "下级分类")
  public List<PlayerCategory> getCategory() {
    return category;
  }
  public void setCategory(List<PlayerCategory> category) {
    this.category = category;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerCategoryTop playerCategoryTop = (PlayerCategoryTop) o;
    return (topName == null ? playerCategoryTop.topName == null : topName.equals(playerCategoryTop.topName)) &&
        (category == null ? playerCategoryTop.category == null : category.equals(playerCategoryTop.category));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (topName == null ? 0: topName.hashCode());
    result = 31 * result + (category == null ? 0: category.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerCategoryTop {\n");
    
    sb.append("  topName: ").append(topName).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
