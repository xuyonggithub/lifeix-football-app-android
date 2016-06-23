package io.swagger.client.model;

import io.swagger.client.model.Menu;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 菜单
 **/
@ApiModel(description = "菜单")
public class Menu  {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("iconUrl")
  private String iconUrl = null;
  @SerializedName("page")
  private String page = null;
  @SerializedName("menus")
  private List<Menu> menus = null;

  /**
   * 菜单名称
   **/
  @ApiModelProperty(value = "菜单名称")
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
   * 菜单图标地址
   **/
  @ApiModelProperty(value = "菜单图标地址")
  public String getIconUrl() {
    return iconUrl;
  }
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  /**
   * 跳转页面标示，比如：post_detail_page，该标示与页面名称一致
   **/
  @ApiModelProperty(value = "跳转页面标示，比如：post_detail_page，该标示与页面名称一致")
  public String getPage() {
    return page;
  }
  public void setPage(String page) {
    this.page = page;
  }

  /**
   * 子菜单
   **/
  @ApiModelProperty(value = "子菜单")
  public List<Menu> getMenus() {
    return menus;
  }
  public void setMenus(List<Menu> menus) {
    this.menus = menus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menu menu = (Menu) o;
    return (name == null ? menu.name == null : name.equals(menu.name)) &&
        (id == null ? menu.id == null : id.equals(menu.id)) &&
        (iconUrl == null ? menu.iconUrl == null : iconUrl.equals(menu.iconUrl)) &&
        (page == null ? menu.page == null : page.equals(menu.page)) &&
        (menus == null ? menu.menus == null : menus.equals(menu.menus));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (iconUrl == null ? 0: iconUrl.hashCode());
    result = 31 * result + (page == null ? 0: page.hashCode());
    result = 31 * result + (menus == null ? 0: menus.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menu {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  iconUrl: ").append(iconUrl).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  menus: ").append(menus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
