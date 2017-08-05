package cn.st.spring.mybatis;

import cn.st.spring.mybatis.entity.GovUser;
import cn.st.spring.mybatis.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by coolearth on 17-8-3.
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService= (UserService) context.getBean("userService");
        GovUser govUser=userService.load(1);
        System.out.println(govUser.getChineseName());
    }
}
