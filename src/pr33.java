import java.util.Scanner;


public class pr33 {
	void arun(int a)
		{
          if(a>0)
          {
        	  System.out.println("The positive number is "+a);
          }
          else
          {
        	  System.out.println("The negative number is "+a);
          }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		Scanner t=new Scanner(System.in);
		d=t.nextInt();
		pr33 arul=new pr33();
		arul.arun(d);

	}

}
