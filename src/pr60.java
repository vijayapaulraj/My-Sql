import java.util.Scanner;


public class pr60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[3];
			int i;
			Scanner t=new Scanner(System.in);
			for(i=0;i<4;i++)
			{
				a[i]=t.nextInt();
			}
			for(i=0;i<4;i++)
			{
				System.out.print("\t"+a[i]);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("raju");

	}

}
