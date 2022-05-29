package com.example.mqplusnettydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mqplusnettydemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}

