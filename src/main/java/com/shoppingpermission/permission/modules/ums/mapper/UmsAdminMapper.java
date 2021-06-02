package com.shoppingpermission.permission.modules.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shoppingpermission.permission.modules.ums.model.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台用户表 Mapper 接口
 * @author: Gauss
 * @date: 2021-06-02 11:09
 **/
public interface UmsAdminMapper extends BaseMapper<UmsAdmin> {

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);

}

