package cn.st.spring.mybatis;

import cn.st.spring.mybatis.entity.GovUser;
import cn.st.spring.mybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by coolearth on 17-8-3.
 */
public class Application {
    private static final Logger LOGGER= LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        LOGGER.info("Application is run");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService= (UserService) context.getBean("userService");
        GovUser govUser=userService.load(1);
        System.out.println(govUser.getChineseName());
    }
}
