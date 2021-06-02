package com.shoppingpermission.permission.modules.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shoppingpermission.permission.modules.ums.model.UmsResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台资源表 Mapper 接口
 * @author: Gauss
 * @date: 2021-06-02 14:14
 **/
@Mapper
public interface UmsResourceMapper extends BaseMapper<UmsResource> {

    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);

}
