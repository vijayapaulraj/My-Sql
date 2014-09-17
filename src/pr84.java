import java.util.ArrayList;
import java.util.Scanner;


public class pr84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		Scanner r=new Scanner(System.in);
	/*	for(int i=0;i<a.size();i++){
		
			a.add(r.nextInt(i));
		}
		for(int i=0;i<5;i++){
		System.out.println(a.add(i)+"\t"+a.get(i));
			//System.out.println(a.get(i));
		}*/
		
		a.add(5);
		a.add(6.08f);
		a.add('y');
		System.out.println("Before adding");
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		a.add("String");
		System.out.println("after adding");
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		a.set(1,6);
		System.out.println("after editing adding");
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		System.out.println("position of particular value");
		System.out.println(a.indexOf('y'));
		System.out.println("Size of the value");
		System.out.println(a.size());
		a.remove(1);
		System.out.println("After removing value ");
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
			}
		System.out.println("Check the value is here or not");
			if(a.contains(5)){
				System.out.println("the number is there"+"\t"+a.indexOf(5)+"\t"+a.get(0));
			}
			else{
				System.out.println("the number is no there");
			}
			
			a.add(2,7);
			System.out.println("after  adding value 7 to the position 2");
			for(int i=0;i<a.size();i++){
				System.out.println(a.get(i));
				}
			a.add(0,2);
			System.out.println("after  adding value 2 to the position 0");
			for(int i=0;i<a.size();i++){
				System.out.println(a.get(i));
				}
		
	       a.set(0,9);
	        System.out.println("after  adding value 2 to the position 0");
		    for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
			}
	 
	

	}
	}


