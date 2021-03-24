package ppppp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ppppp.bean.Person;

/**
 * @author lppppp
 * @create 2021-01-17 17:02
 */
/* 所有自动扫面的类要全部放在 主配置类的包下 不然扫不到 */
// @Controller
@RestController  // = @Controller + @ResponseBody

@Slf4j
public class HelloController {

    // @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "<h1>Hello 静静!</h1>";
    }


    // 配置文件 绑定 bean
    @Autowired
    Person person;
    @RequestMapping("/p")
    public Person p(){
        log.info("请求进来鸟...");
        return person;
    }
}

