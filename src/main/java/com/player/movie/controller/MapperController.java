package com.player.movie.controller;

import com.player.movie.entity.ResultEntity;
import com.player.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/service/movie")
@RestController
public class MapperController {
    @Autowired
    private IMovieService movieService;
    @RequestMapping("/findClassify")
    public ResultEntity findClassify() {
        return movieService.findClassify();
    }

    @GetMapping("/getKeyWord")
    public ResultEntity getKeyWord(@RequestParam("classify") String classify) {
        return movieService.getKeyWord(classify);
    }
}
