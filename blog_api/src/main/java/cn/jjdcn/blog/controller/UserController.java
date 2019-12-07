package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.User;
import cn.jjdcn.blog.service.UserService;
import cn.jjdcn.blog.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	@GetMapping("get/{id}")
	public Result get(@PathVariable Integer id) {
		Result result = Result.error();
		User user = userService.queryById(id);
		if (user != null) {
			Map<String, User> map = new HashMap<>();
			map.put("user", user);
			result = Result.ok().data(map);
		}

		return result;
	}

	@GetMapping("get")
	public Result getAll() {
		Result result = Result.error();
		List<User> categories = userService.queryAllByLimit(0, 10);
		if (categories != null) {
			Map<String, List> map = new HashMap<>();
			map.put("users", categories);
			result = Result.ok().data(map);
		}

		return result;
	}

	@PostMapping("add")
	public Result add(User user) {

		Result result = Result.error();
		if (userService.insert(user) != null) {
			result = Result.ok().message("添加成功");
		}

		return result;
	}

	@PutMapping("update")
	public Result update(@RequestBody User user) {
		Result result = Result.error();
		if (userService.update(user) != null) {
			result = Result.ok().message("修改成功");
		}

		return result;
	}

	@DeleteMapping("delete/{id}")
	public Result delete(@PathVariable Integer id) {
		Result result = Result.error();
		boolean delete = userService.deleteById(id);
		if (delete) {
			result = Result.ok().message("用户删除成功");
		}
		return result;
	}
}