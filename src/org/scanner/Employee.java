package org.scanner;

import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		short id = s.nextShort();
		Long phno = s.nextLong();
		int salary = s.nextInt();
		float cno = s.nextFloat();
		char gender = s.next().charAt(0);
		System.out.println("Name is :"+name);
		System.out.println("Id is :" +id);
		System.out.println("Phone no is :" +phno);
		System.out.println("Salary is :" +salary);
		System.out.println("Cheque no is :" +cno);
		System.out.println("Gender is :" +gender);
			
		
	}
	

}
