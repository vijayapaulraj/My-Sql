import java.io.FileInputStream;
import java.io.FileOutputStream;


public class f3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		FileInputStream f=new FileInputStream("F:\\go.txt");
		FileOutputStream f1=new FileOutputStream("E:\\gy.txt");
		int i=0;
		while((i=f.read())!=-1){
			System.out.print((char)i);
			f1.write((byte)(i));
			
		}
		
		f.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
