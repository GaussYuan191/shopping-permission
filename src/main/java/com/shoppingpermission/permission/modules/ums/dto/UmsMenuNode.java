package com.shoppingpermission.permission.modules.ums.dto;

import com.shoppingpermission.permission.modules.ums.model.UmsMenu;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 后台节点封装
 * @author: Gauss
 * @date: 2021-06-02 11:26
 **/
@Getter
@Setter
public class UmsMenuNode extends UmsMenu {
    private List<UmsMenuNode> children;
}
