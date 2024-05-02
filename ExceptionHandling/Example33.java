class Example33
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("These is the try block...");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("These is the catch block...");
			System.out.println("---------------------------------");
			System.out.println(ae.toString());
			System.out.println("---------------------------------");
			System.out.println(ae.getMessage());
			System.out.println("---------------------------------");
			ae.printStackTrace();
		}
	}
}
/*
	IQ.	Ways to know information about exception??
	1)toString()
	2)getMessage()
	3)printStackTrace()
*/

//public java.lang.String toString();
//public java.lang.String getMessage();
//public void printStackTrace();