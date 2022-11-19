package com.player.movie.service.impl;

import com.player.movie.entity.User;
import com.player.movie.dao.UserDao;
import com.player.movie.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 13:14:30
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param useid 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer useid) {
        return this.userDao.queryById(useid);
    }

    /**
     * 分页查询
     *
     * @param user 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<User> queryByPage(User user, PageRequest pageRequest) {
        long total = this.userDao.count(user);
        return new PageImpl<>(this.userDao.queryAllByLimit(user, pageRequest), pageRequest, total);
    }

    @Override
    public User login(String name) {
        return userDao.queryByName(name);
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
        return this.queryById(user.getUseid());
    }

    /**
     * 通过主键删除数据
     *
     * @param useid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer useid) {
        return this.userDao.deleteById(useid) > 0;
    }
}
