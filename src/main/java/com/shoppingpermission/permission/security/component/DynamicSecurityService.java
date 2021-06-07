package com.shoppingpermission.permission.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @program: shopping-permission
 * @description: 动态权限相关业务类
 * @author: Gauss
 * @date: 2021-06-05 13:45
 **/
public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}

