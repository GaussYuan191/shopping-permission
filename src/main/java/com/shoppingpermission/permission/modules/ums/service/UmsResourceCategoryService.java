package com.shoppingpermission.permission.modules.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shoppingpermission.permission.modules.ums.model.UmsResourceCategory;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台资源分类管理Service
 * @author: Gauss
 * @date: 2021-06-05 13:38
 **/
public interface UmsResourceCategoryService extends IService<UmsResourceCategory> {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    boolean create(UmsResourceCategory umsResourceCategory);
}

