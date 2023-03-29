package usingStatic;

public class StaticExample {
	String name;
	int age;
	static String clg;
	
	public StaticExample(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "StaticExample [name=" + name + ", age=" + age + ", clg=" + clg + "]";
	}
	public static void main(String[] args) {
		
		//Making college name static as every student is from same clg;
		//Static is used for memory management;
		StaticExample.clg="PBCOE";
		StaticExample s=new StaticExample("GEETA",20);
		StaticExample s1=new StaticExample("RAM",21);
		System.out.println(s1.toString());
		System.out.println(s.toString());
	}
}
