package cn.jjdcn.blog.controller;

import cn.jjdcn.blog.entity.Picture;
import cn.jjdcn.blog.service.PictureService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Picture)表控制层
 *
 * @author makejava
 * @since 2019-12-05 01:09:43
 */
@RestController
@RequestMapping("picture")
public class PictureController {
    /**
     * 服务对象
     */
    @Resource
    private PictureService pictureService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Picture selectOne(Integer id) {
        return this.pictureService.queryById(id);
    }

}