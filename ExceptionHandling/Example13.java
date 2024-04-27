class Example13
{
	public static void main(String[] args)
	{
		int[] a={10,20,30};
		try
		{
			System.out.println("These is the try block...");	// Execute
			System.out.println(a[2]);		// ArrayIndexOutOfBoundsException Execute
			System.out.println(10/0);		//ArithmeticException Can not handle multiple exceptions at a time
		}
		catch (ArrayIndexOutOfBoundsException aiobe)	// We can write multiple catch blocks to handle the multiple exception at a time generates
		{
			System.out.println("These is the catch block --> ArrayIndexOutOfBoundsException");	// Execute

		}
		catch (ArithmeticException ae)
		{
			System.out.println("These is the catch block --> ArithmeticException");	// Execute

		}
	}
}

// It check inetemediate catch block first if exception handled then executed otherwise no. GO to next catch.
// Note : It print only one catch block.

// We can write multiple catch blocks to handle the multiple exception at a time generates