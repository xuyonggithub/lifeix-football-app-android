package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Like
 **/
@ApiModel(description = "Like")
public class Like  {
  
  @SerializedName("like")
  private Boolean like = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("unlikeNum")
  private Integer unlikeNum = null;
  @SerializedName("target")
  private String target = null;
  @SerializedName("likeNum")
  private Integer likeNum = null;

  /**
   * 当前用户/设备/ip 是否喜欢过该target
   **/
  @ApiModelProperty(value = "当前用户/设备/ip 是否喜欢过该target")
  public Boolean getLike() {
    return like;
  }
  public void setLike(Boolean like) {
    this.like = like;
  }

  /**
   * 类型或者说业务系统:比如：nationalteam,post
   **/
  @ApiModelProperty(value = "类型或者说业务系统:比如：nationalteam,post")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * 被踩的总数
   **/
  @ApiModelProperty(value = "被踩的总数")
  public Integer getUnlikeNum() {
    return unlikeNum;
  }
  public void setUnlikeNum(Integer unlikeNum) {
    this.unlikeNum = unlikeNum;
  }

  /**
   * 目标，比如国家队成员
   **/
  @ApiModelProperty(value = "目标，比如国家队成员")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  /**
   * 被喜欢的总数
   **/
  @ApiModelProperty(value = "被喜欢的总数")
  public Integer getLikeNum() {
    return likeNum;
  }
  public void setLikeNum(Integer likeNum) {
    this.likeNum = likeNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Like like = (Like) o;
    return (like == null ? like.like == null : like.equals(like.like)) &&
        (type == null ? like.type == null : type.equals(like.type)) &&
        (unlikeNum == null ? like.unlikeNum == null : unlikeNum.equals(like.unlikeNum)) &&
        (target == null ? like.target == null : target.equals(like.target)) &&
        (likeNum == null ? like.likeNum == null : likeNum.equals(like.likeNum));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (like == null ? 0: like.hashCode());
    result = 31 * result + (type == null ? 0: type.hashCode());
    result = 31 * result + (unlikeNum == null ? 0: unlikeNum.hashCode());
    result = 31 * result + (target == null ? 0: target.hashCode());
    result = 31 * result + (likeNum == null ? 0: likeNum.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Like {\n");
    
    sb.append("  like: ").append(like).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  unlikeNum: ").append(unlikeNum).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  likeNum: ").append(likeNum).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
