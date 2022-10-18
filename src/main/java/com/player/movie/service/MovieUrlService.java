package com.player.movie.service;

import com.player.movie.entity.MovieUrl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieUrl)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 00:30:03
 */
public interface MovieUrlService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieUrl queryById(Integer id);

    /**
     * 分页查询
     *
     * @param movieUrl 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieUrl> queryByPage(MovieUrl movieUrl, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieUrl 实例对象
     * @return 实例对象
     */
    MovieUrl insert(MovieUrl movieUrl);

    /**
     * 修改数据
     *
     * @param movieUrl 实例对象
     * @return 实例对象
     */
    MovieUrl update(MovieUrl movieUrl);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
