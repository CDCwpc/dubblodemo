package com.example.dao;

import com.example.dao.entity.UserEntity;
import com.example.dao.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        List<UserEntity> user = userService.getUser();
        System.out.println("外部输出");
        System.out.println(user.toString());
    }

}
