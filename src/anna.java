import java.util.Scanner;


public class anna implements appa,amma{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anna taj=new anna();
		taj.mul();
		taj.div();
		taj.add();
		taj.sum();
		
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner t=new Scanner(System.in);	
	a=t.nextInt();
	b=t.nextInt();
	c=a*b;
	System.out.println(c);
		
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner t=new Scanner(System.in);	
	a=t.nextInt();
	b=t.nextInt();
	c=a/b;
	System.out.println(c);
		
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner t=new Scanner(System.in);	
	a=t.nextInt();
	b=t.nextInt();
	c=a+b;
	System.out.println(c);
		
	}
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner t=new Scanner(System.in);	
	a=t.nextInt();
	b=t.nextInt();
	c=a+b;
	System.out.println(c);
		
	}

}