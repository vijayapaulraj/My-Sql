import java.util.Scanner;


public class str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]=new String[2];
		String b[]=new String[2];
		Scanner r=new Scanner(System.in);
		for(int i=0;i<1;i++){
			a[i]=r.nextLine();
			b[i]=r.nextLine();
		}
		for(int i=0;i<1;i++){
		//	System.out.println(a[i]);
			//System.out.println(b[i]);
			int le=a[i].compareToIgnoreCase(b[i]);
			System.out.println(le);
			
		}
		
		

	}

}
