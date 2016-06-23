package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 比赛工作人员
 **/
@ApiModel(description = "比赛工作人员")
public class MatchStaff  {
  
  @SerializedName("birthday")
  private Date birthday = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("birthplace")
  private String birthplace = null;
  @SerializedName("introduce")
  private String introduce = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("position")
  private String position = null;

  /**
   * 出生地  中国北京
   **/
  @ApiModelProperty(value = "出生地  中国北京")
  public Date getBirthday() {
    return birthday;
  }
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  /**
   * 国家： 中国
   **/
  @ApiModelProperty(value = "国家： 中国")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * 出生地  中国北京
   **/
  @ApiModelProperty(value = "出生地  中国北京")
  public String getBirthplace() {
    return birthplace;
  }
  public void setBirthplace(String birthplace) {
    this.birthplace = birthplace;
  }

  /**
   * 介绍
   **/
  @ApiModelProperty(value = "介绍")
  public String getIntroduce() {
    return introduce;
  }
  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  /**
   * 名字
   **/
  @ApiModelProperty(value = "名字")
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
   * 照片
   **/
  @ApiModelProperty(value = "照片")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  /**
   * 职位：领队,队医....
   **/
  @ApiModelProperty(value = "职位：领队,队医....")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchStaff matchStaff = (MatchStaff) o;
    return (birthday == null ? matchStaff.birthday == null : birthday.equals(matchStaff.birthday)) &&
        (country == null ? matchStaff.country == null : country.equals(matchStaff.country)) &&
        (birthplace == null ? matchStaff.birthplace == null : birthplace.equals(matchStaff.birthplace)) &&
        (introduce == null ? matchStaff.introduce == null : introduce.equals(matchStaff.introduce)) &&
        (name == null ? matchStaff.name == null : name.equals(matchStaff.name)) &&
        (id == null ? matchStaff.id == null : id.equals(matchStaff.id)) &&
        (avatar == null ? matchStaff.avatar == null : avatar.equals(matchStaff.avatar)) &&
        (position == null ? matchStaff.position == null : position.equals(matchStaff.position));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (birthday == null ? 0: birthday.hashCode());
    result = 31 * result + (country == null ? 0: country.hashCode());
    result = 31 * result + (birthplace == null ? 0: birthplace.hashCode());
    result = 31 * result + (introduce == null ? 0: introduce.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (avatar == null ? 0: avatar.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchStaff {\n");
    
    sb.append("  birthday: ").append(birthday).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  birthplace: ").append(birthplace).append("\n");
    sb.append("  introduce: ").append(introduce).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
