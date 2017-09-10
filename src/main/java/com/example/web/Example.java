package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.UserMapper;

@RestController
@EnableAutoConfiguration
@RequestMapping("/example")
public class Example {

    @Autowired
    private UserMapper testUserMapper;

    @RequestMapping("/getUser/{id}")
    String getUser(@PathVariable Long id) {
        return testUserMapper.selectByPrimaryKey(id).toString();
    }
   }