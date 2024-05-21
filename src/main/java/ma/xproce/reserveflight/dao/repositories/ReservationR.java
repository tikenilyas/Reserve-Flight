package ma.xproce.reserveflight.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.reserveflight.dao.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface ReservationR extends JpaRepository<Reservation,Integer> {
}
