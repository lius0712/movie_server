package com.player.movie.utils;

import com.player.movie.entity.ResultEntity;

public class ResultUtil {
    public static ResultEntity success(Object object) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(object);
        resultEntity.setStatus(ResultCode.SUCCESS);
        return resultEntity;
    }

    public static ResultEntity success(Object object, String msg) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(object);
        resultEntity.setMsg(msg);
        resultEntity.setStatus(ResultCode.SUCCESS);
        return resultEntity;
    }

    public static ResultEntity success(Object object, Long total) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(object);
        resultEntity.setTotal(total);
        resultEntity.setStatus(ResultCode.SUCCESS);
        return resultEntity;
    }

    public static ResultEntity success(Object object, String msg, String token) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(object);
        resultEntity.setToken(token);
        resultEntity.setStatus(ResultCode.SUCCESS);
        return resultEntity;
    }

    public static ResultEntity fail(Object object) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(object);
        resultEntity.setStatus(ResultCode.FAIIL);
        return resultEntity;
    }

    public static ResultEntity fail(Object object, String msg) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(object);
        resultEntity.setStatus(ResultCode.FAIIL);
        resultEntity.setMsg(msg);
        return resultEntity;
    }

    public static ResultEntity fail(Object object, String msg, String status) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(object);
        resultEntity.setStatus(status);
        resultEntity.setMsg(msg);
        return resultEntity;
    }

}
