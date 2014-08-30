import java.util.Scanner;


public class pr52 extends pr51{
	void add()
	{
		int a,b,c;
		Scanner t=new Scanner(System.in);
		a=t.nextInt();
		b=t.nextInt();
		c=a*b;
		System.out.println("the number cis"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr52 raj=new pr52();
		raj.add();

	}

}
