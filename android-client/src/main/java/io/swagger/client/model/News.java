package io.swagger.client.model;

import io.swagger.client.model.Author;
import io.swagger.client.model.Video;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 新闻
 **/
@ApiModel(description = "新闻")
public class News  {
  
  @SerializedName("images")
  private List<String> images = null;
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
  @SerializedName("htmlContent")
  private String htmlContent = null;
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
   * 内容
   **/
  @ApiModelProperty(value = "内容")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * 解析过的Html内容
   **/
  @ApiModelProperty(value = "解析过的Html内容")
  public String getHtmlContent() {
    return htmlContent;
  }
  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
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
    News news = (News) o;
    return (images == null ? news.images == null : images.equals(news.images)) &&
        (createTime == null ? news.createTime == null : createTime.equals(news.createTime)) &&
        (author == null ? news.author == null : author.equals(news.author)) &&
        (videos == null ? news.videos == null : videos.equals(news.videos)) &&
        (id == null ? news.id == null : id.equals(news.id)) &&
        (title == null ? news.title == null : title.equals(news.title)) &&
        (content == null ? news.content == null : content.equals(news.content)) &&
        (htmlContent == null ? news.htmlContent == null : htmlContent.equals(news.htmlContent)) &&
        (status == null ? news.status == null : status.equals(news.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (images == null ? 0: images.hashCode());
    result = 31 * result + (createTime == null ? 0: createTime.hashCode());
    result = 31 * result + (author == null ? 0: author.hashCode());
    result = 31 * result + (videos == null ? 0: videos.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (content == null ? 0: content.hashCode());
    result = 31 * result + (htmlContent == null ? 0: htmlContent.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class News {\n");
    
    sb.append("  images: ").append(images).append("\n");
    sb.append("  createTime: ").append(createTime).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  videos: ").append(videos).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  htmlContent: ").append(htmlContent).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
