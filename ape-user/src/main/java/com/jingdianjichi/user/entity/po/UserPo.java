package com.jingdianjichi.user.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

//po 是与数据库进行交互的东西 service和mapper交互
@TableName("user")
@Data
public class UserPo {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
    private Integer deleteFlag;
    private Integer version;

}
