import java.util.Scanner;


public class pr31 {
	pr31(int a)
	{
		//Scanner t=new Scanner(System.in);
		//a=t.nextInt();
		if(a>0)
		{
			System.out.println("The positive number"+a);
		}
		else
		{
			System.out.println("The negative number"+a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
	Scanner y=new Scanner(System.in);
        d=y.nextInt();
         new pr31( d);
	}

}
