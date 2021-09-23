package com.itheima.Service;

import com.itheima.Dao.User;
import com.itheima.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryByid(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public int insterUser(String username,String password){
        User user =new User();
        user.setUsername(username);
        user.setPassword(password);
        return userMapper.insert(user);
    }
}
