package th.ac.ku.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.reservation.model.User;
import th.ac.ku.reservation.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUserPage(Model model){
        model.addAttribute("allUsers", userService.getUser());
        return "user"; // customer.html
    }


    @PostMapping
    public String registerUser(@ModelAttribute User user, Model model){
        userService.createUser(user);
        model.addAttribute("allUsers", userService.getUser());
        return "redirect:login";
    };

}
