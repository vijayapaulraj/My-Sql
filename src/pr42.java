import java.util.Scanner;


public class pr42 {
	void add(int a)
	{
		int b[]=new int[3];
		Scanner t=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			b[i]=t.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pr42 fun=new pr42();
		int c;
		Scanner t=new Scanner(System.in);
		c=t.nextInt();
		
		fun.add(c);

	}

}
