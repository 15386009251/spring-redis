package com.hr.mapper;

import com.hr.entity.SysUser;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SysUserMapper {

    @Select("select * from sys_user")
    List<SysUser> queryAll();

    @Insert("insert into sys_user values(5, 'haha', 'xixi')")
    void add();

}