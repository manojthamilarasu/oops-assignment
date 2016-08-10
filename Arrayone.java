package mjthree;
import java.util.Scanner;
public class Arrayone {
	Scanner input=new Scanner(System.in);
	int c;
	int []salesSal;
	int[] counter=new int[9];
	public void set()
	{
		System.out.println("enter array size");
		c=input.nextInt();
		salesSal=new int[c];
		
	}
	public void setvalue()
	{
		System.out.println("enter the gross fr all employees");
		for(int i=0;i<salesSal.length;i++)
		{
			salesSal[i]=input.nextInt();
		}
	}
	public void calculate()
	{
		for(int i=0;i<salesSal.length;i++)
		{
			salesSal[i]=(int)(200+(0.09)*salesSal[i]);
			//System.out.printf("%d",salesSal[i]);
		}
			
	}
	public void classify()
	{
		for (int k=0;k<counter.length;k++)
		{
			counter[k]=0;
			for(int j=0;j<salesSal.length;j++)
			{
				if((salesSal[j]>=200) &&(salesSal[j]<=300 ))
				{
					counter[0]++;
				}
				else if((salesSal[j]>=300) &&(salesSal[j]<=400 ))
				{
					counter[1]++;
				}
				else if((salesSal[j]>=400) &&(salesSal[j]<=500 ))
				{
					counter[2]++;
				}
				else if((salesSal[j]>=500) &&(salesSal[j]<=600 ))
				{
					counter[3]++;
				}
				else if((salesSal[j]>=600) &&(salesSal[j]<=700 ))
				{
					counter[4]++;
				}
				else if((salesSal[j]>=700) &&(salesSal[j]<=800 ))
				{
					counter[5]++;
				}
				else if((salesSal[j]>=800) &&(salesSal[j]<=900 ))
				{
					counter[6]++;
				}
				else if((salesSal[j]>=900) &&(salesSal[j]<=1000 ))
				{
					counter[7]++;
				}
				else counter[8]++;
			}
			for(int q=0;q<counter.length;q++)
			{
				System.out.printf("  "+ counter[k]+"  ");
				
				
			}
			System.out.println("200-299 300-399 400-499 500-599 600-699 700-799 800-899 900-999 ");

			
		}
	}
	//System.out.println("200-299 300-399 400-499 500-599 600-699 700-799 800-899 900-999 ");

}



	
