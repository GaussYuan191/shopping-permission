package com.shoppingpermission.permission.modules.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shoppingpermission.permission.modules.ums.mapper.UmsResourceCategoryMapper;
import com.shoppingpermission.permission.modules.ums.model.UmsResourceCategory;
import com.shoppingpermission.permission.modules.ums.service.UmsResourceCategoryService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台资源分类管理Service实现类
 * @author: Gauss
 * @date: 2021-06-05 13:39
 **/
@Service
public class UmsResourceCategoryServiceImpl extends ServiceImpl<UmsResourceCategoryMapper,UmsResourceCategory> implements UmsResourceCategoryService {

    @Override
    public List<UmsResourceCategory> listAll() {
        QueryWrapper<UmsResourceCategory> wrapper = new QueryWrapper<>();
        wrapper.lambda().orderByDesc(UmsResourceCategory::getSort);
        return list(wrapper);
    }

    @Override
    public boolean create(UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setCreateTime(new Date());
        return save(umsResourceCategory);
    }
}

