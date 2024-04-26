class Example10
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("These is the try block... Before");	// Execute
			System.out.println(10/0);		// ArithmeticException	NOT Execute
			System.out.println("Control Back after execution... After");	// NOT Execute	 After control goes out of the try block it will never return back to try block
		}
		catch (ArithmeticException ae)
		{
			System.out.println("These is the catch block...");	// Execute
			//System.out.println(10/2);	// Execute
		}
	}
}

/*
	Never ever used generic statements .

	Never ever write statements after the exception.

	After control goes out of the try block it will never return back to try block
*/