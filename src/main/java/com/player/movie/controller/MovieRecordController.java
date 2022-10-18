package com.player.movie.controller;

import com.player.movie.entity.MovieRecord;
import com.player.movie.service.MovieRecordService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieRecord)表控制层
 *
 * @author makejava
 * @since 2022-10-19 00:29:15
 */
@RestController
@RequestMapping("movieRecord")
public class MovieRecordController {
    /**
     * 服务对象
     */
    @Resource
    private MovieRecordService movieRecordService;

    /**
     * 分页查询
     *
     * @param movieRecord 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MovieRecord>> queryByPage(MovieRecord movieRecord, PageRequest pageRequest) {
        return ResponseEntity.ok(this.movieRecordService.queryByPage(movieRecord, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MovieRecord> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.movieRecordService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieRecord 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MovieRecord> add(MovieRecord movieRecord) {
        return ResponseEntity.ok(this.movieRecordService.insert(movieRecord));
    }

    /**
     * 编辑数据
     *
     * @param movieRecord 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MovieRecord> edit(MovieRecord movieRecord) {
        return ResponseEntity.ok(this.movieRecordService.update(movieRecord));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.movieRecordService.deleteById(id));
    }

}

