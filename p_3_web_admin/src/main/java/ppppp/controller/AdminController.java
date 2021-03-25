package ppppp.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ppppp.bean.User;

import javax.servlet.http.HttpSession;

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
    public String main(User user, Model model,HttpSession session){
        /*if(StringUtils.hasLength(user.getUserName()) && "kk".equals(user.getPassword())){
            //把登陆成功的用户保存起来
            session.setAttribute("loginUser",user);
            //登录成功重定向到main.html;  重定向防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            //回到登录页面
            return "login";
        }*/
        session.setAttribute("loginUser",user);
        //登录成功重定向到main.html;  重定向防止表单重复提交
        return "redirect:/main.html";

    }

    // 防止 login post表单的重复提交
    @GetMapping("/main.html")
    public String toMain(Model model,HttpSession session){
        Object loginUser = session.getAttribute("loginUser");
       if(loginUser != null){
           return "main";
       }else {
           //回到登录页面
           model.addAttribute("msg","请重新登录");
           return "login";
       }
    }
}
