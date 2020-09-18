package com.dreamyfish.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "course")
public class Course {
    private Integer cid;
    private String courseName;
    private Integer studentId;
}