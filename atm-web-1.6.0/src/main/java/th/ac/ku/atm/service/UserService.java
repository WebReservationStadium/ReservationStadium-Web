package th.ac.ku.atm.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    @PostConstruct
    public void postConstruct(){
        this.userList = new ArrayList<>();

    }

    public  void createUser(User user){
        //hashpin for user
        String hashPin = hash(user.getPassword());
        user.setPassword(hashPin);
        userList.add(user);
    }

    public List<User> getUserList(){
        return  new ArrayList<>(this.userList);
    }

    public User findUser(String id){
        for (User user : userList){
            if(user.getId().equals(id))
                return user;
        }
        return null;
    }

    public User checkPin(User inputUser){
        User storedUser = findUser(inputUser.getId());

        if (storedUser !=null){
            String hashPin = storedUser.getPassword();

            if(BCrypt.checkpw(inputUser.getPassword(),hashPin)){
                return storedUser;
            }

        }
        return  null;
    }

    private String hash(String pin){
        String salt = BCrypt.gensalt(12);
        return BCrypt.hashpw(pin,salt);
    }
}


