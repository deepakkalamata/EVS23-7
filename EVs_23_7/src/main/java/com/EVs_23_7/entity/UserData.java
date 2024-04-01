package com.EVs_23_7.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usersTable")
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
	
	@Id
	@Column(name = "email", columnDefinition = "VARCHAR(30)",nullable = false)
	private String email;
	
	@Column(name = "vehicleNumber", columnDefinition = "VARCHAR(30)",nullable = false)
	private String vehicleNumber;

	@Column(name = "phoneNumber", columnDefinition = "VARCHAR(30)",nullable = false)
	private String phoneNumber;
	
	@Column(name = "userName",columnDefinition = "VARCHAR(30)",nullable = false)
	private String userName;
	
	@Column(name = "password",columnDefinition = "VARCHAR(30)",nullable = false)
	private String password;
	
	@Column(name = "vehicleType", columnDefinition = "VARCHAR(30)",nullable = false)
	private String vehicleType;
	
	@Column(name = "slot_id",columnDefinition = "VARCHAR(30)", nullable = true)
	private Integer slot_id;
	
	@Column(name = "otp", columnDefinition = "VARCHAR(30)", nullable = true)
	private Integer otp;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getSlot_id() {
		return slot_id;
	}

	public void setSlot_id(Integer slot_id) {
		this.slot_id = slot_id;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "UserData [email=" + email + ", vehicleNumber=" + vehicleNumber + ", phoneNumber=" + phoneNumber
				+ ", userName=" + userName + ", password=" + password + ", vehicleType=" + vehicleType + ", slot_id="
				+ slot_id + ", otp=" + otp + "]";
	}
	
	
}
