package com.ten.springboot_mybatis_web_demo.controller;


import com.ten.springboot_mybatis_web_demo.mapper.ChatMsgMapper;
import com.ten.springboot_mybatis_web_demo.pojo.ChatMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ChatMsgMapper mapper;


    @GetMapping("/test")
    public List<ChatMsg>  test(){
        List<ChatMsg> chatMsgs = mapper.selectAll();
        return chatMsgs;
    }
}
