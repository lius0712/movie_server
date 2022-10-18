package com.player.movie.service.impl;

import com.player.movie.entity.MovieCategory;
import com.player.movie.dao.MovieCategoryDao;
import com.player.movie.service.MovieCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 00:26:36
 */
@Service("movieCategoryService")
public class MovieCategoryServiceImpl implements MovieCategoryService {
    @Resource
    private MovieCategoryDao movieCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieCategory queryById(Integer id) {
        return this.movieCategoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movieCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieCategory> queryByPage(MovieCategory movieCategory, PageRequest pageRequest) {
        long total = this.movieCategoryDao.count(movieCategory);
        return new PageImpl<>(this.movieCategoryDao.queryAllByLimit(movieCategory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieCategory 实例对象
     * @return 实例对象
     */
    @Override
    public MovieCategory insert(MovieCategory movieCategory) {
        this.movieCategoryDao.insert(movieCategory);
        return movieCategory;
    }

    /**
     * 修改数据
     *
     * @param movieCategory 实例对象
     * @return 实例对象
     */
    @Override
    public MovieCategory update(MovieCategory movieCategory) {
        this.movieCategoryDao.update(movieCategory);
        return this.queryById(movieCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieCategoryDao.deleteById(id) > 0;
    }
}
