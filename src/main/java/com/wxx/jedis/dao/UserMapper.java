package com.wxx.jedis.dao;

import com.wxx.jedis.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    void addUser(User user);

    List<User> getUser(@Param("username") String username);

}