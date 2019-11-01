package com.wx.springBootShiro.shrio.web.controller;

import com.wx.springBootShiro.shrio.common.WrapMapper;
import com.wx.springBootShiro.shrio.common.Wrapper;
import com.wx.springBootShiro.shrio.model.pojo.Student;
import com.wx.springBootShiro.shrio.service.IStudentService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author wangxin
 * @Title
 * @Description
 * @date 2019-10-29 11:27
 */
@RestController
public class StudentController {
    private static final Logger logger = LogManager.getLogger(StudentController.class);

    @Resource
    private IStudentService studentService;

    @GetMapping("/selectall")
    public Wrapper<List<Student>> selectAll(){
        List<Student> students = studentService.studenetList();
        Wrapper<List<Student>> wrapper = null;
        if (null!=students){
            wrapper = WrapMapper.wrap(200,"查询成功",students);
        }else {
            wrapper = WrapMapper.wrap(200,"查无数据");
        }
        return wrapper;
    }

}
