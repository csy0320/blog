package cn.jjdcn.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 标签(Tag)实体类
 *
 * @author makejava
 * @since 2019-12-08 00:08:39
 */
@Data
public class Tag implements Serializable {
	private static final long serialVersionUID = 927887413725343192L;
	/**
	 * 标签ID
	 */
	private Integer id;
	/**
	 * 标签名
	 */
	private String name;

}