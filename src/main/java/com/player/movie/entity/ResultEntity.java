package com.player.movie.entity;

import io.swagger.annotations.ApiModelProperty;

public class ResultEntity {
    @ApiModelProperty(value = "数据")
    private Object data;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "信息")
    private String msg;

    @ApiModelProperty(value = "总页数")
    private Long total;

    @ApiModelProperty(value = "token")
    private String token;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
