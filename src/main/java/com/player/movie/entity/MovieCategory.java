package com.player.movie.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (MovieCategory)实体类
 *
 * @author makejava
 * @since 2022-10-19 00:26:35
 */
public class MovieCategory implements Serializable {
    private static final long serialVersionUID = -79431367294228161L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 分类 电影,电视剧,动漫,综艺,新片库,福利,午夜,恐怖,其他
     */
    private String classify;
    /**
     * 类目，值为banner首屏，carousel：滚动轮播
     */
    private String category;
    /**
     * 使用状态状态，1表示显示，0表示隐藏
     */
    private Object status;
    /**
     * 页面名称
     */
    private String pageName;
    /**
     * 来源
     */
    private String sourceName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
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

