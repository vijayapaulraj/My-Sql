
public class pr46 {
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
		pr46 ramu=new pr46();
		int a=4,b=7;
		float d=(float)9.8,e=(float)8.9;
		double g=5,h=4;
		ramu.sum(a,b);
		ramu.sum( d, e);
		ramu.sum(g,h);
		
		

	}

}
