package com.player.movie.dao;

import com.player.movie.entity.Movie;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Map;

/**
 * (Movie)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-18 23:58:26
 */
public interface MovieDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Movie queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param movie 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Movie> queryAllByLimit(Movie movie, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movie 查询条件
     * @return 总行数
     */
    long count(Movie movie);

    /**
     * 新增数据
     *
     * @param movie 实例对象
     * @return 影响行数
     */
    int insert(Movie movie);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Movie> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Movie> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Movie> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Movie> entities);

    /**
     * 修改数据
     *
     * @param movie 实例对象
     * @return 影响行数
     */
    int update(Movie movie);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    List<Map<String, String>> findClassify();

    Object getMovieUrl(String movieId);

    Object getKeyWord(String classify);

    Map<String, Long> total(String keyword);

    Object search(String keyword, int start, int pageSize);

    Object getAllCategoryByClassify(String classsify);

    Object getAllCategoryListByPageName(String pageName);

    Object getCategoryList(String classify, String category);

    Object getStar(String movieId);
}

