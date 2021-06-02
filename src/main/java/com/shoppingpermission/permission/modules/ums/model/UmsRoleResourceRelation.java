package com.shoppingpermission.permission.modules.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @program: shopping-permission
 * @description: 后台角色资源关系表
 * @author: Gauss
 * @date: 2021-06-02 15:46
 **/
@Data
@TableName("ums_role_resource_relation")
public class UmsRoleResourceRelation implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long roleId;           //角色ID
    private Long resourceId;       //资源ID


}

