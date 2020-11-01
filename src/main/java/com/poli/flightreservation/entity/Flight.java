package com.poli.flightreservation.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FLIGHT")
public class Flight {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "FLIGHT_NUMBER")
	private String flightNumber;
	
	@Column(name = "OPERATING_AIRLINES")
	private String operatingAirlines;
	
	@Column(name = "DEPARTURE_CITY")
	private String departureCity;
	
	@Column(name = "ARRIVAL_CITY")
	private String arrivalCity;
	
	@Column(name = "DATE_OF_DEPARTURE")
	private Date dateOfDeparture;
	
	@Column(name = "ESTIMATED_DEPARTURE_TIME")
	private Time time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDate() {
		return dateOfDeparture;
	}

	public void setDate(Date date) {
		this.dateOfDeparture = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines
				+ ", departureCity=" + departureCity + ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture + ", time="
				+ time + "]";
	}
	
	
	
}
