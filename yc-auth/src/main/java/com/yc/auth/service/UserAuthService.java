package com.yc.auth.service;

import com.yc.common.core.base.dto.auth.UserAuthInfoReqDTO;

import java.util.Map;

/**
 * @description:
 * @author: youcong
 * @time: 2021/9/20 22:23
 */
public interface UserAuthService {

    /**
     * 登录认证逻辑处理
     *
     * @param reqDTO
     * @return
     */
    Map<String, Object> loginHandle(UserAuthInfoReqDTO reqDTO);

}