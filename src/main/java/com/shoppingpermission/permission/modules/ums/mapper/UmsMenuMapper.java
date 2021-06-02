package com.shoppingpermission.permission.modules.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shoppingpermission.permission.modules.ums.model.UmsMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台菜单表 Mapper 接口
 * @author: Gauss
 * @date: 2021-06-02 15:43
 **/
@Mapper
public interface UmsMenuMapper extends BaseMapper<UmsMenu> {

    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

}

