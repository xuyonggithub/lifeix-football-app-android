package io.swagger.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 上传文件令牌
 **/
@ApiModel(description = "上传文件令牌")
public class UploadToken  {
  
  @SerializedName("uptoken")
  private String uptoken = null;
  @SerializedName("keys")
  private List<String> keys = null;

  /**
   * 令牌值
   **/
  @ApiModelProperty(value = "令牌值")
  public String getUptoken() {
    return uptoken;
  }
  public void setUptoken(String uptoken) {
    this.uptoken = uptoken;
  }

  /**
   * 上传文件名列表
   **/
  @ApiModelProperty(value = "上传文件名列表")
  public List<String> getKeys() {
    return keys;
  }
  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadToken uploadToken = (UploadToken) o;
    return (uptoken == null ? uploadToken.uptoken == null : uptoken.equals(uploadToken.uptoken)) &&
        (keys == null ? uploadToken.keys == null : keys.equals(uploadToken.keys));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (uptoken == null ? 0: uptoken.hashCode());
    result = 31 * result + (keys == null ? 0: keys.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadToken {\n");
    
    sb.append("  uptoken: ").append(uptoken).append("\n");
    sb.append("  keys: ").append(keys).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
