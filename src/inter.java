import java.util.Scanner;


public class inter implements tall,gun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter anuj=new inter();
		anuj.swap();
		anuj.tuy();
		anuj.vum();
		anuj.fun();

	}

	@Override
	public void swap() {
		// TODO Auto-generated method stub
		int a,b;
		Scanner t=new Scanner (System.in);
		System.out.println("Enter the number");
		a=t.nextInt();
		b=t.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the number is a="+a+"\n"+"the number b is="+b);
	}

	@Override
	public void tuy() {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner t=new Scanner (System.in);
		System.out.println("Enter the number");
		a=t.nextInt();
		b=t.nextInt();
		c=a*b;
		System.out.println("the number is c="+c);
		
		
		
	}

	@Override
	public void vum() {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner t=new Scanner (System.in);
		System.out.println("Enter the number");
		a=t.nextInt();
		b=t.nextInt();
		c=a/b;
		System.out.println("the number is c="+c);
		
		
		
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner t=new Scanner (System.in);
		System.out.println("Enter the number");
		a=t.nextInt();
		b=t.nextInt();
		c=a-b;
		System.out.println("the number is c="+c);
		
		
	}

}
