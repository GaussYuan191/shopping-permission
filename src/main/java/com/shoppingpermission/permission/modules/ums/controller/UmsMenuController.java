package com.shoppingpermission.permission.modules.ums.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shoppingpermission.permission.common.api.CommonPage;
import com.shoppingpermission.permission.common.api.CommonResult;
import com.shoppingpermission.permission.modules.ums.dto.UmsMenuNode;
import com.shoppingpermission.permission.modules.ums.model.UmsMenu;
import com.shoppingpermission.permission.modules.ums.service.UmsMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台菜单管理Controller
 * @author: Gauss
 * @date: 2021-06-05 15:30
 **/
@Controller
@RequestMapping("/menu")
public class UmsMenuController {

    @Autowired
    private UmsMenuService menuService;

    /**
     * 添加后台菜单
     * @param umsMenu
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody UmsMenu umsMenu) {
        boolean success = menuService.create(umsMenu);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    /**
     * 修改后台菜单
     * @param id
     * @param umsMenu
     * @return
     */
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id,
                               @RequestBody UmsMenu umsMenu) {
        boolean success = menuService.update(id, umsMenu);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    /**
     * 根据ID获取菜单详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsMenu> getItem(@PathVariable Long id) {
        UmsMenu umsMenu = menuService.getById(id);
        return CommonResult.success(umsMenu);
    }

    /**
     * 根据ID删除后台菜单
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        boolean success = menuService.removeById(id);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    /**
     * 分页查询后台菜单
     * @param parentId
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping(value = "/list/{parentId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsMenu>> list(@PathVariable Long parentId,
                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<UmsMenu> menuList = menuService.list(parentId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(menuList));
    }

    /**
     * 树形结构返回所有菜单列表
     * @return
     */
    @RequestMapping(value = "/treeList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsMenuNode>> treeList() {
        List<UmsMenuNode> list = menuService.treeList();
        return CommonResult.success(list);
    }

    /**
     * 修改菜单显示状态
     * @param id
     * @param hidden
     * @return
     */
    @RequestMapping(value = "/updateHidden/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateHidden(@PathVariable Long id, @RequestParam("hidden") Integer hidden) {
        boolean success = menuService.updateHidden(id, hidden);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }
}
