package com.yc.admin.controller;

import com.yc.admin.service.RoleService;
import com.yc.common.core.base.dto.admin.RoleAddOrUpdateReqDTO;
import com.yc.common.core.base.dto.admin.RoleDelReqDTO;
import com.yc.common.core.base.dto.admin.RolePageReqDTO;
import com.yc.common.core.base.result.ResultBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: youcong
 * @time: 2021/9/20 21:07
 */
@RestController
@Slf4j
@Api(tags = {"后台管理-角色管理"}, description = "后台管理-角色管理")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 获取角色列表
     *
     * @param reqDTO
     * @return
     */
    @PostMapping("/role/queryPageList")
    @ApiOperation("获取角色列表")
    public ResultBody queryPageList(@RequestBody RolePageReqDTO reqDTO) {
        log.info("/role/queryPageList:" + reqDTO);
        return ResultBody.success(roleService.queryRolePageList(reqDTO));
    }


    /**
     * 新增或修改角色
     *
     * @param reqDTO
     * @return
     */
    @PostMapping("/role/saveOrUpdate")
    @ApiOperation("新增或修改角色")
    public ResultBody saveOrUpdate(@RequestBody RoleAddOrUpdateReqDTO reqDTO) {
        log.info("/user/saveOrUpdate:" + reqDTO);
        return ResultBody.success(roleService.saveOrUpdate(reqDTO));
    }

    /**
     * 删除角色
     *
     * @param reqDTO
     * @return
     */
    @PostMapping("/role/del")
    @ApiOperation("删除角色")
    public ResultBody del(@RequestBody RoleDelReqDTO reqDTO) {
        log.info("/role/del");
        return ResultBody.success(roleService.del(reqDTO));
    }

}
