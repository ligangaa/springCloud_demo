package com.ligang.controller;

import com.ligang.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    private final static String POWER_URL="http://SERVER-POWER";
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getUser.do")
    public R getUser() {
        Map map = new HashMap();
        map.put("user", "l am a user!");
        return R.success("返回成功", map);
    }

    @RequestMapping("/getPower.do")
    public R getPower() {
        return R.success("操作成功", restTemplate.getForObject(POWER_URL+"/getPower.do", Object.class));
    }
}
