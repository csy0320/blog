package cn.jjdcn.blog.service.impl;

import cn.jjdcn.blog.dao.UserDao;
import cn.jjdcn.blog.entity.User;
import cn.jjdcn.blog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2019-12-05 01:09:43
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public User queryById(Integer id) {
		return this.userDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<User> queryAllByLimit(int offset, int limit) {
		return this.userDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 查询多条数据
	 *
	 * @return 对象列表
	 */
	@Override
	public List<User> queryAll() {
		return this.userDao.queryAll();
	}

	/**
	 * 新增数据
	 *
	 * @param user 实例对象
	 * @return 实例对象
	 */
	@Override
	public User insert(User user) {
		this.userDao.insert(user);
		return user;
	}

	/**
	 * 修改数据
	 *
	 * @param user 实例对象
	 * @return 实例对象
	 */
	@Override
	public User update(User user) {
		this.userDao.update(user);
		return this.queryById(user.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Integer id) {
		return this.userDao.deleteById(id) > 0;
	}
}