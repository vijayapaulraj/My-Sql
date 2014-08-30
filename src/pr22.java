import java.util.Scanner;


public class pr22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		int i,pdt=1;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the number");
		for(i=0;i<4;i++)
		{
			a[i]=r.nextInt();
		}
		for(i=0;i<4;i++)
		{
			pdt=pdt*a[i];
		}
		System.out.println("the Product of the number:"+pdt);

	}

}
