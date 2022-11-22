package com.player.movie.controller;

import com.player.movie.entity.Movie;
import com.player.movie.entity.ResultEntity;
import com.player.movie.service.MovieService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * (Movie)表控制层
 *
 * @author makejava
 * @since 2022-10-18 23:58:24
 */
@RestController
@RequestMapping("movies")
public class MovieController {

    /**
     * 服务对象
     */
    @Resource
    private MovieService movieService;


    @ApiOperation("获取分类信息")
    @GetMapping("findClassify")
    public ResultEntity findClassify() {
        return movieService.findClassify();
    }


    @GetMapping("/search")
    public ResultEntity search(
            @RequestParam("keyword") String keyword,
            @RequestParam("pageNum") int pageNum,
            @RequestParam("pageSize") int pageSize
    ) {
        return movieService.search(keyword, pageNum, pageSize);
    }


    @GetMapping("/getCategoryList")
    public ResultEntity getCategoryList(
            @RequestParam("classify") String classify,
            @RequestParam("category") String category
    ) {
        return movieService.getCategoryList(classify, category);
    }



    @GetMapping
    public Movie movies() {
        return movieService.queryById(1);
    }

    /**
     * 分页查询
     *
     * @param movie 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<Movie>> queryByPage(Movie movie, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.movieService.queryByPage(movie, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Movie> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movie 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Movie> add(Movie movie) {
        return ResponseEntity.ok(this.movieService.insert(movie));
    }

    /**
     * 编辑数据
     *
     * @param movie 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Movie> edit(Movie movie) {
        return ResponseEntity.ok(this.movieService.update(movie));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieService.deleteById(id));
    }

}

