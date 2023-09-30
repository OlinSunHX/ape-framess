package com.jingdianjichi.user.entity.dto;

import lombok.Data;


//相较于po可以存在更多的属性 多个po进行聚合 controller和service交互
//dto更专注于业务属性
@Data
public class UserDto {
    private String name;
    private Integer age;

}
