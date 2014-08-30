import java.util.Scanner;


public class pr21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1,z,y,x;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the choice");
		n=t.nextInt();
		switch(n)
		{
		case 1:
			System.out.println(i);
			break;
		case 2:
			System.out.println(i);
			n=n-1;
			z=n+1;
			System.out.println(n+"\t"+z);
			break;
		case 3:
			System.out.println(i);
			n=n-2;
			z=n+1;
			System.out.println(n+"\t"+z);
			n=n;
			z=n+1;
			y=z+1;
			System.out.println(n+"\t"+z+"\t"+y);
			break;
		case 4:
			System.out.println(i);
			n=n-3;
			z=n+1;
			System.out.println(n+"\t"+z);
			n=n;
			z=n+1;
			y=z+1;
			System.out.println(n+"\t"+z+"\t"+y);
			n=n;
			z=n+1;
			y=z+1;
			x=y+1;
			System.out.println(n+"\t"+z+"\t"+y+"\t"+x);
			break;
			default:
			System.out.println("error");
		
		}
	}

}
