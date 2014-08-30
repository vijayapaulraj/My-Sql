import java.util.Scanner;


public class pr50 extends pr49{
	void mul()
	{
		int a,b,c;
		Scanner t=new Scanner(System.in);
		a=t.nextInt();
		b=t.nextInt();
		c=a%b;
		System.out.println("the c number"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr50 amma=new pr50();
		amma.mul();
		amma.sum();
		amma.add();
		

	}

}
