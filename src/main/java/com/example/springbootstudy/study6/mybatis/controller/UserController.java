package com.example.springbootstudy.study6.mybatis.controller;

import com.example.springbootstudy.study6.mybatis.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private TestDao dao;

    @GetMapping(value = "/users")
    public List<TestDao> users() throws Exception {
        return dao.selectTest();
    }

}