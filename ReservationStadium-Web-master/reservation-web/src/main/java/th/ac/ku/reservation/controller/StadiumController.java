package th.ac.ku.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.reservation.model.ReservedStadium;
import th.ac.ku.reservation.model.User;
import th.ac.ku.reservation.service.ReservedStadiumService;

@Controller
public class StadiumController {

    private ReservedStadiumService reservedStadiumService;
    @RequestMapping("/stadium")
    public String getHomePage(Model model){
        return "stadium"; // stadium template (.html)
    }


    @PostMapping
    public String registerStadium(@ModelAttribute ReservedStadium reservedStadium, Model model){
        reservedStadiumService.saveReservedStadium(reservedStadium);
        //model.addAttribute("all", reservedStadiumService.getUserId());
        return "redirect:stadium";
    };
}
