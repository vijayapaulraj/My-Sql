import java.util.Scanner;


public class pr12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]=new int[5];
		Scanner y=new Scanner(System.in);
		System.out.println("Enter the number");
		for(int i=0;i<5;i++)
		{
			b[i]=y.nextInt();
		}
		System.out.println("The sum of the number");
		int sum=0;
		for(int i=0;i<5;i++){
			sum=sum+b[i];
			
		}
		System.out.println(sum);
	}

}
