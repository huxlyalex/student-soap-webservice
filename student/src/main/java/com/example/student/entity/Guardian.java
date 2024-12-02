package com.example.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Guardian {
	@Id
	private Long guardianId;
	@Column(name="guardian_first_name")
	private String firstName;
	@Column(name="guardian_last_name")
	private String lastName;
	@Column(name="guardian_email")
	private String email;
	public Long getGuardianId() {
		return guardianId;
	}
	public void setGuardianId(Long guardianId) {
		this.guardianId = guardianId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Guardian [guardianId=" + guardianId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	


}
