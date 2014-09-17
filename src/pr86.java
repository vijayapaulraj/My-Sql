import java.util.ArrayList;


public class pr86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList h=new ArrayList();
		h.add(5);
		h.add(7);
		h.add(4);
		h.add("Str");
		h.add(6);
		h.add('g');
		
		System.out.println(h);
		h.remove(4);
		System.out.println(h);
		h.remove("Str");
		System.out.println(h);
		h.add(8);
		System.out.println(h);
		
		ArrayList b=(ArrayList)h.clone();
		System.out.println(b);
		
		h.add("appu");
		System.out.println(h);
		
		System.out.println(b);
		
		
		ArrayList f=new ArrayList();
		
		f.add("India");
		f.add("Australia");
		f.add("Pakistan");
		f.add("United Kingdom");
		f.add("United States");
		f.add("Russia");
		
		System.out.println(f);
		f.add("Singapore");
		System.out.println(f);
		
		f.add(6,"Malaysia");
		System.out.println(f);
		
		f.addAll(8,h);
		System.out.println(f);
		
		System.out.println(f.size());
		
		f.add("Ukraine");
		System.out.println(f);
		
		f.add(8,"Ukraine");
		System.out.println(f);
		
		System.out.println(f.lastIndexOf("Ukraine"));
		
	}

}
