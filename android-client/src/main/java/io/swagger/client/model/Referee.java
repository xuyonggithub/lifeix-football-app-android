package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 裁判员
 **/
@ApiModel(description = "裁判员")
public class Referee  {
  
  @SerializedName("birthday")
  private Date birthday = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("level")
  private String level = null;
  @SerializedName("sex")
  private String sex = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("showNum")
  private Integer showNum = null;
  @SerializedName("birthplace")
  private String birthplace = null;
  @SerializedName("function")
  private String function = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("sinceInternational")
  private String sinceInternational = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("category")
  private String category = null;

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
   * 级别
   **/
  @ApiModelProperty(value = "级别")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  /**
   * 性别
   **/
  @ApiModelProperty(value = "性别")
  public String getSex() {
    return sex;
  }
  public void setSex(String sex) {
    this.sex = sex;
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
   * 顶级联赛出场次数
   **/
  @ApiModelProperty(value = "顶级联赛出场次数")
  public Integer getShowNum() {
    return showNum;
  }
  public void setShowNum(Integer showNum) {
    this.showNum = showNum;
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
   * 主裁判、助理裁判
   **/
  @ApiModelProperty(value = "主裁判、助理裁判")
  public String getFunction() {
    return function;
  }
  public void setFunction(String function) {
    this.function = function;
  }

  /**
   * 名字：郎平
   **/
  @ApiModelProperty(value = "名字：郎平")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 成为国际级裁判的时间
   **/
  @ApiModelProperty(value = "成为国际级裁判的时间")
  public String getSinceInternational() {
    return sinceInternational;
  }
  public void setSinceInternational(String sinceInternational) {
    this.sinceInternational = sinceInternational;
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
   * 主裁、边裁、第四官员
   **/
  @ApiModelProperty(value = "主裁、边裁、第四官员")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   * 11人制，5人制，沙滩
   **/
  @ApiModelProperty(value = "11人制，5人制，沙滩")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
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
    Referee referee = (Referee) o;
    return (birthday == null ? referee.birthday == null : birthday.equals(referee.birthday)) &&
        (country == null ? referee.country == null : country.equals(referee.country)) &&
        (level == null ? referee.level == null : level.equals(referee.level)) &&
        (sex == null ? referee.sex == null : sex.equals(referee.sex)) &&
        (avatar == null ? referee.avatar == null : avatar.equals(referee.avatar)) &&
        (showNum == null ? referee.showNum == null : showNum.equals(referee.showNum)) &&
        (birthplace == null ? referee.birthplace == null : birthplace.equals(referee.birthplace)) &&
        (function == null ? referee.function == null : function.equals(referee.function)) &&
        (name == null ? referee.name == null : name.equals(referee.name)) &&
        (sinceInternational == null ? referee.sinceInternational == null : sinceInternational.equals(referee.sinceInternational)) &&
        (id == null ? referee.id == null : id.equals(referee.id)) &&
        (position == null ? referee.position == null : position.equals(referee.position)) &&
        (category == null ? referee.category == null : category.equals(referee.category));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (birthday == null ? 0: birthday.hashCode());
    result = 31 * result + (country == null ? 0: country.hashCode());
    result = 31 * result + (level == null ? 0: level.hashCode());
    result = 31 * result + (sex == null ? 0: sex.hashCode());
    result = 31 * result + (avatar == null ? 0: avatar.hashCode());
    result = 31 * result + (showNum == null ? 0: showNum.hashCode());
    result = 31 * result + (birthplace == null ? 0: birthplace.hashCode());
    result = 31 * result + (function == null ? 0: function.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (sinceInternational == null ? 0: sinceInternational.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    result = 31 * result + (category == null ? 0: category.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Referee {\n");
    
    sb.append("  birthday: ").append(birthday).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("  sex: ").append(sex).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  showNum: ").append(showNum).append("\n");
    sb.append("  birthplace: ").append(birthplace).append("\n");
    sb.append("  function: ").append(function).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  sinceInternational: ").append(sinceInternational).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
