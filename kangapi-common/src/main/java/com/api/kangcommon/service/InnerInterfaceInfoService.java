package com.api.kangcommon.service;

import com.api.kangcommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * @author sakuul
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2023-10-14 17:47:04
 */
public interface InnerInterfaceInfoService{


    /**
     * 从数据库中查询模拟接口是否存在（请求路径，请求方法，请求参数 返回接口信息）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path,String method);

}
