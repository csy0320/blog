package cn.jjdcn.blog.service.impl;

import cn.jjdcn.blog.entity.Picture;
import cn.jjdcn.blog.dao.PictureDao;
import cn.jjdcn.blog.service.PictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Picture)表服务实现类
 *
 * @author makejava
 * @since 2019-12-05 01:09:43
 */
@Service("pictureService")
public class PictureServiceImpl implements PictureService {
    @Resource
    private PictureDao pictureDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Picture queryById(Integer id) {
        return this.pictureDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Picture> queryAllByLimit(int offset, int limit) {
        return this.pictureDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param picture 实例对象
     * @return 实例对象
     */
    @Override
    public Picture insert(Picture picture) {
        this.pictureDao.insert(picture);
        return picture;
    }

    /**
     * 修改数据
     *
     * @param picture 实例对象
     * @return 实例对象
     */
    @Override
    public Picture update(Picture picture) {
        this.pictureDao.update(picture);
        return this.queryById(picture.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pictureDao.deleteById(id) > 0;
    }
}