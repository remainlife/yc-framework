package com.yc.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yc.admin.mapper.MenuMapper;
import com.yc.admin.service.MenuService;
import com.yc.common.core.base.entity.admin.MenuEntity;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: youcong
 * @time: 2021/9/20 20:20
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuEntity> implements MenuService {
}
