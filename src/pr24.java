import java.util.Scanner;


public class pr24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int i,j;
		Scanner  r=new Scanner(System.in);
		System.out.println("Enter the matrix");
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
		
		System.out.println("the output matrix");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("\t"+c[i][j]);
			}
			System.out.println();
		}
		

	}

}
