package com.afl.blog;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * 博客app
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-07 22:26
 */
@SpringBootApplication
public class BlogApplication {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @PostConstruct
    public void printInfo() {
        String port = environment.getProperty("server.port");
        String contextPath = environment.getProperty("server.servlet.context-path", "");
        System.out.println("\tServer started at: http://localhost:" + port + contextPath);
    }
}
