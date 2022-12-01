package com.sliangy.dao;

import com.sliangy.entity.MockApiInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;


import java.util.List;

/**
 * (MockApiInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-12-01 22:14:37
 */
@Mapper
public interface MockApiInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MockApiInfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param mockApiInfo 查询条件
     * @param pageable    分页对象
     * @return 对象列表
     */
    List<MockApiInfo> queryAllByLimit(MockApiInfo mockApiInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param mockApiInfo 查询条件
     * @return 总行数
     */
    long count(MockApiInfo mockApiInfo);

    /**
     * 新增数据
     *
     * @param mockApiInfo 实例对象
     * @return 影响行数
     */
    int insert(MockApiInfo mockApiInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MockApiInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MockApiInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MockApiInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MockApiInfo> entities);

    /**
     * 修改数据
     *
     * @param mockApiInfo 实例对象
     * @return 影响行数
     */
    int update(MockApiInfo mockApiInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

