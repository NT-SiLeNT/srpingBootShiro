package com.wx.springBootShiro.shrio.model.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangxin
 * @Title
 * @Description
 * @date 2019-11-04 13:49
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -8199044236081680038L;

    private Integer id;
    private String userName;
    private String password;
    private Date createTime;
    private String status;
}
