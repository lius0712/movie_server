package com.player.movie.service;

import com.player.movie.entity.MovieStars;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieStars)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 00:29:43
 */
public interface MovieStarsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieStars queryById(Integer id);

    /**
     * 分页查询
     *
     * @param movieStars 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieStars> queryByPage(MovieStars movieStars, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieStars 实例对象
     * @return 实例对象
     */
    MovieStars insert(MovieStars movieStars);

    /**
     * 修改数据
     *
     * @param movieStars 实例对象
     * @return 实例对象
     */
    MovieStars update(MovieStars movieStars);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
