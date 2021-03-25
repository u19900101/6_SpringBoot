package ppppp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lppppp
 * @create 2021-03-25 16:06
 */

// thymeleaf 演示
@Controller
public class ViewController {

    @RequestMapping("/view")
    public String view(Model model){
        model.addAttribute("msg", "thymleaf - msg");
        model.addAttribute("link", "link - msg");
        return "success";
    }

}
