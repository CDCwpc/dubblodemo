//package com.example.dao;
//
//import com.alibaba.dubbo.config.annotation.Reference;
//import com.example.dao.service.UserServiceImpl;
//import entity.UserEntity;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import service.UserService;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class DemoApplicationTests {
//    @Autowired
//    UserService userService;
//
//    @Test
//    public void contextLoads() {
//
//        List<UserEntity> user = userService.getUser();
//        System.out.println("外部输出");
//        System.out.println(user.toString());
//    }
//
//}
