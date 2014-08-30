import java.util.Scanner;


public class pr25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int i,j,k;
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
			for(j=0;j<2;j++)
			{
				b[i][j]=r.nextInt();
			}
			
		}
		int sum=0;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{			
				for(k=0;k<2;k++)
				{
				sum=sum+(a[i][k]*b[k][j]);
				
			}
				c[i][j]=sum;
				sum=0;
				
				}
	}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{			
		System.out.print(c[i][j]+"\t");
			}
}
		System.out.println();
}
}
