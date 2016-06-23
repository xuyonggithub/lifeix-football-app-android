package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 赛事类目
 **/
@ApiModel(description = "赛事类目")
public class CompetitionCategory  {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("rule")
  private String rule = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("iconUrl")
  private String iconUrl = null;
  @SerializedName("type")
  private String type = null;

  /**
   * 赛事类目名称
   **/
  @ApiModelProperty(value = "赛事类目名称")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 赛事规则
   **/
  @ApiModelProperty(value = "赛事规则")
  public String getRule() {
    return rule;
  }
  public void setRule(String rule) {
    this.rule = rule;
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
   * 赛事类目图标地址
   **/
  @ApiModelProperty(value = "赛事类目图标地址")
  public String getIconUrl() {
    return iconUrl;
  }
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  /**
   * 赛事类型 类别 0：双循环比赛  1：淘汰赛  2：小组赛+主客场淘汰赛  3：小组赛+单场淘汰赛  4：小组赛+单场淘汰赛+主客场淘汰赛 
   **/
  @ApiModelProperty(value = "赛事类型 类别 0：双循环比赛  1：淘汰赛  2：小组赛+主客场淘汰赛  3：小组赛+单场淘汰赛  4：小组赛+单场淘汰赛+主客场淘汰赛 ")
  public String getType() {
    return type;
  }
  public void setType(String type) {
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
    CompetitionCategory competitionCategory = (CompetitionCategory) o;
    return (name == null ? competitionCategory.name == null : name.equals(competitionCategory.name)) &&
        (rule == null ? competitionCategory.rule == null : rule.equals(competitionCategory.rule)) &&
        (id == null ? competitionCategory.id == null : id.equals(competitionCategory.id)) &&
        (iconUrl == null ? competitionCategory.iconUrl == null : iconUrl.equals(competitionCategory.iconUrl)) &&
        (type == null ? competitionCategory.type == null : type.equals(competitionCategory.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (rule == null ? 0: rule.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (iconUrl == null ? 0: iconUrl.hashCode());
    result = 31 * result + (type == null ? 0: type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitionCategory {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  rule: ").append(rule).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  iconUrl: ").append(iconUrl).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
