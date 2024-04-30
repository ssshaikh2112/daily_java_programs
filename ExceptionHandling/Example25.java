class Example25
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside the try block");
			Thread.sleep(3000);
		}
		catch (InterruptedException ie)
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
	finally block is also used for checked and unchecked exceptions.
*/