package com.shoppingpermission.permission.modules.ums.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shoppingpermission.permission.modules.ums.dto.UmsMenuNode;
import com.shoppingpermission.permission.modules.ums.model.UmsMenu;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台菜单管理Service
 * @author: Gauss
 * @date: 2021-06-05 13:38
 **/
public interface UmsMenuService extends IService<UmsMenu> {
    /**
     * 创建后台菜单
     */
    boolean create(UmsMenu umsMenu);

    /**
     * 修改后台菜单
     */
    boolean update(Long id, UmsMenu umsMenu);

    /**
     * 分页查询后台菜单
     */
    Page<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 树形结构返回所有菜单列表
     */
    List<UmsMenuNode> treeList();

    /**
     * 修改菜单显示状态
     */
    boolean updateHidden(Long id, Integer hidden);
}

