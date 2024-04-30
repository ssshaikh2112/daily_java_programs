class Example24
{
	public static void main(String[] args)
	{
		int[] a={10,20,30};
		try
		{
			System.out.println("Inside the try block");
			System.out.println(10/0);		
		}
		catch (ArithmeticException ae)
		{
			// catch block exception
			System.out.println("Inside the catch block");
			System.out.println(a[10]);		// can not handle exception
		}
		finally
		{
			// Finally block will always executed...
			System.out.println("Inside the Finally block");	
		}
	}
}
/*
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        at Example24.main(Example24.java:14)
*/