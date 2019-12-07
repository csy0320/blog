package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.Tag;
import cn.jjdcn.blog.service.TagService;
import cn.jjdcn.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 标签(Tag)表控制层
 *
 * @author makejava
 * @since 2019-12-08 00:08:48
 */
@RestController
@RequestMapping("tag")
public class TagController {
	/**
	 * 服务对象
	 */
	@Autowired
	private TagService tagService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("get/{id}")
	public Result getById(@PathVariable Integer id) {
		Tag tag = tagService.queryById(id);
		if (tag != null) {
			Map<String, Tag> map = new HashMap<>();
			map.put("tag", tag);
			return Result.ok().data(map);
		} else {
			return Result.error().message("没有这个标签");
		}
	}

	/**
	 * 获得所有标签
	 *
	 * @return
	 */
	@GetMapping("get")
	public Result getAll() {

		List<Tag> tags = tagService.queryAllByLimit(0, 100);
		if (tags != null && !tags.isEmpty()) {
			Map<String, List> map = new HashMap<>();
			map.put("tags", tags);
			return Result.ok().data(map);
		} else {
			return Result.error().message("暂时还没有标签，请新建标签");
		}
	}

	/**
	 * 添加标签
	 *
	 * @param tag
	 * @return
	 */
	@PostMapping("add")
	public Result add(@RequestBody Tag tag) {

		Tag t = tagService.insert(tag);
		if (t != null) {
			Map<String, Tag> map = new HashMap<>();
			map.put("tag", tag);
			return Result.ok().message("添加成功").data(map);
		} else {
			return Result.error().message("添加失败");
		}
	}

	/**
	 * 更新标签
	 *
	 * @param tag
	 * @return
	 */
	@PutMapping("update")
	public Result update(@RequestBody Tag tag) {
		Tag t = tagService.update(tag);
		if (t != null) {
			Map<String, Tag> map = new HashMap<>();
			map.put("tag", t);
			return Result.ok().message("更新成功").data(map);
		} else {
			return Result.error().message("更新失败");
		}
	}

	/**
	 * 根据id删除标签
	 *
	 * @param id
	 * @return
	 */
	@DeleteMapping("delete/{id}")
	public Result selectOne(@PathVariable Integer id) {
		if (tagService.deleteById(id)) {
			return Result.ok().message("删除成功");
		} else {
			return Result.error().message("删除失败");
		}
	}

}