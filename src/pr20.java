import java.util.Scanner;


public class pr20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char r;
		Scanner t=new Scanner(System.in);
        System.out.println("Enter the character");
		r=t.next().charAt(0);
		switch(r)
		{
		case 'a':
			System.out.println("monday");
			break;
		case 'b':
			System.out.println("Tuesday");
			break;
		case 'c':
			System.out.println("Wednesday");
			break;
		case 'd':
			System.out.println("Thursday");
			break;
		case 'e':
			System.out.println("Friday");
			break;
			default:
				System.out.println("Saturday");
		}
			
			
	}

}
