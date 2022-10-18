package com.player.movie.controller;

import com.player.movie.entity.MovieComment;
import com.player.movie.service.MovieCommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文章评论(MovieComment)表控制层
 *
 * @author makejava
 * @since 2022-10-19 00:27:18
 */
@RestController
@RequestMapping("movieComment")
public class MovieCommentController {
    /**
     * 服务对象
     */
    @Resource
    private MovieCommentService movieCommentService;

    /**
     * 分页查询
     *
     * @param movieComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MovieComment>> queryByPage(MovieComment movieComment, PageRequest pageRequest) {
        return ResponseEntity.ok(this.movieCommentService.queryByPage(movieComment, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MovieComment> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieCommentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieComment 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MovieComment> add(MovieComment movieComment) {
        return ResponseEntity.ok(this.movieCommentService.insert(movieComment));
    }

    /**
     * 编辑数据
     *
     * @param movieComment 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MovieComment> edit(MovieComment movieComment) {
        return ResponseEntity.ok(this.movieCommentService.update(movieComment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieCommentService.deleteById(id));
    }

}

