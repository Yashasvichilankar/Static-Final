package usingStatic;

import java.util.Scanner;

class Abc
{   //static block will run automatically as soon as its class get hit
	static 
	{
		System.out.println("Hey Welcome !");
	}
	public static void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
	    String name=sc.nextLine();
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		System.out.println("Your name: "+name);
		System.out.println("Your Id: "+id);
	}
   static void getData()
	{  
    	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your Company name:");
		String company=sc.nextLine();
		setData();
		System.out.println("Your company's: "+company);	
	}
}
public class MethodExample2 {
public static void main(String[] args) {
	Abc.getData();
}
}