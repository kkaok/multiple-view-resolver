package eblo.example.resolver.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test-jsp")
    public String testJspView() {
        return "js_testJsp";
    }

    @GetMapping("/test-thymeleaf")
    public String testThymeleafView() {

        return "th_page1";
    }
    
    @GetMapping("/test-freemarker")
    public String testFreeMarkerView() {
        return "ft_testFreeMarker";
    }
    
}