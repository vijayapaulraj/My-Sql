import java.util.Scanner;


public class pr19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the choice");
		x=t.nextInt();
		System.out.println("the value is");
		switch (x)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
			
			default:
				System.out.println("Saturday");
			
			}
		

	}

}
