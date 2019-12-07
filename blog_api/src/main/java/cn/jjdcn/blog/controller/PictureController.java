package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.Picture;
import cn.jjdcn.blog.service.PictureService;
import cn.jjdcn.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Picture)表控制层
 *
 * @author jjdcn
 * @since 2019-12-08 02:37:08
 */
@RestController
@RequestMapping("picture")
public class PictureController {
    /**
     * 服务对象
     */
    @Autowired
    private PictureService pictureService;
    
    
    /**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("get/{id}")
	public Result getById(@PathVariable Integer id) {
		Picture picture = pictureService.queryById(id);
		if (picture != null) {
			Map<String,Picture> map = new HashMap<>();
			map.put("picture", picture);
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

		List<Picture> pictures = pictureService.queryAllByLimit(0, 100);
		if (pictures != null && !pictures.isEmpty()) {
			Map<String,List> map = new HashMap<>();
			map.put("pictures",pictures);
			return Result.ok().data(map);
		} else {
			return Result.error().message("没有数据");
		}
	}

	/**
	 * 添加一条数据
	 *
	 * @param picture
	 * @return
	 */
	@PostMapping("add")
	public Result add(@RequestBody Picture picture) {

		Picture added = pictureService.insert(picture);
		if (added != null) {
			Map<String,Picture> map = new HashMap<>();
			map.put("picture",picture);
			return Result.ok().message("添加成功").data(map);
		} else {
			return Result.error().message("添加失败");
		}
	}

	/**
	 * 更新数据
	 *
	 * @param picture
	 * @return
	 */
	@PutMapping("update")
	public Result update(@RequestBody Picture picture) {
		Picture updated = pictureService.update(picture);
		if (updated != null) {
			Map<String,Picture> map = new HashMap<>();
			map.put("picture",updated);
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
		if (pictureService.deleteById(id)) {
			return Result.ok().message("删除成功");
		} else {
			return Result.error().message("删除失败");
		}
	}

}