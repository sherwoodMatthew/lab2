package lab2.msherwood.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/page1")
    public String getPage1()
    {
        return "page1";
    }

    @GetMapping("/page2")
    public String getPage2()
    {
        return "page2";
    }
}
