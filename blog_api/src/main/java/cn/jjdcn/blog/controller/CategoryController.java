package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.Category;
import cn.jjdcn.blog.service.CategoryService;
import cn.jjdcn.blog.vo.Result;
import io.swagger.annotations.Api;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Category)表控制层
 *
 * @author makejava
 * @since 2019-12-05 01:09:42
 */
@Api(value = "分类Controller")
@RestController
@RequestMapping("category")
public class CategoryController {
	/**
	 * 服务对象
	 */
	@Resource
	private CategoryService categoryService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("get/{id}")
	public Result get(@PathVariable Integer id) {
		Result result = Result.error();
		Category category = categoryService.queryById(id);
		if (category != null) {
			Map<String, Object> map = new HashMap<>();
			map.put("item", category);
			result = Result.ok().data(map);
		}

		return result;
	}

	@GetMapping("get")
	public Result getAll() {
		Result result = Result.error();
		List<Category> categories = categoryService.queryAllByLimit(0, 10);
		if (categories != null) {
			Map<String, Object> map = new HashMap<>();
			map.put("items", categories);
			result = Result.ok().data(map);
		}

		return result;
	}

	@PostMapping("add")
	public Result add(Category category) {

		Result result = Result.error();
		if (categoryService.insert(category) != null) {
			result = Result.ok().message("添加成功");
		}

		return result;
	}

	@PutMapping("update")
	public Result update(@RequestBody Category category) {
		Result result = Result.error();
		if (categoryService.update(category) != null) {
			result = Result.ok().message("修改成功");
		}

		return result;
	}

	@DeleteMapping("delete/{id}")
	public Result delete(@PathVariable Integer id) {
		Result result = Result.error();
		boolean delete = categoryService.deleteById(id);
		if (delete) {
			result = Result.ok().message("删除成功");
		}

		return result;
	}
}