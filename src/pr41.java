import java.util.Scanner;


public class pr41 {
	void vijay()
	{
		int a[]=new int[4];
		Scanner t=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			a[i]=t.nextInt();
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
		pr41 gun=new pr41();
		gun.vijay();

	}

}
