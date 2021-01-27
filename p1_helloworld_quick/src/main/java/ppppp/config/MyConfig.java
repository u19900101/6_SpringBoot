package ppppp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ppppp.service.HelloService;

/**
 * @author lppppp
 * @create 2021-01-27 16:39
 */
@Configuration
public class MyConfig {

    @Bean
    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    public HelloService helloService(){
        System.out.println("使用@Bean将方法加入ioc中");
        return new HelloService();
    }
}
