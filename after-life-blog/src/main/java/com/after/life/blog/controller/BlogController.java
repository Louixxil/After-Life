package com.after.life.blog.controller;

import com.after.life.blog.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ce
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-10 14:17
 */
@RestController
@RequestMapping("/test")
public class BlogController {
    @Autowired
    private UserClient userClient;
    @GetMapping("/test")
    public String test() {
        return userClient.test(1);
    }
    @GetMapping("/test2")
    public String test2() {
        return ";";
    }
}
