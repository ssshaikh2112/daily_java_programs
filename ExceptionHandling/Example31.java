class Example31
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside the try block");
			System.exit(0);				//shutdown the JVM
			System.out.println(10/0);
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
	How to avoid execution of finally??
	ANS:	When we use System.exit(int status) method it will be responsible to shutdown the JVM
			either under normal condition or under abnormal condition.

			When JVM shutd down then the control will never enter into the finally block.
*/