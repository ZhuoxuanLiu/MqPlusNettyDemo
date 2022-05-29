package com.example.mqplusnettydemo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mqplusnettydemo.mapper.UserMapper;
import com.example.mqplusnettydemo.pojo.User;
import com.example.mqplusnettydemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User getUserByName(String username) {
        return userMapper.selectOne(query().eq("username", username));
    }
}
