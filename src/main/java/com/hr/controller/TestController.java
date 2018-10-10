package com.hr.controller;

import com.hr.entity.SysUser;
import com.hr.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/queryAll")
    public List<SysUser> queryAll(HttpServletRequest req){
        List<SysUser> list = sysUserService.queryAll();
        System.out.println(req.getSession().getId());
        return list;
    }

    @RequestMapping("add")
    public String add(){
        sysUserService.add();
        return "新增成功!";
    }

}
