package com.lmq.service.user.impl;


import com.lmq.dao.UserMapper;
import com.lmq.model.Info;
import com.lmq.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private InfoService infoService;


    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public void addUserInfo(User user, Info info){
       userMapper.addUser(user);
        //User user=null;
        System.out.println("user end!!!!!!!!!");
        infoService.updateInfo(info);
        int i = 1/0 ;
    }

}
