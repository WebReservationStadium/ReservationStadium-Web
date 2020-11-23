package th.ac.ku.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.reservation.model.ReservedStadium;
import th.ac.ku.reservation.model.User;
import th.ac.ku.reservation.service.ReservedStadiumService;

@Controller
public class StadiumController {

    @RequestMapping("/stadium")
    public String getStadiumPage(Model model){
        return "stadium"; // stadium template (.html)
    }
    private ReservedStadiumService reservedStadiumService;

    public StadiumController(ReservedStadiumService reservedStadiumService) {
        this.reservedStadiumService = reservedStadiumService;
    }
    @GetMapping
    public String getBankAccountPage(Model model){
        model.addAttribute("stadium",reservedStadiumService.getAllReservation());
        return "stadium";
    }
}
