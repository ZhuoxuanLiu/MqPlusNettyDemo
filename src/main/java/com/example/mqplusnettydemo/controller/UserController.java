package com.example.mqplusnettydemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mqplusnettydemo.rabbitmq.service.RabbitQueueService;
import com.example.mqplusnettydemo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RabbitQueueService rabbitQueueService;

    @Value("${my-rabbit-queues.name}")
    private String[] queueNames;

    //登录接口, body内传入user信息 注册user专属rabbitmq队列
    @PostMapping("/login/account")
    public LoginResponse getUserQueue(@RequestBody JSONObject jsonObject){
        String username = jsonObject.getString("username");
        String type = jsonObject.getString("type");
        LoginResponse response = new LoginResponse("ok", type, "admin");
        for (String queueName : queueNames) {
            rabbitQueueService.addNewQueue(queueName + "_" + username, username, queueName);
        }
        return response;
    }


}
@Data
@AllArgsConstructor
class LoginResponse {
    private String status;
    private String type;
    private String currentAuthority;
}