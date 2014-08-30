import java.util.Scanner;


public class pr64 {
	void add(int a)
	{
		int i,j,n;
		Scanner t=new Scanner(System.in);
		n=t.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
		void add(int a,int b)
		{
			int i,j,n;
			Scanner y=new Scanner(System.in);
			n=y.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr64 bhaskar=new pr64();
		bhaskar.add(6);
		bhaskar.add(7,7);

	}

}
