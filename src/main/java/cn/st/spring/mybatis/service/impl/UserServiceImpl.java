package cn.st.spring.mybatis.service.impl;

import cn.st.spring.mybatis.entity.GovUser;
import cn.st.spring.mybatis.mapper.GovUserMapper;
import cn.st.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by coolearth on 17-8-3.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private GovUserMapper govUserMapper;

    @Override
    public GovUser findById(int id) {
        return govUserMapper.selectByPrimaryKey(id);
    }
}
