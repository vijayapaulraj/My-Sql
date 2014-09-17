
public class BaseThread extends Thread{
	
	public BaseThread()
	{
		System.out.println("enter base");
		Thread ob = new Thread(this,"baskar singakuti");
		ob.start();
	}
	
	public void run()
	{
		try{
		for(int i=0;i<10;i++)
		{
		System.out.println("Base Thread is Running");
		Thread.sleep(1000);
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
