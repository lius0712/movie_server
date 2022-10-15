package com.player.movie.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class ResultEntity implements Serializable {
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
}
