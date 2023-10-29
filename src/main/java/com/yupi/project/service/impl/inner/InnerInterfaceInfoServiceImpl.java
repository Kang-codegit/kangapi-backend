package com.yupi.project.service.impl.inner;


import com.api.kangcommon.model.entity.InterfaceInfo;
import com.api.kangcommon.service.InnerInterfaceInfoService;
import com.yupi.project.service.InterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
* @author csw
*/
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        return interfaceInfoService.query()
                .eq("url", path)
                .eq("method", method)
                .one();
    }
}




