import java.util.Scanner;


public class pr43 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr43 ramu=new pr43();
		ramu.add();
	}

}
