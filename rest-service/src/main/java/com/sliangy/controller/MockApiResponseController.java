package com.sliangy.controller;

import com.sliangy.entity.MockApiResponse;
import com.sliangy.service.MockApiResponseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MockApiResponse)表控制层
 *
 * @author makejava
 * @since 2022-12-05 21:07:32
 */
@RestController
@RequestMapping("mockApiResponse")
public class MockApiResponseController {
    /**
     * 服务对象
     */
    @Resource
    private MockApiResponseService mockApiResponseService;

    /**
     * 分页查询
     *
     * @param mockApiResponse 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MockApiResponse>> queryByPage(MockApiResponse mockApiResponse, PageRequest pageRequest) {
        return ResponseEntity.ok(this.mockApiResponseService.queryByPage(mockApiResponse, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MockApiResponse> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.mockApiResponseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param mockApiResponse 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MockApiResponse> add(MockApiResponse mockApiResponse) {
        return ResponseEntity.ok(this.mockApiResponseService.insert(mockApiResponse));
    }

    /**
     * 编辑数据
     *
     * @param mockApiResponse 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MockApiResponse> edit(MockApiResponse mockApiResponse) {
        return ResponseEntity.ok(this.mockApiResponseService.update(mockApiResponse));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.mockApiResponseService.deleteById(id));
    }

}

