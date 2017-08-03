package cn.st.spring.mybatis.service.impl;

import cn.st.spring.mybatis.entity.SysUser;
import cn.st.spring.mybatis.mapper.SysUserMapper;
import cn.st.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by coolearth on 17-8-3.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findById(int id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
