package com.damon.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping ("/helloWorld")
  public String index() {
    return "HelloWorld";
  }
}
