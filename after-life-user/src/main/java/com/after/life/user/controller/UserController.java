package com.after.life.user.controller;

import com.after.life.feign.entity.SysUser;
import com.after.life.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-10 20:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SysUserService userService;

    @GetMapping("/test")
    public String test(@RequestParam Integer id) {
        List<SysUser> list = userService.list();
        return list.toString() + id;
    }
}
