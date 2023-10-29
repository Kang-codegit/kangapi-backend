package com.api.kangcommon.service;


import com.api.kangcommon.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService{


    /**
     * 根据accessKey,secretKey查询用户
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
