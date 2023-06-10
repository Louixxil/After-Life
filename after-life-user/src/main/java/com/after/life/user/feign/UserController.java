package com.after.life.user.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-10 14:14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test")
    public String test(@RequestParam Integer id) {
        return "test" + id;
    }
}
