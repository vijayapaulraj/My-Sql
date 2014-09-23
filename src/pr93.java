import java.util.Scanner;


public class pr93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char t[]=new char[6];
		Scanner y=new Scanner(System.in);
		for(int i=0;i<6;i++){
			t[i]=y.nextLine().charAt(0);
		}
		for(int i=5;i>=0;i--){
			System.out.print(t[i]);
		}

	}

}
