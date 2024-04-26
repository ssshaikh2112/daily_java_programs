class Example11
{
	public static void main(String[] args)
	{
		int[] a={10,20,30};
		try
		{
			System.out.println("These is the try block... Before");	// Execute
			System.out.println(a[10]);		// ArrayIndexOutOfBoundsException	Not Execute
			System.out.println("Control Back after execution... After");	// NOT Execute	 After control goes out of the try block it will never return back to try block
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("These is the catch block...");	// Execute
			System.out.println(10/0);	// Not Execute
		}
	}
}
/*
	These is the try block... Before
	These is the catch block...

	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example11.main(Example11.java:15)
*/

/*
	If exception raised in the try block then it will handled by catch block
	But if exception raised in the catch block then it can not be handled.
	It will lead to abnormal termination.
*/