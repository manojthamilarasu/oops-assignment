package mj.operation;
import mj.data.Employee;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee one=new Employee();
		Employee two=new Employee();
 		Scanner input=new Scanner(System.in);
 		System.out.println("enter emp1 fisrt name");
 		one.setFirstName(input.next());
 		System.out.println("enter emp1 last name");
 		one.setLastName(input.next());
 		System.out.println("enter mnthly salry");
 		one.setSalary(input.nextDouble());
 		System.out.println("enter emp1 fisrt name");
 		two.setFirstName(input.next());
 		System.out.println("enter emp1 last name");
 		two.setLastName(input.next());
 		System.out.println("enter mnthly salry");
 		two.setSalary(input.nextDouble());
 		calcAnnualSal(one);
 		calcAnnualSal(two);
 		hikesalary(one);
 		hikesalary(two);
 		calcAnnualSal(one);
 		calcAnnualSal(two);
 		


		

	}

	private static void hikesalary(Employee one) {
		// TODO Auto-generated method stub
		double sal=one.getSalary();
		sal += (sal * 10/100);
		one.setSalary(sal);
		
	}

	private static void calcAnnualSal(Employee one) {
		// TODO Auto-generated method stub
		double year;
		year=one.getSalary()*12;
		System.out.println("annaul salry of emp"+year);
	}

}
