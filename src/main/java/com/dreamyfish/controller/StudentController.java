package com.dreamyfish.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dreamyfish.entity.Student;
import com.dreamyfish.entity.vo.StudentCourseVo;
import com.dreamyfish.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 多表联查，一对多
     * @return
     */
//    @GetMapping("testA")
//    public List<Student> testA(){
//        return studentService.getAll();
//    }

    /**
     * 多表联查，一对多，分页
     * @param page 当前页
     * @param size 每页条数
     * @return
     */
    @GetMapping("/pageTestA/{page}/{size}")
    public Page<Student> pageTestA(@PathVariable Integer page, @PathVariable Integer size){
        Page<Student> iPage = new Page<Student>(page, size);
        return studentService.getAll(iPage);
    }

    /**
     * 多表联查，一对多，分页
     * @param page 当前页
     * @param size 每页条数
     * @return
     */
    @GetMapping("/pageTestB/{page}/{size}")
    public Page<StudentCourseVo> pageTestB(@PathVariable Integer page, @PathVariable Integer size){
        Page<StudentCourseVo> iPage = new Page<StudentCourseVo>(page, size);
        return studentService.getPageVo(iPage);
    }
}