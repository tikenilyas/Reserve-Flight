package ma.xproce.reserveflight.service;
import ma.xproce.reserveflight.dao.repositories.ReservationR;
import lombok.AllArgsConstructor;
import ma.xproce.reserveflight.dao.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationR reservationR1;

    @Override
    public Reservation savereservation(Reservation reservation) {

        return reservationR1.save(reservation);
    }

    @Override
    public Reservation updatereservation(Reservation reservation) {

        return reservationR1.save(reservation);
    }

    @Override
    public void deletereservationById(Integer id) {
        reservationR1.deleteById(id);
    }

    @Override
    public void deleteAllreservations() {
        reservationR1.deleteAll();
    }

    @Override
    public Reservation getreservationById(Integer id) {
        return  reservationR1.findById(id).get();
    }

    @Override
    public List<Reservation> getAllreservations() {

        return reservationR1.findAll();
    }
}
