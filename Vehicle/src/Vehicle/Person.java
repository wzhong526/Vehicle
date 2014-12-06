package Vehicle;

import java.util.UUID;

public class Person {
	private String FirstName, LastName;
	private UUID PersonID;
	public Person(){
	}
	public Person(String FirstName, String LastName, UUID PersonID){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.PersonID = PersonID;
	}
	public String getFirstName(){
		return FirstName;
	}
	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}
	public String getLastName(){
		return LastName;
	}
	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	public UUID getPersonID(){
		return PersonID;
	}
	public void setPersonID(UUID PersonID){
		this.PersonID = PersonID;
	}
}