package cn.st.spring.mybatis.service;

import cn.st.spring.mybatis.entity.GovUser;

/**
 * Created by coolearth on 17-8-3.
 */
public interface UserService {
    GovUser findById(int id);
}
