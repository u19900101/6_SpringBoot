package ppppp.p_3_web_admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author lppppp
 * @create 2021-03-25 16:24
 */
@Controller
public class AdminController {

    @GetMapping(value = {"/","/login"})
    public String index(){
        return "login";
    }

    @PostMapping("/login")
    public String main(){
        return "main";
    }
}
