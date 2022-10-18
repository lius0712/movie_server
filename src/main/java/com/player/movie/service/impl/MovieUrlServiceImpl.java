package com.player.movie.service.impl;

import com.player.movie.entity.MovieUrl;
import com.player.movie.dao.MovieUrlDao;
import com.player.movie.service.MovieUrlService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieUrl)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 00:30:03
 */
@Service("movieUrlService")
public class MovieUrlServiceImpl implements MovieUrlService {
    @Resource
    private MovieUrlDao movieUrlDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieUrl queryById(Integer id) {
        return this.movieUrlDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movieUrl 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieUrl> queryByPage(MovieUrl movieUrl, PageRequest pageRequest) {
        long total = this.movieUrlDao.count(movieUrl);
        return new PageImpl<>(this.movieUrlDao.queryAllByLimit(movieUrl, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieUrl 实例对象
     * @return 实例对象
     */
    @Override
    public MovieUrl insert(MovieUrl movieUrl) {
        this.movieUrlDao.insert(movieUrl);
        return movieUrl;
    }

    /**
     * 修改数据
     *
     * @param movieUrl 实例对象
     * @return 实例对象
     */
    @Override
    public MovieUrl update(MovieUrl movieUrl) {
        this.movieUrlDao.update(movieUrl);
        return this.queryById(movieUrl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieUrlDao.deleteById(id) > 0;
    }
}
