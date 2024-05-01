class Example30
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside Outer try block");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside the Inner catch block");
		}
		finally
		{
			// we can use try-catch inside the finally
			System.out.println("Inside the finally block");
			try
			{
				System.out.println("Inside the finally Inner try block");
				System.out.println(10/0);
			}
			catch (ArithmeticException ae1)
			{
				System.out.println("Inside the finally Inner catch block");
			}
		}
	}
}