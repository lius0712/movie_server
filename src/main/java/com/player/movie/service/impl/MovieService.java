package com.player.movie.service.impl;

import com.player.movie.entity.ResultEntity;
import com.player.movie.mapper.MovieMapper;
import com.player.movie.service.IMovieService;
import com.player.movie.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public ResultEntity findClassify() {
        ResultEntity resultEntity = ResultUtil.success(movieMapper.findClassify());
        return resultEntity;
    }

    @Override
    public ResultEntity getKeyWord(String classify) {
        ResultEntity resultEntity = ResultUtil.success(movieMapper.getKeyWord(classify));
        return resultEntity;
    }
}
