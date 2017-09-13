//Written by Dimiter Dinkov
//student number :C15334276
//Mobile Software Development Lab work
//Examples of encapsulation/inheritance/interfaces/instanceof in java
package lab1;

//creating a student subclass which extends the Person superclass and 
//implements the PublishDetails() interface
public class Student extends Person implements PublishDetails {
	//private variable which cannot be accessed outside the 
	//student class to demonstrate encapsulation
	private int studentID;
	private String courseCode;
	
	//constrcutor for the student class
	Student(String name, String gender,int Id,String course)
	{
		//passing on the name and gender to the superclass constructor
		super(name,gender);
		this.studentID= Id;
		this.courseCode = course;
		
	}
	
	//converting the data from the student subclass into a logical sentence to be returned
	public String toString()
	{
		return "Student ID:"+this.studentID +"\n"+
				"Name:"+ super.getName() + "\n"+
				"Gender:"+super.getGender()+ "\n";
	}
	
	//ConfirmDetails() method required by the interface
	public String ConfirmDetails()
	{
		return "Student ID:"+studentID +"\n"+
				"Name:"+ super.getName() + "\n"+
				"Gender:"+super.getGender()+ "\n";
	}
	//getCourseCode() method required by the interface
	public String getCourseCode()
	{
		return "Course Code:"+courseCode;
	}
}
