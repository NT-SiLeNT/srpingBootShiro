package com.wx.springBootShiro.shrio.mapper;


import com.wx.springBootShiro.shrio.model.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangxin
 * @Title
 * @Description
 * @date 2019-10-29 10:54
 */
@Component
@Mapper
public interface StudentMapper {
    List<Student> queryAll();
}

