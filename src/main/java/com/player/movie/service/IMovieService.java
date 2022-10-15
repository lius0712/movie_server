package com.player.movie.service;

import com.player.movie.entity.ResultEntity;

public interface IMovieService {
    ResultEntity findClassify();

    ResultEntity getKeyWord(String classify);
}
