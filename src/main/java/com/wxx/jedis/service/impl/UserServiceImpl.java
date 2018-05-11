package com.wxx.jedis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wxx.jedis.dao.UserMapper;
import com.wxx.jedis.service.UserService;
import com.wxx.jedis.domain.User;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    /**
     * 新增数据直接进入缓存
     *
     * */
    @Override
    @Cacheable(value = "User",key = "'addUser'")
    public void addUser(User user){
        userMapper.addUser(user);
    }

    /**
     * 第一次查询会从数据库取数据，随后进入redis缓存
     * 这里的value的我们在xml文件里面定义的name
     *
     * */
    @Override
    @Cacheable(value="User",key = "'getUser'")
    public List<User> getUser(String username) {
        return userMapper.getUser(username);
    }

}