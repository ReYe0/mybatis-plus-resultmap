package com.dreamyfish.entity.vo;

import lombok.Data;
import java.io.Serializable;

@Data
public class StudentCourseVo implements Serializable {

    private Integer id;
    private String studentName;
    private Integer cid;
    private String courseName;
    private Integer studentId;
}