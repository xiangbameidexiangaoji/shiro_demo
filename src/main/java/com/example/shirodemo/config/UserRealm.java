package com.example.shirodemo.config;

import com.example.shirodemo.entity.GenAdminUser;
import com.example.shirodemo.service.UserService;
import com.example.shirodemo.vo.AdminUserVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        log.info("=========执行授权逻辑=========");
        //给资源进行授权
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //添加资源的授权字符串
        Subject subject = SecurityUtils.getSubject();
        AdminUserVo principal = (AdminUserVo) subject.getPrincipal();
        //查找用户信息
        AdminUserVo byId = this.userService.findById(principal.getId());
        if(byId != null){
            //添加授权字符串
            simpleAuthorizationInfo.addStringPermission(byId.getPerms());
            return simpleAuthorizationInfo;
        }
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        log.info("=========执行认证逻辑=========");
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;

        GenAdminUser user = this.userService.findByName(usernamePasswordToken.getUsername());
        if (user == null) {
            throw new UnknownAccountException();//账号不存在
        }
        if (user.getEnable() == 0) {
            throw new LockedAccountException(); //账号未被启用
        }
        // 验证
         usernamePasswordToken.getPassword();
        return new SimpleAuthenticationInfo(user, user.getPassword(), user.getName());
    }

}
