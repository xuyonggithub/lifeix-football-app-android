package io.swagger.client.model;

import io.swagger.client.model.TeamInfo;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 教练
 **/
@ApiModel(description = "教练")
public class Coach  {
  
  @SerializedName("birthday")
  private Date birthday = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("career")
  private List<TeamInfo> career = null;
  @SerializedName("birthplace")
  private String birthplace = null;
  @SerializedName("level")
  private String level = null;
  @SerializedName("introduce")
  private String introduce = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("team")
  private TeamInfo team = null;

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
   * 职业生涯
   **/
  @ApiModelProperty(value = "职业生涯")
  public List<TeamInfo> getCareer() {
    return career;
  }
  public void setCareer(List<TeamInfo> career) {
    this.career = career;
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
   * 裁判级别
   **/
  @ApiModelProperty(value = "裁判级别")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
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
   * 名字：高洪波
   **/
  @ApiModelProperty(value = "名字：高洪波")
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
   * 职位：主教练,助理教练
   **/
  @ApiModelProperty(value = "职位：主教练,助理教练")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TeamInfo getTeam() {
    return team;
  }
  public void setTeam(TeamInfo team) {
    this.team = team;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coach coach = (Coach) o;
    return (birthday == null ? coach.birthday == null : birthday.equals(coach.birthday)) &&
        (country == null ? coach.country == null : country.equals(coach.country)) &&
        (career == null ? coach.career == null : career.equals(coach.career)) &&
        (birthplace == null ? coach.birthplace == null : birthplace.equals(coach.birthplace)) &&
        (level == null ? coach.level == null : level.equals(coach.level)) &&
        (introduce == null ? coach.introduce == null : introduce.equals(coach.introduce)) &&
        (name == null ? coach.name == null : name.equals(coach.name)) &&
        (id == null ? coach.id == null : id.equals(coach.id)) &&
        (avatar == null ? coach.avatar == null : avatar.equals(coach.avatar)) &&
        (position == null ? coach.position == null : position.equals(coach.position)) &&
        (team == null ? coach.team == null : team.equals(coach.team));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (birthday == null ? 0: birthday.hashCode());
    result = 31 * result + (country == null ? 0: country.hashCode());
    result = 31 * result + (career == null ? 0: career.hashCode());
    result = 31 * result + (birthplace == null ? 0: birthplace.hashCode());
    result = 31 * result + (level == null ? 0: level.hashCode());
    result = 31 * result + (introduce == null ? 0: introduce.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (avatar == null ? 0: avatar.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    result = 31 * result + (team == null ? 0: team.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coach {\n");
    
    sb.append("  birthday: ").append(birthday).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  career: ").append(career).append("\n");
    sb.append("  birthplace: ").append(birthplace).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("  introduce: ").append(introduce).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  team: ").append(team).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
