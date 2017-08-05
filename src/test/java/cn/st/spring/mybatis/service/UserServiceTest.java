package cn.st.spring.mybatis.service;

import cn.st.spring.mybatis.BaseTest;
import cn.st.spring.mybatis.entity.GovUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by coolearth on 17-8-5.
 */
public class UserServiceTest extends BaseTest{
    @Autowired
    private UserService userService;

    @Test
    public void load(){
        GovUser govUser=userService.load(1);
        Assert.assertNotNull(govUser);
    }

    @Test
    public void add(){
        GovUser govUser=new GovUser();
        userService.add(govUser);
    }
}
