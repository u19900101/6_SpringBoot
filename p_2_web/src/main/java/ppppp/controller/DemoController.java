package ppppp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lppppp
 * @create 2021-03-24 22:02
 */
// @Controller
@RestController
public class DemoController {
   /* @RequestMapping("/bg-02.jpg")
    public String demo(){
        return "memeda";
    }*/

    //  rest 风格
  //   @GetMapping("/user")
  //   // @RequestMapping(value = "/user",method = RequestMethod.GET)
  //   public String get(){
  //       return "get method";
  //   }
  //
  //   @PostMapping("/user")
  //   // @RequestMapping(value = "/user",method = RequestMethod.POST)
  //   public String post(){
  //       return "post method";
  //   }
  //
  //   @DeleteMapping("/user")
  //   // @RequestMapping(value = "/user",method = RequestMethod.DELETE)
  //   public String del(){
  //       return "del method";
  //   }
  //
  //   @PutMapping("/user")
  //   // @RequestMapping(value = "/user",method = RequestMethod.PUT)
  //   public String put(){
  //       return "put method";
  //   }


    @RequestMapping("/req")
    public String req(HttpServletRequest req){
        req.setAttribute("msg", "msg");
        return "forward:success";
    }


    @RequestMapping("/success")
    public void success(HttpServletRequest req,@RequestAttribute("msg") String msg){

        System.out.println(req.getAttribute("msg"));
        System.out.println(msg);
    }
// 矩阵变量
    //1、语法： 请求路径：/cars/sell;low=34;brand=byd,audi,yd
    //2、SpringBoot默认是禁用了矩阵变量的功能
    //      手动开启：原理。对于路径的处理。UrlPathHelper进行解析。
    //              removeSemicolonContent（移除分号内容）支持矩阵变量的
    //3、矩阵变量必须有url路径变量才能被解析
    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List<String> brand,
                        @PathVariable("path") String path){
        Map<String,Object> map = new HashMap<>();

        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }
}
