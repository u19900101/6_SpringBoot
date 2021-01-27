package ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lppppp
 * @create 2021-01-17 17:01
 */
// @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
@SpringBootApplication
public class HelloWorldMainApp {
    public static void main(String[] args) {

        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApp.class, args);
    }
}
