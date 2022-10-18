package com.player.movie.service.impl;

import com.player.movie.entity.MovieComment;
import com.player.movie.dao.MovieCommentDao;
import com.player.movie.service.MovieCommentService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 文章评论(MovieComment)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 00:27:19
 */
@Service("movieCommentService")
public class MovieCommentServiceImpl implements MovieCommentService {
    @Resource
    private MovieCommentDao movieCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieComment queryById(Integer id) {
        return this.movieCommentDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param movieComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieComment> queryByPage(MovieComment movieComment, PageRequest pageRequest) {
        long total = this.movieCommentDao.count(movieComment);
        return new PageImpl<>(this.movieCommentDao.queryAllByLimit(movieComment, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieComment 实例对象
     * @return 实例对象
     */
    @Override
    public MovieComment insert(MovieComment movieComment) {
        this.movieCommentDao.insert(movieComment);
        return movieComment;
    }

    /**
     * 修改数据
     *
     * @param movieComment 实例对象
     * @return 实例对象
     */
    @Override
    public MovieComment update(MovieComment movieComment) {
        this.movieCommentDao.update(movieComment);
        return this.queryById(movieComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.movieCommentDao.deleteById(id) > 0;
    }
}
