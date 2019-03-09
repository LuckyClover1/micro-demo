package com.clover.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OderController {
    @GetMapping("order")
    public String order(){

        System.out.println("8001");
        return "I'm a Oder";
    }
}
