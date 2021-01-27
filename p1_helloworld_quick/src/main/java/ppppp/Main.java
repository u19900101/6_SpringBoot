package ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication

// 导入 自己编写的bean文件 将里面的ioc注入  但一般不再使用这种方式，改为使用配置类
// @ImportResource(locations = {"classpath:bean.xml"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
