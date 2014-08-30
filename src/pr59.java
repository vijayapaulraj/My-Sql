import java.util.Scanner;


public class pr59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,k;
		Scanner t=new Scanner (System.in);
		n=t.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
				k=i-j;
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
