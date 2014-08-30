import java.util.Scanner;


public class pr55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner t=new Scanner (System.in);
		a=t.nextInt();
		b=t.nextInt();
		c=t.nextInt();
		if((a>b)&&(b>c))
		{
			System.out.println("the greatest number of a "+a);
		}
		else if(b>c)
		{
			System.out.println("the greatest number of b "+b);
		}
		else
		{
			
				System.out.println("the greatest number of c "+c);
			
		}
		

	}

}
