package ppppp.p_2_web_jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lppppp
 * @create 2021-03-29 16:13
 */

@Controller
public class HelloController {
    @GetMapping("/h")
    public String hello(){
        return "success";
    }
}
