package com.after.life.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户接口
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-10 20:05
 */
@FeignClient(name = "userApp")
@Component
public interface UserClient {


    @GetMapping("/user/test")
    String test(@RequestParam Integer id);
}
