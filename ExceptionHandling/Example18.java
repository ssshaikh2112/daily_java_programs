class Example18
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		try
		{
			System.out.println("Inside the try block --- 1");
			System.out.println(10/2);
			System.out.println(a[10]);
		}
		catch (ArithmeticException e)
		{	
			System.out.println("Inside ArithmeticException ...");	
		}
		catch(Exception e)
		{
			System.out.println("Inside Exception...");
		}
	}
}

/*
	It is better recommended that is the exception is raised of particular type 
	handle it with the same type.

	Multiple catch blocks are allowed if the order of multiple catch blocks are from child to parent
*/