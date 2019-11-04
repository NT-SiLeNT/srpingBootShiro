package com.wx.springBootShiro.shrio.mapper;

import com.wx.springBootShiro.shrio.model.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangxin
 * @Title
 * @Description
 * @date 2019-11-04 13:56
 */
@Mapper
public interface UserMapper {
    User findByUserName(String userName);
}
