package ma.xproce.reserveflight.service;

import ma.xproce.reserveflight.dao.entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation savereservation(Reservation reservation);
    Reservation updatereservation(Reservation reservation);
    void deletereservationById(Integer id);
    void deleteAllreservations();
    Reservation getreservationById(Integer id);
    List<Reservation> getAllreservations();
}
