package com.book.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

import com.book.dto.UserRegistrationDTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "userregistration")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationData {
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column
	private String kyc;

	@Column(name = "emailId")
	private String emailId;

	@Column
	private String password;

	@Column
	private LocalDate dob;

	@Column(name = "registerDate")
	private LocalDate registerDate;

	@Column(name = "verify")
	private Boolean verify;

	@Column(name = "updatedDate")
	private LocalDate updatedDate;

//	@Column
//	private int otp;

//	@Column(name = "purchaseDate")
//	private LocalDate purchaseDate;
//
//	@Column(name = "expiryDate")
//	private LocalDate expiryDate;

	public void createUser(UserRegistrationDTO userDTO) {
		this.firstName = userDTO.getFirstName();
		this.lastName = userDTO.getLastName();
		this.kyc = userDTO.getKyc();
		this.emailId = userDTO.getEmailId();
		this.password = userDTO.getPassword();
		this.dob = userDTO.getDob();
		this.registerDate = userDTO.getRegisterDate();
		this.verify = userDTO.getVerify();
		this.updatedDate = userDTO.getUpdatedDate();
		// this.otp = userDTO.getOtp();
//		this.purchaseDate = userDTO.getPurchaseDate();
//		this.expiryDate = userDTO.getExpiryDate();

	}

	public void updateUser(UserRegistrationDTO userDTO) {
		this.firstName = userDTO.getFirstName();
		this.lastName = userDTO.getLastName();
		this.kyc = userDTO.getKyc();
		this.emailId = userDTO.getEmailId();
		this.password = userDTO.getPassword();
		this.dob = userDTO.getDob();
		this.registerDate = userDTO.getRegisterDate();
		this.verify = userDTO.getVerify();
		this.updatedDate = userDTO.getUpdatedDate();
		// this.otp = userDTO.getOtp();
//		this.purchaseDate = userDTO.getPurchaseDate();
//		this.expiryDate = userDTO.getExpiryDate();

	}
}