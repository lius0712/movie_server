package com.player.movie.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (MovieStars)实体类
 *
 * @author makejava
 * @since 2022-10-19 00:29:43
 */
public class MovieStars implements Serializable {
    private static final long serialVersionUID = 126159793765110358L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 演员名称
     */
    private String starName;
    /**
     * 演员图片地址
     */
    private String img;
    /**
     * 演员本地图片地址
     */
    private String localImg;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 对应电影的id
     */
    private Integer movieId;
    /**
     * 角色
     */
    private String role;
    /**
     * 演员的豆瓣链接地址
     */
    private String href;
    /**
     * 代表作
     */
    private String works;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLocalImg() {
        return localImg;
    }

    public void setLocalImg(String localImg) {
        this.localImg = localImg;
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

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getWorks() {
        return works;
    }

    public void setWorks(String works) {
        this.works = works;
    }

}

