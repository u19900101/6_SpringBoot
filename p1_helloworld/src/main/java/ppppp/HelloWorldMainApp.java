package ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
        boolean person = stringList.contains("person");
        System.out.println(person);
        System.out.println(stringList.contains("person_id"));

    }
}
