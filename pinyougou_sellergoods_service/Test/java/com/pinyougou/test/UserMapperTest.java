package com.pinyougou.test;

import com.pinyougou.mapper.UserMapper;
import com.pinyougou.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext-*.xml")

public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testGetAllUser(){
        //查询所有品牌
        List<User> select = userMapper.select(null);
        for (User user : select) {
            System.out.println(user);
        }
    }
    /**
     * 插入数据-忽略空值
     */
    @Test
    public void testInsertSelective(){
        User user=new User();
        user.setUsername("大哥哥");
        userMapper.insertSelective(user);
    }

    @Test
    public  void testUpdateByPrimaryKey(){
        User user=new User();
        user.setId(37);
        user.setAddress("北京黑马");
        userMapper.updateByPrimaryKey(user);
    }
}
