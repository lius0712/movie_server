package com.player.movie.controller;

import com.player.movie.entity.MovieUrl;
import com.player.movie.service.MovieUrlService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieUrl)表控制层
 *
 * @author makejava
 * @since 2022-10-19 00:30:03
 */
@RestController
@RequestMapping("movieUrl")
public class MovieUrlController {
    /**
     * 服务对象
     */
    @Resource
    private MovieUrlService movieUrlService;

    /**
     * 分页查询
     *
     * @param movieUrl 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MovieUrl>> queryByPage(MovieUrl movieUrl, PageRequest pageRequest) {
        return ResponseEntity.ok(this.movieUrlService.queryByPage(movieUrl, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MovieUrl> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieUrlService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieUrl 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MovieUrl> add(MovieUrl movieUrl) {
        return ResponseEntity.ok(this.movieUrlService.insert(movieUrl));
    }

    /**
     * 编辑数据
     *
     * @param movieUrl 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MovieUrl> edit(MovieUrl movieUrl) {
        return ResponseEntity.ok(this.movieUrlService.update(movieUrl));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieUrlService.deleteById(id));
    }

}

