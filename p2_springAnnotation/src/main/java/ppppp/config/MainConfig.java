package ppppp.config;

import org.springframework.context.annotation.*;
import ppppp.bean.Color;
import ppppp.bean.Person;
import ppppp.condition.LinxCondition;
import ppppp.condition.WindowCondition;

/**
 * @author lppppp
 * @create 2021-01-17 20:45
 */

//默认是单实例的
/**
 *  ConfigurableBeanFactory SCOPE_PROTOTYPE
 *  ConfigurableBeanFactory SCOPE_SINGLETON
 *  org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
 *  org.springframework.web.context.WebApplicationContext#SCOPE_SESSION	 sesssion
 *
 * @Scope:调整作用域
 * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
 * 					每次获取的时候才会调用方法创建对象；
 * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
 * 			以后每次获取就是直接从容器（map.get()）中拿，
 * request：同一次请求创建一个实例
 * session：同一个session创建一个实例
 *
 * 懒加载：
 * 		单实例bean：默认在容器启动的时候创建对象；
 * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
 *
 */
@Configuration
@ComponentScan(value = {"ppppp"})
@Import(Color.class) //直接注入类
public class MainConfig {
    // 使用@Bean替代 配置文件的初始化值注入
    // id 默认是方法名
    @Bean("personName")//此处也可指定 id 的值
    @Scope("singleton")
    public Person person(){
        return new Person("张三",18);
    }

    @Conditional(LinxCondition.class)
    @Bean("Linux")//此处也可指定 id 的值
    public Person person1(){
        return new Person("Linux",6);
    }

    @Conditional(WindowCondition.class)
    @Bean("Windows")//此处也可指定 id 的值
    public Person person2(){
        return new Person("Windows",3);
    }
}
