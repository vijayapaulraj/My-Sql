import java.util.Scanner;


public class pr32 {
	void son()
	{
		int x,y,z;
		Scanner t=new Scanner(System.in);
		x=t.nextInt();
		y=t.nextInt();
		z=x+y;
		if((z%2)==0)
		{
			System.out.println("The Even number is"+z);
		}
		else
		{
			System.out.println("The odd number is"+z);
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr32 bhaskar=new pr32();
		bhaskar.son();

	}

}
