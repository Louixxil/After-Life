package com.after.life.feign.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 用户
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-10 20:06
 */
@Getter
@Setter
public class SysUser {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String headImg;
    private String password;
    private String email;
    private String salt;
    private LocalDateTime latLogTime;
    private String latLogIp;
    private String ext;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String mobile;
}
