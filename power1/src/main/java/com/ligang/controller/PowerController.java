package com.ligang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PowerController {
    @RequestMapping("/hello")
    public String test(){
        return "xxxxx";
    }
    @RequestMapping("/getPower.do")
    public Object getPower(){
        Map map=new HashMap();
        map.put("key","i am a power1!");
        return map;
    }
}
