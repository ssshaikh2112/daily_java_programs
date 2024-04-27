class Example12
{
	public static void main(String[] args)
	{
		int[] a={10,20,30};
		try
		{
			System.out.println("These is the try block...");	// Execute
			System.out.println(a[2]);		// ArrayIndexOutOfBoundsException Execute
			System.out.println(10/0);		// Can not handle multiple exceptions at a time
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("These is the catch block...");	// Execute

		}
	}
}

/*
	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example12.main(Example12.java:10)
*/