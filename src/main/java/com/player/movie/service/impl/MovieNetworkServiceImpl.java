package com.player.movie.service.impl;

import com.player.movie.entity.MovieNetwork;
import com.player.movie.dao.MovieNetworkDao;
import com.player.movie.entity.ResultEntity;
import com.player.movie.entity.ResultUtil;
import com.player.movie.service.MovieNetworkService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieNetwork)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 00:28:45
 */
@Service("movieNetworkService")
public class MovieNetworkServiceImpl implements MovieNetworkService {
    @Resource
    private MovieNetworkDao movieNetworkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieNetwork queryById(Integer id) {
        return this.movieNetworkDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movieNetwork 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieNetwork> queryByPage(MovieNetwork movieNetwork, PageRequest pageRequest) {
        long total = this.movieNetworkDao.count(movieNetwork);
        return new PageImpl<>(this.movieNetworkDao.queryAllByLimit(movieNetwork, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieNetwork 实例对象
     * @return 实例对象
     */
    @Override
    public MovieNetwork insert(MovieNetwork movieNetwork) {
        this.movieNetworkDao.insert(movieNetwork);
        return movieNetwork;
    }

    /**
     * 修改数据
     *
     * @param movieNetwork 实例对象
     * @return 实例对象
     */
    @Override
    public MovieNetwork update(MovieNetwork movieNetwork) {
        this.movieNetworkDao.update(movieNetwork);
        return this.queryById(movieNetwork.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieNetworkDao.deleteById(id) > 0;
    }

    @Override
    public ResultEntity getKeyWord(String classify) {
        ResultEntity resultEntity = ResultUtil.success(movieNetworkDao.getKeyWord(classify));
        return resultEntity;
    }
}
