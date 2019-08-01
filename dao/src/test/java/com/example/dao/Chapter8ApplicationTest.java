package com.example.dao;

import com.example.dao.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;


/**
 * @description: demo-com.example.demo
 * @author: WPC
 * @date: 2019-07-24 16:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter8ApplicationTest {
    private static final Logger log = LoggerFactory.getLogger(Chapter8ApplicationTest.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

//    @Autowired
//    private RedisTemplate RedisTemplate;

    @Test
    public void get() {
//        // TODO 测试线程安全
//        ExecutorService executorService = Executors.newFixedThreadPool(1000);
//        IntStream.range(0, 1000).forEach(i ->
//                executorService.execute(() -> stringRedisTemplate.opsForValue().increment("kk", 1))
//        );
//        stringRedisTemplate.opsForValue().set("k1", "v1");
//        final String k1 = stringRedisTemplate.opsForValue().get("k1");
//        log.info("[字符缓存结果] - [{}]", k1);
//        // TODO 以下只演示整合，具体Redis命令可以参考官方文档，Spring Data Redis 只是改了个名字而已，Redis支持的命令它都支持
//        String key = "battcn:user:1";
//        redisCacheTemplate.opsForValue().set(key, new User(1L, "u1", "pa"));
//        // TODO 对应 String（字符串）
//        final User user = (User) redisCacheTemplate.opsForValue().get(key);
//        log.info("[对象缓存结果] - [{}]", user);

//        // redis存储数据
//        String key = "name";
//        stringRedisTemplate.opsForValue().set(key, "yukong");
//        // 获取数据
//        String value = stringRedisTemplate.opsForValue().get(key);
//        System.out.println("获取缓存中key为" + key + "的值为：" + value);


        String userKey = "张三";
//        UserEntity user = new UserEntity();
//        user.setId(1);
//        user.setAge(19);
//        user.setName("张三");
//        user.setEmail("一点也不清楚");
//
//        redisTemplate.opsForValue().set(userKey, user);
        UserEntity newUser = (UserEntity) redisTemplate.opsForValue().get(userKey);
        System.out.println("获取缓存中key为" + userKey + "的值为：" + newUser);

    }
}
