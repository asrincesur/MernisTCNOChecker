package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Abstract.IEntity;

public class Player implements IEntity
{
	
	int id;
	String FirstName,LastName,Email;
	LocalDate BirthDate;
	String NationalityID;
	
				
	
	public Player(int id2, String firstName2, String lastName2, String email2, LocalDate of, String nationalityID2) {
		setId(id2);
		setFirstName(firstName2);
		setLastName(lastName2);
		setEmail(email2);
		setBirthDate(of);
		setNationalityID(nationalityID2);	
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public LocalDate getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}
	
	
	public String getNationalityID() {
		return NationalityID;
	}



	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}

	

}
