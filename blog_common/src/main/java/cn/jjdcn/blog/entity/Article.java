package cn.jjdcn.blog.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Article)实体类
 *
 * @author makejava
 * @since 2019-12-05 01:09:31
 */
@Data
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

}