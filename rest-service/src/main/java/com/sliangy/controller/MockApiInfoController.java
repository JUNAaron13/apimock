package com.sliangy.controller;

import com.sliangy.entity.MockApiInfo;
import com.sliangy.service.MockApiInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MockApiInfo)表控制层
 *
 * @author makejava
 * @since 2022-12-01 22:14:32
 */
@RestController
@RequestMapping("mockApiInfo")
public class MockApiInfoController {
    /**
     * 服务对象
     */
    @Resource
    private MockApiInfoService mockApiInfoService;

    /**
     * 分页查询
     *
     * @param mockApiInfo 筛选条件1111111
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MockApiInfo>> queryByPage(MockApiInfo mockApiInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.mockApiInfoService.queryByPage(mockApiInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MockApiInfo> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.mockApiInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param mockApiInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MockApiInfo> add(MockApiInfo mockApiInfo) {
        return ResponseEntity.ok(this.mockApiInfoService.insert(mockApiInfo));
    }

    /**
     * 编辑数据
     *
     * @param mockApiInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MockApiInfo> edit(MockApiInfo mockApiInfo) {
        return ResponseEntity.ok(this.mockApiInfoService.update(mockApiInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.mockApiInfoService.deleteById(id));
    }

}

