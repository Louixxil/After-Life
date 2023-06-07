package com.afl.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-07 22:26
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @GetMapping("/test")
    public String test() {
        log.info("hello...");
        return "hello";
    }
}
