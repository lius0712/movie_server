package com.player.movie.service.impl;

import com.player.movie.entity.MovieRecord;
import com.player.movie.dao.MovieRecordDao;
import com.player.movie.service.MovieRecordService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieRecord)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 00:29:15
 */
@Service("movieRecordService")
public class MovieRecordServiceImpl implements MovieRecordService {
    @Resource
    private MovieRecordDao movieRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieRecord queryById(Integer id) {
        return this.movieRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movieRecord 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieRecord> queryByPage(MovieRecord movieRecord, PageRequest pageRequest) {
        long total = this.movieRecordDao.count(movieRecord);
        return new PageImpl<>(this.movieRecordDao.queryAllByLimit(movieRecord, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieRecord 实例对象
     * @return 实例对象
     */
    @Override
    public MovieRecord insert(MovieRecord movieRecord) {
        this.movieRecordDao.insert(movieRecord);
        return movieRecord;
    }

    /**
     * 修改数据
     *
     * @param movieRecord 实例对象
     * @return 实例对象
     */
    @Override
    public MovieRecord update(MovieRecord movieRecord) {
        this.movieRecordDao.update(movieRecord);
        return this.queryById(movieRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieRecordDao.deleteById(id) > 0;
    }
}
