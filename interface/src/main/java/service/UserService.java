package service;

import entity.UserEntity;

import java.util.List;

/**
 * @description: dubblodemo-com.example.dao.service
 * @author: WPC
 * @date: 2019-08-02 15:48
 */
public interface UserService {
    public List<UserEntity> getUser();
}
