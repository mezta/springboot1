package com.itheima.Test;

import com.itheima.Dao.User;
import com.itheima.Service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserHandler {

    @Autowired
    private UserService userService;
    @RequestMapping("/hello1")
    public String queruser(){
        return "index";
    }

    @RequestMapping("/user/{id}")
    public User queryByid(@PathVariable Integer id){
        return userService.queryByid(id);
    }

//
    @RequestMapping ("/inster")
    public int  intersr(){
        String username="张三";
        String password="213";
        int i = userService.insterUser(username, password);
        return i;
    }


}
