import java.util.Scanner;


public class pr34 {
	void add(int a,int b)
	{
		int c;
		c=a+b;
		if((c%2)==0)
		{
			System.out.println("The even number" +c);
			
		}
		else
		{
			System.out.println("The odd number" +c);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr34 run=new pr34();
		int a,b,c;
		Scanner t=new Scanner(System.in);
		a=t.nextInt();
		b=t.nextInt();
		run.add(a,b);

	}

}
