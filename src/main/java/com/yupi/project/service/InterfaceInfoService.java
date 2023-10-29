package com.yupi.project.service;

import com.api.kangcommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author sakuul
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-10-14 17:47:04
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * add 是否为创建校验
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
