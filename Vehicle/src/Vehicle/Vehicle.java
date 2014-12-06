package Vehicle;

import java.util.UUID;

public abstract class Vehicle {
private String Name, Color;
private int Weight;
private Person Owner;
public Vehicle (){
	
}
public Vehicle(String Name, String Color, int Weight, Person Owner){
	this.Name = Name;
	this.Color = Color;
	this.Weight = Weight;
	this.Owner = Owner;
}
public void transferOwnership(Person newOwner){
	this.Owner = newOwner;
}
}