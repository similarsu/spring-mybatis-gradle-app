package cn.st.spring.mybatis.service;

import cn.st.spring.mybatis.entity.SysUser;

/**
 * Created by coolearth on 17-8-3.
 */
public interface UserService {
    SysUser findById(int id);
}
