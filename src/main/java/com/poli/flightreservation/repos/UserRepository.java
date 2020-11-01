package com.poli.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.poli.flightreservation.entity.User;

@Component
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
}
