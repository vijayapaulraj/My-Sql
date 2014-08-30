import java.util.Scanner;


public class pr28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int n,i,j;
		Scanner t=new Scanner(System.in);
		System.out.println("enter the matrix");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=t.nextInt();
			}
		}
		System.out.println("enter the number");
		n=t.nextInt();
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=n*a[i][j];
			}
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
