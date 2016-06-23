package io.swagger.client.model;

import io.swagger.client.model.Post;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 时间轴形式的新闻
 **/
@ApiModel(description = "时间轴形式的新闻")
public class TimeLineNews  {
  
  @SerializedName("date")
  private String date = null;
  @SerializedName("posts")
  private List<Post> posts = null;

  /**
   * date,时间轴上日期
   **/
  @ApiModelProperty(value = "date,时间轴上日期")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * 文章
   **/
  @ApiModelProperty(value = "文章")
  public List<Post> getPosts() {
    return posts;
  }
  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeLineNews timeLineNews = (TimeLineNews) o;
    return (date == null ? timeLineNews.date == null : date.equals(timeLineNews.date)) &&
        (posts == null ? timeLineNews.posts == null : posts.equals(timeLineNews.posts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (date == null ? 0: date.hashCode());
    result = 31 * result + (posts == null ? 0: posts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeLineNews {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  posts: ").append(posts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
