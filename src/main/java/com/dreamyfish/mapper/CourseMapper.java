package com.dreamyfish.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dreamyfish.entity.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper extends BaseMapper<Course> {

    @Select("select * from course where student_id=#{studentId}")
    List<Course> selectByStudentId(Integer studentId);
}
