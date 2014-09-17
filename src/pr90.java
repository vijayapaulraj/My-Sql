
public class pr90 extends Thread{
	
	public pr90(){
		System.out.println("Enter the number");
		Thread t=new Thread(this,"bhaskar");
		t.start();
		
	}
	public void run(){
		try{
			for(int i=1;i<10;i++){
				int z=2*i;
				System.out.println("Base number"+"\t"+z);
				Thread.sleep(1000);
				
			}}
			catch(Exception e){
				e.printStackTrace();
			}
		
	}

}
