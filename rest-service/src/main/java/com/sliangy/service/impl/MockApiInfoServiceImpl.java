package com.sliangy.service.impl;

import com.sliangy.dao.MockApiInfoDao;
import com.sliangy.entity.MockApiInfo;
import com.sliangy.service.MockApiInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (MockApiInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-12-01 22:15:06
 */
@Service("mockApiInfoService")
public class MockApiInfoServiceImpl implements MockApiInfoService {

    @Resource
    private MockApiInfoDao mockApiInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MockApiInfo queryById(Integer id) {
        return this.mockApiInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mockApiInfo 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<MockApiInfo> queryByPage(MockApiInfo mockApiInfo, PageRequest pageRequest) {
        long total = this.mockApiInfoDao.count(mockApiInfo);
        return new PageImpl<>(this.mockApiInfoDao.queryAllByLimit(mockApiInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param mockApiInfo 实例对象
     * @return 实例对象
     */
    @Override
    public MockApiInfo insert(MockApiInfo mockApiInfo) {
        this.mockApiInfoDao.insert(mockApiInfo);
        return mockApiInfo;
    }

    /**
     * 修改数据
     *
     * @param mockApiInfo 实例对象
     * @return 实例对象
     */
    @Override
    public MockApiInfo update(MockApiInfo mockApiInfo) {
        this.mockApiInfoDao.update(mockApiInfo);
        return this.queryById(mockApiInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mockApiInfoDao.deleteById(id) > 0;
    }
}
