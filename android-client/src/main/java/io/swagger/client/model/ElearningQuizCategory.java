package io.swagger.client.model;

import io.swagger.client.model.ElearningQuizCategory;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * elearning测试类目
 **/
@ApiModel(description = "elearning测试类目")
public class ElearningQuizCategory  {
  
  @SerializedName("image")
  private String image = null;
  @SerializedName("cats")
  private List<ElearningQuizCategory> cats = null;
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
   * 子类目
   **/
  @ApiModelProperty(value = "子类目")
  public List<ElearningQuizCategory> getCats() {
    return cats;
  }
  public void setCats(List<ElearningQuizCategory> cats) {
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
    ElearningQuizCategory elearningQuizCategory = (ElearningQuizCategory) o;
    return (image == null ? elearningQuizCategory.image == null : image.equals(elearningQuizCategory.image)) &&
        (cats == null ? elearningQuizCategory.cats == null : cats.equals(elearningQuizCategory.cats)) &&
        (name == null ? elearningQuizCategory.name == null : name.equals(elearningQuizCategory.name)) &&
        (id == null ? elearningQuizCategory.id == null : id.equals(elearningQuizCategory.id)) &&
        (type == null ? elearningQuizCategory.type == null : type.equals(elearningQuizCategory.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (image == null ? 0: image.hashCode());
    result = 31 * result + (cats == null ? 0: cats.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (type == null ? 0: type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElearningQuizCategory {\n");
    
    sb.append("  image: ").append(image).append("\n");
    sb.append("  cats: ").append(cats).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
