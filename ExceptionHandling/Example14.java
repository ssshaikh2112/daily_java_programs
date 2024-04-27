class Example14
{
	public static void main(String[] args)
	{
		int[] a={10,20,30};
		try
		{
			System.out.println("These is the try block...");	// Execute
			System.out.println(a[2]);		// ArrayIndexOutOfBoundsException Execute

		}

		System.out.println("After the try block...");	// Statements are not allow after the try block and before the catch block.

		catch (ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("These is the catch block --> ArrayIndexOutOfBoundsException");	// Execute

		}
		
	}
}

// Statements are not allow after the try block and before the catch block.

/*
	Example14.java:6: error: 'try' without 'catch', 'finally' or resource declarations
                try
                ^
	Example14.java:13: error: 'catch' without 'try'
                catch (ArrayIndexOutOfBoundsException aiobe)
                ^
2 errors
*/