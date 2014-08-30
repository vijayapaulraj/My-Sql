import java.util.Scanner;


public class pr37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		int sum=0;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the number");
		n=t.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
			sum=sum+1;
			System.out.print(sum);
			}
			System.out.println();	
				
		}
	}

}
