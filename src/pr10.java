import java.util.Scanner;


public class pr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]=new String[10];
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the String");
		for(int i=0;i<10;i++)
		{
			a[i]=t.nextLine();
		
		}
		System.out.println("The Output string");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
