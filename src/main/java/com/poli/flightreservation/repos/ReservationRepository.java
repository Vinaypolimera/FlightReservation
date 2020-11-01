package com.poli.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.poli.flightreservation.entity.Reservation;

@Component
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
