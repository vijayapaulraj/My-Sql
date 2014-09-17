
public class SubThread {
	public static void main(String args[])
	{
		new BaseThread();
		try{
			for(int i=0;i<10;i++)
			{
			System.out.println("Sub Thread is Running");
			Thread.sleep(1000);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
