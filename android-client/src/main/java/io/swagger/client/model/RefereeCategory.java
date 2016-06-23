package io.swagger.client.model;

import io.swagger.client.model.Referee;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 裁判分类
 **/
@ApiModel(description = "裁判分类")
public class RefereeCategory  {
  
  @SerializedName("categoryName")
  private String categoryName = null;
  @SerializedName("referees")
  private List<Referee> referees = null;

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

  /**
   * 裁判列表
   **/
  @ApiModelProperty(value = "裁判列表")
  public List<Referee> getReferees() {
    return referees;
  }
  public void setReferees(List<Referee> referees) {
    this.referees = referees;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefereeCategory refereeCategory = (RefereeCategory) o;
    return (categoryName == null ? refereeCategory.categoryName == null : categoryName.equals(refereeCategory.categoryName)) &&
        (referees == null ? refereeCategory.referees == null : referees.equals(refereeCategory.referees));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (categoryName == null ? 0: categoryName.hashCode());
    result = 31 * result + (referees == null ? 0: referees.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefereeCategory {\n");
    
    sb.append("  categoryName: ").append(categoryName).append("\n");
    sb.append("  referees: ").append(referees).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
