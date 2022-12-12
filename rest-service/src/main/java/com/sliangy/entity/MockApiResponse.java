package com.sliangy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (MockApiResponse)实体类
 *
 * @author makejava
 * @since 2022-12-08 00:09:54
 */
@Data
@AllArgsConstructor
public class MockApiResponse implements Serializable {
    private static final long serialVersionUID = -80267192596087732L;
    
    private Integer id;
    /**
     * 接口名称
     */
    private String apiName;
    /**
     * 返回类型：1-数字 2-字符串 3-Json
     */
    private Integer resType;
    /**
     * 返回内容
     */
    private String resContent;
    /**
     * 优先级
     */
    private Integer resOrder;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;

}

