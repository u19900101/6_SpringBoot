package ppppp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lppppp
 * @create 2021-01-17 17:02
 */
/* 所有自动扫面的类要全部放在 主配置类的包下 不然扫不到 */
// @Controller
@RestController  // = @Controller + @ResponseBody
public class HelloController {

    // @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "<h1>Hello 静静!</h1>";
    }
}

