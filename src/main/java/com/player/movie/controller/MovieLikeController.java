package com.player.movie.controller;

import com.player.movie.entity.MovieLike;
import com.player.movie.service.MovieLikeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 点赞的影片(MovieLike)表控制层
 *
 * @author makejava
 * @since 2022-10-19 00:28:12
 */
@RestController
@RequestMapping("movieLike")
public class MovieLikeController {
    /**
     * 服务对象
     */
    @Resource
    private MovieLikeService movieLikeService;

    /**
     * 分页查询
     *
     * @param movieLike 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MovieLike>> queryByPage(MovieLike movieLike, PageRequest pageRequest) {
        return ResponseEntity.ok(this.movieLikeService.queryByPage(movieLike, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MovieLike> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieLikeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieLike 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MovieLike> add(MovieLike movieLike) {
        return ResponseEntity.ok(this.movieLikeService.insert(movieLike));
    }

    /**
     * 编辑数据
     *
     * @param movieLike 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MovieLike> edit(MovieLike movieLike) {
        return ResponseEntity.ok(this.movieLikeService.update(movieLike));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieLikeService.deleteById(id));
    }

}

