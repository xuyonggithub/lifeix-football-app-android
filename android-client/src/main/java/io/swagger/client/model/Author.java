package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 作者
 **/
@ApiModel(description = "作者")
public class Author  {
  
  @SerializedName("image")
  private String image = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;

  /**
   * 头像地址
   **/
  @ApiModelProperty(value = "头像地址")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * 昵称
   **/
  @ApiModelProperty(value = "昵称")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return (image == null ? author.image == null : image.equals(author.image)) &&
        (name == null ? author.name == null : name.equals(author.name)) &&
        (id == null ? author.id == null : id.equals(author.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (image == null ? 0: image.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("  image: ").append(image).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
