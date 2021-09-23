package com.itheima.Service;

import com.itheima.Dao.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    void queryByid() {
        User user = userService.queryByid(1);
        System.out.println("user="+user);
    }


}