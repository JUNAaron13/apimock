package com.sliangy.controller;


import com.alibaba.fastjson.JSON;
import com.sliangy.dao.MockApiInfoDao;
import com.sliangy.dao.MockApiResponseDao;
import com.sliangy.entity.MockApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/v1")
@Slf4j
public class MockApiController {

    @Autowired
    private MockApiResponseDao mockApiResponseDao;


    @Autowired
    MockApiInfoDao mockApiInfoDao ;


    @GetMapping("/default/{apiName}")
    public String commonApi(@PathVariable("apiName") String apiName){
        log.info("========Mock-Api-Service Receive...Interface=[{}]========",apiName);
        StopWatch watch = new StopWatch();
        String res = "";
        watch.start();
        MockApiResponse rseonse;
        if("lottery".equals(apiName)){

            rseonse =  mockApiResponseDao.selectByApiNameRandom(apiName);


        }else {
             rseonse =  mockApiResponseDao.selectByOrder(apiName);
        }
        if(rseonse == null){
            res = " Api Not Define ";
        }else {
            res = rseonse.getResContent();
        }

        watch.stop();
        log.info("task finish! cost{} ms",watch.getTotalTimeMillis());
        return  res;


    }
}
