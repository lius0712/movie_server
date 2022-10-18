package com.player.movie.service;

import com.player.movie.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Movie)表服务接口
 *
 * @author makejava
 * @since 2022-10-18 23:58:29
 */
public interface MovieService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Movie queryById(Integer id);

    /**
     * 分页查询
     *
     * @param movie 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Movie> queryByPage(Movie movie, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movie 实例对象
     * @return 实例对象
     */
    Movie insert(Movie movie);

    /**
     * 修改数据
     *
     * @param movie 实例对象
     * @return 实例对象
     */
    Movie update(Movie movie);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
