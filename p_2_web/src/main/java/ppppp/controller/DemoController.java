package ppppp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lppppp
 * @create 2021-03-24 22:02
 */
@RestController
public class DemoController {
   /* @RequestMapping("/bg-02.jpg")
    public String demo(){
        return "memeda";
    }*/

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String get(){
        return "get method";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String post(){
        return "post method";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String del(){
        return "del method";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String put(){
        return "put method";
    }
}
