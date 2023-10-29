package com.api.apiinterface.controller;


import com.kangapi.kangapiclientsdk.model.User;
import com.kangapi.kangapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/name")
@RestController
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("kang"));
        return "发送GET请求 你的名字是：" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "发送POST请求 你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
        String result = "Post 用户名是" + user.getUsername();
        return result;
    }

}
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        if (!accessKey.equals("kang")) {
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("过长");
//        }
//        if (timestamp){
//
//        }
//        String serverSign = SignUtils.gensign(body, "abcdefg");
//        if (!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }