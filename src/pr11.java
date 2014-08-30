import java.util.Scanner;


public class pr11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double a[]=new Double[5];
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the float number");
		for(int i=0;i<5;i++)
		{
			a[i]=t.nextDouble();
		}
		System.out.println("The output Float number");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
