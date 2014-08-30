import java.util.Scanner;


public class pr57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the number");
		n=t.nextInt();
		r=(int)Math.pow((n/100),3)+(int)Math.pow(((n%100)/10),3)+(int)Math.pow(((n%100)%10),3);
		if(r==n)
		{
			System.out.println("the number is armstrong number="+r);	
		}
		else{
			System.out.println("the number is not armstrong");
		}
		

	}

}
