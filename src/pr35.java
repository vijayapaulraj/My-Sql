import java.util.Scanner;


public class pr35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the value");
		n=t.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("&");
			}
			System.out.println();
			
		}

	}

}
