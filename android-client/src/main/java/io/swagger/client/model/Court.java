package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 球场
 **/
@ApiModel(description = "球场")
public class Court  {
  
  @SerializedName("images")
  private String images = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("capacity")
  private Integer capacity = null;

  /**
   * 球场照片
   **/
  @ApiModelProperty(value = "球场照片")
  public String getImages() {
    return images;
  }
  public void setImages(String images) {
    this.images = images;
  }

  /**
   * 名字：鲁能大球场
   **/
  @ApiModelProperty(value = "名字：鲁能大球场")
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
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * 位置，例如：济南
   **/
  @ApiModelProperty(value = "位置，例如：济南")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   * 球场容量
   **/
  @ApiModelProperty(value = "球场容量")
  public Integer getCapacity() {
    return capacity;
  }
  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Court court = (Court) o;
    return (images == null ? court.images == null : images.equals(court.images)) &&
        (name == null ? court.name == null : name.equals(court.name)) &&
        (id == null ? court.id == null : id.equals(court.id)) &&
        (position == null ? court.position == null : position.equals(court.position)) &&
        (capacity == null ? court.capacity == null : capacity.equals(court.capacity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (images == null ? 0: images.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    result = 31 * result + (capacity == null ? 0: capacity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Court {\n");
    
    sb.append("  images: ").append(images).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  capacity: ").append(capacity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
