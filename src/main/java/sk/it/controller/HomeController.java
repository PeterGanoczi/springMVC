package sk.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class HomeController {

    @RequestMapping
    public String printHello(Model model){
        model.addAttribute("message", "Hello spring");
        return "hello";
    }

}
