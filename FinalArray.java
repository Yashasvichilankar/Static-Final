
public class FinalArray 
{
	public static void main(String args[])
	{
		//making final array
		final int myarray[] = {1, 2, 3, 4, 5};
			for (int i= 0; i< myarray.length; i++)
				{
					myarray [i] = myarray [i]*10;
					System.out.print(" "+myarray [i]);
				}
	}
}
	
		