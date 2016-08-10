package mjtwo;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date one=new Date();
		Scanner input=new Scanner(System.in);
		//one.displayDate(04,11,1997);
		int day,month,year;
		day=input.nextInt();
		month=input.nextInt();
		year=input.nextInt();
		one.displayDate(day,month,year);
	}

} 
