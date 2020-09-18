package com.dreamyfish.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName(value = "student")
public class Student {
    private Integer id;
    private String studentName;

    //一对一
//    @TableField(exist = false)
//    private Course course;

    //一对多
    @TableField(exist = false)
    private List<Course> courses;
}