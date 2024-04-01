package com.EVs_23_7.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "powerConsumptionTable")
@NoArgsConstructor
@AllArgsConstructor
public class PowerConsumptionData {
	
	@Id
	@Column(name = "otp", columnDefinition = "INT", nullable = false)
	private Integer otp;
	
	@Column(name = "slot_id",columnDefinition = "INT", nullable = false)
	private Integer slot_id;
	
	@Column(name = "station", columnDefinition = "VARCHAR(30)", nullable = false)
	private String station;
	
	@Column(name = "POWER", columnDefinition = "DOUBLE", nullable = true)
	private Double POWER;
	
	@Column(name = "ENERGY", columnDefinition = "DOUBLE", nullable = true)
	private Double ENERGY;
	
	@Column(name = "CAPACITY", columnDefinition = "DOUBLE", nullable = true)
	private Double CAPACITY;
	
	@Column(name = "TOTAL_COST", columnDefinition = "FLOAT", nullable = true)
	private float TOTAL_COST;
	
	@Column(name = "created_at",nullable = true)
    private LocalDate createdAtDate;

    @Column(name = "created_at_time",nullable = true)
    private LocalTime createdAtTime;

    @PrePersist
    protected void onCreate() {
        createdAtDate = LocalDate.now();
        createdAtTime = LocalTime.now();
    }

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	public Integer getSlot_id() {
		return slot_id;
	}

	public void setSlot_id(Integer slot_id) {
		this.slot_id = slot_id;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public Double getPOWER() {
		return POWER;
	}

	public void setPOWER(Double pOWER) {
		POWER = pOWER;
	}

	public Double getENERGY() {
		return ENERGY;
	}

	public void setENERGY(Double eNERGY) {
		ENERGY = eNERGY;
	}

	public Double getCAPACITY() {
		return CAPACITY;
	}

	public void setCAPACITY(Double cAPACITY) {
		CAPACITY = cAPACITY;
	}

	public float getTOTAL_COST() {
		return TOTAL_COST;
	}

	public void setTOTAL_COST(float tOTAL_COST) {
		TOTAL_COST = tOTAL_COST;
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
		return "PowerConsumptionData [otp=" + otp + ", slot_id=" + slot_id + ", station=" + station + ", POWER=" + POWER
				+ ", ENERGY=" + ENERGY + ", CAPACITY=" + CAPACITY + ", TOTAL_COST=" + TOTAL_COST + ", createdAtDate="
				+ createdAtDate + ", createdAtTime=" + createdAtTime + "]";
	}
	
    
	
}
