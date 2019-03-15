package com.hr.service;

import com.hr.entity.SysUser;
import com.hr.mapper.SysUserMapper;
import com.hr.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    RedisUtil redisUtil;

    @Cacheable("queryAll")
    public List<SysUser> queryAll(){
        System.out.println(1111);
        return sysUserMapper.queryAll();
    }

    @CacheEvict(value = {"queryAll"},allEntries = true)
    public void add(){
        sysUserMapper.add();
    }

}
