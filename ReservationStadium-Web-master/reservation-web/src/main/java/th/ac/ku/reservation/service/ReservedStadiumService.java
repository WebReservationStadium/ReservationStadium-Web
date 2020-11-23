package th.ac.ku.reservation.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import th.ac.ku.reservation.data.StadiumRepository;
import th.ac.ku.reservation.model.ReservedStadium;
import th.ac.ku.reservation.model.User;

import java.util.Arrays;
import java.util.List;

@Service
public class ReservedStadiumService {

private RestTemplate restTemplate;

    public ReservedStadiumService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public List<ReservedStadium> getAllReservation(){
        String url = "http://localhost:8091/api/reservedstadium";
        ResponseEntity<ReservedStadium[]> response = restTemplate.getForEntity(url, ReservedStadium[].class);
        ReservedStadium[] reserved = response.getBody();
        return Arrays.asList(reserved);
        //รีเทิร์นลิสของการจองทั้งหมดมา
    }
    public void addReserved(ReservedStadium reservedStadium){
        String url = "http://localhost:8091/api/reservedstadium";
        restTemplate.postForObject(url,reservedStadium,ReservedStadium.class);
        //เพิ่มการจองใหม่ เอาไปเชื่อมกับหน้า html ด้วย
    }
    public ReservedStadium getOneReservedStadium(int id){
        String url = "http://localhost:8091/api/reservedstadium/"+ id;
        ResponseEntity<ReservedStadium> response = restTemplate.getForEntity(url,ReservedStadium.class);
        return response.getBody();
        //เอาการจองออกมาอันเดียว
    }
    public void deleteReserved(ReservedStadium reservedStadium){
        String url = "http://localhost:8091/api/reservedstadium/"+reservedStadium.getId();
        restTemplate.delete(url,reservedStadium);
        //ยกเลิกการจอง
    }
}
