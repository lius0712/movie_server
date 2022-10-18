package com.player.movie.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 文章评论(MovieComment)实体类
 *
 * @author makejava
 * @since 2022-10-19 00:27:19
 */
public class MovieComment implements Serializable {
    private static final long serialVersionUID = -68716243489300889L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论父级id
     */
    private Integer parentId;
    /**
     * 一级评论
     */
    private Integer topId;
    /**
     * 文章id
     */
    private Integer movieId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date udateTime;
    /**
     * 被回复者
     */
    private String replyUserId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
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

    public Date getUdateTime() {
        return udateTime;
    }

    public void setUdateTime(Date udateTime) {
        this.udateTime = udateTime;
    }

    public String getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(String replyUserId) {
        this.replyUserId = replyUserId;
    }

}

