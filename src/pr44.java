import java.util.Scanner;


public class pr44 {
	void add()
	{
		int a[][]=new int[2][2];
		int b[][]=new int [2][2];
		int c[][]=new int[2][2];
		int i,j,k;
		Scanner t=new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=t.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=t.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print("\t"+c[i][j]);
			}
			System.out.println();
		}
	}
	void multi()
	{
		
			int a[][]=new int[2][2];
			int b[][]=new int [2][2];
			int c[][]=new int[2][2];
			int i,j,k;
			Scanner t=new Scanner(System.in);
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					a[i][j]=t.nextInt();
				}
			}
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					b[i][j]=t.nextInt();
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
					System.out.print("\t"+c[i][j]);
				}
				System.out.println();
			}
			
			
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr44 raju=new pr44();
		raju.multi();
		raju.add();
		}

}
