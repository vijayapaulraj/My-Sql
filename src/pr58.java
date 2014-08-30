import java.util.Scanner;


public class pr58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n;
		Scanner t=new Scanner(System.in);
		System.out.println("enter the number");
		n=t.nextInt();
		r=(int)Math.pow(n/1000,4)+(int)Math.pow((n%1000)/100,4)+(int)Math.pow((((n%1000)%100)/10),4)+(int)Math.pow((((n%1000)%100)%10),4);
		if(r==n)
		{
			System.out.println("the armstrong number is="+r);
		}
		else
		{
			System.out.println("the number is not armstrong="+r);
		}

	}

}
