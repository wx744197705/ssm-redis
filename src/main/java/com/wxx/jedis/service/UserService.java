package com.wxx.jedis.service;

import com.wxx.jedis.domain.User;
import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getUser(String username);

}