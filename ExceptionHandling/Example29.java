class Example29
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
			// we can use the inner try-catch (nested try-catch)
			// When exception is occur in the catch block it can handle by inner try-catch
			System.out.println("Inside the Inner catch block");
			try
			{
				System.out.println("Inside the Inner try block");
				System.out.println(10/0);
			}
			catch (ArithmeticException ae1)
			{
				System.out.println("Inside the Inner catch block");
			}
		}
	}
}