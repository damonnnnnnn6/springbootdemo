package com.damon.springbootdemo.controller;

import com.damon.springbootdemo.model.TUser;
import com.damon.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  public UserService userService;

  @RequestMapping(value = "/findAll")
  public TUser findAllUser(){
    return userService.findAllUser();
  }
}
