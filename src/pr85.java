import java.util.ArrayList;


public class pr85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList y=new ArrayList();
       y.add(7);
       y.add(8.90f);
       y.add('f');
       System.out.println("Before adding");
       for(int i=0;i<y.size();i++){
    	   System.out.println(y.get(i));
       }
       y.trimToSize();
       System.out.println(y);
       y.add("tyre");
       System.out.println("after adding");
       for(int i=0;i<y.size();i++){
    	   System.out.println(y.get(i));
       }
       System.out.println("position of particular value");
       System.out.println(y.indexOf("tyre"));
       System.out.println("Size of the value");
       System.out.println(y.size());
       y.set(1,10);
       System.out.println("after editing adding");
       for(int i=0;i<y.size();i++){
    	   System.out.println(y.get(i));
       }
       
       if(y.contains(10)){
    	   System.out.println("the number is there"+"\t"+y.get(3)+"\t"+y.indexOf(10));
       }
       for(int i=0;i<y.size();i++){
    	   System.out.println(y.get(i));
       }
       System.out.println(y);
               
 	ArrayList a=new ArrayList();
	
       a.add(5);
       a.add(25);
       a.add("run");
       
       System.out.println("2nd Arraylist Before adding");
       for(int i=0;i<a.size();i++)
       {
    	   System.out.println(a.get(i));
       }
    	   
    	   a.add(3,68);
    	   System.out.println("2nd arraylist after adding");
    	   for(int j=0;j<a.size();j++)
    	   {
        	   System.out.println(a.get(j));
    	   }
        	  a.set(0,"Str"); 
        	  System.out.println("after editing first value");
        	  for(int j=0;j<a.size();j++)
        	  {
           	   System.out.println(a.get(j));
           	   
        	  }
        	  a.addAll(2,y);
        	  System.out.println("Adding two arraylist");
        	  System.out.println(a);
        	  System.out.println(a.size());
        	  System.out.println(a.indexOf(25));
        	  a.add(25);
        	  System.out.println("Last Index of number 25");
        	  System.out.println(a.lastIndexOf(25));
        	  System.out.println(a.indexOf(25));
	}
   }