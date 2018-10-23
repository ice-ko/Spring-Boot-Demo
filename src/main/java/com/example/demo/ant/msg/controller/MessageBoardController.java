package com.example.demo.ant.msg.controller;

import java.util.HashMap;

import com.example.demo.ant.msg.entity.MessageBoard;
import com.example.demo.ant.msg.mapper.MessageBoardMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * <p>
 * 留言板 前端控制器
 * </p>
 *
 * @author demo
 * @since 2018-10-22
 */
@Controller
@RequestMapping("/msg")
public class MessageBoardController {

    @Autowired
    MessageBoardMapper mapper;

    @RequestMapping("/index")
    public String helloHtml(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/msg/index";
    }

    /**
     * 查询数据
     * 
     * @return
     */
    @RequestMapping("/msg/message-board")
    public MessageBoard GetMsg() {
        MessageBoard data = mapper.selectById(1);
        return data;
    }

    /**
     * 添加数据
     * 
     * @return
     */
    @RequestMapping("/msg/add")
    public String Add() {
        MessageBoard entity = new MessageBoard();
        entity.setName("Name1");
        entity.setEmail("Email1");
        entity.setTitle("演示");
        int isAdd = mapper.insert(entity);
        return isAdd > 0 ? "ok" : "err";
    }

    /**
     * 修改数据
     * 
     * @return
     */
    @RequestMapping("/msg/update")
    public String Update() {
        MessageBoard entity = new MessageBoard();
        entity.setName("Name1");
        entity.setEmail("Email1");
        entity.setTitle("演示1");
        entity.setId(2);
        int isAdd = mapper.updateById(entity);
        return isAdd > 0 ? "ok" : "err";
    }
}
