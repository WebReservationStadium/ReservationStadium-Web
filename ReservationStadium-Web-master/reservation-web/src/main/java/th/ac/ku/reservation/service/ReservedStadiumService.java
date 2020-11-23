package th.ac.ku.reservation.service;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import th.ac.ku.reservation.data.ReservedStadiumRepository;
import th.ac.ku.reservation.model.ReservedStadium;
import th.ac.ku.reservation.model.User;

import java.util.List;

@Service
public class ReservedStadiumService {
    private ReservedStadiumRepository repository;

//    public ReservedStadiumService (ReservedStadiumRepository repository){
//        this.repository = repository;
//    }
//
//    public void saveState(ReservedStadium reservedStadium){
//            repository.save(reservedStadium);
//    }
    private RestTemplate restTemplate;

    public  ReservedStadiumService(RestTemplate restTemplate){
        this.repository = restTemplate;
    }

}
