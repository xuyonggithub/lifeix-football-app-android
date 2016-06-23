package io.swagger.client.model;

import io.swagger.client.model.TeamCategory;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 球队分类
 **/
@ApiModel(description = "球队分类")
public class TeamCategory  {
  
  @SerializedName("fId")
  private String fId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("categories")
  private List<TeamCategory> categories = null;
  @SerializedName("isLeaf")
  private Integer isLeaf = null;

  /**
   * 父目录Id
   **/
  @ApiModelProperty(value = "父目录Id")
  public String getFId() {
    return fId;
  }
  public void setFId(String fId) {
    this.fId = fId;
  }

  /**
   * 类目名称
   **/
  @ApiModelProperty(value = "类目名称")
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
   * 子类目
   **/
  @ApiModelProperty(value = "子类目")
  public List<TeamCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<TeamCategory> categories) {
    this.categories = categories;
  }

  /**
   * 是否是叶子节点
   **/
  @ApiModelProperty(value = "是否是叶子节点")
  public Integer getIsLeaf() {
    return isLeaf;
  }
  public void setIsLeaf(Integer isLeaf) {
    this.isLeaf = isLeaf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamCategory teamCategory = (TeamCategory) o;
    return (fId == null ? teamCategory.fId == null : fId.equals(teamCategory.fId)) &&
        (name == null ? teamCategory.name == null : name.equals(teamCategory.name)) &&
        (id == null ? teamCategory.id == null : id.equals(teamCategory.id)) &&
        (categories == null ? teamCategory.categories == null : categories.equals(teamCategory.categories)) &&
        (isLeaf == null ? teamCategory.isLeaf == null : isLeaf.equals(teamCategory.isLeaf));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (fId == null ? 0: fId.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (categories == null ? 0: categories.hashCode());
    result = 31 * result + (isLeaf == null ? 0: isLeaf.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamCategory {\n");
    
    sb.append("  fId: ").append(fId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("  isLeaf: ").append(isLeaf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
