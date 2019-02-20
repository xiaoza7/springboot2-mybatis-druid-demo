package com.lmq.dao;


import com.lmq.model.User;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public User findUserInfo();
    public void addUser(User user);
}
