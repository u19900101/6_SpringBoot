package ppppp.config;

import ch.qos.logback.classic.db.DBHelper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ppppp.bean.Person;

import javax.naming.Name;

/**
 * @author lppppp
 * @create 2021-03-24 11:01
 */
/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)（保证每个@Bean方法被调用多少次返回的组件都是单实例的）（默认）
 *      Lite(proxyBeanMethods = false)（每个@Bean方法被调用多少次返回的组件都是新创建的）
 */
// 配置类本身也是组件
@Configuration(proxyBeanMethods = false)

//  给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
@Import({Person.class, DBHelper.class})

public class MyConfig {
    @Bean("kk")
    public Person person1(){
        return new Person("kk", 18);
    }

    @ConditionalOnBean(name = "kk") //有先后顺序
    @Bean("person")
    public Person person(){
        return new Person("lpppp", 18);
    }


}
