package com.player.movie.dao;

import com.player.movie.entity.MovieCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Map;

/**
 * (MovieCategory)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-19 00:26:35
 */
public interface MovieCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MovieCategory queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param movieCategory 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MovieCategory> queryAllByLimit(MovieCategory movieCategory, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movieCategory 查询条件
     * @return 总行数
     */
    long count(MovieCategory movieCategory);

    /**
     * 新增数据
     *
     * @param movieCategory 实例对象
     * @return 影响行数
     */
    int insert(MovieCategory movieCategory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieCategory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MovieCategory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieCategory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MovieCategory> entities);

    /**
     * 修改数据
     *
     * @param movieCategory 实例对象
     * @return 影响行数
     */
    int update(MovieCategory movieCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    List<Map<String, String>> getAllCategoryByClassify(String classsify);

    List<Map<String, String>> getAllCategoryListByPageName(String pageName);
}

