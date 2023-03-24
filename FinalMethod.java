
public class FinalMethod {
	
	public final void display()
	{
	      System.out.println("Hello welcome to Asterisc");
	   }
	
	   public static void main(String args[])
	   {
	      new FinalMethod().display();
	   }
	   // we cannot override the final method
	  /* class Sample extends FinalMethod{
	      public void display(){
	         System.out.println("hello");
	      }*/
	   }
	
