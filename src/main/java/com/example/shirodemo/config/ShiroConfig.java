package com.example.shirodemo.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class ShiroConfig {
    //创建 Realm
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }
    /**
     * 创建 DefaultWebSecurityManager
     */
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(UserRealm userRealm){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        //关联Realm
        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;
    }

    /**
     * ShiroFilterFactoryBean,过滤工厂
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager getDefaultWebSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(getDefaultWebSecurityManager);//设置 SecurityManager(安全管理器)
        /**
         * 常用的过滤器类型
         *  anon:无需认证(登录)，可以访问。
         *  authc:必须认证才可以访问
         *  user:如果使用 RemeberMe 的功能可以直接访问
         *  perms:该资源必须得到资源权限才可以访问
         *  role:该资源必须得到角色权限才可以访问。
         */
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("/user/add", "perms[user::add,user::query]");//添加的话需要
        concurrentHashMap.put("/user/delete", "perms[user:add,user::query,user::delete]");
        concurrentHashMap.put("/user/login", "anon");
        concurrentHashMap.put("/swagger-ui.html","anon");
        concurrentHashMap.put("/swagger-resources/**","anon");
        concurrentHashMap.put("/v2/api-docs","anon");
        concurrentHashMap.put("/webjars/springfox-swagger-ui/**","anon");
//        concurrentHashMap.put("/**", "authc");
//        concurrentHashMap.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(concurrentHashMap);
        //登录页面
        shiroFilterFactoryBean.setLoginUrl("/user/toLogin");
        return shiroFilterFactoryBean;
    }
}
