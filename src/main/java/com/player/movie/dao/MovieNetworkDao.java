package com.player.movie.dao;

import com.player.movie.entity.MovieNetwork;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (MovieNetwork)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-19 00:28:45
 */
public interface MovieNetworkDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieNetwork queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param movieNetwork 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MovieNetwork> queryAllByLimit(MovieNetwork movieNetwork, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movieNetwork 查询条件
     * @return 总行数
     */
    long count(MovieNetwork movieNetwork);

    /**
     * 新增数据
     *
     * @param movieNetwork 实例对象
     * @return 影响行数
     */
    int insert(MovieNetwork movieNetwork);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieNetwork> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MovieNetwork> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieNetwork> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MovieNetwork> entities);

    /**
     * 修改数据
     *
     * @param movieNetwork 实例对象
     * @return 影响行数
     */
    int update(MovieNetwork movieNetwork);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    Object getKeyWord(String classify);
}

