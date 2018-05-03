package com.wang.controller;

import com.wang.pojo.JsonResult;
import com.wang.pojo.Resource;
import com.wang.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserContoller {

    @Autowired
    private Resource resource;

    @RequestMapping("/getUser")
    public User getUser() {

        User u = new User();
        u.setName("imooc1");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc1");
        u.setDesc("hello imooc1");

        return u;
    }

    @RequestMapping("/getResource")
    public JsonResult getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);

        return JsonResult.ok(bean);
    }

}
