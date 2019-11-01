package com.wx.springBootShiro.shrio.service.impl;

import com.wx.springBootShiro.shrio.mapper.StudentMapper;
import com.wx.springBootShiro.shrio.model.pojo.Student;
import com.wx.springBootShiro.shrio.service.IStudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangxin
 * @Title
 * @Description
 * @date 2019-10-29 10:54
 */
@Service
public class StudentServiceImpl implements IStudentService {

    private static final Logger logger = LogManager.getLogger(StudentServiceImpl.class);

    @Resource
    private StudentMapper studentMapper;


    @Override
    public List<Student> studenetList() {
        logger.info("进入方法");
        List<Student> students = studentMapper.queryAll();
        logger.info("查询结果条数："+students.size());
        return students;
    }

}
