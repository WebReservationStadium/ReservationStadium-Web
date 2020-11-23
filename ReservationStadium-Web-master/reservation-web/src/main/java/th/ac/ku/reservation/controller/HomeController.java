package th.ac.ku.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("greeting","Pancake Stadium");
        return "home"; // Home template (.html)
    }
}
