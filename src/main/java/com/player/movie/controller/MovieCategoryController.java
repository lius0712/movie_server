package com.player.movie.controller;

import com.player.movie.entity.MovieCategory;
import com.player.movie.service.MovieCategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieCategory)表控制层
 *
 * @author makejava
 * @since 2022-10-19 00:26:35
 */
@RestController
@RequestMapping("movieCategory")
public class MovieCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private MovieCategoryService movieCategoryService;

    /**
     * 分页查询
     *
     * @param movieCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MovieCategory>> queryByPage(MovieCategory movieCategory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.movieCategoryService.queryByPage(movieCategory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MovieCategory> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieCategoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieCategory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MovieCategory> add(MovieCategory movieCategory) {
        return ResponseEntity.ok(this.movieCategoryService.insert(movieCategory));
    }

    /**
     * 编辑数据
     *
     * @param movieCategory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MovieCategory> edit(MovieCategory movieCategory) {
        return ResponseEntity.ok(this.movieCategoryService.update(movieCategory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieCategoryService.deleteById(id));
    }

}

