package io.swagger.client.model;

import io.swagger.client.model.Coach;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 教练分类
 **/
@ApiModel(description = "教练分类")
public class CoachCategory  {
  
  @SerializedName("coaches")
  private List<Coach> coaches = null;
  @SerializedName("categoryName")
  private String categoryName = null;

  /**
   * 教练列表
   **/
  @ApiModelProperty(value = "教练列表")
  public List<Coach> getCoaches() {
    return coaches;
  }
  public void setCoaches(List<Coach> coaches) {
    this.coaches = coaches;
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
    CoachCategory coachCategory = (CoachCategory) o;
    return (coaches == null ? coachCategory.coaches == null : coaches.equals(coachCategory.coaches)) &&
        (categoryName == null ? coachCategory.categoryName == null : categoryName.equals(coachCategory.categoryName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (coaches == null ? 0: coaches.hashCode());
    result = 31 * result + (categoryName == null ? 0: categoryName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachCategory {\n");
    
    sb.append("  coaches: ").append(coaches).append("\n");
    sb.append("  categoryName: ").append(categoryName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
