package com.sliangy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (MockApiInfo)实体类
 *
 * @author makejava
 * @since 2022-12-01 22:14:39
 */
@Data
@AllArgsConstructor
public class MockApiInfo implements Serializable {
    private static final long serialVersionUID = 204957030743853406L;

    private Integer id;

    private String name;

    private String delete;

    private String remark;

    private Date deleteTime;

    private Date createTime;

    private Date modifyTime;


}

