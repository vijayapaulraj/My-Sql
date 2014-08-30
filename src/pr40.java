import java.util.Scanner;


public class pr40 {
	void add()
	{
		int a[]=new int[4];
		Scanner t=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			a[i]=t.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr40 fan=new pr40();
		fan.add();
		

	}

}
