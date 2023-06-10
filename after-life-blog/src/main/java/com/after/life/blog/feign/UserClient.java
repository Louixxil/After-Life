package com.after.life.blog.feign;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "userapp")
public interface UserClient {
    @GetMapping("/user/test")
    String test(@RequestParam Integer id);
}
