
public class pr45 {
	void sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	void sum(double a,double b)
	{
		double c;
		c=a*b;
		System.out.println(c);
	}
	void sum(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		System.out.println(d);
	}
	void sum(float a,float b)
	{
		float c;
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr45 raju=new pr45();
		raju.sum(4,5);
		raju.sum(4d,7d);
		raju.sum(4.5f,6.8f);
		raju.sum(4,6,9);
		
		

	}

}
