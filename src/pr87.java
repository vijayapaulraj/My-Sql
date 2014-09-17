import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class pr87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h=new HashMap ();
		h.put(1,"a");
		h.put(2,"b");
		h.put(3,"d");
		  
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the value");
		String a[]=new String[3];
		for(int i=0;i<3;i++)
		{
			a[i]=r.nextLine();
		}
		for(int i=0;i<3;i++)
		{
			int j=i+1;
			if(h.get(j).toString().equalsIgnoreCase(a[i]))
			{
			System.out.println("the answer is correct");
		}
			else{
				System.out.println("the answer is not correct");
				
			}	}
		}
		
		

	}


