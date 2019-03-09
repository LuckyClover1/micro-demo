package com.example.eurekauser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Home {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/getOrder")
    public String order(){
        return this.restTemplate.getForObject("http://order/order",String.class);
    }
}
