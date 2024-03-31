package com.EVs_23_7.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
//@Getter
//@Setter
@Data
@Table(name= "new_table")
@NoArgsConstructor
@AllArgsConstructor
public class SlotData {
	
	@Id
	@Column(name = "slot_id")
	//@GeneratedValue//(strategy = GenerationType.IDENTITY)
	private Integer slot_id;
	
	@Column(name="status")
	private Integer status;

	@Column(name="booking_status")
	private String booking_status;
	
	@Column(name="vehicle_number")
	private String vehicle_number;
	
	@Column(name = "created_at")
    private LocalDate createdAtDate;

    @Column(name = "created_at_time")
    private LocalTime createdAtTime;

    @PrePersist
    protected void onCreate() {
        // Set both createdAtDate and createdAtTime from LocalDateTime.now()
        createdAtDate = LocalDate.now();
        createdAtTime = LocalTime.now();
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

	

	
	
	
}
