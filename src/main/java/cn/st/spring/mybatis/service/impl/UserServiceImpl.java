package cn.st.spring.mybatis.service.impl;

import cn.st.spring.mybatis.base.BaseMapper;
import cn.st.spring.mybatis.base.BaseServiceImpl;
import cn.st.spring.mybatis.entity.GovUser;
import cn.st.spring.mybatis.entity.GovUserExample;
import cn.st.spring.mybatis.mapper.GovUserMapper;
import cn.st.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by coolearth on 17-8-3.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<GovUser,GovUserExample> implements UserService {
    @Autowired
    private GovUserMapper govUserMapper;

    @PostConstruct
    public void injectBaseMapper() {
        super.injectBaseMapper(govUserMapper);
    }
}
