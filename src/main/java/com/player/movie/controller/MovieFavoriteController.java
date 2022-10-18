package com.player.movie.controller;

import com.player.movie.entity.MovieFavorite;
import com.player.movie.service.MovieFavoriteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 收藏的电影(MovieFavorite)表控制层
 *
 * @author makejava
 * @since 2022-10-19 00:27:45
 */
@RestController
@RequestMapping("movieFavorite")
public class MovieFavoriteController {
    /**
     * 服务对象
     */
    @Resource
    private MovieFavoriteService movieFavoriteService;

    /**
     * 分页查询
     *
     * @param movieFavorite 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MovieFavorite>> queryByPage(MovieFavorite movieFavorite, PageRequest pageRequest) {
        return ResponseEntity.ok(this.movieFavoriteService.queryByPage(movieFavorite, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MovieFavorite> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieFavoriteService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieFavorite 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MovieFavorite> add(MovieFavorite movieFavorite) {
        return ResponseEntity.ok(this.movieFavoriteService.insert(movieFavorite));
    }

    /**
     * 编辑数据
     *
     * @param movieFavorite 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MovieFavorite> edit(MovieFavorite movieFavorite) {
        return ResponseEntity.ok(this.movieFavoriteService.update(movieFavorite));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieFavoriteService.deleteById(id));
    }

}

