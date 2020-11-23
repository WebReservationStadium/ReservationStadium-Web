package th.ac.ku.reservation.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import th.ac.ku.reservation.data.UserRepository;
import th.ac.ku.reservation.model.User;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

//    @PostConstruct
//    public void postConstruct(){
//        this.userList = new ArrayList<>();
//
//    }

    public  void createUser(User user){
        //hashpin for user
        String hashPin = hash(user.getPassword());
        user.setPassword(hashPin);
        repository.save(user);
    }

    public List<User> getUser(){
        return  repository.findAll();
    }

    public User findUser(Integer id){
       try{
           return repository.findById(id).get();
       }catch (NoSuchElementException e){
           return null;
       }
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


