
package sunneng.com.main.service;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sunneng.com.main.dao.UserTypeMapper;
import sunneng.com.main.pojo.UserType;

public class TestMaybits {

    @Test
    public void test() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserTypeMapper userTypeMapper = ac.getBean(UserTypeMapper.class);

        UserType userType = new UserType();
        userType.setUserType("管理员");

        userTypeMapper.insertUserType(userType);

    }
}
