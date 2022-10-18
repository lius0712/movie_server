package com.player.movie.service;

import com.player.movie.entity.MovieFavorite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 收藏的电影(MovieFavorite)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 00:27:45
 */
public interface MovieFavoriteService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieFavorite queryById(Integer id);

    /**
     * 分页查询
     *
     * @param movieFavorite 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieFavorite> queryByPage(MovieFavorite movieFavorite, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieFavorite 实例对象
     * @return 实例对象
     */
    MovieFavorite insert(MovieFavorite movieFavorite);

    /**
     * 修改数据
     *
     * @param movieFavorite 实例对象
     * @return 实例对象
     */
    MovieFavorite update(MovieFavorite movieFavorite);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
