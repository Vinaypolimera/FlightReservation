package com.poli.flightreservation.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.TypeAlias;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	
	@Column(name = "CHECKED_IN")
	private boolean checkedIn;
	
	@Column(name = "NUMBER_OF_BAGS")
	private int noOfBags;
	
//	@Column(name = "PASSENGER_ID")
	@OneToOne
	private Passenger passenger;
	
//	@Column(name = "FLIGHT_ID")
	@OneToOne
	private Flight flight;
	
	@Column(name = "CREATED")
	private Timestamp timestamp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNoOfBags() {
		return noOfBags;
	}

	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", checkedIn=" + checkedIn + ", noOfBags=" + noOfBags + ", passenger="
				+ passenger + ", flight=" + flight + ", timestamp=" + timestamp + "]";
	}

	
}
