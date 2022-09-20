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
/* added these dynamic pages to the main controller so you don't have to go thorugh weired file managmetns when call
ed in main
*/
    @GetMapping("/dynamicPage1")
    public String getDynamicPage1()
    {
        return "dynamicPage1";
    }

    @GetMapping("/dynamicPage2")
    public String getDynamicPage2()
    {
        return "dynamicPage2";
    }
}
