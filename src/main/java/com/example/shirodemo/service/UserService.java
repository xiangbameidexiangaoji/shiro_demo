package com.example.shirodemo.service;

import com.example.shirodemo.entity.GenAdminUser;
import com.example.shirodemo.vo.AdminUserVo;

public interface UserService {
    GenAdminUser findByName(String username);

    AdminUserVo findById(Long id);
}
