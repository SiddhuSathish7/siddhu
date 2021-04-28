package org.tcs.test.login;

public class Student {
	public static void main(String[] args) {
		short studentId = 0 ;
		System.out.println("Student ID is "+ studentId);
		String studentName = "Sathish";
		System.out.println("Student Name is "+ studentName);
		byte mark1 = 80;
		System.out.println("Mark 1 is "+ mark1);
		byte mark2 = 90;
		System.out.println("Mark 2 is "+ mark2);
		byte mark3 = 70;
		System.out.println("Mark 3 is "+ mark3);
		byte mark4 = 60;
		System.out.println("Mark 4 is "+ mark4);
		byte mark5 = 0;
		System.out.println("Mark 5 is "+ mark5);
		int total = mark1+mark2+mark3+mark4+mark5;
		System.out.println("Total is "+ total);
		int average = total/5;
		System.out.println("Average is "+ average);
		
	}

}
