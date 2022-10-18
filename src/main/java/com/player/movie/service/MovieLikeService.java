package com.player.movie.service;

import com.player.movie.entity.MovieLike;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 点赞的影片(MovieLike)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 00:28:13
 */
public interface MovieLikeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieLike queryById(Integer id);

    /**
     * 分页查询
     *
     * @param movieLike 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieLike> queryByPage(MovieLike movieLike, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieLike 实例对象
     * @return 实例对象
     */
    MovieLike insert(MovieLike movieLike);

    /**
     * 修改数据
     *
     * @param movieLike 实例对象
     * @return 实例对象
     */
    MovieLike update(MovieLike movieLike);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
