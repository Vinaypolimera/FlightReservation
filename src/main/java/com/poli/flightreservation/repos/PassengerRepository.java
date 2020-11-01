package com.poli.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.poli.flightreservation.entity.Passenger;

@Component
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
