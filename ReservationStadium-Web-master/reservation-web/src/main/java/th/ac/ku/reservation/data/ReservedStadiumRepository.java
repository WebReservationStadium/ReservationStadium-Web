package th.ac.ku.reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.reservation.model.ReservedStadium;

public interface ReservedStadiumRepository extends JpaRepository<ReservedStadium,Integer> {

}
