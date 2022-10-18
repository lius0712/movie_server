package com.player.movie.controller;

import com.player.movie.entity.MovieStars;
import com.player.movie.service.MovieStarsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieStars)表控制层
 *
 * @author makejava
 * @since 2022-10-19 00:29:43
 */
@RestController
@RequestMapping("movieStars")
public class MovieStarsController {
    /**
     * 服务对象
     */
    @Resource
    private MovieStarsService movieStarsService;

    /**
     * 分页查询
     *
     * @param movieStars 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MovieStars>> queryByPage(MovieStars movieStars, PageRequest pageRequest) {
        return ResponseEntity.ok(this.movieStarsService.queryByPage(movieStars, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MovieStars> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieStarsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieStars 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MovieStars> add(MovieStars movieStars) {
        return ResponseEntity.ok(this.movieStarsService.insert(movieStars));
    }

    /**
     * 编辑数据
     *
     * @param movieStars 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MovieStars> edit(MovieStars movieStars) {
        return ResponseEntity.ok(this.movieStarsService.update(movieStars));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieStarsService.deleteById(id));
    }

}

