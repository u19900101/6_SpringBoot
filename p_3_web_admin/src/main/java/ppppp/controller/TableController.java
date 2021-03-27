package ppppp.controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ppppp.bean.Label;
import ppppp.bean.User;
import ppppp.mapper.LabelMapperPlug;
import ppppp.service.LabelService;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {
    /**
     *
     * 不带请求参数或者参数类型不对  400；Bad Request  一般都是浏览器的参数没有传递正确
     * @return
     */
    @GetMapping("/basic_table")
    public String basic_table(){

        // int i = 10/0;
        return "table/basic_table";
    }

    @Autowired
    LabelMapperPlug labelMapperPlug;

    @Autowired
    LabelService labelService;

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value="pn",defaultValue = "1") Integer pn,Model model){
        //表格内容的遍历
        //  List<Label> labels = labelService.list();

        //构造分页参数
        Page<Label> page = new Page<>(pn, 5);
        //调用page进行分页
        Page<Label> labelPage = labelService.page(page, null);


//        userPage.getRecords()
//        userPage.getCurrent()
//        userPage.getPages()


        model.addAttribute("labels",labelPage);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
