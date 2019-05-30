package com.pinyougou.sellergoods.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller// 传入一个页面
// RestController = Controller + ResponseBody//传出一个JOSN
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "/info")
    public Map<String,Object> name(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map<String, Object> map = new HashMap<>();
        map.put("loginName", name);
        return map;
    }
}
