class Example27
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside the try block");
			System.out.println(10/0);

		}
		finally
		{
			// Finally block will always executed...
			System.out.println("Inside the Finally block");	
		}
	}
}
/*
	try-catch as well as try-finally is also valid.

	try-finally block can not handle the exception it result on abnormal termination.

	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example27.main(Example27.java:8)
*/