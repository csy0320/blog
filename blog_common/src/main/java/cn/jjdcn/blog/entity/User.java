package cn.jjdcn.blog.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2019-12-05 01:09:43
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -64298878450163210L;
    /**
    * 用户ID
    */
    private Integer id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 用户密码
    */
    private String password;
    /**
    * 用户角色 0：admin,1:普通用户
    */
    private Integer role;
    /**
    * 注册时间
    */
    private Date createTime;
    /**
    * 上次登录时间
    */
    private Date lastLoginTime;
    /**
    * 用户状态
    */
    private Object status;
    /**
    * 用户电话
    */
    private String phone;
    /**
    * 用户邮箱
    */
    private String email;

}