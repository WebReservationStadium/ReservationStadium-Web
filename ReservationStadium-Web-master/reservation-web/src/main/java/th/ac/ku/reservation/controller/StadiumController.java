package th.ac.ku.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StadiumController {
    @RequestMapping("/stadium")
    public String getHomePage(Model model){
        return "stadium"; // stadium template (.html)
    }

}
