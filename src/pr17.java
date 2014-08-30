import java.util.Scanner;


public class pr17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x,y,c;
     Scanner z=new Scanner (System.in);
     System.out.println("enter the number");
     x=z.nextInt();
     y=z.nextInt();
     c=x*y;
     if((c%2)==0)
     {
    	 System.out.println("The even number is="+c);
    	}
     else
     {
    	 System.out.println("The odd number is="+c);
     }
	}

}
