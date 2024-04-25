class Example7
{
	public static void main(String[] args)
	{
		int a[] ={10,20,30,40};
		try
		{
			System.out.println("These is the try block...");	// Execute
			System.out.println(a[10]);		// ArrayIndexOutOfBoundsException NO Execute
		}
		catch (ArithmeticException ae)		// but catch ArithmeticException
		{
			System.out.println("These is the catch block...");	// No Execute
			System.out.println(a[1]);	// No Execute
		}
	}
}

/*
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
        at Example7.main(Example7.java:9)
*/

/*
	If an exception thrown is on perticular type (ArrayIndexOutOfBoundsException) then while catching an exception , 
	it is manditory that the exception should be of the same type. Otherwise it will result abnormal termination
*/