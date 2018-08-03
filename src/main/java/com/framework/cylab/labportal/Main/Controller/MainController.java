package com.framework.cylab.labportal.Main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

}
