package com.bank.nayana.pl.model;

import java.util.Comparator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PersonalLoan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loginId")
	private int loginId;
	private String fullName;
	private int DOB;
	private long contactNo;
	private String email;
	private String KYC;
	private double income;
	private String occupation;

	@Override
	public String toString() {
		return "PersonalLoan [loginId=" + loginId + ", fullName=" + fullName + ", DOB=" + DOB + ", contactNo="
				+ contactNo + ", email=" + email + ", KYC=" + KYC + ", income=" + income + ", occupation=" + occupation
				+ "]";
	}

	public PersonalLoan() {
		super();
	}

	public PersonalLoan(int loginId, String fullName, int dOB, long contactNo, String email, String kYC, double income,
			String occupation) {
		super();
		this.loginId = loginId;
		this.fullName = fullName;
		DOB = dOB;
		this.contactNo = contactNo;
		this.email = email;
		KYC = kYC;
		this.income = income;
		this.occupation = occupation;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKYC() {
		return KYC;
	}

	public void setKYC(String kYC) {
		KYC = kYC;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
