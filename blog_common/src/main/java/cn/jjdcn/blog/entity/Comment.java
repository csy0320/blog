package cn.jjdcn.blog.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author makejava
 * @since 2019-12-05 01:09:42
 */
@Data
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


}