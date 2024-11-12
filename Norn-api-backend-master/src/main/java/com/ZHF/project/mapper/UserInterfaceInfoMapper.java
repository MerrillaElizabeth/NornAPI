package com.ZHF.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ZHF.nornapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * 用户接口信息 Mapper
 *
 * @author ZHF
 *  
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




