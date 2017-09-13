//Written by Dimiter Dinkov
//student number :C15334276
//Mobile Software Development Lab work
//Examples of encapsulation/inheritance/interfaces/instanceof in java
package lab1;

//Creating a superclass Person	
public class Person {

	//making private variables which cannot be accessed 
	//from outside this class to demonstrate encapsulation
	private String name;
	private String gender;
	
	//default constructor for the person class
	Person()
	{
	
	} 
	
	//another constructor for the person class
	Person(String name, String gender)
	{
		this.name=name;
		this.gender=gender;
	}
	
	//get method which returns the objects gender
	public String getGender()
	{
	  return gender;
	}
	
	//get method which returns the objects name
	public String getName()
	{
		return name;
	}
	//set method which sets the objects name
	public void setName(String newName)
	{
		name = newName;
	}
	//set method which sets the objects gender	
	public void setGender(String newGender)
	{
		gender = newGender;
	}
	//toString() converts the data from the object into
	// a logical sentence to be returned
	public String toString()
	{
		return "Name:"+this.name+"\n"+
				"Gender:"+this.gender+"\n";
	}

}
