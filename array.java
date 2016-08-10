package mjfour;


public class array {
	
	public int []A;
	public void unique() {
		for(int i=0;i<5;i++)
			{ int flag1=1;
				for(int j=i+1;j<5;j++)
				{
					if (A[i]== A[j])
					{
						flag1=0;
						break;
					}
				}
				if(flag1==1)
					System.out.printf("%d \t",A[i]);
			}
		
	}
		
	
		

};
