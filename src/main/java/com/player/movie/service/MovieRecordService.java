package com.player.movie.service;

import com.player.movie.entity.MovieRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieRecord)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 00:29:15
 */
public interface MovieRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieRecord queryById(Integer id);

    /**
     * 分页查询
     *
     * @param movieRecord 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieRecord> queryByPage(MovieRecord movieRecord, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieRecord 实例对象
     * @return 实例对象
     */
    MovieRecord insert(MovieRecord movieRecord);

    /**
     * 修改数据
     *
     * @param movieRecord 实例对象
     * @return 实例对象
     */
    MovieRecord update(MovieRecord movieRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
