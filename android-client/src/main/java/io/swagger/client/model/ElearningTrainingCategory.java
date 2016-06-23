package io.swagger.client.model;

import io.swagger.client.model.ElearningTrainingCategory;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * elearning培训类目
 **/
@ApiModel(description = "elearning培训类目")
public class ElearningTrainingCategory  {
  
  @SerializedName("image")
  private String image = null;
  @SerializedName("pageCount")
  private Integer pageCount = null;
  @SerializedName("cats")
  private List<ElearningTrainingCategory> cats = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("type")
  private Integer type = null;

  /**
   * 类目图片地址
   **/
  @ApiModelProperty(value = "类目图片地址")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * 类目下的单篇总数量
   **/
  @ApiModelProperty(value = "类目下的单篇总数量")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  /**
   * 子类目
   **/
  @ApiModelProperty(value = "子类目")
  public List<ElearningTrainingCategory> getCats() {
    return cats;
  }
  public void setCats(List<ElearningTrainingCategory> cats) {
    this.cats = cats;
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
   * 类目对应的页面类型：1-视频列表  | 2-文章列表 | 3-测试
   **/
  @ApiModelProperty(value = "类目对应的页面类型：1-视频列表  | 2-文章列表 | 3-测试")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElearningTrainingCategory elearningTrainingCategory = (ElearningTrainingCategory) o;
    return (image == null ? elearningTrainingCategory.image == null : image.equals(elearningTrainingCategory.image)) &&
        (pageCount == null ? elearningTrainingCategory.pageCount == null : pageCount.equals(elearningTrainingCategory.pageCount)) &&
        (cats == null ? elearningTrainingCategory.cats == null : cats.equals(elearningTrainingCategory.cats)) &&
        (name == null ? elearningTrainingCategory.name == null : name.equals(elearningTrainingCategory.name)) &&
        (id == null ? elearningTrainingCategory.id == null : id.equals(elearningTrainingCategory.id)) &&
        (type == null ? elearningTrainingCategory.type == null : type.equals(elearningTrainingCategory.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (image == null ? 0: image.hashCode());
    result = 31 * result + (pageCount == null ? 0: pageCount.hashCode());
    result = 31 * result + (cats == null ? 0: cats.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (type == null ? 0: type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElearningTrainingCategory {\n");
    
    sb.append("  image: ").append(image).append("\n");
    sb.append("  pageCount: ").append(pageCount).append("\n");
    sb.append("  cats: ").append(cats).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
