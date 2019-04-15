package org.lhx.springboot.controller;

import org.lhx.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * @author lhx
 * @date 2019/4/10 - 10:48
 */
@Controller
public class HelloController {
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        if (user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World!";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好！</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
