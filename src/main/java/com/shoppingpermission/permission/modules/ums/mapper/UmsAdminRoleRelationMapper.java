package com.shoppingpermission.permission.modules.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shoppingpermission.permission.modules.ums.model.UmsAdminRoleRelation;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: shopping-permission
 * @description: 后台用户和角色关系表 Mapper 接口
 * @author: Gauss
 * @date: 2021-06-02 13:13
 **/
@Mapper
public interface UmsAdminRoleRelationMapper extends BaseMapper<UmsAdminRoleRelation> {
    Integer findAdminIdByRoleId(Integer id);

}
