import java.util.Scanner;


public class pr68 implements pr66,pr67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr68 bhaskar=new pr68();
		bhaskar.arun();
		bhaskar.raju();

	}

	@Override
	public void arun() {
		// TODO Auto-generated method stub
		int i,j,sum=0;;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++){
				
				sum=sum+1;
				System.out.print(sum);
			}
			System.out.println();
		}
		
	}

	@Override
	public void raju() {
		// TODO Auto-generated method stub
		int i,j,n,k;
		Scanner t=new Scanner(System.in);
		n=t.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=0;j<i;j++){
				k=i-j;
				System.out.print(k);
				
			}
			System.out.println();
		}
	}

}
