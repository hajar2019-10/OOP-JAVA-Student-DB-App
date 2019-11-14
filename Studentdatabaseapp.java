package app;

import java.util.Scanner;



public class Studentdatabaseapp {

	public static void main(String[] args) {
		
		/*Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.toString());
		*/
		
		
		//Ask how many new uses we want to add
		
		System.out.println("Enter number of new students to enroll;");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];	
		
		//Create n number of new students
		for(int n=0;n<numOfStudents;n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			
		}
		for(int n=0;n<numOfStudents;n++) {
			
			System.out.println(students[n].toString());
		}
		
	}

}
