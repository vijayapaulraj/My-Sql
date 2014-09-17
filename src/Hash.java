import java.util.HashMap;
import java.util.Scanner;


public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter the answers");
		String a[] = new String [3];
		for(int i=0;i<3;i++)
		{
			a[i]=in.nextLine();
		}
		
		if(hm.get(1).toString().equalsIgnoreCase(a[0]))
		{
			System.out.println("The answer 1 is correct");
		}
		
		if(hm.get(2).toString().equalsIgnoreCase(a[1]))
		{
			System.out.println("The answer 2 is correct");
		}
		
		if(hm.get(3).toString().equalsIgnoreCase(a[2]))
		{
			System.out.println("The answer 3 is correct");
		}
	}

}
