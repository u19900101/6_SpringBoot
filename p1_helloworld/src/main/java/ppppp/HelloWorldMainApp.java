package ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ppppp.bean.Person;
import ppppp.config.MyConfig;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;
import java.util.List;

/**
 * @author lppppp
 * @create 2021-01-17 17:01
 */
// @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
@SpringBootApplication
public class HelloWorldMainApp {
    public static void main(String[] args) {

        // Spring应用启动起来
        ConfigurableApplicationContext run = SpringApplication.run(HelloWorldMainApp.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        System.out.println(run.getBeanDefinitionCount());
        List<String> stringList = Arrays.asList(beanDefinitionNames);
        // boolean person = stringList.contains("person");
        // System.out.println(person);
        // System.out.println(stringList.contains("person_id"));

        //singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
        //以后每次获取就是直接从容器（map.get()）中拿，
        // Person p1 = run.getBean("person",Person.class);
        // Person p2 = run.getBean("person",Person.class);
        // System.out.println(p1 == p2);// true
        //
        // MyConfig config = run.getBean(MyConfig.class);
        // Person person = config.person();
        // Person person2 = config.person();
        // System.out.println(person == person2);// true

    //    测试条件装配
        boolean person = run.containsBean("person");
        System.out.println("run.containsBean(\"person\") :" + person);
    }
}
