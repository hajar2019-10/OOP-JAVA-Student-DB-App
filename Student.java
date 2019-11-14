package app;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID ;
	private String courses="";
	private int tuitionBalance= 0;
	private static int costOfCourse = 600;
	private static int id =1001;
	
     //Constructor prompt user to enter name and year
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		this.firstName=in.nextLine();
		System.out.print("Enter the last name: ");
		this.lastName = in.nextLine();
		System.out.print("1- Freeshman \n2- Sophomore \n3- Junior \n4- Senior\n Enter student class level: ");
		this.gradeYear = in.nextInt();
		setStudentID();
		//System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
		
	}
	
	//Generate ID
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear +""+id;
	}
	// Enroll in courses
	public void enroll() {
		//get inside a loop user hits 0 
		do {System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course=in.nextLine();
		if (!course.equals("Q")) {
			courses= courses +"\n  " +course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {break;}
		}while(1 !=0);
		//System.out.println("ENROLLED IN: "+ courses);
		//System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" +tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance + payment;
		System.out.println("Thank you for your payment of $" +payment);
		viewBalance();
	}
	//Show status
	public String toString() {
		return "Name " + firstName +" "+lastName+
				"\nGrade level:"+ gradeYear +
				"\nStudent ID:"+studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
