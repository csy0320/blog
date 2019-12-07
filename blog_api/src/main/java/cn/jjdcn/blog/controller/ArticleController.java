package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.Article;
import cn.jjdcn.blog.service.ArticleService;
import cn.jjdcn.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Article)表控制层
 *
 * @author jjdcn
 * @since 2019-12-08 02:37:37
 */
@RestController
@RequestMapping("article")
public class ArticleController {
	/**
	 * 服务对象
	 */
	@Autowired
	private ArticleService articleService;


	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("get/{id}")
	public Result getById(@PathVariable Integer id) {
		Article article = articleService.queryById(id);
		if (article != null) {
			Map<String, Article> map = new HashMap<>();
			map.put("article", article);
			return Result.ok().data(map);
		} else {
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

		List<Article> articles = articleService.queryAllByLimit(0, 100);
		if (articles != null && !articles.isEmpty()) {
			Map<String, List> map = new HashMap<>();
			map.put("articles", articles);
			return Result.ok().data(map);
		} else {
			return Result.error().message("没有数据");
		}
	}

	/**
	 * 添加一条数据
	 *
	 * @param article
	 * @return
	 */
	@PostMapping("add")
	public Result add(@RequestBody Article article) {

		Article added = articleService.insert(article);
		if (added != null) {
			Map<String, Article> map = new HashMap<>();
			map.put("article", article);
			return Result.ok().message("添加成功").data(map);
		} else {
			return Result.error().message("添加失败");
		}
	}

	/**
	 * 更新数据
	 *
	 * @param article
	 * @return
	 */
	@PutMapping("update")
	public Result update(@RequestBody Article article) {
		Article updated = articleService.update(article);
		if (updated != null) {
			Map<String, Article> map = new HashMap<>();
			map.put("article", updated);
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
		if (articleService.deleteById(id)) {
			return Result.ok().message("删除成功");
		} else {
			return Result.error().message("删除失败");
		}
	}

}