import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class pr88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,ArrayList> hm=new HashMap<Integer,ArrayList>();
		ArrayList a=new ArrayList();
		a.add("Apple");
		a.add("Banana");
		
		ArrayList b=new ArrayList();
		b.add("Caarot");
		b.add("Doctar");
		
		ArrayList c=new ArrayList();
		c.add("Elephant");
		c.add("Fun");
		
		hm.put(1,a);
		hm.put(2,b);
		hm.put(3,c);
		
		for(Map.Entry<Integer,ArrayList>hr:hm.entrySet()){
			Integer key=hr.getKey();
			ArrayList y=hr.getValue();
			System.out.println("the Key is="+key);
			System.out.println("the value is="+y);
		}
		
		

	}

}
