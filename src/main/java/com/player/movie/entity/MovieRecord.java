package com.player.movie.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (MovieRecord)实体类
 *
 * @author makejava
 * @since 2022-10-19 00:29:15
 */
public class MovieRecord implements Serializable {
    private static final long serialVersionUID = 820373978005832582L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 电影id
     */
    private String movieId;
    /**
     * 用户名，这这个表不需要，为了跟记录叫和收藏表的结构一致
     */
    private String userId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}

