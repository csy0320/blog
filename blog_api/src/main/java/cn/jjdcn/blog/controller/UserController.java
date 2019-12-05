package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.User;
import cn.jjdcn.blog.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-12-05 01:11:11
 */
@RestController
@RequestMapping("user")
public class UserController {
	/**
	 * 服务对象
	 */
	@Resource
	private UserService userService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public User selectOne(Integer id) {
		return this.userService.queryById(id);
	}


	@GetMapping("selectAll")
	public List<User> selectAll() {
		return this.userService.queryAll();
	}

}