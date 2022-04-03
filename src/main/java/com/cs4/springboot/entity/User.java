package com.cs4.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 5703cs4
 * @since 2022-04-01
 */
@Getter
@Setter
@ApiModel(value = "User Object", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("user id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty("email account")
    private String loginEmail;

    @ApiModelProperty("account password")
    private String password;

    @ApiModelProperty("admin or not")
    private Integer auth;


}
