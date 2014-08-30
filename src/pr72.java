

public class pr72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,y;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				//k=i-j;
				System.out.print(j);
			}
			for(k=0;k<i;k++){
				y=i-k;
				System.out.print(y);
			}
			System.out.println();
		}

	}

}
