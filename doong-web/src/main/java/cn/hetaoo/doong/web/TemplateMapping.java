package cn.hetaoo.doong.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hetaoo
 * @Description 映射静态资源
 * @Date 2017/10/12
 */
@Controller
public class TemplateMapping {

    @RequestMapping("/index")
    public String indexMapping(){
        return "index";
    }
}
