package com.example.shirodemo.service.impl;

import com.example.shirodemo.dao.GenAdminUserMapper;
import com.example.shirodemo.entity.GenAdminUser;
import com.example.shirodemo.entity.GenAdminUserExample;
import com.example.shirodemo.service.UserService;
import com.example.shirodemo.vo.AdminUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private GenAdminUserMapper genAdminUserMapper;


    @Override
    public GenAdminUser findByName(String username) {
        GenAdminUserExample genAdminUserExample = new GenAdminUserExample();
        genAdminUserExample.createCriteria().andUsernameEqualTo(username);
        List<GenAdminUser> genAdminUsers = this.genAdminUserMapper.selectByExample(genAdminUserExample);
        if(genAdminUsers.size() > 0){
            return genAdminUsers.get(0);
        }
        return new GenAdminUser();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AdminUserVo findById(Long id) {
//        AdminUserVo adminUserVo = this.genAdminUserMapper.selectFindById(id);
        AdminUserVo adminUserVo = this.genAdminUserMapper.selectFindById(id);
        if(adminUserVo != null){
            return adminUserVo;
        }
        return new AdminUserVo();
    }
}
