package com.example.mqplusnettydemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mqplusnettydemo.pojo.User;


public interface UserService extends IService<User> {

    User getUserByName(String username);
}
