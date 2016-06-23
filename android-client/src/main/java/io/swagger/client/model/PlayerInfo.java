package io.swagger.client.model;

import io.swagger.client.model.PlayerNationalRecord;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 队员
 **/
@ApiModel(description = "队员")
public class PlayerInfo  {
  
  @SerializedName("birthday")
  private Date birthday = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("birthplace")
  private String birthplace = null;
  @SerializedName("record")
  private PlayerNationalRecord record = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("weight")
  private String weight = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("jeserysNum")
  private Integer jeserysNum = null;
  @SerializedName("first")
  private Integer first = null;
  @SerializedName("height")
  private String height = null;

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
   * 国籍
   **/
  @ApiModelProperty(value = "国籍")
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
   **/
  @ApiModelProperty(value = "")
  public PlayerNationalRecord getRecord() {
    return record;
  }
  public void setRecord(PlayerNationalRecord record) {
    this.record = record;
  }

  /**
   * 名字：李铁
   **/
  @ApiModelProperty(value = "名字：李铁")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 体重
   **/
  @ApiModelProperty(value = "体重")
  public String getWeight() {
    return weight;
  }
  public void setWeight(String weight) {
    this.weight = weight;
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
   * 头像地址
   **/
  @ApiModelProperty(value = "头像地址")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  /**
   * 位置：前锋
   **/
  @ApiModelProperty(value = "位置：前锋")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   * 球衣号码
   **/
  @ApiModelProperty(value = "球衣号码")
  public Integer getJeserysNum() {
    return jeserysNum;
  }
  public void setJeserysNum(Integer jeserysNum) {
    this.jeserysNum = jeserysNum;
  }

  /**
   * 1:首发 2：替补
   **/
  @ApiModelProperty(value = "1:首发 2：替补")
  public Integer getFirst() {
    return first;
  }
  public void setFirst(Integer first) {
    this.first = first;
  }

  /**
   * 身高
   **/
  @ApiModelProperty(value = "身高")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerInfo playerInfo = (PlayerInfo) o;
    return (birthday == null ? playerInfo.birthday == null : birthday.equals(playerInfo.birthday)) &&
        (country == null ? playerInfo.country == null : country.equals(playerInfo.country)) &&
        (birthplace == null ? playerInfo.birthplace == null : birthplace.equals(playerInfo.birthplace)) &&
        (record == null ? playerInfo.record == null : record.equals(playerInfo.record)) &&
        (name == null ? playerInfo.name == null : name.equals(playerInfo.name)) &&
        (weight == null ? playerInfo.weight == null : weight.equals(playerInfo.weight)) &&
        (id == null ? playerInfo.id == null : id.equals(playerInfo.id)) &&
        (avatar == null ? playerInfo.avatar == null : avatar.equals(playerInfo.avatar)) &&
        (position == null ? playerInfo.position == null : position.equals(playerInfo.position)) &&
        (jeserysNum == null ? playerInfo.jeserysNum == null : jeserysNum.equals(playerInfo.jeserysNum)) &&
        (first == null ? playerInfo.first == null : first.equals(playerInfo.first)) &&
        (height == null ? playerInfo.height == null : height.equals(playerInfo.height));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (birthday == null ? 0: birthday.hashCode());
    result = 31 * result + (country == null ? 0: country.hashCode());
    result = 31 * result + (birthplace == null ? 0: birthplace.hashCode());
    result = 31 * result + (record == null ? 0: record.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (weight == null ? 0: weight.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (avatar == null ? 0: avatar.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    result = 31 * result + (jeserysNum == null ? 0: jeserysNum.hashCode());
    result = 31 * result + (first == null ? 0: first.hashCode());
    result = 31 * result + (height == null ? 0: height.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerInfo {\n");
    
    sb.append("  birthday: ").append(birthday).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  birthplace: ").append(birthplace).append("\n");
    sb.append("  record: ").append(record).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  jeserysNum: ").append(jeserysNum).append("\n");
    sb.append("  first: ").append(first).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
