package com.ZHF.nornapicommon.service;

import com.ZHF.nornapicommon.model.entity.InterfaceInfo;


public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
