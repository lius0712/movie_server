package com.player.movie.service.impl;

import com.player.movie.entity.MovieLike;
import com.player.movie.dao.MovieLikeDao;
import com.player.movie.service.MovieLikeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 点赞的影片(MovieLike)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 00:28:13
 */
@Service("movieLikeService")
public class MovieLikeServiceImpl implements MovieLikeService {
    @Resource
    private MovieLikeDao movieLikeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieLike queryById(Integer id) {
        return this.movieLikeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movieLike 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieLike> queryByPage(MovieLike movieLike, PageRequest pageRequest) {
        long total = this.movieLikeDao.count(movieLike);
        return new PageImpl<>(this.movieLikeDao.queryAllByLimit(movieLike, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieLike 实例对象
     * @return 实例对象
     */
    @Override
    public MovieLike insert(MovieLike movieLike) {
        this.movieLikeDao.insert(movieLike);
        return movieLike;
    }

    /**
     * 修改数据
     *
     * @param movieLike 实例对象
     * @return 实例对象
     */
    @Override
    public MovieLike update(MovieLike movieLike) {
        this.movieLikeDao.update(movieLike);
        return this.queryById(movieLike.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieLikeDao.deleteById(id) > 0;
    }
}
