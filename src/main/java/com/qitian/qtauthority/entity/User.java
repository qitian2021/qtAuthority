package com.qitian.qtauthority.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author qitianyb
 * @Create by  StayHungry
 * @Date 2023/3/21 10:59 下午
 * @Description
 */
@Data
@ApiModel(description = "用户实体")
public class User implements Serializable {
    @ApiModelProperty(value = "主键")
    private int id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "年龄")
    private int age;
    @ApiModelProperty(value = "地址")
    private String address;
}
