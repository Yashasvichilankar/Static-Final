
final public class FinalClass {
	void m1() 
    {
        System.out.println("Method in parent class.");
    }

/*
class B extends FinalClass
{
    void m1()
    { 
        System.out.println("Illegal!");
    }
	
}*/
public static void main (String args[])
{
	System.out.println("we cannot inherit the final class");
	FinalClass f=new FinalClass();
	f.m1();
}
}


