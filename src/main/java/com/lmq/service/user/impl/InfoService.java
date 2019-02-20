package com.lmq.service.user.impl;


import com.lmq.dao.InfoMapper;
import com.lmq.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class InfoService {

    @Autowired
    private InfoMapper infoMapper;
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
    public void updateInfo(Info info){
       infoMapper.updateInfo(info);
       System.out.println("info end!!!!!!");
        //User user=null;
       // return info;
    }

}
