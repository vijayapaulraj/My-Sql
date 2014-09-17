import java.util.ArrayList;


public class collection {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		ArrayList a=new  ArrayList();
		a.add(6);
		a.add(6.04f);
		a.add("app");
		a.add('d');
		
		System.out.println("the arraylist before ");
		
		for(int i =0 ;i<a.size();i++)
		{
		System.out.println(a.get(i));
		}
		
		a.add(2,"arun");
		
		a.remove(0);
		
		if(a.contains("arun"))
		{
			System.out.println("arun iruku ");
		}
		else
		{
			System.out.println("arun illa");
		}
		System.out.println("after editing");
		
		for(int i =0 ;i<a.size();i++)
		{
		System.out.println(a.get(i));
		}
	}

}
