import java.util.ArrayList;


public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(7);
		a.add(66);
		a.add('y');
		System.out.println(a);
		a.add("tyre");
		System.out.println("After adding string");
		System.out.println(a);
		a.remove(1);
		System.out.println("After removing index value");
		System.out.println(a);
		System.out.println(a.indexOf("tyre"));
        if(a.contains(66)){
        	System.out.println("the number is present");
        }
        else{
        	System.out.println("the number is not present");
        }
		a.set(2,"run");
		System.out.println("After adding 2nd position");
		System.out.println(a);
		System.out.println(a.size());
		
		ArrayList b=new ArrayList();
		b.add(9);
		b.add(8.09f);
		b.add("remove");
		System.out.println(b);
		
		b.addAll(1,a);
		System.out.println(b);
		System.out.println(b.size());
		
		}

}
