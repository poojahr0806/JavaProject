package iprime.com;
import java.util.Scanner;

public class Emp {
	String name,designation;
	int age;
	double salary;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter name: ");
   	 name=sc.next();
   	System.out.println("Enter age: ");
   	  age=sc.nextInt();
   	System.out.println("Enter Salary: ");
   	 salary=sc.nextDouble();
   	System.out.println("Enter designation: ");
   	  designation=sc.next();
	}
	void display(){
		System.out.println("Name: "+name+" "+"Age: "+age+" "+"Salary: "+salary+" "+"Designation: "+designation);
	}
	void SalRaise(){
		salary=(salary*10)/100;
		System.out.println("Salary raised as: "+salary);
	}

}
