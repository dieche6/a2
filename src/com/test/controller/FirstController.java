package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @RequestMapping("first.do")
    @ResponseBody
    public  String print(){
        System.out.println("bbbccc");
        return "aaa";
    }
}
