package com.qitian.qtauthority.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Create by  StayHungry
 * @Date 2023/3/21 11:00 下午
 * @Description
 */
@Data
@ApiModel(description = "菜单实体")
public class Menu implements Serializable {
    @ApiModelProperty(value = "主键")
    private int id;
    @ApiModelProperty(value = "菜单名称")
    private String name;
}