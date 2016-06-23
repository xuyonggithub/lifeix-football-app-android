package io.swagger.client.model;

import io.swagger.client.model.Category;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 类目
 **/
@ApiModel(description = "类目")
public class Category  {
  
  @SerializedName("fId")
  private String fId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("iconUrl")
  private String iconUrl = null;
  @SerializedName("categories")
  private List<Category> categories = null;

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
   * 类目图标地址
   **/
  @ApiModelProperty(value = "类目图标地址")
  public String getIconUrl() {
    return iconUrl;
  }
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  /**
   * 子类目
   **/
  @ApiModelProperty(value = "子类目")
  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return (fId == null ? category.fId == null : fId.equals(category.fId)) &&
        (name == null ? category.name == null : name.equals(category.name)) &&
        (id == null ? category.id == null : id.equals(category.id)) &&
        (iconUrl == null ? category.iconUrl == null : iconUrl.equals(category.iconUrl)) &&
        (categories == null ? category.categories == null : categories.equals(category.categories));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (fId == null ? 0: fId.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (iconUrl == null ? 0: iconUrl.hashCode());
    result = 31 * result + (categories == null ? 0: categories.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("  fId: ").append(fId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  iconUrl: ").append(iconUrl).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
