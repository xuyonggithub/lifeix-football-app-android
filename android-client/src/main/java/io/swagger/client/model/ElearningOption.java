package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * elearning视频答案选项
 **/
@ApiModel(description = "elearning视频答案选项")
public class ElearningOption  {
  
  @SerializedName("image")
  private String image = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("right")
  private Boolean right = null;

  /**
   * 答案图片项
   **/
  @ApiModelProperty(value = "答案图片项")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * 答案文字项
   **/
  @ApiModelProperty(value = "答案文字项")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * 是否是正确答案，true正确，null或false错误
   **/
  @ApiModelProperty(value = "是否是正确答案，true正确，null或false错误")
  public Boolean getRight() {
    return right;
  }
  public void setRight(Boolean right) {
    this.right = right;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElearningOption elearningOption = (ElearningOption) o;
    return (image == null ? elearningOption.image == null : image.equals(elearningOption.image)) &&
        (text == null ? elearningOption.text == null : text.equals(elearningOption.text)) &&
        (right == null ? elearningOption.right == null : right.equals(elearningOption.right));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (image == null ? 0: image.hashCode());
    result = 31 * result + (text == null ? 0: text.hashCode());
    result = 31 * result + (right == null ? 0: right.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElearningOption {\n");
    
    sb.append("  image: ").append(image).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  right: ").append(right).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
