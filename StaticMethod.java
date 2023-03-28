package usingStatic;

class TestStatic
{
	//non-static method
	int multiply(int a,int b)
	{
		return a*b;
	}
	
	//static method
	static int add(int a,int b)
	{
		return a+b;
	}
}
public class StaticMethod {
	public static void main(String[] args) {
	//  for calling static method we do not need object we can call it by class name;
	//  TestStatic s=new TestStatic();
	//	System.out.println("2*2= "+s.multiply(2, 2));
	//	System.out.println("5+4= "+s.add(5, 4));
		System.out.println("Addition: 5+5= "+TestStatic.add(5, 5));
		System.out.println("Addition: 10+10= "+TestStatic.add(10, 10));
	}
}