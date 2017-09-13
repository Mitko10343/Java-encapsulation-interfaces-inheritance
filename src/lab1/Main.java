//Written by Dimiter Dinkov
//student number :C15334276
//Mobile Software Development Lab work
//Examples of encapsulation/inheritance/interfaces/instanceof in java
package lab1;

//main control method 
public class Main {
	public static void main(String[] args) {
			//part 1
			//create a new person object called person1
			Person person1 = new Person();
			
			//using the set methods sets the name and gender of the person object
			//an example of encapsulation
			person1.setName("Jonny");
			person1.setGender("Male");
			//using the get methods gets the name and gender of the person object
			//another example of encapsulation
			String personName = person1.getName();
			String personGender = person1.getGender();
			//print out the name and gender of the person1 object
			System.out.println(personName+"\n");
			System.out.println(personGender+"\n");
			
			//part 2
			//printing out the data from person1 using the toString() method
			System.out.println(person1);
			
			//part 3
			//Creating a new student object that inherits some variables from the parent class
			Student student = new Student("Tom","Male",23432,"CD992f");
			//printing out the toString() data from the student object
			System.out.println(student);
			
			//part 4
			//Testing the methods in the publishDetails interface
			System.out.println(student.ConfirmDetails());
			System.out.println(student.getCourseCode());
			
			//part 5
			//Demonstrating the use of instanceof
			if(student instanceof Student)
			{
				System.out.println("student is an instance of Student \n");;
			}
			if(student instanceof PublishDetails)
			{
				System.out.println("student is an instance of publishDetails \n");
			}
			
		}
}
