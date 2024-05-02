class Example32
{
	public static void main(String[] args)
	{
		System.out.println(10/0);
		try
		{
			System.out.println("Inside the try block");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside the catch block");
		}
		finally
		{
			System.out.println("Inside the finally block");
		}
	}
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example32.main(Example32.java:5)

If an exception is raised outside try block the then finally block never executed.
*/