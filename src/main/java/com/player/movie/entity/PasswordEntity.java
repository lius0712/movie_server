package com.player.movie.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PasswordEntity {
    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "新密码")
    private String newPassword;

    @ApiModelProperty(value = "旧密码")
    private String oldPassword;
}
