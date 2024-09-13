package com.spring.React_Spring_Fom.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class FormData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String contact;
	private String gender;
	private String subjcet;
	private String resume; // Store file path or binary data
	private String url;
	private String choice;
	private String about;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSubjcet() {
		return subjcet;
	}
	public void setSubjcet(String subjcet) {
		this.subjcet = subjcet;
	}
	public String getResume() {
		return resume;
	}
	public FormData(Long id, String firstName, String lastName, String email, String contact, String gender,
			String subjcet, String resume, String url, String choice, String about) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.subjcet = subjcet;
		this.resume = resume;
		this.url = url;
		this.choice = choice;
		this.about = about;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	
	

}
