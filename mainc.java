package mjfour;
import java.util.Scanner;

public class mainc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array obj=new array();
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter 5 elemnts \n");
		obj.A = new int[5];
		for(int i=0;i<5;i++)
		{
			obj.A[i]=input.nextInt(); 
	     }
		obj.unique();
		
	

	}

}
