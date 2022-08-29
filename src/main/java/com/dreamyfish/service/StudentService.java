package com.dreamyfish.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dreamyfish.entity.Student;
import com.dreamyfish.entity.vo.StudentCourseVo;
import com.dreamyfish.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    public List<Student> getAll1() {
        return studentMapper.getAll();
    }

    public Page<Student> getAll(IPage<Student> iPage) {
        return studentMapper.getAll(iPage);
    }

    public Page<StudentCourseVo> getPageVo(Page<StudentCourseVo> iPage) {
        return studentMapper.getPageVo(iPage);
    }
}