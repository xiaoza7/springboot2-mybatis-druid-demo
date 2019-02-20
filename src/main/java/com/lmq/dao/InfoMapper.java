package com.lmq.dao;


import com.lmq.model.Info;

/**
 * Created by zl on 2015/8/27.
 */
public interface InfoMapper {
    public Info findInfo();
    public void updateInfo(Info info);
}
