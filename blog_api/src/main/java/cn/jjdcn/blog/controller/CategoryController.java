package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.Category;
import cn.jjdcn.blog.service.CategoryService;
import cn.jjdcn.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Category)表控制层
 *
 * @author jjdcn
 * @since 2019-12-08 02:37:37
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    /**
     * 服务对象
     */
    @Autowired
    private CategoryService categoryService;
    
    
    /**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("get/{id}")
	public Result getById(@PathVariable Integer id) {
		Category category = categoryService.queryById(id);
		if (category != null) {
			Map<String,Category> map = new HashMap<>();
			map.put("category", category);
			return Result.ok().data(map);
		}else {
			return Result.error().message("没有数据");
		}
	}

	/**
	 * 获得所有数据
	 *
	 * @return
	 */
	@GetMapping("get")
	public Result getAll() {

		List<Category> categorys = categoryService.queryAllByLimit(0, 100);
		if (categorys != null && !categorys.isEmpty()) {
			Map<String,List> map = new HashMap<>();
			map.put("categorys",categorys);
			return Result.ok().data(map);
		} else {
			return Result.error().message("没有数据");
		}
	}

	/**
	 * 添加一条数据
	 *
	 * @param category
	 * @return
	 */
	@PostMapping("add")
	public Result add(@RequestBody Category category) {

		Category added = categoryService.insert(category);
		if (added != null) {
			Map<String,Category> map = new HashMap<>();
			map.put("category",category);
			return Result.ok().message("添加成功").data(map);
		} else {
			return Result.error().message("添加失败");
		}
	}

	/**
	 * 更新数据
	 *
	 * @param category
	 * @return
	 */
	@PutMapping("update")
	public Result update(@RequestBody Category category) {
		Category updated = categoryService.update(category);
		if (updated != null) {
			Map<String,Category> map = new HashMap<>();
			map.put("category",updated);
			return Result.ok().message("更新成功").data(map);
		} else {
			return Result.error().message("更新失败");
		}
	}

	/**
	 * 根据id删除
	 *
	 * @param id
	 * @return
	 */
	@DeleteMapping("delete/{id}")
	public Result delete(@PathVariable Integer id) {
		if (categoryService.deleteById(id)) {
			return Result.ok().message("删除成功");
		} else {
			return Result.error().message("删除失败");
		}
	}

}