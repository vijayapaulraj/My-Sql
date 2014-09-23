
public class st4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am bad boy";
		String t="I am good boy";
		String y="We are not good ";
		int le;
		le=s.compareToIgnoreCase(t);
		System.out.println(le);
		le=t.compareToIgnoreCase(y);
		System.out.println(le);
		le=y.compareToIgnoreCase(s);
		System.out.println(le);
		
	}

}
