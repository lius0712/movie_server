package com.player.movie.service;

import com.player.movie.entity.MovieCategory;
import com.player.movie.entity.ResultEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieCategory)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 00:26:35
 */
public interface MovieCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieCategory queryById(Integer id);

    /**
     * 分页查询
     *
     * @param movieCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieCategory> queryByPage(MovieCategory movieCategory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieCategory 实例对象
     * @return 实例对象
     */
    MovieCategory insert(MovieCategory movieCategory);

    /**
     * 修改数据
     *
     * @param movieCategory 实例对象
     * @return 实例对象
     */
    MovieCategory update(MovieCategory movieCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    ResultEntity getAllCategoryByClassify(String classsify);

    ResultEntity getAllCategoryListByPageName(String pageName);
}
