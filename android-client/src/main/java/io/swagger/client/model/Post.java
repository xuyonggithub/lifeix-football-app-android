package io.swagger.client.model;

import io.swagger.client.model.Author;
import io.swagger.client.model.Video;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 帖子
 **/
@ApiModel(description = "帖子")
public class Post  {
  
  @SerializedName("images")
  private List<String> images = null;
  @SerializedName("categoryIds")
  private List<String> categoryIds = null;
  @SerializedName("createTime")
  private Date createTime = null;
  @SerializedName("author")
  private Author author = null;
  @SerializedName("videos")
  private List<Video> videos = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("status")
  private Integer status = null;

  /**
   * 图片地址
   **/
  @ApiModelProperty(value = "图片地址")
  public List<String> getImages() {
    return images;
  }
  public void setImages(List<String> images) {
    this.images = images;
  }

  /**
   * 文章类别ID
   **/
  @ApiModelProperty(value = "文章类别ID")
  public List<String> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }

  /**
   * post创建日期
   **/
  @ApiModelProperty(value = "post创建日期")
  public Date getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Author getAuthor() {
    return author;
  }
  public void setAuthor(Author author) {
    this.author = author;
  }

  /**
   * 视频地址
   **/
  @ApiModelProperty(value = "视频地址")
  public List<Video> getVideos() {
    return videos;
  }
  public void setVideos(List<Video> videos) {
    this.videos = videos;
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
   * 标题，5-50个字符
   **/
  @ApiModelProperty(value = "标题，5-50个字符")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * 内容，可以是纯文本或者html形式，最长字符5000
   **/
  @ApiModelProperty(value = "内容，可以是纯文本或者html形式，最长字符5000")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * 状态 ：1可用 ，0不可用
   **/
  @ApiModelProperty(value = "状态 ：1可用 ，0不可用")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post post = (Post) o;
    return (images == null ? post.images == null : images.equals(post.images)) &&
        (categoryIds == null ? post.categoryIds == null : categoryIds.equals(post.categoryIds)) &&
        (createTime == null ? post.createTime == null : createTime.equals(post.createTime)) &&
        (author == null ? post.author == null : author.equals(post.author)) &&
        (videos == null ? post.videos == null : videos.equals(post.videos)) &&
        (id == null ? post.id == null : id.equals(post.id)) &&
        (title == null ? post.title == null : title.equals(post.title)) &&
        (content == null ? post.content == null : content.equals(post.content)) &&
        (status == null ? post.status == null : status.equals(post.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (images == null ? 0: images.hashCode());
    result = 31 * result + (categoryIds == null ? 0: categoryIds.hashCode());
    result = 31 * result + (createTime == null ? 0: createTime.hashCode());
    result = 31 * result + (author == null ? 0: author.hashCode());
    result = 31 * result + (videos == null ? 0: videos.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (content == null ? 0: content.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    
    sb.append("  images: ").append(images).append("\n");
    sb.append("  categoryIds: ").append(categoryIds).append("\n");
    sb.append("  createTime: ").append(createTime).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  videos: ").append(videos).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
