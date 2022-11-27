package com.player.movie.controller;

import com.player.movie.entity.MovieNetwork;
import com.player.movie.entity.ResultEntity;
import com.player.movie.service.MovieNetworkService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieNetwork)表控制层
 *
 * @author makejava
 * @since 2022-10-19 00:28:45
 */
@RestController
@RequestMapping("movieNetwork")
public class MovieNetworkController {
    /**
     * 服务对象
     */
    @Resource
    private MovieNetworkService movieNetworkService;


    @GetMapping("/getTopMovieList")
    public ResultEntity getTopMovieList(
            @RequestParam("classify") String classify,
            @RequestParam(value = "category",required = false) String category
    ) {
        return movieNetworkService.getTopMovieList(classify, category);
    }

    @ApiOperation("按照类型获取推荐影片")
    @GetMapping("/getKeyWord")
    public ResultEntity getKeyWord(
            @RequestParam("classify") String classify
    ) {
        return movieNetworkService.getKeyWord(classify);
    }

    @GetMapping
    public ResponseEntity<Page<MovieNetwork>> queryByPage(MovieNetwork movieNetwork, PageRequest pageRequest) {
        return ResponseEntity.ok(this.movieNetworkService.queryByPage(movieNetwork, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MovieNetwork> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieNetworkService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieNetwork 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MovieNetwork> add(MovieNetwork movieNetwork) {
        return ResponseEntity.ok(this.movieNetworkService.insert(movieNetwork));
    }

    /**
     * 编辑数据
     *
     * @param movieNetwork 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MovieNetwork> edit(MovieNetwork movieNetwork) {
        return ResponseEntity.ok(this.movieNetworkService.update(movieNetwork));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieNetworkService.deleteById(id));
    }

}

