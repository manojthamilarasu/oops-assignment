/**
 * 
 */
package mjtwo;


public class Date {
	private int month,day,year;

	public Date() {
		month=0;day=0;year=0;}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate(int day,int month,int year)
	{
		System.out.printf("the date is %d/%d/%d",day,month,year);
		
	}

}
