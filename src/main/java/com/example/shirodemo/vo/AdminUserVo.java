package com.example.shirodemo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserVo {
    private Long id;
    private String username;
    private String mobile;
    private String email;
    private String password;
    private Long roleId;
    private String name;
    private String job;
    private String idNum;
    private String roleName;//角色名称
    private String roleDescription;//角色描述
    private String perms;//权限标识
    private String menuName;//权限名称
    private String permsDescription;//权限描述
}
