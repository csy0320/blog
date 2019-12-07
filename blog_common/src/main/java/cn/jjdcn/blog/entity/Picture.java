package cn.jjdcn.blog.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Picture)实体类
 *
 * @author makejava
 * @since 2019-12-05 01:09:43
 */
@Data
public class Picture implements Serializable {
    private static final long serialVersionUID = -67773438025705774L;
    /**
    * 图片ID
    */
    private Integer id;
    /**
    * 图片名
    */
    private String name;
    /**
    * 图片地址
    */
    private String url;
    /**
    * 上传时间
    */
    private Date createTime;
    /**
    * 上传用户
    */
    private Integer userId;
    /**
    * 本地路径
    */
    private String path;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}