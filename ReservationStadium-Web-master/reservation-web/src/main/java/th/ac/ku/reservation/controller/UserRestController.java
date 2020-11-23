package th.ac.ku.reservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.ku.reservation.model.User;
import th.ac.ku.reservation.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

        private UserService userService;

        public UserRestController (UserService userService){
            this.userService = userService;
        }

        @GetMapping
        public List<User> getAll(){
            return userService.getUser();
        }

        @GetMapping("/{id}")
        public User getOne(@PathVariable String id){
            return userService.findUser(id);
        }
}


