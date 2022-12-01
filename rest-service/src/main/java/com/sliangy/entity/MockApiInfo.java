package com.sliangy.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (MockApiInfo)实体类
 *
 * @author makejava
 * @since 2022-12-01 22:14:39
 */
public class MockApiInfo implements Serializable {
    private static final long serialVersionUID = 204957030743853406L;

    private Integer id;

    private String name;

    private String delete;

    private String remark;

    private Date deleteTime;

    private Date createTime;

    private Date modifyTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}

