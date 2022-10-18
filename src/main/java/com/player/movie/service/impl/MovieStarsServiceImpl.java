package com.player.movie.service.impl;

import com.player.movie.entity.MovieStars;
import com.player.movie.dao.MovieStarsDao;
import com.player.movie.service.MovieStarsService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieStars)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 00:29:43
 */
@Service("movieStarsService")
public class MovieStarsServiceImpl implements MovieStarsService {
    @Resource
    private MovieStarsDao movieStarsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieStars queryById(Integer id) {
        return this.movieStarsDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movieStars 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieStars> queryByPage(MovieStars movieStars, PageRequest pageRequest) {
        long total = this.movieStarsDao.count(movieStars);
        return new PageImpl<>(this.movieStarsDao.queryAllByLimit(movieStars, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieStars 实例对象
     * @return 实例对象
     */
    @Override
    public MovieStars insert(MovieStars movieStars) {
        this.movieStarsDao.insert(movieStars);
        return movieStars;
    }

    /**
     * 修改数据
     *
     * @param movieStars 实例对象
     * @return 实例对象
     */
    @Override
    public MovieStars update(MovieStars movieStars) {
        this.movieStarsDao.update(movieStars);
        return this.queryById(movieStars.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieStarsDao.deleteById(id) > 0;
    }
}
