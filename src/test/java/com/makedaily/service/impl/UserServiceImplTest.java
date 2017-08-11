package com.makedaily.service.impl;

import com.alibaba.fastjson.JSON;
import com.makedaily.model.User;
import com.makedaily.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceImplTest {
    private static Logger logger = Logger.getLogger(UserServiceImplTest.class);
    @Resource
    private IUserService userService = null;
    @Test
    public void test1() {
        User user = userService.getUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
        System.out.println(user.toString());
    }
}