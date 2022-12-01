package com.sliangy.service;

import com.sliangy.entity.MockApiInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MockApiInfo)表服务接口
 *
 * @author makejava
 * @since 2022-12-01 22:15:01
 */
public interface MockApiInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MockApiInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mockApiInfo 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<MockApiInfo> queryByPage(MockApiInfo mockApiInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param mockApiInfo 实例对象
     * @return 实例对象
     */
    MockApiInfo insert(MockApiInfo mockApiInfo);

    /**
     * 修改数据
     *
     * @param mockApiInfo 实例对象
     * @return 实例对象
     */
    MockApiInfo update(MockApiInfo mockApiInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
