package com.sliangy.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (MockApiResponse)实体类
 *
 * @author makejava
 * @since 2022-12-05 21:07:32
 */
public class MockApiResponse implements Serializable {
    private static final long serialVersionUID = -71497901646385833L;
    
    private Integer id;
    
    private String apiName;
    
    private String response;
    
    private String order;
    
    private Date createTime;
    
    private Date modifyTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
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

