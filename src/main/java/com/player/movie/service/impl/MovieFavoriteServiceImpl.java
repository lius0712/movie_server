package com.player.movie.service.impl;

import com.player.movie.entity.MovieFavorite;
import com.player.movie.dao.MovieFavoriteDao;
import com.player.movie.service.MovieFavoriteService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 收藏的电影(MovieFavorite)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 00:27:45
 */
@Service("movieFavoriteService")
public class MovieFavoriteServiceImpl implements MovieFavoriteService {
    @Resource
    private MovieFavoriteDao movieFavoriteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieFavorite queryById(Integer id) {
        return this.movieFavoriteDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movieFavorite 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieFavorite> queryByPage(MovieFavorite movieFavorite, PageRequest pageRequest) {
        long total = this.movieFavoriteDao.count(movieFavorite);
        return new PageImpl<>(this.movieFavoriteDao.queryAllByLimit(movieFavorite, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieFavorite 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFavorite insert(MovieFavorite movieFavorite) {
        this.movieFavoriteDao.insert(movieFavorite);
        return movieFavorite;
    }

    /**
     * 修改数据
     *
     * @param movieFavorite 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFavorite update(MovieFavorite movieFavorite) {
        this.movieFavoriteDao.update(movieFavorite);
        return this.queryById(movieFavorite.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieFavoriteDao.deleteById(id) > 0;
    }
}
