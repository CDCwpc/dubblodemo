package com.example.dao.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dao.entity.UserEntity;
import com.example.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: demo-com.example.demo.service
 * @author: WPC
 * @date: 2019-07-25 15:59
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Cacheable(value = "getUser")
    public List<UserEntity> getUser(){
//        Map<String, Object> map = new HashMap<>();
////        map.put("id", 1);
////        map.put("name", "4");


        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();


        queryWrapper.eq("name", "2").or(i -> i.eq("email", "5"));

        List<UserEntity> userEntity = userMapper.selectList(queryWrapper);
        System.out.println("查询后输出");
        System.out.println(userEntity.toString());
        return userEntity;
    }
}
