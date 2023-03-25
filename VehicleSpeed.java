
public class VehicleSpeed {
	//declaring and initializing a final variable
	  final int speed= 60;
	  void Accurate() {
	    //Trying to change the value of the final variable will give an error
	    //speed = 200;
	  }
	  public static void main(String args[]) {
	    VehicleSpeed obj = new VehicleSpeed();
	    obj.Accurate();
	  }
	}

