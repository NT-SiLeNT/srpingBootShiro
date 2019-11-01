package com.wx.springBootShiro.shrio.model.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangxin
 * @Title
 * @Description
 * @date 2019-10-28 11:22
 */
@Data
public class Student implements Serializable {
    private String sno;
    private String name;
    private String sex;
}
