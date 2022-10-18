package com.player.movie.dao;

import com.player.movie.entity.MovieFavorite;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 收藏的电影(MovieFavorite)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-19 00:27:45
 */
public interface MovieFavoriteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieFavorite queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param movieFavorite 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MovieFavorite> queryAllByLimit(MovieFavorite movieFavorite, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movieFavorite 查询条件
     * @return 总行数
     */
    long count(MovieFavorite movieFavorite);

    /**
     * 新增数据
     *
     * @param movieFavorite 实例对象
     * @return 影响行数
     */
    int insert(MovieFavorite movieFavorite);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieFavorite> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MovieFavorite> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieFavorite> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MovieFavorite> entities);

    /**
     * 修改数据
     *
     * @param movieFavorite 实例对象
     * @return 影响行数
     */
    int update(MovieFavorite movieFavorite);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

