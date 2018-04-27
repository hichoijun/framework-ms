package com.cai.configclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Value("${server.env}")
  private String env;

  @Value("${server.name}")
  private String name;

  @GetMapping("/hi")
  public String hi() {
    return "hello, I am " + env + ", name " + name;
  }


  @GetMapping("/config/client/hi2")
  public String chi() {
    return "hello, I am config client";
  }

}
