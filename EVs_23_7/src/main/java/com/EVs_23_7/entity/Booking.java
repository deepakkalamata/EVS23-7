package com.EVs_23_7.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
@Data
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "Bookings_table1")
public class Booking {
	
	@Id
	@GeneratedValue
	@Column(name = "id", columnDefinition = "VARCHAR(30)", nullable = false)
	private Integer id;
	
	@Column(name = "country", columnDefinition = "VARCHAR(30)", nullable = false)
	private String country;
	
	@Column(name = "state", columnDefinition = "VARCHAR(30)", nullable = false)
	private String state;
	
	@Column(name = "city", columnDefinition = "VARCHAR(30)", nullable = false)
	private String city;
	
	@Column(name = "station", columnDefinition = "VARCHAR(30)", nullable = false)
	private String station;
	
//	@ManyToOne(targetEntity = Slot.class)
//	@JoinColumn(name = "slot_id",columnDefinition = "VARCHAR(30)", nullable = false)
	@Column(name = "slot_id",columnDefinition = "VARCHAR(30)", nullable = false)
	private Integer slot_id;
	
	@Column(name = "email", columnDefinition = "VARCHAR(30)", nullable = false)
	private String email;
	
	@Column(name = "phoneNumber", columnDefinition = "VARCHAR(30)", nullable = false)
	private String phoneNumber;
	
	@Column(name = "vehicleNumber", columnDefinition = "VARCHAR(30)", nullable = false)
	private String vehicleNumber;
	
	@Column(name = "userName", columnDefinition = "VARCHAR(30)", nullable = false)
	private String userName;
	
	@Column(name = "otp", columnDefinition = "VARCHAR(30)", nullable = false)
	private Integer otp;
	
	@Column(name = "created_at")
    private LocalDate createdAtDate;

    @Column(name = "created_at_time")
    private LocalTime createdAtTime;

    @PrePersist
    protected void onCreate() {
        createdAtDate = LocalDate.now();
        createdAtTime = LocalTime.now();
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
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
		return "Booking [id=" + id + ", country=" + country + ", state=" + state + ", city=" + city + ", station="
				+ station + ", slot_id=" + slot_id + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", vehicleNumber=" + vehicleNumber + ", userName=" + userName + ", otp=" + otp + ", createdAtDate="
				+ createdAtDate + ", createdAtTime=" + createdAtTime + "]";
	}
	
	
}
