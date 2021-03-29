package ppppp.p_5_profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lppppp
 * @create 2021-03-29 8:29
 */
@RestController
public class HelloController {

    @Value("${person.name:李四}")
    String name;

    @RequestMapping("/m")
    public String hello(){
        return name;
    }
}
