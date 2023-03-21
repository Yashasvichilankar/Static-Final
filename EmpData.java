
public class EmpData
	{
	//Blank final variable
	  final int id;

	  //parameterized constructor
	  EmpData(int idNum) 
	  {
	    //Blank final variable must be initialized in constructor
	    id = idNum;
	  }
	  void getDetails() 
	  {
	    System.out.println("Id of the First Employee is: "+id );
	  }
	  public static void main(String args[]) 
	  {
	    EmpData emp = new EmpData(102);
	    emp.getDetails();
	  }
	}

