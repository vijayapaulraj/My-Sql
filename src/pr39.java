import java.util.Scanner;


public class pr39 {
	pr39()
	{
		int a[]=new int[3];
		Scanner r=new Scanner(System.in);
		for(int i=0;i<3;i++)
			{
				a[i]=r.nextInt();
			}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
			System.out.println(sum);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pr39();

	}

}
