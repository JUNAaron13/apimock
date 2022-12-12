package com.sliangy.service;

import com.sliangy.entity.MockApiResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MockApiResponse)表服务接口
 *
 * @author makejava
 * @since 2022-12-08 00:09:55
 */
public interface MockApiResponseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MockApiResponse queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mockApiResponse 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MockApiResponse> queryByPage(MockApiResponse mockApiResponse, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param mockApiResponse 实例对象
     * @return 实例对象
     */
    MockApiResponse insert(MockApiResponse mockApiResponse);

    /**
     * 修改数据
     *
     * @param mockApiResponse 实例对象
     * @return 实例对象
     */
    MockApiResponse update(MockApiResponse mockApiResponse);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
