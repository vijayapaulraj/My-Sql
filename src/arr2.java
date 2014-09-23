import java.util.HashMap;
import java.util.Scanner;


public class arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h=new HashMap();
		h.put(1,"d");
		h.put(2,"e");
		h.put(3,"t");
		String a[]=new String[3];
		Scanner r=new Scanner(System.in);
		for(int i=0;i<3;i++){
			a[i]=r.nextLine();
		}
		for(int i=0;i<3;i++){
			if(h.get(i+1).toString().equalsIgnoreCase(a[i])){
				System.out.println("the answer is correct");
				
			}
		}
		
		}
}
