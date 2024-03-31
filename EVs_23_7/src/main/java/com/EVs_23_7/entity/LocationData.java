package com.EVs_23_7.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Getter
//@Setter
//@Data
@Table(name= "StationLocationTable")
@NoArgsConstructor
@AllArgsConstructor
public class LocationData {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id", columnDefinition = "VARCHAR(30)", nullable = false)
	private Integer location_id;
	
	@Column(name = "country", columnDefinition = "VARCHAR(30)", nullable = false)
	private String country;
	
	@Column(name = "state", columnDefinition = "VARCHAR(30)", nullable = false)
	private String state;
	
	@Column(name = "city", columnDefinition = "VARCHAR(30)", nullable = false)
	private String city;
	
	@Column(name = "station", columnDefinition = "VARCHAR(30)", nullable = false)
	private String station;
	
	@Column(name = "slot_id", columnDefinition = "VARCHAR(30)", nullable = false)
	private Integer slot_id;

	@Column(name = "status", columnDefinition = "VARCHAR(30)", nullable = false)
	private Integer status;
	
	@Column(name = "booking_status", columnDefinition = "VARCHAR(30)", nullable = false)
	private String booking_status;
	
	@Column(name = "vehicle_number", columnDefinition = "VARCHAR(30)", nullable = true)
	private String vehicle_number;
	
	@Column(name = "created_at")
    private LocalDate createdAtDate;

    @Column(name = "created_at_time")
    private LocalTime createdAtTime;

    @PrePersist
    protected void onCreate() {
        createdAtDate = LocalDate.now();
        createdAtTime = LocalTime.now();
    }
	
    public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public Integer getSlot_id() {
		return slot_id;
	}

	public void setSlot_id(Integer slot_id) {
		this.slot_id = slot_id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBooking_status() {
		return booking_status;
	}

	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public LocalDate getCreatedAtDate() {
		return createdAtDate;
	}

	public void setCreatedAtDate(LocalDate createdAtDate) {
		this.createdAtDate = createdAtDate;
	}

	public LocalTime getCreatedAtTime() {
		return createdAtTime;
	}

	public void setCreatedAtTime(LocalTime createdAtTime) {
		this.createdAtTime = createdAtTime;
	}
	
	@Override
	public String toString() {
		return "LocationData [location_id=" + location_id + ", country=" + country + ", state=" + state + ", city="
				+ city + ", station=" + station + ", slot_id=" + slot_id + ", status=" + status + ", booking_status="
				+ booking_status + ", vehicle_number=" + vehicle_number + ", createdAtDate=" + createdAtDate
				+ ", createdAtTime=" + createdAtTime + "]";
	}
	
}
