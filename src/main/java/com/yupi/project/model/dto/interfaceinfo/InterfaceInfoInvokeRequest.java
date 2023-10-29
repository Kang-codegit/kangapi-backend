package com.yupi.project.model.dto.interfaceinfo;

import lombok.Data;

/**
 * 接口调用请求
 * @author kang
 */
@Data
public class InterfaceInfoInvokeRequest {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String userRequestParams;

    private static final long serialVersionUID = 1L;

}
