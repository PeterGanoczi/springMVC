package sk.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class FormController {



    @RequestMapping("/showForm")
    public String showForm(){
        return "form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "showPerson";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutPerson(HttpServletRequest request, Model model){

            String theName=request.getParameter("personName");

            theName=theName.toUpperCase();

            String result="Hello " + theName;

            model.addAttribute("messageName", result);
            return "showPerson";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("personName") String theName, Model model){


        theName=theName.toUpperCase();

        String result="Hello my friend from SOVY academy " + theName;

        model.addAttribute("messageName", result);

        return "showPerson";
    }

}
