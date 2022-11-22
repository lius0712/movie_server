package com.player.movie.service;

import com.player.movie.entity.MovieNetwork;
import com.player.movie.entity.ResultEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieNetwork)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 00:28:45
 */
public interface MovieNetworkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieNetwork queryById(Integer id);

    /**
     * 分页查询
     *
     * @param movieNetwork 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieNetwork> queryByPage(MovieNetwork movieNetwork, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieNetwork 实例对象
     * @return 实例对象
     */
    MovieNetwork insert(MovieNetwork movieNetwork);

    /**
     * 修改数据
     *
     * @param movieNetwork 实例对象
     * @return 实例对象
     */
    MovieNetwork update(MovieNetwork movieNetwork);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    ResultEntity getKeyWord(String classify);
}
