package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 管理员
 **/
@ApiModel(description = "管理员")
public class Admin  {
  
  @SerializedName("password")
  private String password = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("key")
  private String key = null;

  /**
   * 加密
   **/
  @ApiModelProperty(value = "加密")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * 名称
   **/
  @ApiModelProperty(value = "名称")
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
   * 头像地址
   **/
  @ApiModelProperty(value = "头像地址")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * 授权，只有在注册登录的情况下会返回
   **/
  @ApiModelProperty(value = "授权，只有在注册登录的情况下会返回")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Admin admin = (Admin) o;
    return (password == null ? admin.password == null : password.equals(admin.password)) &&
        (name == null ? admin.name == null : name.equals(admin.name)) &&
        (id == null ? admin.id == null : id.equals(admin.id)) &&
        (email == null ? admin.email == null : email.equals(admin.email)) &&
        (key == null ? admin.key == null : key.equals(admin.key));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (password == null ? 0: password.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (email == null ? 0: email.hashCode());
    result = 31 * result + (key == null ? 0: key.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Admin {\n");
    
    sb.append("  password: ").append(password).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
