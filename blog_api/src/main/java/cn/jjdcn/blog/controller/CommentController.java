package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.Comment;
import cn.jjdcn.blog.service.CommentService;
import cn.jjdcn.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Comment)表控制层
 *
 * @author jjdcn
 * @since 2019-12-08 02:37:08
 */
@RestController
@RequestMapping("comment")
public class CommentController {
    /**
     * 服务对象
     */
    @Autowired
    private CommentService commentService;
    
    
    /**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("get/{id}")
	public Result getById(@PathVariable Integer id) {
		Comment comment = commentService.queryById(id);
		if (comment != null) {
			Map<String,Comment> map = new HashMap<>();
			map.put("comment", comment);
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

		List<Comment> comments = commentService.queryAllByLimit(0, 100);
		if (comments != null && !comments.isEmpty()) {
			Map<String,List> map = new HashMap<>();
			map.put("comments",comments);
			return Result.ok().data(map);
		} else {
			return Result.error().message("没有数据");
		}
	}

	/**
	 * 添加一条数据
	 *
	 * @param comment
	 * @return
	 */
	@PostMapping("add")
	public Result add(@RequestBody Comment comment) {

		Comment added = commentService.insert(comment);
		if (added != null) {
			Map<String,Comment> map = new HashMap<>();
			map.put("comment",comment);
			return Result.ok().message("添加成功").data(map);
		} else {
			return Result.error().message("添加失败");
		}
	}

	/**
	 * 更新数据
	 *
	 * @param comment
	 * @return
	 */
	@PutMapping("update")
	public Result update(@RequestBody Comment comment) {
		Comment updated = commentService.update(comment);
		if (updated != null) {
			Map<String,Comment> map = new HashMap<>();
			map.put("comment",updated);
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
		if (commentService.deleteById(id)) {
			return Result.ok().message("删除成功");
		} else {
			return Result.error().message("删除失败");
		}
	}

}