package com.player.movie.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (MovieUrl)实体类
 *
 * @author makejava
 * @since 2022-10-19 00:30:03
 */
public class MovieUrl implements Serializable {
    private static final long serialVersionUID = -16338284345440268L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 电影名称
     */
    private String movieName;
    /**
     * 对应的电影的id
     */
    private Integer movieId;
    /**
     * 源地址
     */
    private String href;
    /**
     * 集数
     */
    private String label;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 播放地址
     */
    private String url;
    /**
     * 播放分组，1, 2
     */
    private String playGroup;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPlayGroup() {
        return playGroup;
    }

    public void setPlayGroup(String playGroup) {
        this.playGroup = playGroup;
    }

}

