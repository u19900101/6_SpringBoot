package ppppp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ppppp.bean.Person;

/**
 * @author lppppp
 * @create 2021-03-24 11:01
 */
@Configuration
public class myConfig {
    @Bean("person_id")
    public Person person(){
        return new Person("lpppp", 18);
    }
}
