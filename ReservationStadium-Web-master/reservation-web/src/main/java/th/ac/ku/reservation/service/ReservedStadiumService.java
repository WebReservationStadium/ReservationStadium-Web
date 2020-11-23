package th.ac.ku.reservation.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.reservation.data.StadiumRepository;
import th.ac.ku.reservation.model.ReservedStadium;
import th.ac.ku.reservation.model.User;

import java.util.List;

@Service
public class ReservedStadiumService {

    private StadiumRepository repository;

    public ReservedStadiumService(StadiumRepository repository){
        this.repository=repository;
    }
    public List<ReservedStadium> getStadium(){
        return  repository.findAll();
    }
    public void saveReservedStadium(ReservedStadium reservedStadium){
        repository.save(reservedStadium);
    }
    public void getUserId(int id){
        repository.findById(id).get();
    }

}
