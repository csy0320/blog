package cn.jjdcn.blog.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author makejava
 * @since 2019-12-05 01:09:42
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = 921207632495215100L;
    /**
    * 评论ID
    */
    private Integer id;
    /**
    * 用户ID
    */
    private Integer userId;
    /**
    * 评论内容
    */
    private String content;
    /**
    * 父评论ID，0：父评论
    */
    private Integer parentId;
    /**
    * 评论时间
    */
    private Date createTime;
    /**
    * 点赞数量
    */
    private Integer isUseful;
    /**
    * 评论状态，0：正常 1：删除
    */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsUseful() {
        return isUseful;
    }

    public void setIsUseful(Integer isUseful) {
        this.isUseful = isUseful;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}