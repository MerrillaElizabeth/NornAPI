package com.ZHF.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ZHF.nornapicommon.model.entity.InterfaceInfo;

/**
 * 接口信息服务
 *
 * @author ZHF
 *  
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
