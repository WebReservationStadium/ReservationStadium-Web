package th.ac.ku.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.reservation.model.ReservedStadium;
import th.ac.ku.reservation.model.User;
import th.ac.ku.reservation.service.ReservedStadiumService;

@Controller
@RequestMapping("/stadium")
public class StadiumController {


//    public String getStadiumPage(Model model){
//        return "stadium"; // stadium template (.html)
//    }
    private ReservedStadiumService reservedStadiumService;

    public StadiumController(ReservedStadiumService reservedStadiumService) {
        this.reservedStadiumService = reservedStadiumService;
    }
    @GetMapping
    public String getStadiumPage(Model model){
        model.addAttribute("allStadium",reservedStadiumService.getAllReservation());
        return "stadium";
    }

    @PostMapping
    public String registerStadium(@ModelAttribute ReservedStadium reservedStadium,Model model){
        reservedStadiumService.addReserved(reservedStadium);
        model.addAttribute("allStadium",reservedStadiumService.getAllReservation());
        return "redirect:stadium";
    }

}
