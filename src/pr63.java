import java.util.Scanner;


public class pr63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k,j,n,y;
		Scanner t=new Scanner(System.in);
		n=t.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
			System.out.print(j);					
			}
			for(k=0;k<i;k++)
			{
			y=i-k;
			System.out.print(y);
				
			}
			System.out.println();
		}
		
		}
	}
	


