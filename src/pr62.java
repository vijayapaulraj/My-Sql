import java.util.Scanner;


public class pr62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		Scanner t=new Scanner(System.in);
		j=t.nextInt();
		for(i=1;i<j;i++)
		{
			if((j/i)==0){
				k=k+1;
			}
		}
		//if(k>2)
	//	{
			
		//}
		System.out.println(k);
		
		

	}

}
