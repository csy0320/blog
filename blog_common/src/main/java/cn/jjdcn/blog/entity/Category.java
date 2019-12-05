package cn.jjdcn.blog.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Category)实体类
 *
 * @author makejava
 * @since 2019-12-05 01:09:42
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 925087413725343192L;
    /**
    * 分类ID
    */
    private Integer id;
    /**
    * 分类名
    */
    private String name;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 父分类ID，0:父分类
    */
    private Integer parentId;


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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}