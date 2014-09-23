import java.io.FileInputStream;
import java.io.FileOutputStream;


public class f1 {
	
	String fun(){
		String content="";
	
		try{
			FileInputStream a=new FileInputStream("F:\\bhas.txt");
			int b;
			
			while((b=a.read())!=-1){
				content=content+(char)b; 
				System.out.print((char)(b));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return content;
	}
	
	void gun(String b){
		try{
		FileOutputStream y=new FileOutputStream("F:\\raj.txt");
		byte a[] = b.getBytes();
		y.write(a);
		y.flush();
		y.close();
		
	}
		catch(Exception e)
		{
			
		e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1 bh=new f1();
		String singa =bh.fun();
		bh.gun(singa);
		
		}

}
