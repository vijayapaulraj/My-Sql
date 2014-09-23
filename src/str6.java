
public class str6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g=new String("Welcome to new Java world");
		System.out.println(g.toLowerCase());
		System.out.println(g.toUpperCase());
		System.out.println(g.intern());
		
		String y=new String("   I   am     back     ");
		System.out.println(y.trim());
		System.out.println(g.toUpperCase());
		System.out.println(g.replace('o','H'));
		
		System.out.println(g.replaceFirst("new","hello"));
		
	}

}
