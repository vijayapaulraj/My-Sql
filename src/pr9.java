import java.util.Scanner;


public class pr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [5];
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the number");
		for(int i=0;i<5;i++){
			a[i]=r.nextInt();

		}
		System.out.println(" the output  number");
		for(int i=0;i<5;i++)
	{
			System.out.println(a[i]);
		}

	}

}
