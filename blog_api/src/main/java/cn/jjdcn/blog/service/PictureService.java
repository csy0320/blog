package cn.jjdcn.blog.service;

import cn.jjdcn.blog.entity.Picture;
import java.util.List;

/**
 * (Picture)表服务接口
 *
 * @author makejava
 * @since 2019-12-05 01:09:43
 */
public interface PictureService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Picture queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Picture> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param picture 实例对象
     * @return 实例对象
     */
    Picture insert(Picture picture);

    /**
     * 修改数据
     *
     * @param picture 实例对象
     * @return 实例对象
     */
    Picture update(Picture picture);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}