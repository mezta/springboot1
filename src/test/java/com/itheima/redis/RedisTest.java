package com.itheima.redis;

import com.itheima.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test(){
        redisTemplate.opsForValue().set("str","heima");
        System.out.println(redisTemplate.opsForValue().get("str"));
        redisTemplate.boundValueOps("see").set("woshinida");
        System.out.println(redisTemplate.opsForValue().get("see"));

        //hash
        redisTemplate.boundHashOps("h_map").put("sad","asd");
        redisTemplate.boundHashOps("h_map").put("sss","asd");

        Set set = redisTemplate.boundHashOps("h_map").keys();
        System.out.println(" hash散列的所有域：" + set);
        //获取所有值
        List list = redisTemplate.boundHashOps("h_map").values();
        System.out.println(" hash散列的所有域的值：" + list);
        //
        //list
        redisTemplate.boundListOps("as").leftPush("c");
        redisTemplate.boundListOps("as").leftPush("d");
        redisTemplate.boundListOps("as").leftPush("e");

       list = redisTemplate.boundListOps("as").range(0, -1);
        System.out.println(list);

        // set 集合
        redisTemplate.boundSetOps("s_key").add("a", "b", "c");
        set = redisTemplate.boundSetOps("s_key").members();
        System.out.println(" set集合中的所有元素：" + set);

        // sorted set 有序集合
        redisTemplate.boundZSetOps("z_key").add("a", 30);
        redisTemplate.boundZSetOps("z_key").add("b", 20);
        redisTemplate.boundZSetOps("z_key").add("c", 10);
        set = redisTemplate.boundZSetOps("z_key").range(0, -1);
        System.out.println(" zset有序集合中的所有元素：" + set);


    }
}
