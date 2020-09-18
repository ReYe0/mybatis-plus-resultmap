package com.dreamyfish.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dreamyfish.entity.Student;
import com.dreamyfish.entity.vo.StudentCourseVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getAll();

    Page<Student> getAll(IPage<Student> iPage);

    @Select("SELECT * from student a LEFT JOIN course b on a.id=b.student_id")
    Page<StudentCourseVo> getPageVo(Page<StudentCourseVo> iPage);
}
