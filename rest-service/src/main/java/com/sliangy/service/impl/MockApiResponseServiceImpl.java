package com.sliangy.service.impl;

import com.sliangy.entity.MockApiResponse;
import com.sliangy.dao.MockApiResponseDao;
import com.sliangy.service.MockApiResponseService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MockApiResponse)表服务实现类
 *
 * @author makejava
 * @since 2022-12-05 21:07:52
 */
@Service("mockApiResponseService")
public class MockApiResponseServiceImpl implements MockApiResponseService {
    @Resource
    private MockApiResponseDao mockApiResponseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MockApiResponse queryById(Integer id) {
        return this.mockApiResponseDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mockApiResponse 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MockApiResponse> queryByPage(MockApiResponse mockApiResponse, PageRequest pageRequest) {
        long total = this.mockApiResponseDao.count(mockApiResponse);
        return new PageImpl<>(this.mockApiResponseDao.queryAllByLimit(mockApiResponse, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param mockApiResponse 实例对象
     * @return 实例对象
     */
    @Override
    public MockApiResponse insert(MockApiResponse mockApiResponse) {
        this.mockApiResponseDao.insert(mockApiResponse);
        return mockApiResponse;
    }

    /**
     * 修改数据
     *
     * @param mockApiResponse 实例对象
     * @return 实例对象
     */
    @Override
    public MockApiResponse update(MockApiResponse mockApiResponse) {
        this.mockApiResponseDao.update(mockApiResponse);
        return this.queryById(mockApiResponse.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mockApiResponseDao.deleteById(id) > 0;
    }
}
