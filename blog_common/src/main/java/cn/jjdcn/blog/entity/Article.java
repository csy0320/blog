package cn.jjdcn.blog.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Article)实体类
 *
 * @author makejava
 * @since 2019-12-05 01:09:31
 */
public class Article implements Serializable {
    private static final long serialVersionUID = -63293359126307114L;
    /**
    * 博文ID
    */
    private Integer id;
    /**
    * 标题
    */
    private String title;
    /**
    * 博文内容
    */
    private String content;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 发表时间
    */
    private Date publishTime;
    /**
    * 用户ID
    */
    private Integer userId;
    /**
    * 点击量
    */
    private Integer pageView;
    /**
    * 分类ID
    */
    private Integer categoryId;
    /**
    * 标签
    */
    private String tags;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

}