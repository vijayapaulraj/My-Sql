import java.util.Scanner;


public class pr27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner t=new Scanner(System.in);
		n=t.nextInt();
		for(i=0;i<=n;++i)
		{
			for(j=i+1;j<=n;++j)
			{
				System.out.print("$");
			}
			System.out.println();
		}
		

	}

}

