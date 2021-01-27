package ppppp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import ppppp.bean.Person;

@SpringBootTest
class p01_Test {
    @Autowired
    Person person;
    @org.junit.jupiter.api.Test
    void contextLoads() {
        System.out.println(person);
    }

    @Autowired
    ApplicationContext ioc;
    // 测试容器中有哪些 组件
    @Test
    public void T_contain_ioc(){

        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);// true
    }

}
