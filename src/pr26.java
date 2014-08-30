import java.util.Scanner;


public class pr26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int temp,i,j;
		Scanner r=new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			a[i][j]=r.nextInt();
		}
		}
		for(i=0;i<2;i++)
		{
			for(j=i+1;j<2;j++)
			{
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
				
			}
			//System.out.println();
		}
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print("\t"+a[i][j]);
				
			}
		System.out.println();
				
			}
			
		}
			
			
		
}	

	


