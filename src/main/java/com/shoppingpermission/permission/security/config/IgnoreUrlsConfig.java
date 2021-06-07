package com.shoppingpermission.permission.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shopping-permission
 * @description: 用于配置白名单资源路径
 * @author: Gauss
 * @date: 2021-06-05 13:49
 **/
@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

}