package com.after.life.user.service.impl;

import com.after.life.feign.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.after.life.user.service.SysUserService;
import com.after.life.user.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Lostceleste
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2023-06-10 20:42:59
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




