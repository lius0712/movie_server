package com.player.movie.service.impl;

import com.player.movie.entity.Movie;
import com.player.movie.dao.MovieDao;
import com.player.movie.service.MovieService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Movie)表服务实现类
 *
 * @author makejava
 * @since 2022-10-18 23:58:29
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {
    @Resource
    private MovieDao movieDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Movie queryById(Integer id) {
        return this.movieDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movie 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Movie> queryByPage(Movie movie, PageRequest pageRequest) {
        long total = this.movieDao.count(movie);
        return new PageImpl<>(this.movieDao.queryAllByLimit(movie, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movie 实例对象
     * @return 实例对象
     */
    @Override
    public Movie insert(Movie movie) {
        this.movieDao.insert(movie);
        return movie;
    }

    /**
     * 修改数据
     *
     * @param movie 实例对象
     * @return 实例对象
     */
    @Override
    public Movie update(Movie movie) {
        this.movieDao.update(movie);
        return this.queryById(movie.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieDao.deleteById(id) > 0;
    }
}
