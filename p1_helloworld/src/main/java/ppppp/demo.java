package ppppp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lppppp
 * @create 2021-03-24 10:41
 */
@RestController
public class demo {
    @RequestMapping("/w")
    public String demo(){
        return "demo";
    }
}
