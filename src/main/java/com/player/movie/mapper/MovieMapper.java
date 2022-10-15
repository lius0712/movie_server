package com.player.movie.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface MovieMapper {
    /**
     * 查询电影分类
     * @return
     */
    List<Map<String, String>> findClassify();

    /**
     * 查询推荐电影
     * @param classify
     * @return
     */
    Map<String, String> getKeyWord(String classify);
}
