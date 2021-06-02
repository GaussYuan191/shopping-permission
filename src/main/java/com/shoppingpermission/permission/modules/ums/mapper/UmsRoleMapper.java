package com.shoppingpermission.permission.modules.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shoppingpermission.permission.modules.ums.model.UmsRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台用户角色表 Mapper 接口
 * @author: Gauss
 * @date: 2021-06-02 14:13
 **/
@Mapper
public interface UmsRoleMapper extends BaseMapper<UmsRole> {

    /**
     * 获取用户所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

}

