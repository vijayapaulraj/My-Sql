import java.util.Scanner;


public class pr30 {
	 pr30()
	{
		int x,y,z;
		Scanner t=new Scanner(System.in);
		x=t.nextInt();
		y=t.nextInt();
		z=x+y;
		if((z%2)==0)
		{
			System.out.println("the even number is"+z);
		}
		else
		{
			System.out.println("The odd number is"+z);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pr30();

	}


}
