package lib;

import java.io.*;


public class fileio {
	
	public static void main(String args[])
	{
		try{

			
			FileInputStream fi = new FileInputStream("D:/Flim/abc.txt");
			int c;
			while((c=fi.read())!=-1)
			{
				System.out.print((char)(c));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
