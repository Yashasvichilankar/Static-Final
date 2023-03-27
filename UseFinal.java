
public class UseFinal {
	
	//create a final variable
	final int age = 21;
	
	//error occurs when we try to change the value in final variable
    public static void main(String[] args) {
    	
		UseFinal a= new UseFinal();
		
		System.out.print("Age stored in the final variable: ");
		System.out.println(a.age);
	}
}
